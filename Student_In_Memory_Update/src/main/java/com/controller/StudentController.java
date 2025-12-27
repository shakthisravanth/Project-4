package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	@GetMapping("/all")
	public List<Student> getStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/getBy/{id}")
	public Object getStudentById(@PathVariable int id) {

		Student student = service.getStudentById(id);

		if (student == null) {
			return "Student not found";
		}
		return student;
	}

	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {

		service.addStudent(student);

		return "Student added successfully";

	}
}
