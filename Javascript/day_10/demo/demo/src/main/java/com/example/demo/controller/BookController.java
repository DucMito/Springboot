package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/books") //Tham so chung o duoi g@GetMapping de trong,(co the thay duoc GetMapping nhung dai dong hon)
@Controller//ap dung cho kieu tra ve(view) complate ->muon in ra du lieu thi thi +@ResponseBody
//@RestController //danh dau len class -> xu ly request client yeu cau tra ve response tuoong ung
// ClassResponseEntity<?>: class dai dien cho 1 doi tuong http response , co the chua body, header
public class BookController {

    private List<Book> books = new ArrayList<>(List.of(
            new Book("1", "de men phieu luu ky", "to hoai", 2000),
            new Book("2", "dat rung phuong nam", "to ", 2000),
            new Book("3", "conan", "toek", 2000),
            new Book("4", "doremon", "quang", 2000)
    ));



//lay danh sach book: Get - /books
//        @GetMapping("/books") //HTTP methor + api url
//        public List<Book> getBooks() {
//                return books;
//        }
//        @GetMapping("/books/{id}")
//        public Book getBook(@PathVariable String id) {
//                for (Book book : books) {
//                        if(book.getId().equals(id)) {
//                                return book;
//                        }
//                }
//                return null;
//        }

//        @GetMapping //HTTP methor + api url
//@RequestMapping(method = RequestMethod.GET)
//        public ResponseEntity<?> getBooks2() {
//                return new ResponseEntity<>(books, HttpStatus.CREATED);
//        }
//        @GetMapping
//        public String home() {
//                return "home"; //Ten template
//        }
//        @ResponseBody
//        @ResponseStatus(HttpStatus.CREATED)
//        @GetMapping("/")
//        public List<Book> getBooks() {
//                return books;
//        }

    @GetMapping("/sortByYear")
    public ResponseEntity<List<Book>> sortByYear() {
        return null;

    }


}






