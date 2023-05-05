package com.davnig.invoicemanagementapi.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paginating {

    private Integer page = 0;
    private String sort = "+id";
    private Integer limit = 3;

}
