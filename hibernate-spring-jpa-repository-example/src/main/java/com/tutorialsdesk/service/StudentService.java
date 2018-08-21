package com.tutorialsdesk.service;

import java.util.List;

import com.tutorialsdesk.entity.Student;

public interface StudentService {

	Student getStudent(int id);
	List<Student> getStudents();
	Student saveStudent(Student student);
}
