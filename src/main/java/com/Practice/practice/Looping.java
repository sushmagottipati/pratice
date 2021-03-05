package com.Practice.practice;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] names= {"sai","siva","rama"};
		
		for(int i=0; i<names.length; i++)
		{
			System.out.println("names "+ names[i]);
		}
		
		
		String[] courses= {"selenium","java","python"};
		
		int j=0;
		
		while (j<courses.length) {
			
			System.out.println(courses[j]);
			j++;
			
		}
		
		 
		
		String[] days= {"sun","mon","tues","wed","thur","fri","sat"};
		int k=0;
		
		do {
			
			System.out.println(days[k]);
			k++;
		} while (k<days.length);

	}

}
