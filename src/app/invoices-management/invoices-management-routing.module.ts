import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {NotFoundComponent} from "../@theme/components/not-found/not-found.component";
import {DashboardComponent} from "./dashboard/dashboard.component";
import {InvoicesComponent} from "./invoices/invoices.component";
import {HeaderContentLayoutComponent} from "../@theme/layouts/header-content/header-content.layout";

const routes: Routes = [
  {
    path: '',
    component: HeaderContentLayoutComponent,
    children: [
      {
        path: '',
        redirectTo: 'dashboard',
        pathMatch: 'full'
      },
      {
        path: 'dashboard',
        component: DashboardComponent
      },
      {
        path: 'invoices',
        component: InvoicesComponent
      },
      {path: '**', component: NotFoundComponent}
    ]
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class InvoicesManagementRoutingModule {
}
