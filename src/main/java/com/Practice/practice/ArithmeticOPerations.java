package com.Practice.practice;

public class ArithmeticOPerations implements Sample  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10,j=5,k;
		
		System.out.println("i value is " + ++i);
		System.out.println("j value is " + j--);
		System.out.println("j value is "+ j);

		
		k=i+j;
		
		System.out.println("k value is "+ k);
		
		k=i-j;
		System.out.println("k value is "+ k);
		
		int a=1234,b=10,c;
		
		c=a*b;
		
		System.out.println("c value is "+  c );
		
		
		c=a/b;
		
		System.out.println("c value is"+ c);
		
		c=a%b;
		
		System.out.println("c value is"+ c);
		
		
		int x=10,y=20,z;
		
		z=(x>y)?x:y;
		
		System.out.println("z value is"+ z);
		

	}
	
	

	public void login() {
		// TODO Auto-generated method stub
		
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}

}
