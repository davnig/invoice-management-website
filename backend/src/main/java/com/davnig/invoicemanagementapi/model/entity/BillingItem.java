package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_billing_item")
@Getter
@Setter
public class BillingItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "billing-item-id-gen")
    @SequenceGenerator(name = "billing-item-id-gen", sequenceName = "t_billing_item_id_seq", allocationSize = 1)
    private int id;
    @ManyToOne
    private BillingItemType type;
    private String description;
    private int price;
    private int quantity;

}
