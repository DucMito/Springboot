package com.example.demo.model;

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;

    public Book(String id, int year, String author, String title) {
        this.id = id;
        this.year = year;
        this.author = author;
        this.title = title;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
