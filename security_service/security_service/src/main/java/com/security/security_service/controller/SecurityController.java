package com.security.security_service.controller;


import java.security.Security;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contact_service.entity.Contact;
import com.contact.contact_service.service.ContactService;
import com.security.security_service.service.SecurityService;

@RestController
@RequestMapping("/security")
public class SecurityController {
	
	@Autowired
	private SecurityService securityService;
	
	@RequestMapping("/user/{userId}")
	public List<Security> getSecurityNew(@PathVariable("userId") Long userId){
		return this.securityService.getSecurityNewOfUser(userId);
	}

}
