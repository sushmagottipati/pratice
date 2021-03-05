package com.Practice.practice;

import java.util.Scanner;

public class FindDupicateWords {

	public void dupicate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		String[] word=str.split(" ");
		int count;
		System.out.println(word.length);
		for(int i=0;i<word.length;i++)
		{
			count=1;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count=count+1;
					word[j]="0";
				}
					
			}
		   	if(word[i]!="0")
			{
				System.out.println(word[i]+"             "+count);
			}
		}
		
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindDupicateWords dup=new FindDupicateWords();
		dup.dupicate();
		
		
	}
}
