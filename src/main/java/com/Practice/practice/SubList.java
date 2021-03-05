package com.Practice.practice;

import java.util.ArrayList;
import java.util.List;

public class SubList {
	
	ArrayList<String> list = new ArrayList<String>();

	
	public void sublists()
	{
		
		
		list.add("selenium");
		
		list.add("jira");
		
		list.add("jira");
		
		list.add("jmeter");
		
		list.add("loadrunner");
		
		list.add("qtp");
		
		list.add("appium");
		
		
		
		
		System.out.println(list);
		
		
		
	}	
	
	public void sublist(int fromIndex,int toIndex)
	{
		ArrayList<String> alist=new ArrayList<String>();
		
		for( int i= fromIndex;i< toIndex ;i++) {
			
			alist.add(list.get(i));
			
		}
		
		System.err.println(alist);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubList sub=new SubList();
		
		sub.sublists();
		
		sub.sublist(1, 4);
			

	}

}
