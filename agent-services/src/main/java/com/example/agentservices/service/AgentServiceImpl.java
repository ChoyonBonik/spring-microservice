package com.example.agentservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.agentservices.entity.Agent;

@Service
public class AgentServiceImpl implements AgentService{

	List<Agent> list = List.of(
			new Agent(1010L, "choyon", "01720406119"),
			new Agent(2020L, "Rajib", "01729449346"),
			new Agent(3030L, "Rupam", "01710772613")
			
			);
	
			

	@Override
	public Agent getAgentId(long id) {

		return this.list.stream().filter(user -> user.getAgentId().equals(id)).findAny().orElse(null);
	}
}
