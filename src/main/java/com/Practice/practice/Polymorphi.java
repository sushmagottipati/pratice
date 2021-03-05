package com.Practice.practice;

public class Polymorphi implements Polymor{
	
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("the value of c is "+c);
	}
	
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("the value of d is "+d);
	}

	public void add(String name,int a)
	{
		System.out.println("name is **********************" +name);
		System.out.println("the value of a is "+a);
		
	}
	
	public void add(int a,String name)
	{
		System.out.println("the value of a is "+a);
		System.out.println("name is ++++++++++++++++++++++" +name);
		
	}
	
	
	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
		int c=a-b;
		System.out.println("sub the value of c "+c);
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		
		int c=a*b;
		System.out.println("mut the value of c "+c);
		
	}

	@Override
	public void word(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("the name is "+name);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphi poly=new Polymorphi();
		poly.add(10, 20);
		poly.add(10, "sushma");
		poly.add(10, 20, 30);
		poly.add("sush", 6);
		poly.sub(100, 100);
		poly.mul(10, 2);
		poly.word("qutomation");
		
		

	}

	
}
