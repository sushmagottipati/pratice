package com.Practice.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections1 {
	
	
	public void arrayList()
	{
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("sushma");
		
		list.add("qutomation");
		
		list.add(0, "sai");
		
		list.add("welcome");
		
		list.add("java");
		
		list.add("java");
		
		System.out.println(list);
		
		boolean rev = list.remove("welcome");
		
		System.out.println(list);
		
		System.out.println(list.clone());
		
		System.out.println(list.get(1));
		
		System.out.println(list.getClass());
		
		System.out.println(list.indexOf("java"));
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.iterator());
		
		System.out.println(list.lastIndexOf("sushma"));
		
		int size= list.size();
		
		System.out.println(size);
		
		System.out.println(list.subList(1, 3));
		
			
					
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Collections1 coll=new Collections1();
		
		coll.arrayList();

	}

}
