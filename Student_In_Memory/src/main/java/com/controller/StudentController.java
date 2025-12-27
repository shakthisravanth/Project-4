package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

// Marks this class as a REST controller
// Automatically converts responses to JSON

public class StudentController {
	
	// In-memory list used as a student repository [ List<Student> repo = new ArrayList<>(); ]

	// Constructor to add initial student data 
	/*
		repo.add(new Student(1, "Rahul", 21));
		repo.add(new Student(2, "Anita", 22));
	*/

	// Handles GET request to "/all"
	// Returns all students
	// Return type: List<Student>

	// Handles POST request to "/add"
	// Reads student data from request body
	// Adds student to repository
	// Return type: String (status message) =>  { "Student added successfully" }

}
