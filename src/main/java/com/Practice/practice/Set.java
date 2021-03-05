package com.Practice.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
	
	public void hash()
	{
		
		HashSet<String> shash = new HashSet<String>();
		
		
		shash.add("apple");
		
		shash.add("orange");
		
		shash.add("banana");
		
		shash.add("papaya");
		
		shash.add("papaya");
		
		shash.add("guva");
	
		
		System.out.println(shash);
	
	
	
		LinkedHashSet<String> hlset = new LinkedHashSet<String>();
		
		hlset.add("carrot");
		
		hlset.add("cucumber");
		
		hlset.add("brinjal");
		
		hlset.add("radish");
		
		hlset.add("cucumber");
		
		System.out.println(hlset);
		
		System.out.println(shash.addAll(hlset));
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new Set();
		
		s.hash();
		
		//s.hash();

	}

}
