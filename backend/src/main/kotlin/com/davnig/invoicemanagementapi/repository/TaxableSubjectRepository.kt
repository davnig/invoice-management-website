package com.davnig.invoicemanagementapi.repository

import com.davnig.invoicemanagementapi.model.entity.TaxableSubject
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.stereotype.Repository

@Repository
interface TaxableSubjectRepository : JpaRepository<TaxableSubject, Int>,
    QuerydslPredicateExecutor<TaxableSubject>