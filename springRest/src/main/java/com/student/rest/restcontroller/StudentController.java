package com.student.rest.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.rest.model.Student;
import com.student.rest.response.BasicResponseMsg;
import com.student.rest.response.StudentRequestVo;
import com.student.rest.service.StudentService;

@RestController
@RequestMapping("/api")

public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/post-student")
	public ResponseEntity<BasicResponseMsg> saveStudent(@RequestBody StudentRequestVo studentRequestVo){
		BasicResponseMsg response = new BasicResponseMsg();
		try {
			response = studentService.saveStudent(studentRequestVo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<BasicResponseMsg>(response, HttpStatus.OK);
	}
	
	@GetMapping("/get-student/{id}")
	public ResponseEntity<BasicResponseMsg> getStudent(@PathVariable Long id){
		BasicResponseMsg response = new BasicResponseMsg();
		try {
			response = studentService.getStudent(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-student")
	public ResponseEntity<BasicResponseMsg> deleteStudent(@PathVariable Long id){
		BasicResponseMsg response= new BasicResponseMsg();
		try {
			response = studentService.deleteStudent(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/get-student")
	public ResponseEntity<List<Student>> getAllStudent(){
		
		List<Student> response = studentService.getAllStudent();
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping("/update-student/{id}")
	public ResponseEntity<BasicResponseMsg> updateStudent(@PathVariable Long id, @RequestBody StudentRequestVo studentRequestVo){
		BasicResponseMsg response = studentService.updateStudent(id, studentRequestVo);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
}
