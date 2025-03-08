package com.example.demo.controller;

import com.example.demo.db.InitDB;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public String home() {
        return "index"; // Trả về trang index.html
    }


    @GetMapping("/getAll")
    public String getAllPerson(Model model) {
        List<Person> people = personService.getAllPerson();
        model.addAttribute("people", people);
        return "people";
    }

    @GetMapping("/person/{id}")
    public String getPersonById(Model model, @PathVariable String id){

        Person person = personService.getPersonById(id);
        model.addAttribute("person", person);
        return "person";
    }


}



