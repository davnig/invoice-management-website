import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {DashboardComponent} from "./dashboard/dashboard.component";
import {InvoicesComponent} from "./invoices/invoices.component";
import {RouterOutlet} from "@angular/router";
import {ThemeModule} from "../@theme/theme.module";
import {InvoicesManagementRoutingModule} from "./invoices-management-routing.module";


@NgModule({
  declarations: [
    DashboardComponent,
    InvoicesComponent
  ],
  imports: [
    CommonModule,
    InvoicesManagementRoutingModule,
    ThemeModule,
    RouterOutlet
  ]
})
export class InvoicesManagementModule { }
