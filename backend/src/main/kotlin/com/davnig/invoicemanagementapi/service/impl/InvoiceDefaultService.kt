package com.davnig.invoicemanagementapi.service.impl

import com.davnig.invoicemanagementapi.model.dto.InvoiceDetail
import com.davnig.invoicemanagementapi.model.dto.InvoiceSummary
import com.davnig.invoicemanagementapi.model.dto.Paginating
import com.davnig.invoicemanagementapi.model.entity.Invoice
import com.davnig.invoicemanagementapi.model.entity.QInvoice
import com.davnig.invoicemanagementapi.repository.InvoiceRepository
import com.davnig.invoicemanagementapi.service.EntityService
import com.querydsl.core.types.dsl.PathBuilder
import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.jpa.repository.support.JpaEntityInformation
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport
import org.springframework.data.jpa.repository.support.Querydsl
import org.springframework.data.querydsl.SimpleEntityPathResolver
import org.springframework.stereotype.Service

@Service
class InvoiceDefaultService(
    private val invoiceRepository: InvoiceRepository,
    entityManager: EntityManager
) : EntityService<InvoiceSummary, InvoiceDetail> {

    @Autowired
    private lateinit var jpaQueryFactory: JPAQueryFactory
    private val qEntity: QInvoice = QInvoice.invoice
    private val querydsl: Querydsl

    init {
        val entityInfo: JpaEntityInformation<Invoice, *> =
            JpaEntityInformationSupport.getEntityInformation(Invoice::class.java, entityManager)
        val entityPath = SimpleEntityPathResolver.INSTANCE.createPath(entityInfo.javaType)
        val entityPathBuilder: PathBuilder<Invoice> = PathBuilder(entityPath.type, entityPath.metadata)
        querydsl = Querydsl(entityManager, entityPathBuilder)
    }

    override fun findAll(paginating: Paginating, search: String, fields: List<String>): Page<InvoiceSummary> {
        TODO("Not yet implemented")
    }

    override fun findAll(paginating: Paginating, search: String): Page<InvoiceSummary> {
        TODO("Not yet implemented")
    }

    override fun findAll(paginating: Paginating, fields: List<String>): Page<InvoiceSummary> {
        TODO("Not yet implemented")
    }

    override fun findAll(paginating: Paginating): Page<InvoiceSummary> {
        TODO("Not yet implemented")
    }

    override fun findById(id: Int): InvoiceDetail {
        TODO("Not yet implemented")
    }

    override fun findById(id: Int, fields: List<String>): InvoiceDetail {
        TODO("Not yet implemented")
    }

}