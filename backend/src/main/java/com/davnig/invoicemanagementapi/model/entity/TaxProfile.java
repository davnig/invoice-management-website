package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TaxProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name="idProfitabilityCoefficient", nullable=false)
    private ProfitabilityCoefficient profitabilityCoefficient;
    @ManyToOne
    @JoinColumn(name="idSocialSecurityFund", nullable=false)
    private SocialSecurityFund socialSecurityFund;
    @ManyToOne
    @JoinColumn(name="idFlatRateScheme", nullable=false)
    private FlatRateScheme flatRateScheme;

}
