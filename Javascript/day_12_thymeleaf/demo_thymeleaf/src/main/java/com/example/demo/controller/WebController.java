package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {
    private List<Person> people = new ArrayList<>(List.of(
            new Person(1, "Mito", "F", 16),
            new Person(2, "Duc Mito", "M", 21),
            new Person(3, "Mito Mito", "F", 22),
            new Person(4, "Anh", "M", 23)
    ));
    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("people", people);
        model.addAttribute("person", people.get(0));

        model.addAttribute("name","Mito");
        model.addAttribute("salary", 2000);
        return "index";
    }

}
