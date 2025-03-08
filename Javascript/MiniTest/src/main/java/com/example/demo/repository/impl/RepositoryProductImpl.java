package com.example.demo.repository.impl;

import com.example.demo.db.InitDB;
import com.example.demo.db.ProductDB;
import com.example.demo.model.Product;
import com.example.demo.repository.RepositoryProduct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@Slf4j
public class RepositoryProductImpl implements RepositoryProduct {

    private final InitDB initDB;

    public RepositoryProductImpl(InitDB initDB) {
        this.initDB = initDB;
    }

    @Override
    public List<Product> getAllProduct() {
        return ProductDB.products;
    }

    @Override
    public Product getProductById(int id) {
        for (Product product : ProductDB.products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null; // Trả về null nếu không tìm thấy sản phẩm
    }

    @Override
    public List<Product> searchProducts(String keyword) {
        return ProductDB.products.stream()
                .filter(product -> product.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> filterProducts(Integer rating) {
        if (rating == null) {
            return ProductDB.products;
        }

        return ProductDB.products.stream()
                .filter(product -> product.getRating() >= rating)
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> filterProductsByPrice(double minPrice, double maxPrice) {
        return ProductDB.products.stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}

