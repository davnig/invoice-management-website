import {Component} from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

  revenue = 15050.50;
  income = 7560.35;
  invoicesStillToBePaid = 4;
  invoicesCount = 14;
  // real data will be gathered via api call
  chartData = {
    labels: ['Gennaio', 'Febbraio', 'Marzo', 'Aprile', 'Maggio', 'Giugno', 'Luglio'],
    datasets: [
      {
        type: 'bar',
        label: 'Flusso di cassa',
        backgroundColor: '#9cc2ff',
        data: [3000, 1500, -500, 2600, 5500, 3600, 200]
      },
      {
        type: 'bar',
        label: 'Incassi',
        backgroundColor: '#22C55E',
        data: [5000, 2500, 1200, 4800, 9000, 7600, 4400]
      },
      {
        type: 'bar',
        label: 'Spese',
        backgroundColor: '#EF4444',
        data: [2000, 1000, 1700, 2200, 3500, 4000, 4200]
      },
    ]
  };

}
