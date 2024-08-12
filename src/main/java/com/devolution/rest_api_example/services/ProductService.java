package com.devolution.rest_api_example.services;

import com.devolution.rest_api_example.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(Integer id);

    void addProduct(Product product);

    void deleteProduct(Integer id);
}
