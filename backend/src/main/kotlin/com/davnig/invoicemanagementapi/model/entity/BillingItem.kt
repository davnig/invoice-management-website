package com.davnig.invoicemanagementapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "t_billing_item")
class BillingItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "billing-item-id-gen")
    @SequenceGenerator(name = "billing-item-id-gen", sequenceName = "t_billing_item_id_seq", allocationSize = 1)
    var id = 0

    @ManyToOne
    var type: BillingItemType? = null
    var description: String? = null
    var price = 0
    var quantity = 0

}