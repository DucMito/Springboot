package com.example.demo.db;

import com.example.demo.model.Product;
import com.example.demo.utils.file.IFileReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Slf4j
public class InitDB implements CommandLineRunner {

    private final IFileReader iFileReader;

    public InitDB(IFileReader iFileReader) {
        this.iFileReader = iFileReader;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Start init data: ");
        List<Product> products = iFileReader.readFile("product.json");
        log.info("Person size: {}", products.size());

        ProductDB.products = products;
    }
}
