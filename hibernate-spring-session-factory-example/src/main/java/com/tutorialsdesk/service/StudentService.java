package com.tutorialsdesk.service;

import java.util.List;

import com.tutorialsdesk.entity.Student;

public interface StudentService {

	List<Student> getStudents();
	void saveStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);
}
