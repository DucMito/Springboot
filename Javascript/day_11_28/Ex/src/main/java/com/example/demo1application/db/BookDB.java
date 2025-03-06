package com.example.demo1application.db;

import com.example.demo1application.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDB {

    public static List<Book> books = new ArrayList<>(List.of(new Book("1", "Chí Phèo", "Nam Cao", 1936),
            new Book("2", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 1941),
            new Book("3", "Văn Học Việt Nam", "Hoài Thanh", 1958),
            new Book("4", "Tắt Đèn", "Ngô Tất Tố", 1939),
            new Book("5", "Lão Hạc", "Nam Cao", 1943),
            new Book("6", "Số Đỏ", "Vũ Trọng Phụng", 1936)));
}
