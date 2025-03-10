package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {
    private String id;
    private String fullName;
    private String job;
    private String gender;
    private String city;
    private double salary;
    private String birthday;

}
