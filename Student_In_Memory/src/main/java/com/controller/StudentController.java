package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

@RestController
public class StudentController {

	List<Student> repo = new ArrayList<>();

	public StudentController() {
		repo.add(new Student(1, "Rahul", 21));
		repo.add(new Student(2, "Anita", 22));
	}

	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return repo;
	}

	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		repo.add(student);
		return "Student added successfully";
	}

}
