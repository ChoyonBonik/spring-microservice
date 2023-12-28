package com.information.information_service.service;

import java.util.List;

import com.information.information_service.entity.Information;

public interface InformationService {
	
	public List<Information> getInformationsOfUser(Long userId);

}
