package com.guardians.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guardians.dao.UserDao;
import com.guardians.models.User;

@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping("save")
	public User save(@RequestBody User user) {
		
		return userDao.save(user); 
	}
	@GetMapping("get/{userId}")
	public User get(@PathVariable String userId) {
		
		return userDao.get(userId); 
	}
	
	
	
	@GetMapping("find-all")
	public Map<Object, Object> getAll() {
		
		return userDao.findAll(); 
	}
	
	
	
	@DeleteMapping("delete/{userId}")
	public void delete(@PathVariable String userId) {
		
		userDao.delete(userId); 
	}
	
	
}
