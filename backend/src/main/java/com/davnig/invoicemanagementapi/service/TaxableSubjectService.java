package com.davnig.invoicemanagementapi.service;

import com.davnig.invoicemanagementapi.model.dto.Paginating;
import com.davnig.invoicemanagementapi.model.dto.TaxableSubjectSummary;
import com.davnig.invoicemanagementapi.model.entity.TaxableSubject;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TaxableSubjectService {

    Page<TaxableSubjectSummary> findAll(Paginating paginating, String search, List<String> fields);

    Page<TaxableSubjectSummary> findAll(Paginating paginating, String search);

    Page<TaxableSubjectSummary> findAll(Paginating paginating, List<String> fields);

    Page<TaxableSubjectSummary> findAll(Paginating paginating);

    TaxableSubject findById(int id);

    TaxableSubject findById(int id, List<String> fields);

}
