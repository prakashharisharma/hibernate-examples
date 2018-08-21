package com.tutorialsdesk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorialsdesk.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	Student findById(int id);
}
