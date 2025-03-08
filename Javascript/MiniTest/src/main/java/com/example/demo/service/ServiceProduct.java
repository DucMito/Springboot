package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ServiceProduct {
    List<Product> getAllProduct();

    Product getProductById(int id);

    List<Product> searchProducts(String keyword);
    List<Product> filterProducts(Integer rating);

    List<Product> filterProductsByPrice(double minPrice, double maxPrice);


}
