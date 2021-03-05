package com.Practice.practice;

public class Conditions {

	public static void main(String args[])
	{
		System.out.println("it is executed");
		Conditions cond=new Conditions();
		cond.condition();


	}


	public void condition() {


		String i="sushma automation";

		if(i.contains("auto")) 
		{ 
			System.out.println("condition is true"); 
		}else 
		{
			System.out.println("condition is false");

		}
		
		
		if(i.contentEquals("sushmaa automation"))
		{
			System.out.println("condition is true"); 
			
		}else
		{
			System.out.println("condition is false"); 

		}
		
		if(i.equalsIgnoreCase("SUSHMA AUTOMATION"))
		{
			System.out.println("condition is true"); 

		}else
		{
			System.out.println("condition is false"); 

		}
		
		if(i.contentEquals("sushma"))
		{
			System.out.println("condition is true"); 

		}else
		{
			System.out.println("condition is false"); 

		}
		if(i.equals("SUSHMA AUTOMATION"))
		{
			System.out.println("condition is true"); 

		}else
		{
			System.out.println("condition is false"); 

		}
		
		if(i.endsWith("qa"))
		{
			System.out.println("condition is true"); 

		}else
		{
			System.out.println("condition is false"); 

		}
		
		if(i.startsWith("sai"))
		{
			System.out.println("condition is true"+ i); 

		}else
		{
			System.out.println("condition is false" +i); 

		}
		String j="engineer";
		
			System.out.println(j.toUpperCase()); 
			
		String k="SAI";
		System.out.println(k.toLowerCase()); 
		System.out.println(k.length()); 
		
		System.out.println("****compare to****  " +i.compareTo("Sushma Automation")); 
		
		System.out.println(i.compareToIgnoreCase("SUSHMA AUTOMATION")); 

		String name="             sushma                     ";
		System.out.println(name.trim()); 
		
		System.out.println("name".concat("sushma")); 

		
		





	}


}
