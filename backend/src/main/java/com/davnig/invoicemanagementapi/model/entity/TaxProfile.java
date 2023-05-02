package com.davnig.invoicemanagementapi.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_tax_profile")
@Getter
@Setter
public class TaxProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tax_profile-id-gen")
    @SequenceGenerator(name = "tax_profile-id-gen", sequenceName = "t_tax_profile_id_seq", allocationSize = 1)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_prof_coefficient", referencedColumnName = "id")
    private ProfitabilityCoefficient profitabilityCoefficient;
    @ManyToOne
    @JoinColumn(name = "id_social_security_fund", referencedColumnName = "id")
    private SocialSecurityFund socialSecurityFund;
    @ManyToOne
    @JoinColumn(name = "id_flat_rate_scheme", referencedColumnName = "id")
    private FlatRateScheme flatRateScheme;

}
