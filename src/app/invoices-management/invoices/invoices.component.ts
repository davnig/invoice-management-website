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
      date: '21-03-2020',
      clientName: 'cliente',
      description: 'Consulenza informatica',
      status: 'saldata',
      subtotal: 200
    },
    {
      number: 2,
      date: '13-04-2020',
      clientName: 'cliente',
      description: 'Consulenza informatica',
      status: 'saldata',
      subtotal: 1000
    },
    {
      number: 3,
      date: '05-01-2021',
      clientName: 'cliente',
      description: 'Consulenza software',
      status: 'saldata',
      subtotal: 800
    },
    {
      number: 4,
      date: '06-01-2022',
      clientName: 'cliente',
      description: 'Consulenza',
      status: 'in attesa',
      subtotal: 4000
    },
    {
      number: 5,
      date: '07-02-2022',
      clientName: 'cliente',
      description: 'Collaborazione',
      status: 'saldata',
      subtotal: 1800
    },
    {
      number: 6,
      date: '20-09-2022',
      clientName: 'cliente',
      description: 'Consulenza informatica',
      status: 'in attesa',
      subtotal: 2300
    }
  ];

}
