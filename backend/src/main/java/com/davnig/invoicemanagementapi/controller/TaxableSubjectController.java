package com.davnig.invoicemanagementapi.controller;

import com.davnig.invoicemanagementapi.model.dto.Paginating;
import com.davnig.invoicemanagementapi.service.TaxableSubjectService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taxable-subjects")
public class TaxableSubjectController {

    private final TaxableSubjectService taxableSubjectService;

    public TaxableSubjectController(TaxableSubjectService taxableSubjectService) {
        this.taxableSubjectService = taxableSubjectService;
    }

    @GetMapping
    public ResponseEntity<Page<?>> findAll(@ModelAttribute Paginating paginating,
                                           @RequestParam(required = false) String search,
                                           @RequestParam(required = false) List<String> fields) {
        if (search != null && fields != null) {
            return ResponseEntity.ok(taxableSubjectService.findAll(paginating, search, fields));
        } else if (search != null) {
            return ResponseEntity.ok(taxableSubjectService.findAll(paginating, search));
        } else if (fields != null) {
            return ResponseEntity.ok(taxableSubjectService.findAll(paginating, fields));
        }
        return ResponseEntity.ok(taxableSubjectService.findAll(paginating));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") int id,
                                      @RequestParam(required = false) List<String> fields) {
        if (fields == null) {
            return ResponseEntity.ok(taxableSubjectService.findById(id));
        }
        return ResponseEntity.ok(taxableSubjectService.findById(id, fields));
    }

}
