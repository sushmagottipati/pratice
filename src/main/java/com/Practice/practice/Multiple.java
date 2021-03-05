package com.Practice.practice;

public class Multiple implements Interface1,Interface2 {

	
	public void occupation() {
		// TODO Auto-generated method stub
		
		System.out.println("occupation is teacher");
		
	}

	public void habits() {
		// TODO Auto-generated method stub
		System.out.println("reading newspaper");
	}

	public void name() {
		// TODO Auto-generated method stub
		System.out.println("name is ranii");
	}

	public void gender() {
		// TODO Auto-generated method stub
		System.out.println("gender is female");
	}

	public void ph() {
		// TODO Auto-generated method stub
		System.out.println("ph 1213243242");
		
	}

	public void Address() {
		// TODO Auto-generated method stub
		
		System.out.println("address kfjdljgl");
		
	}
	
	
	public void login()
	{
		System.out.println("****************login into account********");
	}
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("*********logout*************");
		
	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("***************help**********************");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi this is the information");
		
		
		Multiple mul=new Multiple();
		mul.name();
		mul.gender();
		mul.occupation();
		mul.habits();
		mul.Address();
		mul.ph();
		mul.login();
		mul.logout();
		mul.help();
		Diamond.homePage();
	}



}
