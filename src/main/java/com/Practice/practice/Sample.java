package com.Practice.practice;

public interface Sample {
	
	
	String name="***************sushma";
	public  void login();
	
	public void logout();
	
	public static void bankdetails()
	{
		System.out.println("******dankdetails***********");
	}
	
	default void balance()
	{
		System.out.println("*********balance*************");
	}

}
