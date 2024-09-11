package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entites.User;


public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name, String city);

	public List<User> findByNameStartingWith(String  prefix);
	public List<User> findByNameEndingWith(String suffix);
	
	public List <User> findByNameContaining(String name);
//	public List <User> findByNameLike(String like);
//	public List <User> findByAgeLessThan(int age);
//	public List <User> findByAgeGreaterThanEqual(int age);
	
//jpql java persistence query language
	
	@Query("select u from User u")
	public List<User> getAllUser();
	@Query("select u from User u where u.city =:c ")
	public List<User> getUserByCity(@Param("c") String city); //here we are binding the 																name with parameter n
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getAllUse();
	
	
	

}
