package com.educandoweb.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maiara Schvambach", "maiaraas12@hotmail.com", "996739172", "789456123");
		User u2 = new User(null, "Tufa Borges", "tufa@nenem.dog", "9554521455", "124563129");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
