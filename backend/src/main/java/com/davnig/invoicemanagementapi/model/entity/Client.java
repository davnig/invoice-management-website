package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Client {

    @Id
    private String taxCode;
    private String name;
    private String address;
    @OneToMany
    private Set<Invoice> invoices;

}
