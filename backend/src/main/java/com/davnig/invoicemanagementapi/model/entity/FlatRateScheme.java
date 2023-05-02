package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_flat_rate_scheme")
@Getter
@Setter
public class FlatRateScheme {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flat-rate-scheme-id-gen")
    @SequenceGenerator(name = "flat-rate-scheme-id-gen", sequenceName = "t_flat_rate_scheme_id_seq", allocationSize = 1)
    private int id;
    private String name;
    private float rate;

}
