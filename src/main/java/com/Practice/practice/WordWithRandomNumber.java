package com.Practice.practice;

import java.util.Random;

public class WordWithRandomNumber {
	
	static int randnumber;
	
	public int randomNumber()
	{
		Random random=new Random();
		randnumber=random.nextInt(999);
		
		while(randnumber<100)
		{
			int randnumber=random.nextInt(999);
		}
		
		return randnumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordWithRandomNumber word=new WordWithRandomNumber();
		word.randomNumber();
		
		System.out.println("sushma"+randnumber);

	}

}
