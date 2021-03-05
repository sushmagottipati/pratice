package com.Practice.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FindDupicateelementsUsingList {
	
	String path1="C:\\Users\\dell\\Desktop\\c.txt";
	
	static ArrayList<String> alist = new ArrayList<String>();
	
	int size = 0;
	
	int count[] ;

	
	String[] wordsFromLine=null;

	
	public void fileread() throws IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader(path1));
		
		String read;
		
		while((read = br.readLine())!= null)
		{
			wordsFromLine = read.split(" ");
			for (String string : wordsFromLine) {
				alist.add(string);	
			}
			
		}
		
		System.out.println(alist);
		
		System.out.println(alist.size());
		size = alist.size();
		
		
		duplicate(alist);
		
	}
	
	public void duplicate(ArrayList<String> alist) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0; i<size; i++) {
			
			count[i] = 1;
			
			for(int j=i+1; j<size; j++) {
				
				if(alist.get(i).equals(alist.get(j)))
				{
					count[i] =count[i]+1;
					
					arr.add(alist.get(i));
					
					String dup = alist.get(j);
					
					dup ="0";
					
					System.out.println("duplicate elements "+arr);
					
				}
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			if (arr.get(i)!="0") {
				System.out.println(count[i]);
			}
		}
	}
	
	

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FindDupicateelementsUsingList fd = new FindDupicateelementsUsingList();
		
		fd.fileread();
		
		/* fd.duplicate(alist); */

	}

}
