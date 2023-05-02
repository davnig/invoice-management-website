package com.davnig.invoicemanagementapi.repository;

import com.davnig.invoicemanagementapi.model.entity.TaxableSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxableSubjectRepository extends JpaRepository<TaxableSubject, String> {

    <T> T findById(int id, Class<T> type);

}
