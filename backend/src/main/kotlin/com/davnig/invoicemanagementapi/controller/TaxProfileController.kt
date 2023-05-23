package com.davnig.invoicemanagementapi.controller

import com.davnig.invoicemanagementapi.model.TaxProfileDefault
import com.davnig.invoicemanagementapi.service.EntityService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tax-profiles")
class TaxProfileController(
    private val taxProfileService: EntityService<TaxProfileDefault, TaxProfileDefault>
) {

    @GetMapping("/{id}")
    fun findById(
        @PathVariable id: Int,
        @RequestParam(required = false) fields: List<String>?,
        @RequestParam(required = false) embed: List<String>?
    ): ResponseEntity<TaxProfileDefault> {
        return ResponseEntity.ok(taxProfileService.findById(id))
        // TODO: fields and embed
    }


}