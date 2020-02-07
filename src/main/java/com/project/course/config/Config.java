package com.project.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.project.course.entities.User;
import com.project.course.repositories.UserRepository;

@Configuration
public class Config implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null,"Marcos","marcos@gmail.com","9999-9999","123456");
		User user2 = new User(null,"John","john@gmail.com","8888-8888","987654321");
		
		userRepository.saveAll(Arrays.asList(user1,user2));
	}

}
