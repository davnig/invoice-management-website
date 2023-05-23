package com.davnig.invoicemanagementapi.service.impl

import com.davnig.invoicemanagementapi.model.TaxProfileDefault
import com.davnig.invoicemanagementapi.model.dto.Paginating
import com.davnig.invoicemanagementapi.model.entity.QInvoice
import com.davnig.invoicemanagementapi.model.entity.TaxProfile
import com.davnig.invoicemanagementapi.repository.TaxProfileRepository
import com.davnig.invoicemanagementapi.service.EntityService
import com.querydsl.core.types.dsl.PathBuilder
import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.jpa.repository.support.JpaEntityInformation
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport
import org.springframework.data.jpa.repository.support.Querydsl
import org.springframework.data.querydsl.SimpleEntityPathResolver
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TaxProfileService(
    private val taxProfileRepository: TaxProfileRepository,
    entityManager: EntityManager
) : EntityService<TaxProfileDefault, TaxProfileDefault> {

    @Autowired
    private lateinit var jpaQueryFactory: JPAQueryFactory
    private val qEntity: QInvoice = QInvoice.invoice
    private val querydsl: Querydsl

    init {
        val entityInfo: JpaEntityInformation<TaxProfile, *> =
            JpaEntityInformationSupport.getEntityInformation(TaxProfile::class.java, entityManager)
        val entityPath = SimpleEntityPathResolver.INSTANCE.createPath(entityInfo.javaType)
        val entityPathBuilder: PathBuilder<TaxProfile> = PathBuilder(entityPath.type, entityPath.metadata)
        querydsl = Querydsl(entityManager, entityPathBuilder)
    }

    override fun findAll(paginating: Paginating, search: String, fields: List<String>): Page<TaxProfileDefault> {
        TODO("Not yet implemented")
    }

    override fun findAll(paginating: Paginating, search: String): Page<TaxProfileDefault> {
        TODO("Not yet implemented")
    }

    override fun findAll(paginating: Paginating, fields: List<String>): Page<TaxProfileDefault> {
        TODO("Not yet implemented")
    }

    override fun findAll(paginating: Paginating): Page<TaxProfileDefault> {
        TODO("Not yet implemented")
    }

    override fun findById(id: Int): TaxProfileDefault {
        val entity = taxProfileRepository.findByIdOrNull(id) ?: throw EntityNotFoundException()
        return TaxProfileDefault(entity)
    }

    override fun findById(id: Int, fields: List<String>): TaxProfileDefault {
        TODO("Not yet implemented")
    }

    override fun embedSubResources(id: Int, embed: List<String>, entityResource: TaxProfileDefault): TaxProfileDefault {
        TODO("Not yet implemented")
    }

}