import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {DashboardComponent} from "./dashboard/dashboard.component";
import {InvoicesComponent} from "./invoices/invoices.component";
import {RouterOutlet} from "@angular/router";
import {ThemeModule} from "../@theme/theme.module";
import {InvoicesManagementRoutingModule} from "./invoices-management-routing.module";
import {CardModule} from "primeng/card";
import {ButtonModule} from "primeng/button";


@NgModule({
  declarations: [
    DashboardComponent,
    InvoicesComponent
  ],
  imports: [
    CommonModule,
    InvoicesManagementRoutingModule,
    ThemeModule,
    RouterOutlet,
    CardModule,
    ButtonModule
  ]
})
export class InvoicesManagementModule { }
