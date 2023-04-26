import {Component} from '@angular/core';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent {

  flatRateSchemeTypeOptions = ['ordinary', 'startup'];
  flatRateSchemeType: string = 'ordinary';
  profitabilityCoefficientOptions = [
    {label: '67%', value: 0.67},
    {label: '78%', value: 0.78}
  ];
  profitabilityCoefficient = 0.67;
  socialSecurityRegimeOptions = [
    {label: 'Gestione Separata INPS - 26.23%', value: 'inps'},
    {label: 'INARCASSA - 14.50%', value: 'inarcassa'}
  ];
  socialSecurityRegime = 'inps';


}
