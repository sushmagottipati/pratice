package com.Practice.practice;

public class Encapsulation {
	
	private String name;
	
	private String age;
	
	public String getName()
	{
		return name;
	}
	
	public String getAge()
	{
		return age;
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public void setAge(String age1) {
		
		age=age1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Encapsulation encap=new Encapsulation();
		
		encap.setName("sushma");
		
		encap.setAge("18");
		
		System.out.println(encap.getName());
		System.out.println(encap.getAge());
		
		
		
		

	}

}
