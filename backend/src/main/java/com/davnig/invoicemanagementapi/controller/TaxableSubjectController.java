package com.davnig.invoicemanagementapi.controller;

import com.davnig.invoicemanagementapi.service.TaxableSubjectService;
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

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") int id,
                                      @RequestParam(name = "fields", required = false) List<String> fields) {
        if (fields == null) {
            return ResponseEntity.ok(taxableSubjectService.findById(id));
        }
        return ResponseEntity.ok(taxableSubjectService.findById(id, fields));
    }

}
