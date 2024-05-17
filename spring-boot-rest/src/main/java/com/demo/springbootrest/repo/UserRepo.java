package com.demo.springbootrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springbootrest.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUserName(String userName);
}
