package com.indo.student.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
public class Users {
  
  @Id
  public ObjectId _id;
  @Field
  public String username;
  @Field
  public String password;
  @Field
  public String role;
  
  public Users() {}
  public Users(ObjectId _id, String username, String password,String role) {
    this._id = _id;
    this.username = username;
    this.password = password;
    this.role=role;
  }
  
  public void set_id(ObjectId _id) { this._id = _id; }
  public String get_id() { return this._id.toHexString(); }
  public void setPassword(String password) { this.password = password; }
  public String getPassword() { return password; }
  public void setUsername(String username) { this.username = username; }
  public String getUsername() { return username; }
  
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
  
}