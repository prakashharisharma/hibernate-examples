package com.tutorialsdesk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutorialsdesk.entity.Student;
import com.tutorialsdesk.service.StudentService;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private StudentService studentService;
	
	@Override
	public void run(String... arg0) throws Exception {
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

		studentService.saveStudent(s1);

		List<Student> studentList = studentService.getStudents();

		studentList.forEach(System.out::println);

		studentService.saveStudent(s2);

		studentList = studentService.getStudents();

		studentList.forEach(System.out::println);

		s2.setCourse("M.Tech");

		studentService.updateStudent(s2);

		//studentService.deleteStudent(s1);

		studentList = studentService.getStudents();

		studentList.forEach(System.out::println);

	}

}
