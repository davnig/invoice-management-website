package com.davnig.invoicemanagementapi.service.impl;

import com.davnig.invoicemanagementapi.model.entity.QTaxableSubject;
import com.davnig.invoicemanagementapi.model.entity.TaxableSubject;
import com.davnig.invoicemanagementapi.repository.TaxableSubjectRepository;
import com.davnig.invoicemanagementapi.service.TaxableSubjectService;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.QBean;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityNotFoundException;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TaxableSubjectDefaultService implements TaxableSubjectService {

    private final QTaxableSubject Q_ENTITY = QTaxableSubject.taxableSubject;
    private final TaxableSubjectRepository taxableSubjectRepository;
    private JPAQueryFactory jpaQueryFactory;

    public TaxableSubjectDefaultService(TaxableSubjectRepository taxableSubjectRepository) {
        this.taxableSubjectRepository = taxableSubjectRepository;
    }

    @Override
    public TaxableSubject findById(int id) {
        return taxableSubjectRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public TaxableSubject findById(int id, List<String> fields) {
        QBean<TaxableSubject> entityProjection = createEntityProjectionFrom(fields);
        Optional<TaxableSubject> taxableSubjectOpt = Optional.ofNullable(
                jpaQueryFactory.select(entityProjection).from(Q_ENTITY).where(Q_ENTITY.id.eq(id)).fetchOne());
        return taxableSubjectOpt.orElseThrow(EntityNotFoundException::new);
    }

    @SneakyThrows
    private QBean<TaxableSubject> createEntityProjectionFrom(List<String> fields) {
        Field[] qDeclaredFields = QTaxableSubject.class.getDeclaredFields();
        Path<?>[] qFieldPaths = new Path<?>[fields.size()];
        for (int i = 0; i < fields.size(); i++) {
            String currentField = fields.get(i);
            if (Arrays.stream(qDeclaredFields).anyMatch(qField -> qField.getName().equals(currentField))) {
                Field qField = QTaxableSubject.class.getDeclaredField(currentField);
                qFieldPaths[i] = (Path<?>) qField.get(Q_ENTITY);
            }
        }
        return Projections.bean(TaxableSubject.class, qFieldPaths);
    }

    @Autowired
    public void setJpaQueryFactory(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }
}
