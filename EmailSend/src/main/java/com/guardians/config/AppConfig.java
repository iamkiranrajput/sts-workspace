package com.guardians.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
	@Value("${spring.mail.host}")
	private String mailhost;
	@Value("${spring.mail.port}")
	private int mailport;
	@Value("${spring.mail.username}")
	private String username;
	@Value("${spring.mail.password}")
	private String mailPassword;

	
	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
		javaMailSender.setHost(mailhost);
		javaMailSender.setPassword(mailPassword);
		javaMailSender.setUsername(username);
		javaMailSender.setPort(mailport);
		
		Properties props = javaMailSender.getJavaMailProperties();
		
			props.put("mail.transport.protocol", "smtp");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true"); 
	        props.put("mail.debug", "true");
		return javaMailSender;
	}
}
