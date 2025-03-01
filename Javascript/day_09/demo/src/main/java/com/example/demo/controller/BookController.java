package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // Đánh dấu lên class -> Class nay xu lý request và response
public class BookController {
    private List<Book> books = new ArrayList<>(List.of(
            new Book("1", 2000, "To Hoai", "De men"),
            new Book("2", 2001, "To Huu", "Aokiji"),
            new Book("3", 2002, "Oda", "One piece")
    ));

    //1. lay danh sach book GET -/book
    @GetMapping("/books") // http method + api url
    public List<Book> getAllBooks(){
        return books;
    }
    //2. lay chi tiet book theo id: GET -/book/{id}
//    public Book getBookById(){
//
//    };




}
