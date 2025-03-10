package com.example.demo.db;

import com.example.demo.model.Person;
import com.example.demo.ultis.file.IFileReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
@Slf4j
public class InitDB implements CommandLineRunner
{
    private final IFileReader iFileReader;

    public InitDB(IFileReader iFileReader) {
        this.iFileReader = iFileReader;
    }


    @Override
    public void run(String... args) throws Exception {
        log.info("Start init data");
        List<Person> people = iFileReader.readFile("data.csv");
        log.info("People size: ", people.size());

        PersonDB.people = people;

    }

    public List<Person> getPeople() {
    }
}
