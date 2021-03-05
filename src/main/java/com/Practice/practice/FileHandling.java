package com.Practice.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	public void writeFile() {
		
		
	String path="C:\\Users\\dell\\Desktop\\Auto.txt";
	
	String[]  name= {"selenium","appium","loadnunner"};
	
	File file=new File(path);
	
for(int i=0;i<name.length;i++)
{
	

	try {
	FileWriter fw=new FileWriter(file);
	
	fw.write(name[i]);
		
	fw.close();
	

	System.out.println("file is taking  ");
	
	System.out.println(name[i]);
	
	}catch(IOException e)
	{
		e.getMessage();

		System.out.println("File not found exception" + e.getMessage());
	

	}
}

	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileHandling fh=new FileHandling();
		
		fh.writeFile();
		


	}

}
