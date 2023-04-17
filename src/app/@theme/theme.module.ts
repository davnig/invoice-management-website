import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {HeaderComponent} from "./components/header/header.component";
import {NotFoundComponent} from "./components/not-found/not-found.component";
import {RouterLink, RouterOutlet} from "@angular/router";
import {HeaderContentLayoutComponent} from "./layouts/header-content/header-content.layout";


@NgModule({
  declarations: [
    HeaderComponent,
    NotFoundComponent,
    HeaderContentLayoutComponent
  ],
  imports: [
    CommonModule,
    RouterOutlet,
    RouterLink
  ],
  exports: [
    HeaderComponent,
    NotFoundComponent,
    HeaderContentLayoutComponent
  ]
})
export class ThemeModule {
}
