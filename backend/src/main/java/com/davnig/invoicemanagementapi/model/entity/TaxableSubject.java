package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_taxable_subject")
@Getter
@Setter
public class TaxableSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taxable-subject-id-gen")
    @SequenceGenerator(name = "taxable-subject-id-gen", sequenceName = "t_taxable_subject_id_seq", allocationSize = 1)
    private int id;
    @Column(name = "p_iva")
    private String pIVA;
    private String firstName;
    private String lastName;
    private String taxCode;
    @OneToOne
    @JoinColumn(name = "id_tax_profile", referencedColumnName = "id")
    private TaxProfile taxProfile;

}
