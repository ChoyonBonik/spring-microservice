package com.information.information_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.information.information_service.entity.Information;

@Service
public class InformationServiceImpl implements InformationService{
	
	
	List<Information> list = List.of(
			new Information(1L, "chandi bonik", "rine bonik", "muktagacha", 1010L),
			new Information(2L, "anik banik", "rupa banik", "mymensingh", 2020L),
			new Information(3L, "akash banik", "nila banik", "jamalpur", 3030L)
			);

	@Override
	public List<Information> getInformationsOfUser(Long userId) {
		
		return list.stream().filter(information -> information.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
