package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProfitabilityCoefficient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private float coefficient;
    private String description;

}
