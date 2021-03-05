package com.Practice.practice;

import java.util.Random;

public class Randomnumbers {

static int rand_int;


	public  void digitsrandom() { 
		Random rand=new Random();
		rand_int=rand.nextInt(999); 
		
		
		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Randomnumbers rand_num=new Randomnumbers();
		rand_num.digitsrandom();
		System.out.println("sushma"+ rand_int);
	}

}
