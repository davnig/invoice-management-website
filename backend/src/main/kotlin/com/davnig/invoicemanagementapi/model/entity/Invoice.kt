package com.davnig.invoicemanagementapi.model.entity

import jakarta.persistence.*
import java.sql.Date

@Entity
@Table(name = "t_invoice")
class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invoice-id-gen")
    @SequenceGenerator(name = "invoice-id-gen", sequenceName = "t_invoice_id_seq", allocationSize = 1)
    var id = 0
    var number = 0
    var date: Date? = null

    @ManyToOne
    @JoinColumn(name = "id_vendor")
    var vendor: TaxableSubject? = null

    @ManyToOne
    @JoinColumn(name = "id_client")
    var client: Client? = null

    @OneToMany
    var items: List<InvoiceItem> = mutableListOf()

}