package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public List<Student> getAllStudents() {
		return repository.getAllStudents();
	}

	public void addStudent(Student student) {
		repository.addStudent(student);
	}

	// Method to get student by id using repository
	// Accepts student id as parameter
	// Return type: Student

	
}
