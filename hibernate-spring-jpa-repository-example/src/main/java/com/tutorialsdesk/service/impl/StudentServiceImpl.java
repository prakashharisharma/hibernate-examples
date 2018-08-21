package com.tutorialsdesk.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialsdesk.dao.StudentRepository;
import com.tutorialsdesk.entity.Student;
import com.tutorialsdesk.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student getStudent(int id) {
		
		return studentRepository.findById(id);
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);

	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}


}
