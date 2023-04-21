import {Component} from '@angular/core';

@Component({
  selector: 'app-card',
  styleUrls: ['./card.component.css'],
  template: `
    <div class="bg-white border-round-xl border-solid border-1 surface-border px-5 py-4">
      <ng-content></ng-content>
    </div>
  `
})
export class CardComponent {

}
