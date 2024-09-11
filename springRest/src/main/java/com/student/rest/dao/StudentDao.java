package com.student.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.rest.model.Student;

public interface StudentDao extends JpaRepository<Student, Long> {


}
