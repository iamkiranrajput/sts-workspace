package com.student.rest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.student.rest.model.Student;
import com.student.rest.response.BasicResponseMsg;
import com.student.rest.response.StudentRequestVo;

public interface StudentService {
	public BasicResponseMsg saveStudent(StudentRequestVo student);

	public BasicResponseMsg getStudent(Long id);

	public BasicResponseMsg deleteStudent(Long id);

	public List<Student> getAllStudent();
	
	public  BasicResponseMsg updateStudent(Long id,StudentRequestVo student);

	
}