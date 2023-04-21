import {Component} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  isMobileMenuOpen = false;
  navItems: navItem[] = [
    {label: 'Dashboard', route: 'dashboard'},
    {label: 'Fatture', route: 'invoices'},
    {label: 'Clienti', route: 'clients'}
  ]

  constructor(
    private readonly _activatedRoute: ActivatedRoute,
    private readonly _router: Router,
  ) {
  }

  onMobileMenuClick(): void {
    if (this.isMobileMenuOpen) {
      this.isMobileMenuOpen = false;
      return;
    }
    this.isMobileMenuOpen = true;
    console.log(this.isMobileMenuOpen);
  }

}

interface navItem {
  label: string,
  route: string
}
