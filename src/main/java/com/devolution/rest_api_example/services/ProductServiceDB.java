package com.devolution.rest_api_example.services;

import com.devolution.rest_api_example.model.*;
import com.devolution.rest_api_example.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@ConditionalOnProperty(name="database.type", havingValue = "DB")
public class ProductServiceDB implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(new Product());
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        Optional<Product> byId = productRepository.findById(id);
        byId.ifPresent(productRepository::delete);
    }
}

