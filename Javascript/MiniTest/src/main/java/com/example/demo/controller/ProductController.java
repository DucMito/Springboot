package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ServiceProduct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    private final ServiceProduct serviceProduct;


    public ProductController(ServiceProduct serviceProduct) {
        this.serviceProduct = serviceProduct;
    }

    @GetMapping("/")
    public String getAllProduct(Model model){
        List<Product> products = serviceProduct.getAllProduct();
        model.addAttribute("products", products);
        return "product";

    }

    @GetMapping("/products/{id}")
    public String getProductById(@PathVariable int id, Model model) {
        Product product = serviceProduct.getProductById(id);
        if (product != null) {
            model.addAttribute("product", product);
            return "product-detail"; // Tạo template product-detail.html
        } else {
            return "error"; // Tạo template error.html
        }
    }

    @GetMapping("/search")
    public String searchProducts(@RequestParam("keyword") String keyword, Model model) {
        List<Product> products = serviceProduct.searchProducts(keyword);
        model.addAttribute("products", products);
        return "product";
    }

    @GetMapping("/filter")
    public String filterProducts(
            @RequestParam(value = "minPrice", required = false, defaultValue = "0") double minPrice,
            @RequestParam(value = "maxPrice", required = false, defaultValue = "1000000") double maxPrice,
            Model model) {

        List<Product> products = serviceProduct.filterProductsByPrice(minPrice, maxPrice);
        model.addAttribute("products", products);
        return "product";
    }
}
