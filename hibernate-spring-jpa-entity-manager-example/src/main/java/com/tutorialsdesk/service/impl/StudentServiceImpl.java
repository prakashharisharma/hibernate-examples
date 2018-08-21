package com.tutorialsdesk.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialsdesk.dao.StudentDao;
import com.tutorialsdesk.entity.Student;
import com.tutorialsdesk.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student getStudent(int id) {
		
		return studentDao.getStudent(id);
	}

	@Override
	public int saveStudent(Student student) {
		return studentDao.saveStudent(student);

	}

	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);

	}

	@Override
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);

	}

}
