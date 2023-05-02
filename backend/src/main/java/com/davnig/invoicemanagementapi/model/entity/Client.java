package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "t_client")
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client-id-gen")
    @SequenceGenerator(name = "client-id-gen", sequenceName = "t_client_id_seq", allocationSize = 1)
    private int id;
    private String taxCode;
    private String name;
    private String address;
    @OneToMany
    private Set<Invoice> invoices;

}
