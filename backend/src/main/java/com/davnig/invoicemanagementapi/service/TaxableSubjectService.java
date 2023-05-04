package com.davnig.invoicemanagementapi.service;

import com.davnig.invoicemanagementapi.model.entity.TaxableSubject;

import java.util.List;

public interface TaxableSubjectService {

    TaxableSubject findById(int id);

    TaxableSubject findById(int id, List<String> fields);

}
