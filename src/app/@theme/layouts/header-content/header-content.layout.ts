import { Component } from '@angular/core';

@Component({
  selector: 'app-header-content',
  styleUrls: ['./header-content.layout.css'],
  template: `
      <app-header></app-header>
      <router-outlet></router-outlet>
  `
})
export class HeaderContentLayoutComponent {

}
