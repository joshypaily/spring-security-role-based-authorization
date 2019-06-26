package com.indo.student.model;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="student")
public class Student {
	
	@Field
	private String id;
	
	@Field
	private String name;
	
	@Field
	private String rollNo;
	
	@Field
	private String standard;

	
	
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Student(String id, String name, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
	}

	public Student(String id, String name, String rollNo, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.standard = standard;
	}

	public Student() {
		super();
	}
	
	

}
