package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class TaxableSubject {

    @Id
    private String pIVA;
    private String firstName;
    private String lastName;
    private String taxCode;
    @OneToOne
    private TaxProfile taxProfile;
    @OneToMany
    private Set<Client> clients;
    @OneToMany
    private Set<Invoice> invoices;

}
