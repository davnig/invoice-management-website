export interface Invoice {
  number: number,
  date: string,
  clientName: string,
  description: string,
  status: InvoiceStatus,
  subtotal: number
};

export type InvoiceStatus = 'saldata' | 'in attesa';
