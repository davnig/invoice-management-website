package com.davnig.invoicemanagementapi.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paginating {

    private Integer page = 0;
    private String sort = "+id";
    private Integer limit = 3;

    public Pageable getPageable() {
        return PageRequest.of(this.getPage(), this.getLimit(), SortConverter.parse(this.getSort()));
    }

}
