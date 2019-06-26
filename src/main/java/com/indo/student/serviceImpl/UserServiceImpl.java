package com.indo.student.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indo.student.model.Users;
import com.indo.student.repository.UserRepository;
import com.indo.student.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void signUp(Users user) {
		
		userRepository.save(user);
	}

}
