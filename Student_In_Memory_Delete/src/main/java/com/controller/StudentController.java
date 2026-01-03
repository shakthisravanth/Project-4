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

	// Inject StudentService using @Autowired
	
	// StudentService reference variable
	
	// GET /all → fetch all students
	// Return type: List<Student>
	
	// GET /getBy/{id} → fetch student by id
	// Return type: Object (Student if found, else message)
	
	// DELETE /delete/{id} → delete student by id
	// Return type: String (status message)


}
