package com.guardians.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductRequest {
	private String name;
	private String descriprion;
	private BigDecimal price;

}
