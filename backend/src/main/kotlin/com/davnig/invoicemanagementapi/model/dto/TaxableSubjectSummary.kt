package com.davnig.invoicemanagementapi.model.dto

import com.davnig.invoicemanagementapi.model.entity.TaxableSubject

class TaxableSubjectSummary {

    var piva: String? = null
    var taxCode: String? = null

    constructor(entity: TaxableSubject) {
        piva = entity.piva
        taxCode = entity.taxCode
    }

}