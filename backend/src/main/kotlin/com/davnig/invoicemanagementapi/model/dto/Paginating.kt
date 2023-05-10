package com.davnig.invoicemanagementapi.model.dto

import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable

class Paginating {

    private var page: Int = 0
    private var sort: String = "+id"
    private var limit: Int = 3

    fun getPageable(): Pageable {
        return PageRequest.of(page, limit, SortConverter.parse(sort))
    }
}