package com.Practice.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Append {
	
	static String path="D:\\file.txt";
	
	static String[] tools= {"selenium","appium","jira","loadrunner","jmeter","protractor"};
	
	public static void appendUsingPrintWriter() {
		
		File file=new File(path);
		
		try {
			FileWriter fw=new FileWriter(file,true);
			
			BufferedWriter bw=new BufferedWriter(fw);
			
			PrintWriter pw=new PrintWriter(bw);
			
			pw.println(tools);
			
			pw.close();
			bw.close();
			fw.close();
			System.out.println("successfully file create");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Append.appendUsingPrintWriter();

	}

}
