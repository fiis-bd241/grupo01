import { Component, OnInit } from '@angular/core';
import { ReportesService } from '../../../../core/services/reportes.service';
import { ReporteReclamoResponse } from '../../../../core/models/response/reporte-responses';
import { TableModule } from 'primeng/table';

@Component({
  selector: 'app-reportes-reclamo',
  standalone: true,
  imports: [TableModule],
  templateUrl: './reportes-reclamo.component.html',
  styleUrl: './reportes-reclamo.component.scss',
})
export class ReportesReclamoComponent implements OnInit {
  reporteReclamos!: ReporteReclamoResponse[];
  totalFavor: number = 0;
  totalContra: number = 0;
  totalGeneral: number = 0;
  tiempoTotal: number = 0;
  tiempoMedio: number = 0;

  constructor(private reportesService: ReportesService) {}

  ngOnInit(): void {
    this.reportesService.getReportesReclamos().subscribe((response) => {
      this.reporteReclamos = response;
      this.calcularTotales();
    });
  }

  calcularTotales() {
    let totalFavor = 0;
    let totalContra = 0;
    let totalGeneral = 0;
    let tiempoTotal = 0;
    let tiempoMedio = 0;
    if (this.reporteReclamos.length > 0) {
      this.reporteReclamos.forEach((reclamo) => {
        totalFavor += reclamo.favor;
        totalContra += reclamo.contra;
        totalGeneral += reclamo.total;
        tiempoTotal += reclamo.total * reclamo.tiempoMedio;
      });
      tiempoMedio = tiempoTotal / totalGeneral;
    }
    this.totalFavor = totalFavor;
    this.totalContra = totalContra;
    this.totalGeneral = totalGeneral;
    this.tiempoTotal = tiempoTotal;
    this.tiempoMedio = Math.round(tiempoMedio);
  }
}
