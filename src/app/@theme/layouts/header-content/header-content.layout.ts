import {Component} from '@angular/core';

@Component({
  selector: 'app-header-content',
  styleUrls: ['./header-content.layout.css'],
  template: `
    <div class="flex flex-col h-full">
      <div class="grow-0">
        <app-header></app-header>
      </div>
      <div class="grow">
        <router-outlet></router-outlet>
      </div>
      <div class="grow-0">
        <app-footer></app-footer>
      </div>
    </div>
  `
})
export class HeaderContentLayoutComponent {

}
