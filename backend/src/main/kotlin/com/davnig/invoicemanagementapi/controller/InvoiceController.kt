package com.davnig.invoicemanagementapi.controller

import com.davnig.invoicemanagementapi.model.dto.InvoiceDetail
import com.davnig.invoicemanagementapi.model.dto.InvoiceSummary
import com.davnig.invoicemanagementapi.model.dto.Paginating
import com.davnig.invoicemanagementapi.service.EntityService
import org.springframework.data.domain.Page
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/invoices")
class InvoiceController(
    private val invoiceService: EntityService<InvoiceSummary, InvoiceDetail>
) {

    @GetMapping
    fun findAll(
        @ModelAttribute paginating: Paginating,
        @RequestParam(required = false) search: String?,
        @RequestParam(required = false) fields: List<String>?
    ): ResponseEntity<Page<InvoiceSummary>> {
        return when {
            (search != null && fields != null) ->
                ResponseEntity.ok(invoiceService.findAll(paginating, search, fields))

            (search != null) -> ResponseEntity.ok(invoiceService.findAll(paginating, search))
            (fields != null) -> ResponseEntity.ok(invoiceService.findAll(paginating, fields))
            else -> ResponseEntity.ok(invoiceService.findAll(paginating))
        }
    }

    @GetMapping("/{id}")
    fun findById(
        @PathVariable id: Int,
        @RequestParam(required = false) fields: List<String>?
    ): ResponseEntity<InvoiceDetail> {
        return when {
            (fields == null) -> ResponseEntity.ok(invoiceService.findById(id))
            else -> ResponseEntity.ok(invoiceService.findById(id, fields))
        }
    }
}