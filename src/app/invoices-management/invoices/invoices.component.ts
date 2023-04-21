import {Component} from '@angular/core';
import {Invoice} from "../../@core/models/invoice";

@Component({
  selector: 'app-invoices',
  templateUrl: './invoices.component.html',
  styleUrls: ['./invoices.component.css']
})
export class InvoicesComponent {

  invoices: Invoice[] = [
    {
      number: 1,
      date: new Date(Date.parse('2020-03-21')),
      clientName: 'Ottica S.p.A.',
      description: 'Consulenza informatica',
      status: 'saldata',
      subtotal: 200
    },
    {
      number: 2,
      date: new Date(Date.parse('2020-04-13')),
      clientName: 'Macchine di lusso & co.',
      description: 'Consulenza informatica',
      status: 'saldata',
      subtotal: 1000
    },
    {
      number: 3,
      date: new Date(Date.parse('2021-01-05')),
      clientName: 'Pinco pallo',
      description: 'Consulenza software',
      status: 'saldata',
      subtotal: 800
    },
    {
      number: 4,
      date: new Date(Date.parse('2022-01-06')),
      clientName: 'Mario Rossi',
      description: 'Consulenza',
      status: 'in attesa',
      subtotal: 4000
    },
    {
      number: 5,
      date: new Date(Date.parse('2022-02-07')),
      clientName: 'Google',
      description: 'Collaborazione',
      status: 'saldata',
      subtotal: 1800
    },
    {
      number: 6,
      date: new Date(Date.parse('2022-09-27')),
      clientName: 'Facebook',
      description: 'Consulenza informatica',
      status: 'in attesa',
      subtotal: 2300
    }
  ];

}
