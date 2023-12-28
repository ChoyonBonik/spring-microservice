package com.contact.contact_service.entity;

public class Contact {

	private Long contactId;
	private String email;
	private String contactName;
	private Long userId;
	
	
	public Contact(Long contactId, String email, String contactName, Long userId) {
		
		this.contactId = contactId;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}


	public Contact() {
		
	}


	public Long getcId() {
		return contactId;
	}


	public void setcId(Long cId) {
		this.contactId = cId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
