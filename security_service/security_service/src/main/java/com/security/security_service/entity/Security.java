package com.security.security_service.entity;

public class Security {
	
	private Long sId;
	private String securityEmail;
	private String securityPassword;
	private Long userId;
	
	
	public Security(Long sId, String securityEmail, String securityPassword, Long userId) {
		this.sId = sId;
		this.securityEmail = securityEmail;
		this.securityPassword = securityPassword;
		this.userId = userId;
	}
	
	public Security() {
		
	}


	public Long getsId() {
		return sId;
	}


	public void setsId(Long sId) {
		this.sId = sId;
	}


	public String getSecurityEmail() {
		return securityEmail;
	}


	public void setSecurityEmail(String securityEmail) {
		this.securityEmail = securityEmail;
	}


	public String getSecurityPassword() {
		return securityPassword;
	}


	public void setSecurityPassword(String securityPassword) {
		this.securityPassword = securityPassword;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
	

}
