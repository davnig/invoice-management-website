import {Pipe, PipeTransform} from '@angular/core';
import {InvoiceStatus} from "../../../@core/models/invoice";

@Pipe({name: 'severity'})
export class TagSeverityPipe implements PipeTransform {
  transform(status: InvoiceStatus): 'success' | 'info' | 'warning' | 'danger' {
    switch (status) {
      case 'in attesa':
        return 'warning';
      case 'saldata':
        return 'success';
    }
  }
}
