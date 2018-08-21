package com.tutorialsdesk.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.tutorialsdesk.dao.StudentDao;
import com.tutorialsdesk.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public int saveStudent(Student student) {
		entityManager.persist(student);
		return student.getId();
	}

	@Override
	public Student getStudent(int id) {
		
        return entityManager.find(Student.class, id);
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
		
	}

	@Override
	public void deleteStudent(Student student) {
		entityManager.remove(student);
		
	}

}
