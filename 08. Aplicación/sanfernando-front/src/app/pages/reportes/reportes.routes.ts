import { Routes } from "@angular/router";
import { ReportesComponent } from "./reportes.component";
import { authGuard } from "../../core/guards/auth.guard";
import { ReportesHomeComponent } from "./reportes-home/reportes-home.component";
import { AlmacenInventarioComponent } from "./almacen-inventario/almacen-inventario.component";
import { GraficosReportesComponent } from "./graficos-reportes/graficos-reportes.component";
import { ReportesReclamoComponent } from "./reportes-vista/reportes-reclamo/reportes-reclamo.component";

export const REPORTES_ROUTES: Routes = [
  {
    path: 'reportes',
    children: [
      {
        path: 'inventario',
        component: AlmacenInventarioComponent
      },
      {
        path: 'graficos',
        component: GraficosReportesComponent
      },
      {
        path: '',
        component: ReportesHomeComponent
      },
      {
        path: 'reclamos',
        component: ReportesReclamoComponent
      }
    ],
    canActivate: [authGuard]
  },
];
