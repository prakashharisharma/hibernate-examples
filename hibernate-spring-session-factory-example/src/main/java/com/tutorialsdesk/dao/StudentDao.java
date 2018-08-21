package com.tutorialsdesk.dao;

import java.util.List;

import com.tutorialsdesk.entity.Student;

public interface StudentDao {

	List<Student> getStudents();
	void saveStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);
}
