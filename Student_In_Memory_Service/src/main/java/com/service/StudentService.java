package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public class StudentService {

	private List<Student> repo = new ArrayList<>();

	public StudentService() {
		repo.add(new Student(1, "Rahul", 21));
		repo.add(new Student(2, "Anita", 22));
	}

	public List<Student> getAllStudents() {
		return repo;
	}

	public void addStudent(Student student) {
		repo.add(student);
	}

}