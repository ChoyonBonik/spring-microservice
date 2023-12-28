package com.security.security_service.service;

import java.security.Security;
import java.util.List;



public interface SecurityService {

	public List<Security> getSecurityNewOfUser(Long userId);
}
