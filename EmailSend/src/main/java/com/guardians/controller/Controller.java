package com.guardians.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guardians.dto.EmailDTO;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	private JavaMailSender javaMailSender;
	
	@PostMapping("/send-email")
	public String sendEmail(@RequestBody EmailDTO emailDTO) {
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		
		simpleMailMessage.setTo(emailDTO.getTo());
		simpleMailMessage.setSubject(emailDTO.getSubject());
		simpleMailMessage.setText(emailDTO.getText());
		javaMailSender.send(simpleMailMessage);
		return "Email Sent successfully";
	}
	
}
