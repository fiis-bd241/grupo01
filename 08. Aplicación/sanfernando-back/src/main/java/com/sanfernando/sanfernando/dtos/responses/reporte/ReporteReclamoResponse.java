package com.sanfernando.sanfernando.dtos.responses.reporte;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReporteReclamoResponse {
    private String idReclamoTipo;
    private String reclamoTipo;
    private int favor;
    private int contra;
    private int total;
    private double tiempoMedio;
}
