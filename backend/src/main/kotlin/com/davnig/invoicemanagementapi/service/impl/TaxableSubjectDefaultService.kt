package com.davnig.invoicemanagementapi.service.impl

import com.davnig.invoicemanagementapi.model.dto.Paginating
import com.davnig.invoicemanagementapi.model.dto.TaxableSubjectDetail
import com.davnig.invoicemanagementapi.model.dto.TaxableSubjectSummary
import com.davnig.invoicemanagementapi.model.entity.QTaxableSubject
import com.davnig.invoicemanagementapi.model.entity.TaxableSubject
import com.davnig.invoicemanagementapi.repository.TaxableSubjectRepository
import com.davnig.invoicemanagementapi.service.TaxableSubjectService
import com.querydsl.core.types.EntityPath
import com.querydsl.core.types.Path
import com.querydsl.core.types.Projections
import com.querydsl.core.types.QBean
import com.querydsl.core.types.dsl.PathBuilder
import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import jakarta.persistence.EntityNotFoundException
import lombok.SneakyThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.jpa.repository.support.JpaEntityInformation
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport
import org.springframework.data.jpa.repository.support.Querydsl
import org.springframework.data.querydsl.SimpleEntityPathResolver
import org.springframework.data.repository.findByIdOrNull
import org.springframework.data.support.PageableExecutionUtils
import org.springframework.stereotype.Service
import java.lang.reflect.Field

@Service
class TaxableSubjectDefaultService(
    private val taxableSubjectRepository: TaxableSubjectRepository,
    entityManager: EntityManager
) : TaxableSubjectService {

    @Autowired
    private lateinit var jpaQueryFactory: JPAQueryFactory
    private val Q_ENTITY: QTaxableSubject = QTaxableSubject.taxableSubject
    private val querydsl: Querydsl

    init {
        val entityInfo: JpaEntityInformation<TaxableSubject, *> =
            JpaEntityInformationSupport.getEntityInformation(TaxableSubject::class.java, entityManager)
        val entityPath: EntityPath<TaxableSubject> =
            SimpleEntityPathResolver.INSTANCE.createPath(entityInfo.javaType)
        val pathBuilder: PathBuilder<TaxableSubject> = PathBuilder<TaxableSubject>(entityPath.type, entityPath.metadata)
        querydsl = Querydsl(entityManager, pathBuilder)
    }


    override fun findAll(paginating: Paginating, search: String, fields: List<String>): Page<TaxableSubjectSummary> {
        TODO("Not yet implemented")
    }

    override fun findAll(paginating: Paginating, search: String): Page<TaxableSubjectSummary> {
        TODO("Not yet implemented")
    }

    override fun findAll(paginating: Paginating, fields: List<String>): Page<TaxableSubjectSummary> {
        val pageable = paginating.getPageable()
        val entityProjection = createEntityProjectionFrom(fields)
        val query = querydsl.applyPagination(
            pageable, jpaQueryFactory
                .select(entityProjection)
                .from(Q_ENTITY)
        )
        val entities = query.fetch().map { entity -> TaxableSubjectSummary(entity) }
        return PageableExecutionUtils.getPage(entities, pageable) { query.fetchCount() }
    }

    override fun findAll(paginating: Paginating): Page<TaxableSubjectSummary> {
        val pageable = paginating.getPageable()
        val query = querydsl.applyPagination(
            pageable, jpaQueryFactory
                .select(Projections.constructor(TaxableSubjectSummary::class.java, Q_ENTITY))
                .from(Q_ENTITY)
        )
        val entities = query.fetch()
        return PageableExecutionUtils.getPage(entities, pageable) { query.fetchCount() }
    }

    override fun findById(id: Int): TaxableSubjectDetail {
        val entity = taxableSubjectRepository.findByIdOrNull(id) ?: throw EntityNotFoundException()
        return TaxableSubjectDetail(entity)
    }

    override fun findById(id: Int, fields: List<String>): TaxableSubjectDetail {
        val entityProjection = createEntityProjectionFrom(fields)
        val query = jpaQueryFactory
            .select(entityProjection)
            .from(Q_ENTITY)
            .where(Q_ENTITY.id.eq(id))
        val entity = query.fetchOne() ?: throw EntityNotFoundException()
        return TaxableSubjectDetail(entity)
    }

    @SneakyThrows
    private fun createEntityProjectionFrom(fields: List<String>): QBean<TaxableSubject> {
        val qDeclaredFields: Array<Field> = QTaxableSubject::class.java.declaredFields
        val qFieldPaths = mutableListOf<Path<*>>()
        for (field in fields) {
            if (qDeclaredFields.any { qField -> qField.name == field }) {
                val qField = QTaxableSubject::class.java.getDeclaredField(field)
                qFieldPaths.add(qField.get(Q_ENTITY) as Path<*>)
            }
        }
        return Projections.bean(TaxableSubject::class.java, *qFieldPaths.toTypedArray())
    }

}