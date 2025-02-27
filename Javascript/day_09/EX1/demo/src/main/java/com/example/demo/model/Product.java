package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  // Constructor không tham số
@AllArgsConstructor // Constructor có đầy đủ tham số
public class Product {
    private String id;
    private String name;
    private String description;
    private int price;
    private String brand;
}
