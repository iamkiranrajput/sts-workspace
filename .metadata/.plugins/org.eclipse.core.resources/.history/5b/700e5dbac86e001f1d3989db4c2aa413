package com.guardians.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

	@Bean
	public RedisConnectionFactory connectionFactory() {
		return new LettuceConnectionFactory();
	}
	
	 @Bean
	    public RedisTemplate<String, Object> redisTemplate() {
	        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();

	        redisTemplate.setConnectionFactory(connectionFactory());

	        // Set StringRedisSerializer for key serialization
	        redisTemplate.setKeySerializer(new StringRedisSerializer());

	        // Set StringRedisSerializer for hash key serialization (in case you're using hash operations)
	        redisTemplate.setHashKeySerializer(new StringRedisSerializer());

	        // Set GenericJackson2JsonRedisSerializer for value serialization
	        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());

	        // Set GenericJackson2JsonRedisSerializer for hash value serialization
	        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

	        // Enable transaction support if needed
	        redisTemplate.setEnableTransactionSupport(true);

	        return redisTemplate;
		
	}
}
