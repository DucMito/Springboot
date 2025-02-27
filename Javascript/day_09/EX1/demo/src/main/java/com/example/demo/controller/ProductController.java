package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ProductController {
    private List<Product> products = new ArrayList<>(List.of(
            new Product("1", "iPhone 12", "The latest iPhone", 999, "Apple"),
            new Product("2", "Samsung Galaxy S21", "Flagship Samsung", 899, "Samsung"),
            new Product("3", "MacBook Pro", "Powerful laptop", 1299, "Apple"),
            new Product("4", "Sony WH-1000XM4", "Noise Cancelling Headphones", 349, "Sony"),
            new Product("5", "Dell XPS 13", "Premium Windows Laptop", 1099, "Dell")
    ));

    @GetMapping("/products")
    public List<Product> getProducts() {
        return products;
    }

}
