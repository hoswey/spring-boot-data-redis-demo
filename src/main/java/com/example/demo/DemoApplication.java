package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
public class DemoApplication implements InitializingBean {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		stringRedisTemplate.opsForValue().set("k", "v");
	}
}
