package com.tutorialsdesk.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tutorialsdesk.entity.Student;

public class HibernateExample {

	private static SessionFactory sessionFactory = getSessionFactory();
	
	public static void main(String[] args) {

		Student s1 = new Student();
		
		s1.setRollno("2014CS001");
		s1.setFirstname("Ankit");
		s1.setLastname("Yadav");
		s1.setCourse("MCA");

		Student s2 = new Student();
		
		s2.setRollno("2014CS002");
		s2.setFirstname("Rahul");
		s2.setLastname("Verma");
		s2.setCourse("B.Tech");

		save(s1);
		
		List<Student> studentList = getStudents();

		studentList.forEach(System.out::println);
		
		save(s2);

		studentList = getStudents();

		studentList.forEach(System.out::println);
		
		s2.setCourse("M.Tech");
		
		update(s2);

		delete(s1);

		studentList = getStudents();

		studentList.forEach(System.out::println);
		
		closleSessionFactory(sessionFactory);

	}

	private static SessionFactory getSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}

	private static void closleSessionFactory(SessionFactory sessionFactory) {
		sessionFactory.close();
	}
	
	public static void save(Student student) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(student);

		session.getTransaction().commit();
		
		session.close();

	}

	public static void update(Student student) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.merge(student);

		session.getTransaction().commit();
		
		session.close();
	}

	public static void delete(Student student) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.delete(student);

		session.getTransaction().commit();
		
		session.close();
	}

	public static List<Student> getStudents() {

		Session session = sessionFactory.openSession();

		@SuppressWarnings("unchecked")
		List<Student> studentList = session.createQuery("FROM Student").list();
		
		session.close();
		
		return studentList;
	}

}
