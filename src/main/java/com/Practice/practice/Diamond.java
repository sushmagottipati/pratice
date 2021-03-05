package com.Practice.practice;

public interface Diamond {
	
	default void login()
	{
		System.out.println("*************login***************");
	}
	
	public static void homePage()
	{
		System.out.println("****************homepage******************");
	}
	public void logout();
	public void help();
	

		

}
