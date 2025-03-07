package com.example.demo.ultis.file;

import com.example.demo.model.Person;

import java.util.List;

public interface IFileReader {
    List<Person> read(String filePath);
}
