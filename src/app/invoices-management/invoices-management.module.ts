import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {DashboardComponent} from "./dashboard/dashboard.component";
import {InvoicesComponent} from "./invoices/invoices.component";
import {RouterOutlet} from "@angular/router";
import {ThemeModule} from "../@theme/theme.module";
import {InvoicesManagementRoutingModule} from "./invoices-management-routing.module";
import {CardModule} from "primeng/card";
import {TableModule} from "primeng/table";
import {TagModule} from "primeng/tag";
import {TagSeverityPipe} from "./@core/pipes/TagSeverityPipe";
import {ChartModule} from "primeng/chart";
import {ButtonModule} from "primeng/button";
import {ProfileComponent} from './profile/profile.component';
import {RadioButtonModule} from "primeng/radiobutton";
import {FormsModule} from "@angular/forms";
import {DropdownModule} from "primeng/dropdown";


@NgModule({
  declarations: [
    DashboardComponent,
    InvoicesComponent,
    TagSeverityPipe,
    ProfileComponent
  ],
  imports: [
    CommonModule,
    InvoicesManagementRoutingModule,
    ThemeModule,
    RouterOutlet,
    CardModule,
    TableModule,
    TagModule,
    ChartModule,
    ButtonModule,
    RadioButtonModule,
    FormsModule,
    DropdownModule
  ]
})
export class InvoicesManagementModule { }
