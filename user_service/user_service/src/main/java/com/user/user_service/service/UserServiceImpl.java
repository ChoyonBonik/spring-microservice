package com.user.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> list = List.of(
			new User(1010L, "choyon", "01720406119"),
			new User(2020L, "Rajib", "01729449346"),
			new User(3030L, "Rupam", "01710772613")
			
			);
	
			

	@Override
	public User getUser(long id) {

		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}