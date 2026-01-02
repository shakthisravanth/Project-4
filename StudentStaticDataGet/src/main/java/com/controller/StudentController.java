package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

@RestController
public class StudentController {

	 @GetMapping("/get")
    public Student getStudent() {
        return new Student(1, "Shakthi");
    }

    @PostMapping("/add")
    public Student setStudent(@RequestBody Student std) {
        return std;
    }

}
