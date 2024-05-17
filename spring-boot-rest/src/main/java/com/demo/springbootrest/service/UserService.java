package com.demo.springbootrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.springbootrest.model.User;
import com.demo.springbootrest.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	public User saveUser(User user) {

		user.setPassword(encoder.encode(user.getPassword()));
		return userRepo.save(user);

	}

}
