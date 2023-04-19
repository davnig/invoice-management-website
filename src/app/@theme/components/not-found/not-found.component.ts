import {Component} from '@angular/core';

@Component({
  selector: 'app-not-found',
  styleUrls: ['./not-found.component.css'],
  template: `
    <main class="flex h-full w-full align-items-start justify-content-center bg-white pt-8 sm:py-32 lg:px-8">
      <div class="text-center">
        <p class="text-2xl font-semibold text-indigo-600">404</p>
        <h1 class="mt-4 text-3xl font-bold tracking-tight text-gray-900 sm:text-5xl">Page not found</h1>
        <p class="mt-4 text-base leading-7 text-gray-600">Sorry, we couldn’t find the page you’re looking for.</p>
        <p-button styleClass="p-button-primary mt-2" icon="pi pi-arrow-left" [routerLink]="['/']" label="Go back home">
        </p-button>
      </div>
    </main>
  `
})
export class NotFoundComponent {

}
