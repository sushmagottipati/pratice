package com.Practice.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class FindElementsCount {
	
	String path ="C:\\Users\\dell\\Desktop\\Auto.txt";
	
	BufferedReader br = null;
	
	ArrayList<String> alist = null;
	
	String[] arr = null;
	
	String readline;
	
	LinkedHashSet<String> hset1 = new LinkedHashSet<String>();
	
	LinkedHashSet<String> hset2 = new LinkedHashSet<String>();
	
	ArrayList<Integer>  fre = new ArrayList<Integer>();
	
	ArrayList<String>  greater = new ArrayList<String>();
	
	ArrayList<Integer>  gre = new ArrayList<Integer>();


	
	public void read() throws IOException {
		
		alist = new ArrayList<String>();
		
		br = new BufferedReader(new FileReader(path));
		
		while((readline =br.readLine())!=null) {
			
			 arr = readline.split(" ");
			
			for (String string : arr) {
				
				//alist.add(string);
				
				alist.add(string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
				
			}
			
		}
		
		System.out.println("the paragraph contain--------------------");
		System.out.println(alist);
		
		int size = alist.size();
		
		System.out.println(size);	
		
		for (String string : alist) {
			
			if(!hset1.add(string))
				
				hset2.add(string);
			{
				
			}
			
		}
		
		System.out.println("hash set "+hset1);
		
		System.out.println(hset1.size());
		
		System.out.println("duplicates------"+hset2);
		
		System.out.println(hset2.size());
		
		
		for (String hset : hset1){
	
			//fre.add(Collections.frequency(alist,hset));
			
			//frequencyOfElements.add(Collections.frequency(wordsList, setelement));

			fre.add(Collections.frequency(alist, hset));
	
		}
		
		System.out.println(fre);
		
		System.out.println(fre.size());
		
		int freq=0;
		
		for (String hset : hset1) {

			if((freq = Collections.frequency(alist, hset))>3) {

				greater.add(hset);
				gre.add(freq);

			}			
		}

		System.out.println(greater);

		System.out.println(greater.size());
		System.out.println(gre);
		
		
		
	}

		
		
		
		
		
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FindElementsCount fec = new FindElementsCount();
		
		fec.read();

	}

}
