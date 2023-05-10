package com.davnig.invoicemanagementapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "t_billing_item_type")
class BillingItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "billing-item-type-id-gen")
    @SequenceGenerator(
        name = "billing-item-type-id-gen",
        sequenceName = "t_billing_item_type_id_seq",
        allocationSize = 1
    )
    var id = 0
    var name: String? = null

}