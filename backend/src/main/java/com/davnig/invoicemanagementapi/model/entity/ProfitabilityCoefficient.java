package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_profitability_coefficient")
@Getter
@Setter
public class ProfitabilityCoefficient {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profitability-coeff-id-gen")
    @SequenceGenerator(name = "profitability-coeff-id-gen", sequenceName = "t_profitability_coefficient_id_seq", allocationSize = 1)
    private int id;
    private float coefficient;
    private String description;

}
