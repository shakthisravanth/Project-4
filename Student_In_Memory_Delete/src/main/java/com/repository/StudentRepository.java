package com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentRepository {

	private List<Student> students = new ArrayList<>();

	public StudentRepository() {
		students.add(new Student(1, "Rahul", 21));
		students.add(new Student(2, "Anita", 19));
		students.add(new Student(3, "Sharvari", 20));
		students.add(new Student(4, "Tanwir", 19));
		students.add(new Student(5, "Sravanth", 21));
		students.add(new Student(6, "Anil", 23));
	}

	public List<Student> getAllStudents() {
		return students;
	}

	public Student getStudentById(int id) {
		for (Student s : students) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	// Method to delete a student by id
	// Return type: boolean
	
	// Find student using id
	
	// If student exists, remove from list and return true
	
	// If student not found, return false

}
