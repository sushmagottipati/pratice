package com.Practice.practice;

public enum Colours {

	uiautomation("selenium ApI"),

	mobileautomation("selenium,appium"),
	
	Qaautomation("selenium,qtp"),
	
	perfomance("loadrunner");
	
	

	private String value; 

	public String getvalues() {
		
		return this.value;
		
		
	}
	
	
	private Colours(String value) {
		
		this.value=value;
		
		
	}
}
