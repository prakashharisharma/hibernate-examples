package com.tutorialsdesk;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutorialsdesk.entity.Student;
import com.tutorialsdesk.service.StudentService;

@Component
public class AppRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(AppRunner.class);

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

		Student studentResult = studentService.getStudent(s1.getId());

		log.info("STUDENT " + studentResult);

		studentService.saveStudent(s2);

		studentResult = studentService.getStudent(s1.getId());

		log.info("STUDENT " + studentResult);

		s2.setCourse("M.Tech");

		studentService.saveStudent(s2);

		// studentService.deleteStudent(s1);

		studentResult = studentService.getStudent(s1.getId());

		log.info("STUDENT " + studentResult);
		
		List<Student> studenList = studentService.getStudents();
		
		studenList.forEach(System.out::println);

	}

}
