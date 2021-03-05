package com.Practice.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class Collections {
	

		public void arrayList() {
			
			
			List list = new ArrayList<String>();
			
			
			list.add("Adiseshu");
			
			list.add("Automation");
			
			list.add("Selenium");
			
			list.add("Test Project");
			
			list.add("Test Project");
			
			list.add("NUll");
			
		Iterator	it = list.iterator();
			
			
		
			System.out.println(list);
			
			list.indexOf("Test Project");
			
			System.out.println(list.indexOf("Test Project"));
			
			System.out.println(list.remove("Test Project"));
			
			System.out.println(list);
			
		}
		
		
		public static void main(String[] args) {
			
			
			Collections  list = new Collections();
			
			list.arrayList();
			
		}

	}

	

	


