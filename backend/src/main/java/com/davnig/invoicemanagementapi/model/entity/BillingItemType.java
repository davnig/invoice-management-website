package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_billing_item_type")
@Getter
@Setter
public class BillingItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "billing-item-type-id-gen")
    @SequenceGenerator(name = "billing-item-type-id-gen", sequenceName = "t_billing_item_type_id_seq", allocationSize = 1)
    private int id;
    private String name;

}
