package com.davnig.invoicemanagementapi.model.dto;


import lombok.NonNull;
import org.springframework.data.domain.Sort;

public class SortConverter {

    public enum SortDirection {
        ASCENDING("+") {
            @Override
            public Sort.Direction parse(String value) {
                return Sort.Direction.ASC;
            }
        },
        DESCENDING("-") {
            @Override
            public Sort.Direction parse(String value) {
                return Sort.Direction.DESC;
            }
        };

        private final String value;

        SortDirection(String value) {
            this.value = value;
        }

        public abstract Sort.Direction parse(String value);
    }

    /**
     * Parse the given {@literal String} in a {@link Sort} object.
     *
     * @param sortOrder a field name prefixed with "+" (ascending) or "-" (descending), e.g. "+id"
     * @return {@link Sort}
     */
    public static Sort parse(@NonNull String sortOrder) {
        if (sortOrder.length() < 1) throw new IllegalArgumentException();

        String direction = String.valueOf(sortOrder.charAt(0));
        for (SortDirection el : SortDirection.values()) {
            if (el.value.equals(direction)) {
                return Sort.by(el.parse(direction), sortOrder.substring(1));
            }
        }
        throw new IllegalArgumentException();
    }

}
