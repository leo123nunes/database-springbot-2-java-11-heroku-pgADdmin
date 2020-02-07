package com.project.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.project.course.entities.User;
import com.project.course.resources.UserResource;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(UserResource resource) {
		return args ->{
			resource.save(new User(null,"Maria","maria@gmail.com","99999999","123456"));
		};
	}

}
