package com.example.demo.ultis.file;

import com.example.demo.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class CsvFileReader implements IFileReader {

    @Override
    public List<Person> readFile(String filePath) {
        List<Person> people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Bỏ qua dòng header
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 7) {
                    try {
                        Person person = new Person();
                        person.setId(values[0]);
                        person.setBirthday(values[1]);
                        person.setSalary(Double.parseDouble(values[2]));
                        person.setCity(values[3]);
                        person.setGender(values[4]);
                        person.setJob(values[5]);
                        person.setFullName(values[6]);
                        people.add(person);
                    } catch (NumberFormatException e) {
                        log.error("Lỗi chuyển đổi số trong dòng CSV: {}", line, e);
                    }
                } else {
                    log.warn("Dòng CSV không đúng định dạng: {}", line);
                }
            }
        } catch (IOException e) {
            log.error("Lỗi đọc file CSV: {}", filePath, e);
        }
        return people;
    }
}
