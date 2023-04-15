import {Component} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  navItems: navItem[] = [
    {label: 'Dashboard', route: 'dashboard'},
    {label: 'Invoices', route: 'invoices'}
  ]

  constructor(
    private readonly _activatedRoute: ActivatedRoute,
    private readonly _router: Router,
  ) {
  }

}

interface navItem {
  label: string,
  route: string
}
