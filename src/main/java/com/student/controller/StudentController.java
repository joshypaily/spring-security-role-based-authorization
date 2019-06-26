package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.model.Users;
import com.student.service.StudentService;
import com.student.service.UserService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@RequestMapping(value="/")
	public String indexPage() {
		
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value="/adminHome")
	public String getAdminHome() {
		
		return "adminHome";
	}
	
	@RequestMapping(value="/userHome")
	public String getUserHome() {
		
		return "userHome";
	}
	

	@RequestMapping(value="/signUpPage")
	public String signUp() {
		return "signUp";
	}
	
	@RequestMapping(value="/signUp")
	public String signUp(@RequestParam String username,@RequestParam String password,@RequestParam String role) {
		
		Users user=new Users();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(password));
		user.setRole(role);
		userService.signUp(user);
		
		return "success";
	}
	
	@RequestMapping(value="/success")
	public String success() {
		
		return "success";
	}
	
	@RequestMapping(value="/getStudents")
	public String getStudents(Model model) {
		
		model.addAttribute("studentList", studentService.findAll());
		
		
		return "studentList";
	}
	
	@RequestMapping(value="/makeList")
	public String makeList() {
		String message="success";
		studentService.makeList();
		
		return message;
	}
}
