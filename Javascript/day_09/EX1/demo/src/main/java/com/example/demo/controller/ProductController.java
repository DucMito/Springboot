package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/products")
public class ProductController {
    private List<Product> products = new ArrayList<>(List.of(
            new Product("1", "iPhone 12", "The latest iPhone", 999, "Apple"),
            new Product("2", "Samsung Galaxy S21", "Flagship Samsung", 899, "Samsung"),
            new Product("3", "MacBook Pro", "Powerful laptop", 1299, "Apple"),
            new Product("4", "Sony WH-1000XM4", "Noise Cancelling Headphones", 349, "Sony"),
            new Product("5", "Dell XPS 13", "Premium Windows Laptop", 1099, "Dell")
    ));

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct(){
//        return ResponseEntity.ok(products);
        return new ResponseEntity<>(products, HttpStatus.CREATED);
    }


//    @GetMapping
//    public List<Product> getAllProduct() {
//        return products;
//    }


//    //1. Lấy thông tin chi tiết của một sản phẩm
//    //API: GET /products/{id}
//    @GetMapping("/{id}")
//    public Product getProductById(@PathVariable String id){
//        for (Product product: products){
//            if(product.getId().equals(id)){
//                return product;
//            }
//        }
//        return null;
//    }

    @ResponseBody
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id){
        for(Product product: products){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }



//    // 2. Lấy sản phẩm với tên bắt đầu bằng prefix nào đó
//    @GetMapping("/name-starts/{prefix}")
//    public List<Product> getProductsByPrefix(@PathVariable String prefix) {
//        List<Product> result = new ArrayList<>();
//        for (Product product : products) {
//            if (product.getName().toLowerCase().startsWith(prefix.toLowerCase())) {
//                result.add(product);
//            }
//        }
//        return result;
//    }

    //    // 2. Lấy sản phẩm với tên bắt đầu bằng prefix nào đó
    //    @GetMapping("/name-starts/{prefix}")
    @GetMapping("/name-starts/{prefix}")
    public ResponseEntity<List<Product>> getProductByPrefix(@PathVariable String prefix) {
        List<Product> rs = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().startsWith(prefix.toLowerCase())) {
                rs.add(product);
            }
        }
        if (rs.isEmpty()) {
            return ResponseEntity.noContent().build();  // Trả về 204 nếu không tìm thấy sản phẩm nào
        }

        return ResponseEntity.ok(rs);  // Trả về danh sách sản phẩm tìm được với mã 200 OK
    }





//
//    // 3. Lọc sản phẩm theo khoảng giá
//    @GetMapping("/price/{min}/{max}")
//    public List<Product> getProductsByPrice(@PathVariable int min, @PathVariable int max) {
//        return products.stream()
//                .filter(p -> p.getPrice() >= min && p.getPrice() <= max)
//                .collect(Collectors.toList());
//    }



//
//    // 4. Lấy sản phẩm theo thương hiệu
//    @GetMapping("/brand/{brand}")
//    public List<Product> getProductsByBrand(@PathVariable String brand) {
//        return products.stream()
//                .filter(p -> p.getBrand().equalsIgnoreCase(brand))
//                .collect(Collectors.toList());
//    }
//
//    // 5. Lấy sản phẩm có giá cao nhất theo thương hiệu
//    @GetMapping("/brand/{brand}/max-price")
//    public Product getMaxPriceProductByBrand(@PathVariable String brand) {
//        return products.stream()
//                .filter(p -> p.getBrand().equalsIgnoreCase(brand))
//                .max((p1, p2) -> Integer.compare(p1.getPrice(), p2.getPrice()))
//                .orElse(null);
//    }
}
