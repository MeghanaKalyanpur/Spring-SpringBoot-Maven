package com.demo.springbootrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.springbootrest.model.User;
import com.demo.springbootrest.model.UserPrinciple;
import com.demo.springbootrest.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user= repo.findByUserName(username);
		if(user == null)
		{
			System.out.println("User 404");
			throw new UsernameNotFoundException("User 404");
		}
		// TODO Auto-generated method stub
		return new UserPrinciple(user) ;
	}

}
