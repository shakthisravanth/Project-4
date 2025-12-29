package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/getBy/{id}")
	public Object getStudentById(@PathVariable int id) {

		Student student = service.getStudentById(id);

		if (student == null) {
			return "Student not found";
		}
		return student;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		boolean deleted = service.deleteStudent(id);
		if (deleted) {
			return "Student deleted successfully";
		}
		return "Student not found";
	}

}
