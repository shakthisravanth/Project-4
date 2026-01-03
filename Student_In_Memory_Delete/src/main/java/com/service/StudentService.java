package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public List<Student> getAllStudents() {
		return repository.getAllStudents();
	}

	public Student getStudentById(int id) {
		return repository.getStudentById(id);
	}

	// Method to delete student using repository
	// Return type: boolean

}
