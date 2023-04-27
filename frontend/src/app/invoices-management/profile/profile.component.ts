import {Component} from '@angular/core';
import {TaxProfileService} from "../@core/services/tax-profile.service";

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent {

  flatRateSchemeOptions = [
    {name: 'ordinary', label: 'Ordinario (IRPEF 15%)', tax: 0.15},
    {name: 'startup', label: 'Agevolato (IRPEF 5%)', tax: 0.05}
  ];
  profitabilityCoefficientOptions = [
    {label: '67%', value: 0.67},
    {label: '78%', value: 0.78}
  ];
  socialSecurityRegimeOptions = [
    {label: 'Gestione Separata INPS - 26.23%', rate: 0.2623},
    {label: 'INARCASSA - 14.50%', rate: 0.1450}
  ];

  constructor(
    public taxProfileService: TaxProfileService
  ) {
    console.log(this.taxProfileService.profitabilityCoefficient);
  }

  onChange(): void {
    console.log(this.taxProfileService.profitabilityCoefficient);
  }


}
