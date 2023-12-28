package com.contact.contact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact> list=List.of(
			new Contact(1L, "choyon.bonik@gmail.com", "Choyon", 1010L),
			new Contact(5L, "choyon123.bonik@gmail.com", "Choyon", 1010L),
			new Contact(2L, "rajib.bonik@gmail.com", "Rajib", 2020L),
			new Contact(3L, "rupam.bonik@gmail.com", "Rupam", 3030L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	

	
}
