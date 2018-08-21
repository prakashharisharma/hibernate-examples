package com.tutorialsdesk.service;

import com.tutorialsdesk.entity.Student;

public interface StudentService {

	Student getStudent(int id);
	int saveStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);
}
