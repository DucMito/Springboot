package com.example.demo.utils.file;

import com.example.demo.model.Product;

import java.util.List;

public interface IFileReader {
    List<Product> readFile(String filePath);
}
