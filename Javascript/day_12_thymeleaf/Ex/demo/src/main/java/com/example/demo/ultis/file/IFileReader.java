package com.example.demo.ultis.file;

import com.example.demo.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IFileReader {
    List<Person> readFile(String filePath);
}
