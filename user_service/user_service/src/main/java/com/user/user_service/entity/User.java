package com.user.user_service.entity;
import java.util.ArrayList;
import java.util.List;

public class User {

	private Long userId;
	private String name;
	private String phone;
	
	List<Contact> contacts=new ArrayList<>();
	List<Information> informations=new ArrayList<>();

	public User(Long userId, String name, String phone, List<Contact> contacts, List<Information> informations) {
		
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
		this.informations = informations;
	}

	

	public User(Long userId, String name, String phone) {
		
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public User() {
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}



	public List<Information> getInformations() {
		return informations;
	}



	public void setInformations(List<Information> informations) {
		this.informations = informations;
	}

	
	
	
}
