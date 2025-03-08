package com.example.demo.controller;

import com.example.demo.model.PageResponse;
import com.example.demo.model.Person;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class WebController {
    private List<Person> people = new ArrayList<>();

    public WebController() {
        Faker faker = new Faker();
        Random rd = new Random();
        for(int i = 0; i < 50; i++){
            Person person = new Person(i+1,
                    faker.name().fullName(),
                    rd.nextInt(2) == 1 ? "M" : "F",
                    faker.number().numberBetween(18,60)
                    );
            people.add(person);
        }
    }

    @GetMapping("/")  //http://localhost:8080/
    public String getHome(Model model, @RequestParam(required = false) String keyword,
                          @RequestParam(required = false, defaultValue = "1") int page){

        List<Person> peopleFound = new ArrayList<>();
        if(keyword != null) {
            for (Person person: people){
                if(person.getName().toLowerCase().contains(keyword.toLowerCase())){
                    peopleFound.add(person);
                }
            }

        }
        else {
            peopleFound = people;
        }
        PageResponse<Person> pageResponse = new PageResponse<>(peopleFound, 10, page);
        model.addAttribute("pageResponse", pageResponse);

        model.addAttribute("people", peopleFound);
        model.addAttribute("person", people.get(0));

        model.addAttribute("name","Mito");
        model.addAttribute("salary", 2000);
        return "index";
    }

    // http://localhost:8080/person/1
    @GetMapping("/person/{id}")
    public String getPersonById(Model model, @PathVariable int id){
        Person person = people.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        model.addAttribute("person" , person);
        return "person";
    }

}
