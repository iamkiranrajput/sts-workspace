package com.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.security.entity.Employee;
import com.security.repository.EmpRepo;

@Component
public class CustomDetailsService implements UserDetailsService{
	@Autowired
	private EmpRepo empRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Employee emp = empRepo.findByEmail(email);
		if(emp==null) {
			throw new UsernameNotFoundException("Username not found");
		}else {
			return new CustomUser(emp);
		}
	}
}
