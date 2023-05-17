package com.davnig.invoicemanagementapi.service

import com.davnig.invoicemanagementapi.model.dto.summary.ClientSummary

interface ClientEntityService : EntityService<ClientSummary, ClientSummary> {

    fun findByInvoiceId(invoiceId: Int): ClientSummary

}