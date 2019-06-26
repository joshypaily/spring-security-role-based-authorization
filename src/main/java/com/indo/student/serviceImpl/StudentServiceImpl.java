package com.indo.student.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indo.student.model.Student;
import com.indo.student.repository.StudentRepository;
import com.indo.student.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		
		return studentRepository.findAll();
		 
	}

	@Override
	public void makeList() {
		
		Student student=new Student();
		student.setName("joshy");
		student.setStandard("10");
		student.setRollNo("11");
		studentRepository.save(student);
		
		student=new Student();
		student.setName("manu");
		student.setStandard("11");
		student.setRollNo("16");
		studentRepository.save(student);
		
		student=new Student();
		student.setName("anu");
		student.setStandard("10");
		student.setRollNo("8");
		studentRepository.save(student);
		
		student=new Student();
		student.setName("sonu");
		student.setStandard("11");
		student.setRollNo("41");
		studentRepository.save(student);
		
		student=new Student();
		student.setName("vishnu");
		student.setStandard("10");
		student.setRollNo("50");
		studentRepository.save(student);
			
		
		
	}

}
