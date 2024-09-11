package com.guardians.service;

import com.guardians.dto.ProductRequest;
import com.guardians.dto.ProductResponse;
import com.guardians.model.Product;
import com.guardians.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductSerivce {

	private final ProductRepository productRepository;

	public void createProduct(ProductRequest productRequest) {
		Product product = Product.builder().name(productRequest.getName()).description(productRequest.getDescriprion()).price(productRequest.getPrice()).build();

		productRepository.save(product);
		log.info("Product {} is saved", product.getId());

	}

	List<ProductResponse> getAllProducts(){
		List<Product> products = productRepository.findAll();
		products.stream().map(product -> mapToProductResponse());

		private ProductResponse mapToProductResponse(Product product){
					return Product.builder().name()
		}
	}
}
