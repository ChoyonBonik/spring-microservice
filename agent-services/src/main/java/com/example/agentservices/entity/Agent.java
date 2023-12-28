package com.example.agentservices.entity;

public class Agent {
	
	private Long agentId;
	private String agentName;
	private String agentEmail;
	
	
	public Agent(Long agentId, String agentName, String agentEmail) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentEmail = agentEmail;
	}


	public Long getAgentId() {
		return agentId;
	}


	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}


	public String getAgentName() {
		return agentName;
	}


	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}


	public String getAgentEmail() {
		return agentEmail;
	}


	public void setAgentEmail(String agentEmail) {
		this.agentEmail = agentEmail;
	}
	
	

}
