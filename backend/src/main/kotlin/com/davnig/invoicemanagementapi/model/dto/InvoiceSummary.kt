package com.davnig.invoicemanagementapi.model.dto

import com.davnig.invoicemanagementapi.model.entity.Invoice

class InvoiceSummary {

    var number = 0
    var date: String = ""
    var vendorName: String? = ""
    var clientName: String? = ""
    var total: Int = 0

    constructor(entity: Invoice) {
        number = entity.number
        date = entity.date.toString()
        if (entity.vendor != null) {
            vendorName = entity.vendor!!.firstName + entity.vendor!!.lastName
        }
        if (entity.client != null) {
            clientName = entity.client!!.name
        }
        total = entity.items.stream()
            .map { item -> item.price }
            .toList()
            .reduce { acc, next -> acc + next }
    }

}