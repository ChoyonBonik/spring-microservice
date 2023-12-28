package com.security.security_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.security.security_service.entity.Security;

@Service
public class SecurityServiceImpl implements SecurityService{
	
	List<Security> list=List.of(
			new Security(1L, "choyon.bonik@gmail.com", "Choyon", 1010L),
			new Security(2L, "rajib.bonik@gmail.com", "Rajib", 2020L),
			new Security(3L, "rupom.bonik@gmail.com", "Rajib", 3030L)
			);

	@Override
	public List<java.security.Security> getSecurityNewOfUser(Long userId) {
		
		return null;
	}


	
	

	
}
