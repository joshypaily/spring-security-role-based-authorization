package com.student.service;

import java.util.List;

import com.student.model.Users;

public interface UserService {

	void signUp(Users user);
	List<Users> findAll();
}
