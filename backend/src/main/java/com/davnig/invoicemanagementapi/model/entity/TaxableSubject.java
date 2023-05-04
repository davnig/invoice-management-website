package com.davnig.invoicemanagementapi.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "t_taxable_subject")
public class TaxableSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taxable-subject-id-gen")
    @SequenceGenerator(name = "taxable-subject-id-gen", sequenceName = "t_taxable_subject_id_seq", allocationSize = 1)
    @JsonIgnore
    private int id;
    @Column(name = "p_iva")
    private String piva;
    private String firstName;
    private String lastName;
    private String taxCode;

}


