package com.information.information_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.information.information_service.entity.Information;
import com.information.information_service.service.InformationService;

@RestController
@RequestMapping("/information")
public class InformationController {
	
	@Autowired
	private InformationService informationService;
	
	@RequestMapping("/user/{userId}")
	public List<Information> getInformations(@PathVariable("userId") Long userId)
	{
		return this.informationService.getInformationsOfUser(userId);
	}

}
