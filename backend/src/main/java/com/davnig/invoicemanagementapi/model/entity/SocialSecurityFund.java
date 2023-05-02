package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_social_security")
@Getter
@Setter
public class SocialSecurityFund {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "social-security-id-gen")
    @SequenceGenerator(name = "social-security-id-gen", sequenceName = "t_social_security_id_seq", allocationSize = 1)
    private int id;
    private String name;
    private float rate;

}
