import {NgModule} from '@angular/core';
import {CommonModule, NgOptimizedImage} from '@angular/common';
import {HeaderComponent} from "./components/header/header.component";
import {NotFoundComponent} from "./components/not-found/not-found.component";
import {RouterLink, RouterLinkActive, RouterOutlet} from "@angular/router";
import {HeaderContentLayoutComponent} from "./layouts/header-content/header-content.layout";
import {FooterComponent} from './components/footer/footer.component';


@NgModule({
  declarations: [
    HeaderComponent,
    FooterComponent,
    NotFoundComponent,
    HeaderContentLayoutComponent
  ],
  imports: [
    CommonModule,
    RouterOutlet,
    RouterLink,
    NgOptimizedImage,
    RouterLinkActive
  ],
  exports: [
    HeaderComponent,
    FooterComponent,
    NotFoundComponent,
    HeaderContentLayoutComponent
  ]
})
export class ThemeModule {
}
