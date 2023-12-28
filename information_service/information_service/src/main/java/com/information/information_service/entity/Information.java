package com.information.information_service.entity;

public class Information {
	
	private Long informationId;
	private String fatherName;
	private String motherName;
	private String address;
	private Long userId;
	
	
	public Information(Long informationId, String fatherName, String motherName, String address, Long userId) {
		this.informationId = informationId;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
		this.userId = userId;
	}


	public Information () {
		
	}
	
	public Long getiId() {
		return informationId;
	}


	public void setiId(Long iId) {
		this.informationId = iId;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	

}
