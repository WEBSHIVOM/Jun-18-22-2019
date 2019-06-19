package com.examples;

public class ApplicationForm {
	private String name;
	private String email;
	private int age;
	private String phone;
	
	public String getName() {
		return name;
	}
	public ApplicationForm setName(String name) {
		this.name = name;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public ApplicationForm setEmail(String email) {
		this.email = email;
		return this;
	}
	public int getAge() {
		return age;
	}
	public ApplicationForm setAge(int age) {
		this.age = age;
		return this;
	}
	public String getPhone() {
		return phone;
	}
	public ApplicationForm setPhone(String phone) {
		this.phone = phone;
		return this;
	}
}
