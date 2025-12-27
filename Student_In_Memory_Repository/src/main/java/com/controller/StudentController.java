package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;


    @GetMapping("/all")
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        service.addStudent(student);
        return "Student added successfully";
    }
}
