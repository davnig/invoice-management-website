import {Component} from '@angular/core';

@Component({
  selector: 'app-header-content',
  styleUrls: ['./header-content.layout.css'],
  template: `
    <header>
      <app-header></app-header>
    </header>

    <div class="flex flex-column h-full pt-8">
      <main class="flex-grow-1" style="background-color: var(--surface-ground)">
        <router-outlet></router-outlet>
      </main>
      <footer class="flex-grow-0">
        <app-footer></app-footer>
      </footer>
    </div>
  `
})
export class HeaderContentLayoutComponent {

}
