package com.devolution.rest_api_example.repository;

import com.devolution.rest_api_example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository  extends JpaRepository<Product, Integer> {
}
