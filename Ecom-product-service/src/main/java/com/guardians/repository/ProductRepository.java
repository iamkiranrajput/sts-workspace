package com.guardians.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.guardians.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
