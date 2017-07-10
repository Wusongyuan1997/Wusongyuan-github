package com.cqut.model;

public class User {
	
	private int id;
	private String user_name;
	private String password;
	private int age;
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getUserName(){
		return this.user_name;
	}
	
	public void setUserName(String user_name){
		this.user_name = user_name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
}
