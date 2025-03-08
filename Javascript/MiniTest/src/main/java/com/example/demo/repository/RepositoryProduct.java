package com.example.demo.repository;

import com.example.demo.model.Product;

import java.util.List;

public interface RepositoryProduct {
    List<Product> getAllProduct();

    Product getProductById(int id);

    List<Product> searchProducts(String keyword);

    List<Product> filterProducts(Integer rating);

    List<Product> filterProductsByPrice(double minPrice, double maxPrice);


}
