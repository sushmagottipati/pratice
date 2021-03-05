package com.Practice.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FileHandling5 {
	

	String path1="C:\\Users\\dell\\Desktop\\a.txt";
	
	String path2="C:\\Users\\dell\\Desktop\\b.txt";
	
	String path3="C:\\Users\\dell\\Desktop\\d.txt";
	
	 BufferedReader br1 = null;
	 
	 BufferedReader br2 = null;
	
	 ArrayList<String> arr1 = null;
	
	ArrayList<String> arr2 = null;
	
	ArrayList<String>  al = null;

	public void firstFile() throws IOException
	{
		ArrayList<String> alist1 = new ArrayList<String>();
		
		//String[] str1 = {"selenium","jira","jira","jmeter","loadrunner","appium"};
		
		alist1.add("samsung");
		
		/* alist1.add("samsung"); */
		
		alist1.add("redmi");
		
		/* alist1.add("redmi"); */
		
		alist1.add("oppo");
		
		alist1.add("realme");
		
		File f = new File(path1);
		
		FileWriter fw = new FileWriter(f);
		
		PrintWriter pw = new PrintWriter(fw);
		
		for (String string : alist1) {
			pw.write(string);
			pw.println();
		}
		
		pw.close();
		
		fw.close();
		
		System.out.println("successfully file created");	
		
	}
	
	
	public void secondtFile() throws IOException
	{
		ArrayList<String> alist2 = new ArrayList<String>();
		
		//String[] str1 = {"selenium","jira","jira","jmeter","loadrunner","appium"};
		
		alist2.add("nokia");
		
		alist2.add("moto");
		
		alist2.add("redmi");
		
		alist2.add("oppo");
		
		/* alist2.add("oppo"); */
		
		alist2.add("realme");
		
		File f = new File(path2);
		
		FileWriter fw = new FileWriter(f);
		
		PrintWriter pw = new PrintWriter(fw);
		
		for (String string : alist2) {
			
			pw.write(string);
			
			pw.println();
		}
		
		/* fw.write(alist2); */
		
		pw.close();
		
		fw.close();
		
		System.out.println("successfully file created");	
		
	}
	
	public void read() throws IOException {
		
		arr1=new ArrayList<String>();
		
		arr2 = new ArrayList<String>();

	
		br1 = new BufferedReader(new FileReader(path1));
		
		br2 = new BufferedReader(new FileReader(path2));
		
		String read1;
		
		String read2;
		
		while((read1=br1.readLine())!= null)
		{
					
			arr1.add(read1);
			
		}
		
		while((read2=br2.readLine())!= null)
		{
					
			arr2.add(read2);
			
		}
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		compare(arr1,arr2);
		
	}	
	
	public void compare(ArrayList<String> arr1,ArrayList<String> arr2)
	
	{
		al = new ArrayList<String>();

		
		System.out.println("dupicate elements--------------");
		
		
		for (String name1 : arr1) {
			
			for (String name2 : arr2) {
				
				if(name1.equals(name2))
				{
					al.add(name1);
					
					System.out.println(name1); 
				}
				
			}
		}
			
	}
	
	public void thirdfile() throws IOException
	{
		
		/* File f = new File(path3); */
		
		FileWriter fw = new FileWriter(path3);
		
		PrintWriter pw = new PrintWriter(fw);
		
		
		for (String string : al) {
			
			pw.write(string);
			
			pw.println();
				
			
		}
		pw.close();

		
		fw.close();
		
		System.out.println("success");
	}
		
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileHandling5 fh = new FileHandling5();
		
		fh.firstFile();
		
		fh.secondtFile();
		
		fh.read();
		
		//fh.compare();
		
		fh.thirdfile();

	}

}
