package com.davnig.invoicemanagementapi.model.dto

import com.davnig.invoicemanagementapi.model.entity.Invoice

class InvoiceSummary(
    var number: Int = 0,
    var date: String = "",
    var vendorName: String? = "",
    var clientName: String? = "",
    var total: Double = 0.0
) {

    constructor(entity: Invoice) : this(
        number = entity.number,
        date = entity.date.toString(),
        vendorName = entity.vendor?.firstName + entity.vendor?.lastName,
        clientName = entity.client?.name,
        total = entity.items.stream()
            .map { it.price }
            .toList()
            .reduce { acc, i -> acc + i } * 1.22
    )

}