package com.Practice.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling1 {
	
	String path="D:\\file.txt";
	
	String name="sri sushma gottipati";
	

	public void fileWrite() {
		
		File file=new File(path);
		
		try {
			FileWriter writer=new FileWriter(file);
			
			writer.write(name);
			
			writer.close();
			
			System.out.println("the file is open");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileHandling1 fh=new FileHandling1();
		fh.fileWrite();

	}

}
