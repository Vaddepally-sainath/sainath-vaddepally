package com.java.jdbc;

public class Agent {
	private int AgentID;
	 private String Name;
	 private Gender Gender;
	 private String City;
	 private String Maritalstatus;
	 private double Premium;
	public Object setPremium;
	public int getAgentID() {
		return AgentID;
	}
	public void setAgentID(int agentID) {
		AgentID = agentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Gender getGender() {
		return Gender;
	}
	public void setGender(Gender gender) {
		Gender = gender;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getMaritalstatus() {
		return Maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		Maritalstatus = maritalstatus;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [AgentID=" + AgentID + ", Name=" + Name + ", Gender=" + Gender + ", City=" + City
				+ ", Maritalstatus=" + Maritalstatus + ", Premium=" + Premium + "]";
	}
}