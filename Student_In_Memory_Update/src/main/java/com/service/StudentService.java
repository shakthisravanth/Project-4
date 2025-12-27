package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	public List<Student> getAllStudents() {
		return repository.getAllStudents();
	}

	public void addStudent(Student student) {
		repository.addStudent(student);
	}

	public Student getStudentById(int id) {
		return repository.getStudentById(id);
	}
	
}
