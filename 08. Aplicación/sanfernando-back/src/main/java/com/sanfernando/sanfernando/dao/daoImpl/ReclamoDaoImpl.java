package com.sanfernando.sanfernando.dao.daoImpl;


import com.sanfernando.sanfernando.dao.ReclamoDao;
import com.sanfernando.sanfernando.dtos.requests.reclamo.ReclamoFormCreateDTO;
import com.sanfernando.sanfernando.utils.Conexion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ReclamoDaoImpl implements ReclamoDao {

    @Autowired
    private Conexion conexion;

    @Override
    public void insertarReclamo(ReclamoFormCreateDTO reclamoDTO) throws Exception {
        // 1. Obtener cod_cliente, cod_representante y datos adicionales
        String query = "SELECT c.cod_cliente, r.cod_representante, p.direccion, r.correo_empresarial " +
                "FROM cliente c " +
                "JOIN representante r ON c.cod_cliente = r.cod_cliente " +
                "JOIN persona p ON r.cod_persona = p.cod_persona " +
                "WHERE c.nombre = ? AND p.prenombre = ? AND r.cargo = ?";
        // 2. Obtener información del producto y ticket
        String sqlProducto = "SELECT ec.id_elemento_catalogo, t.fecha_entrega, dtp.cantidad " +
                "FROM elemento_catalogo ec " +
                "JOIN detalle_ticket_producto dtp ON ec.id_elemento_catalogo = dtp.id_elemento_catalogo " +
                "JOIN ticket t ON dtp.cod_ticket = t.cod_ticket " +
                "WHERE ec.nombre = ? AND t.cod_ticket = ?";
        // 3. Insertar en la tabla seguimiento
        String sqlSeguimiento = "INSERT INTO seguimiento (cod_cliente_interno, cod_tipo_accion, comentario, fecha_resolucion, numero_caso) " +
                "VALUES (?, (SELECT cod_tipo_accion FROM accion_tipo WHERE descripcion = ?), ?, ?, ?) " +
                "RETURNING cod_seguimiento";
        // 4. Insertar en la tabla reclamo
        String sqlReclamo = "INSERT INTO reclamo (cod_representante, cod_pedido, cod_seguimiento, cod_tipo_reclamo, " +
                "cod_nivel_urgencia, cod_estado_reclamo, comentario, fecha_suceso, fecha_reclamo) " +
                "VALUES (?, (SELECT cod_pedido FROM pedido WHERE cod_ticket = ?), ?, " +
                "(SELECT cod_tipo_reclamo FROM reclamo_tipo WHERE descripcion = ?), " +
                "(SELECT cod_nivel_urgencia FROM nivel_urgencia WHERE descripcion = ?), " +
                "(SELECT cod_estado_reclamo FROM estado_reclamo WHERE descripcion = ?), ?, ?, CURRENT_DATE) " +
                "RETURNING cod_reclamo";

        // 5. Insertar en la tabla evidencia
        String sqlEvidencia = "INSERT INTO evidencia (cod_reclamo, cod_tipo_evidencia, cod_tipo_archivo, nombre_evidencia) " +
                "VALUES (?, (SELECT cod_tipo_evidencia FROM evidencia_tipo WHERE descripcion = ?), " +
                "(SELECT cod_tipo_archivo FROM archivo_tipo WHERE descripcion = ?), ?)";
        try {
            conexion.startConexion();
            Connection conn = conexion.getCon();
            PreparedStatement pstmt=conn.prepareStatement(query);

            pstmt.setString(1, reclamoDTO.getNombCliente());
            pstmt.setString(2, reclamoDTO.getNomRepresentante());
            pstmt.setString(3, reclamoDTO.getCargoRepresentante());
            ResultSet rsCliente = pstmt.executeQuery();
            int codCliente = 0;
            int codRepresentante = 0;
            if (rsCliente.next()) {
                codCliente = rsCliente.getInt("cod_cliente");
                codRepresentante = rsCliente.getInt("cod_representante");
            } else {
                throw new Exception("No se encontró el cliente o representante especificado");
            }
            pstmt = conn.prepareStatement(sqlProducto);
            pstmt.setString(1, reclamoDTO.getNombProducto());
            pstmt.setInt(2, reclamoDTO.getCodticket());
            ResultSet rsProducto = pstmt.executeQuery();
            int idElementoCatalogo = 0;
            if (rsProducto.next()) {
                idElementoCatalogo = rsProducto.getInt("id_elemento_catalogo");
            } else {
                throw new Exception("No se encontró el producto o ticket especificado");
            }


            pstmt = conn.prepareStatement(sqlSeguimiento);
            pstmt.setInt(1, codCliente);
            pstmt.setString(2, reclamoDTO.getAccionSolicitada());
            pstmt.setString(3, reclamoDTO.getComentario());
            pstmt.setDate(4, java.sql.Date.valueOf(reclamoDTO.getFechaEsperada()));
            pstmt.setInt(5, Integer.parseInt(reclamoDTO.getNroCaso()));
            ResultSet rsSeguimiento = pstmt.executeQuery();
            int codSeguimiento = 0;
            if (rsSeguimiento.next()) {
                codSeguimiento = rsSeguimiento.getInt(1);
            }


            pstmt = conn.prepareStatement(sqlReclamo);
            pstmt.setInt(1, codRepresentante);
            pstmt.setInt(2, reclamoDTO.getCodticket());
            pstmt.setInt(3, codSeguimiento);
            pstmt.setString(4, reclamoDTO.getTipoReclamo());
            pstmt.setString(5, reclamoDTO.getUrgencia());
            pstmt.setString(6, reclamoDTO.getEstadoReclamo());
            pstmt.setString(7, reclamoDTO.getDescripcionProblema());
            pstmt.setDate(8, java.sql.Date.valueOf(reclamoDTO.getFechaIncidencia()));
            ResultSet rsReclamo = pstmt.executeQuery();
            int codReclamo = 0;
            if (rsReclamo.next()) {
                codReclamo = rsReclamo.getInt(1);
            }

            pstmt = conn.prepareStatement(sqlEvidencia);
            pstmt.setInt(1, codReclamo);
            pstmt.setString(2, reclamoDTO.getTipoEvidencia());
            pstmt.setString(3, reclamoDTO.getTipoArchivo());
            pstmt.setString(4, reclamoDTO.getNombreEvidencia());
            pstmt.executeUpdate();

            conn.commit();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.closeConexion();
        }
    }
}
