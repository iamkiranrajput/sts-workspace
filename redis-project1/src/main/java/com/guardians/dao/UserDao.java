package com.guardians.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.guardians.models.User;

@Repository
public class UserDao {
	@Autowired
	private RedisTemplate<String ,Object> redisTemplate; 
	
	private static final String KEY= "USER123";
	
	
	public User save(User user) {
		
		redisTemplate.opsForHash().put(KEY, user.getUserId(), user);
		
		return user;
	}
	
	
	public User get(String userId) {
		
		
		return (User) redisTemplate.opsForHash().get(KEY, userId);
		
	}
	
	public Map<Object,Object> findAll(){
		return redisTemplate.opsForHash().entries(KEY);
	}
	
	public void delete(String userId) {
		
		redisTemplate.opsForHash().delete(KEY, userId);
		
	}
}
