package com.tutorialsdesk.dao;

import com.tutorialsdesk.entity.Student;

public interface StudentDao {

	Student getStudent(int id);
	int saveStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);
}
