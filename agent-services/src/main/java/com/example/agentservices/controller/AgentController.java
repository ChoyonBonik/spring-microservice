package com.example.agentservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.agentservices.entity.Agent;
import com.example.agentservices.service.AgentService;



@RestController
@RequestMapping("/agent")
public class AgentController {
	
	@Autowired
    private AgentService agentService;

    public Agent getUser(@PathVariable("agentId") Long userId) {

        Agent agent = this.agentService.getAgentId(userId);

        
        return agent;

    }

}
