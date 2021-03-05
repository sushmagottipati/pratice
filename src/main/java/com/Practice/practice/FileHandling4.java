package com.Practice.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileHandling4 {
	
	
	String[] data1 = {"apple","banana","carrot","potato","beans","pinapple","radish"};
	
	String[] data2 = {"orange","guva","beans","pear","carrot","potato","radish"};
	
	String path1="C:\\Users\\dell\\Desktop\\a.txt";
	
	String path2="C:\\Users\\dell\\Desktop\\b.txt";
	
	String path3="C:\\Users\\dell\\Desktop\\c.txt";
	
	ArrayList<String> arr1 = null;
	
	ArrayList<String>  arr2 = null;
	
	BufferedReader br1 = null;
	
	BufferedReader br2 = null;
	
	ArrayList<String> al = null;
	
	 public void first() throws IOException
	
	{
		
		File f1 = new File(path1);
		
		File f2 = new File(path2);
		
		FileWriter fw1 = new FileWriter(f1);
		
		FileWriter fw2 = new FileWriter(f2);

		PrintWriter pw1 = new PrintWriter(fw1);
		
		PrintWriter pw2 = new PrintWriter(fw2);

		
		for (String word1 : data1) {
			
			pw1.write(word1);
			
			pw1.println();
			
		}
		
		for (String word2 : data2) {
			
			pw2.write(word2);
			
			pw2.println();
			
		}
		
		pw1.close();
		
		fw1.close();
		
		
		pw2.close();
		
		fw2.close();
		
		
		System.out.println("successfully write the files");
		
	}
	
	
	public void read() throws IOException
	{
		
		br1 = new BufferedReader(new FileReader(path1));
		
		br2 = new BufferedReader(new FileReader(path2));
		
		String line1;
		
		String line2 ;
		
		while((line1=br1.readLine())!= null){
			
			
			arr1.add(line1);
		}
		
		while((line2=br2.readLine())!= null){
			
			
			arr2.add(line2);
		}
		
		System.out.println(arr1);
		
		System.out.println(arr2);
		compare(arr1,arr2);
	}
	
	

	public void compare(ArrayList<String> arr1, ArrayList<String> arr2) {
		
		al = new ArrayList<String>();
		
		System.out.println("duplicate elements----------------");
		
		for (String string1 : arr1) {
			
			for (String string2 : arr2) {
				
				if(string1.equals(string2))
				{
					al.add(string1);
					
					System.out.println(string1);
				}
				
			}
			
		}
			
	}
	
	public void thirdFile() throws IOException {
		
		File f = new File(path3);
		
		FileWriter fw = new FileWriter(f);
		
		PrintWriter pw = new PrintWriter(fw);
		
		for (String string3 : al) {
			
			pw.write(string3);
			
			pw.println();
			
		}
		
		pw.close();
		fw.close();
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileHandling4 fh = new FileHandling4();
		
		fh.first();
		
		fh.read();
		
		fh.thirdFile();

	}

}
