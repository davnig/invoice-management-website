package com.davnig.invoicemanagementapi.controller;

import com.davnig.invoicemanagementapi.model.dto.TaxableSubjectOverview;
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


//    @GetMapping
//    public ResponseEntity<List<TaxableSubject>> findAll() {
//        return ResponseEntity.ok(taxableSubjectRepository.findAll());
//    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") int id) {
        TaxableSubjectOverview byId = taxableSubjectRepository.findById(id, TaxableSubjectOverview.class);
        return ResponseEntity.ok(byId);
    }

}
