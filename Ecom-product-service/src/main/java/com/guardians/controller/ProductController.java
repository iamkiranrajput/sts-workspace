package com.guardians.controller;

import com.guardians.dto.ProductResponse;
import com.guardians.model.Product;
import com.guardians.service.ProductSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.guardians.dto.ProductRequest;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
		private final ProductSerivce productSerivce;


		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public void createProduct(@RequestBody ProductRequest productRequest) {
			productSerivce.createProduct(productRequest);
			
		}

		@GetMapping
		@ResponseStatus(HttpStatus.OK)
		public List<ProductResponse> getAllProducts(){
			productSerivce.getAllProducts();
		}
}
