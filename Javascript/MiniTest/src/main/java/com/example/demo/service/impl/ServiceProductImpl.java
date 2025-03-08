package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.repository.RepositoryProduct;
import com.example.demo.service.ServiceProduct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class ServiceProductImpl implements ServiceProduct {

    private final RepositoryProduct repositoryProduct;

    public ServiceProductImpl(RepositoryProduct repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }

    @Override
    public List<Product> getAllProduct() {
        return repositoryProduct.getAllProduct();
    }

    @Override
    public Product getProductById(int id) {
        return repositoryProduct.getProductById(id);
    }

    @Override
    public List<Product> searchProducts(String keyword) {
        return repositoryProduct.searchProducts(keyword);
    }

    @Override
    public List<Product> filterProducts(Integer rating) {
        return repositoryProduct.filterProducts(rating);
    }

    @Override
    public List<Product> filterProductsByPrice(double minPrice, double maxPrice) {
        return repositoryProduct.filterProductsByPrice(minPrice, maxPrice);
    }


}
