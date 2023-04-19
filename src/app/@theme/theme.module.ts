import {NgModule} from '@angular/core';
import {CommonModule, NgOptimizedImage} from '@angular/common';
import {HeaderComponent} from "./components/header/header.component";
import {NotFoundComponent} from "./components/not-found/not-found.component";
import {RouterLink, RouterLinkActive, RouterOutlet} from "@angular/router";
import {HeaderContentLayoutComponent} from "./layouts/header-content/header-content.layout";
import {FooterComponent} from './components/footer/footer.component';
import {ButtonModule} from "primeng/button";
import {SidebarModule} from "primeng/sidebar";
import {CardComponent} from './components/card/card.component';


@NgModule({
  declarations: [
    HeaderComponent,
    FooterComponent,
    NotFoundComponent,
    HeaderContentLayoutComponent,
    CardComponent
  ],
  imports: [
    CommonModule,
    RouterOutlet,
    RouterLink,
    NgOptimizedImage,
    RouterLinkActive,
    ButtonModule,
    SidebarModule
  ],
  exports: [
    HeaderComponent,
    FooterComponent,
    NotFoundComponent,
    HeaderContentLayoutComponent,
    CardComponent
  ]
})
export class ThemeModule {
}
