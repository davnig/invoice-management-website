package com.davnig.invoicemanagementapi.model.dto;

import com.davnig.invoicemanagementapi.model.entity.TaxableSubject;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TaxableSubjectSummary {

    private String piva;
    private String fullName;

    public TaxableSubjectSummary(TaxableSubject entity) {
        this.piva = entity.getPiva();
        this.fullName = entity.getFirstName() + " " + entity.getLastName();
    }

}
