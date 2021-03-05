package com.Practice.practice;

public class Ab extends Abstraction{


	@Override 
	public void logout()
	{ 
		// TODO Auto-generated method stub
		System.out.println("*************shutdown***********"); 
	}


	@Override
	void arth() {
		// TODO Auto-generated method stub

		System.out.println("***********arth*********************");

	}
	
	void sample()
	{
		super.logout();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ab a=new Ab();
		a.arth();
		a.balance();
		a.login();
		a.logout();
		a.sample();
		Sample.bankdetails();

	}


}
