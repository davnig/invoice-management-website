package com.davnig.invoicemanagementapi.model.dto.summary

import com.davnig.invoicemanagementapi.model.entity.Invoice

class InvoiceSummary(
    var number: Int? = null,
    var date: String? = null,
    var idVendor: Int? = null,
    var idClient: Int? = null
) {

    constructor(entity: Invoice) : this(
        number = entity.number,
        date = entity.date.toString(),
        idVendor = entity.idVendor,
        idClient = entity.idClient
//        vendorName = entity.vendor?.firstName + entity.vendor?.lastName,
//        clientName = entity.client?.name,
//        total = entity.items.stream()
//            .map { it.price }
//            .toList()
//            .reduce { acc, i -> acc + i } * 1.22
    )

}