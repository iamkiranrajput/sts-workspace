package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;

@SpringBootApplication
public class Examplesecurity1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Examplesecurity1Application.class, args);
		
		UserRepository userRepository =context.getBean(UserRepository.class);

//		User user1 = new  User();
//		user1.setName("sejal");
//		user1.setCity("chh. sambhajinagar");
//		user1.setStatus("SDE at google");	
//		User result1=userRepository.save(user1);
//		System.out.println(user1);
//		
		
		//create object of user
//		User user2 = new User();
//		user2.setName("raj");
//		user2.setCity("dharashiv");
//		user2.setStatus("java developer");
		
//		User result2 = userRepository.save(user2);
//		System.out.println(result2);
		
//		User user3 = new User();
//		user3.setName("veer");
//		user3.setCity("dharashiv");
//		user3.setStatus("Django developer");
		
		
//		List<User>users = List.of(user2,user3);
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
		
//		Optional<User> optional = userRepository.findById(2);
//		User user=optional.get();
//		user.setName("raj kumar");
//		User result = userRepository.save(user);
//		System.out.println(result);
		
//		Iterable<User> itr= userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()) {
//			User user1= iterator.next();
//			System.out.println(user1);
//		}
	
//	itr.forEach(user->System.out.println(user));
		
		
		//deleting the user element
//	 userRepository.deleteById(2);
	 
//		List<User> user2 = userRepository.findByName("Kiran Rajput");
	
//		List<User> user2  = userRepository.findByNameAndCity("Kiran Rajput", "Chh. Sambhajinagar");
//		List <User> user3 = userRepository.findByNameEndingWith("put");
//		List <User> user4 = userRepository.findByNameStartingWith("v"); 

		
//		List <User> user5 = userRepository.findByNameContaining("a");
//		System.out.println(user5);
//		user5.forEach((user)->System.out.println(user));
		
//		Iterator<User> itr = user5.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		
//		List<User> userByCity = userRepository.getUserByCity("chh. Sambhajinagar");
//		System.out.println(userByCity);
	
//		Iterator<User> itr= userByCity.iterator();
//		itr.forEachRemaining((user)->System.out.println(user));
		
		System.out.println("_______________________________++________________");
		List<User> users =userRepository.getAllUse();
		System.out.println(users);
		
		
		
	}

}
