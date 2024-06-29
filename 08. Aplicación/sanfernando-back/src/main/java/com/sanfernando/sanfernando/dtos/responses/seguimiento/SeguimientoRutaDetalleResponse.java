package com.sanfernando.sanfernando.dtos.responses.seguimiento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeguimientoRutaDetalleResponse {
  private int orden;
  private String local;
  private String tipoParadero;
}
