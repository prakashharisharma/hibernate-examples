package com.tutorialsdesk.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutorialsdesk.dao.StudentDao;
import com.tutorialsdesk.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Student> getStudents() {
		
		Session session = sessionFactory.openSession();
		
		@SuppressWarnings("unchecked")
		List<Student> studentList = session.createQuery("FROM Student").list();
		
		return studentList;
	}
	
	
	@Override
	public void saveStudent(Student student) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(student);

		session.getTransaction().commit();
		
		//session.close();

	}
	
	@Override
	public void updateStudent(Student student) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.merge(student);

		session.getTransaction().commit();
		
		//session.close();
	}

	@Override
	public void deleteStudent(Student student) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.delete(student);

		session.getTransaction().commit();
		
		//session.close();
	}

}
