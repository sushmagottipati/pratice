package com.Practice.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlin3 {
	
	
	
	String path1="C:\\Users\\dell\\Desktop\\first.txt";
	
	String path2="C:\\Users\\dell\\Desktop\\second.txt";


	public void firstFile() {
		
		String data= "selenium is a functional testing automation tool" ;
	
	
		File file=new File(path1);
		
		try {
			FileWriter fw=new FileWriter(file);
			fw.write(data);
			
			fw.close();
			System.out.println("successfully file created");

			
		} catch (IOException e) {
			// TODO Auto-generated catch blocks
			e.printStackTrace();
		}
			
	}
	
	public void secondFile() {
		
		
		String data= "selenium is a open source it is used to automate the web applications";
		
		
		File file=new File(path2);
		
		try {
			FileWriter fw=new FileWriter(file);
			fw.write(data);
			
			fw.close();
			System.out.println("successfully file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void filesread() throws IOException {
		
        BufferedReader reader1 = new BufferedReader(new FileReader(path1));

        BufferedReader reader2 = new BufferedReader(new FileReader(path2));
        
        String line1 = reader1.readLine();
        
        String line2 = reader2.readLine();
        
        

        
		String[] word1=line1.split(" ");
		
		String[] word2=line2.split(" ");
		
	
		System.out.println(word1.length);
		
		System.out.println(word2.length);
		
		//String[] commonwords;
		
		for(int i=0;i<word1.length;i++)
		{
			for(int j=0;j<word2.length;j++)
			{
				
				if(word1[i]==word2[j])
				{
					
					System.out.println(word1[i]);
						
					}
				}
			}
			
			//System.out.println(word1[i]);
		}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileHandlin3 fh3=new FileHandlin3();
		fh3.firstFile();
		fh3.secondFile();
		fh3.filesread();

	}

}
