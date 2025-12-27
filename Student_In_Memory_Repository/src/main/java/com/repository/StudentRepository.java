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
        students.add(new Student(2, "Anita", 22));
        
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
