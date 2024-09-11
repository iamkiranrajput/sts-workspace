package com.guardians.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

public class ProductResponse {
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data

    public class Product {
        private String id;
        private String name;
        private String description;
        private BigDecimal price;
    }
}
