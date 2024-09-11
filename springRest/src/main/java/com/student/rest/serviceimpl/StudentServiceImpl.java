package com.student.rest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.rest.dao.StudentDao;
import com.student.rest.exception.StudentNotFound;
import com.student.rest.model.Student;
import com.student.rest.response.BasicResponseMsg;
import com.student.rest.response.StudentRequestVo;
import com.student.rest.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	
		@Autowired
		private StudentDao studentDao;
		
	@Override
	public BasicResponseMsg saveStudent(StudentRequestVo studentRequestVo) {
		BasicResponseMsg response = new BasicResponseMsg();
		
		try {
			Student s = new Student();
			s.setAddress(studentRequestVo.getAddress());
			s.setAge(studentRequestVo.getAge());
			s.setMobileNumber(studentRequestVo.getMobileNumber());
			s.setRollNo(studentRequestVo.getRollNo());
			s.setName(studentRequestVo.getName());
			
			Student save = studentDao.save(s);
			
			response.setData(save.getId());
			response.setMessage("Student Saved");
			response.setStatus(200);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public BasicResponseMsg getStudent(Long id) {
		
		BasicResponseMsg response = new BasicResponseMsg();
		try {
			Optional<Student> findById= studentDao.findById(Long.valueOf(id));
			
			if(findById.isPresent()) {
				Student student = findById.get();
				response.setStatus(200);
				response.setData(student);
				response.setMessage("data found");
			}
			else {
				response.setStatus(400);
				response.setMessage("data not found");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return response;
	}

	
	public BasicResponseMsg deleteStudent(Long id) {
		BasicResponseMsg responseMsg=new BasicResponseMsg();
		
		 studentDao.deleteById(id);
		
		return responseMsg;
	}
	public List<Student> getAllStudent() {
			List<Student> s= studentDao.findAll();
			return s;
		
	}

	@Override
	public BasicResponseMsg updateStudent(Long id, StudentRequestVo student) {

	Student student2 = studentDao.findById(Long.valueOf(id)).orElseThrow(()->new StudentNotFound("Student not found with this id "+id));
		
	BasicResponseMsg response = new BasicResponseMsg();

		Student sNew = new Student();
		sNew.setId(id);
		sNew.setRollNo(student.getRollNo());
		sNew.setAddress(student.getAddress());
		sNew.setAge(student.getAge());
		sNew.setMobileNumber(student.getMobileNumber());
		sNew.setName(student.getName());

		Student save =studentDao.save(sNew);
		response.setData(save.getId());
		response.setMessage("Student Saved");
		response.setStatus(200);
		
		return response;
	}

}
