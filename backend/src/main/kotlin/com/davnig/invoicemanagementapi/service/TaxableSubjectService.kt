package com.davnig.invoicemanagementapi.service

import com.davnig.invoicemanagementapi.model.dto.Paginating
import com.davnig.invoicemanagementapi.model.dto.TaxableSubjectDetail
import com.davnig.invoicemanagementapi.model.dto.TaxableSubjectSummary
import org.springframework.data.domain.Page

interface TaxableSubjectService {

    fun findAll(paginating: Paginating, search: String, fields: List<String>): Page<TaxableSubjectSummary>

    fun findAll(paginating: Paginating, search: String): Page<TaxableSubjectSummary>

    fun findAll(paginating: Paginating, fields: List<String>): Page<TaxableSubjectSummary>

    fun findAll(paginating: Paginating): Page<TaxableSubjectSummary>

    fun findById(id: Int): TaxableSubjectDetail

    fun findById(id: Int, fields: List<String>): TaxableSubjectDetail

}