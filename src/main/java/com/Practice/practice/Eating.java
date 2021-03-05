package com.Practice.practice;

public class Eating extends Animals{

	
	public void Dog()
	{
		System.out.println("***********chicken*************");
	}
	
	public void cat()
	{
		System.out.println("******************milk************");
	}
	
	/*
	 * public void rat() {
	 * System.out.println("******************milk***********************"); }
	 */
	
	public void goat()
	{
		System.out.println("******************grass*****************");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eating eat=new Eating();
		eat.dog();
		eat.cat();
		eat.Dog();
		eat.rat();
		//System.out.println("value of i = "i);

	}

}
