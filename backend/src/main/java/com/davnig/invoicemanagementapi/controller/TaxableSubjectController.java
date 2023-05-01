package com.davnig.invoicemanagementapi.controller;

import com.davnig.invoicemanagementapi.model.entity.TaxableSubject;
import com.davnig.invoicemanagementapi.repository.TaxableSubjectRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxable-subjects")
public class TaxableSubjectController {

    private TaxableSubjectRepository taxableSubjectRepository;

    public TaxableSubjectController(TaxableSubjectRepository taxableSubjectRepository) {
        this.taxableSubjectRepository = taxableSubjectRepository;
    }

    @GetMapping("/{pIVA}")
    public ResponseEntity<TaxableSubject> findByPIVA(@PathVariable String pIVA) {
        return ResponseEntity.ok(taxableSubjectRepository.findByPIVA(pIVA, TaxableSubject.class));
    }

}
