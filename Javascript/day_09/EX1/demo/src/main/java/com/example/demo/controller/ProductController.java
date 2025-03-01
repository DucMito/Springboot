package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {
    private List<Product> products = new ArrayList<>(List.of(
            new Product("1", "iPhone 12", "The latest iPhone", 999, "Apple"),
            new Product("2", "Samsung Galaxy S21", "Flagship Samsung", 899, "Samsung"),
            new Product("3", "MacBook Pro", "Powerful laptop", 1299, "Apple"),
            new Product("4", "Sony WH-1000XM4", "Noise Cancelling Headphones", 349, "Sony"),
            new Product("5", "Dell XPS 13", "Premium Windows Laptop", 1099, "Dell")
    ));

    // ✅ API GET tất cả sản phẩm (fix lỗi 404 Not Found)
    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    // 1. Lấy thông tin chi tiết sản phẩm theo ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // 2. Lấy sản phẩm với tên bắt đầu bằng prefix nào đó
    @GetMapping("/name-starts/{prefix}")
    public List<Product> getProductsByPrefix(@PathVariable String prefix) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().startsWith(prefix.toLowerCase()))
                .collect(Collectors.toList());
    }

    // 3. Lọc sản phẩm theo khoảng giá
    @GetMapping("/price/{min}/{max}")
    public List<Product> getProductsByPrice(@PathVariable int min, @PathVariable int max) {
        return products.stream()
                .filter(p -> p.getPrice() >= min && p.getPrice() <= max)
                .collect(Collectors.toList());
    }

    // 4. Lấy sản phẩm theo thương hiệu
    @GetMapping("/brand/{brand}")
    public List<Product> getProductsByBrand(@PathVariable String brand) {
        return products.stream()
                .filter(p -> p.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    // 5. Lấy sản phẩm có giá cao nhất theo thương hiệu
    @GetMapping("/brand/{brand}/max-price")
    public Product getMaxPriceProductByBrand(@PathVariable String brand) {
        return products.stream()
                .filter(p -> p.getBrand().equalsIgnoreCase(brand))
                .max((p1, p2) -> Integer.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);
    }
}
