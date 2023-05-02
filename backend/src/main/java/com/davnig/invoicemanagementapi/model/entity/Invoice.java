package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "t_invoice")
@Getter
@Setter
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invoice-id-gen")
    @SequenceGenerator(name = "invoice-id-gen", sequenceName = "t_invoice_id_seq", allocationSize = 1)
    private int id;
    private int number;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "id_vendor")
    private TaxableSubject vendor;
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

}
