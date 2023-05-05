package com.davnig.invoicemanagementapi.model.dto;

import com.davnig.invoicemanagementapi.model.entity.TaxableSubject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaxableSubjectDetail {

    private String piva;
    private String firstName;
    private String lastName;
    private String taxCode;

    public TaxableSubjectDetail(TaxableSubject entity) {
        this.piva = entity.getPiva();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.taxCode = entity.getTaxCode();
    }

}
