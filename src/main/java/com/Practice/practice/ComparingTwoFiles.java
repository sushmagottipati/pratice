package com.Practice.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ComparingTwoFiles {
	
	String path1="C:\\Users\\dell\\Desktop\\a";
	
	String path2="C:\\Users\\dell\\Desktop\\b";
	
	String path3="C:\\Users\\dell\\Desktop\\c";
	
	public void write1() throws IOException
	{
		
		ArrayList<String>  alist = new ArrayList<String>();
		

		
		//String[] str1 = {"selenium","jira","jira","jmeter","loadrunner","appium"};
		
		alist.add("selenium");
		
		alist.add("jira");
		
		alist.add("jira");
		
		alist.add("jmeter");
		
		alist.add("loadrunner");
		
		alist.add("appium");
		
		File f = new File(path1);
		
		FileWriter fw = new FileWriter(f);
		
		PrintWriter pw = new PrintWriter(fw);
		
		fw.write(alist.toString());
		
		pw.close();
		
		fw.close();
		
		System.out.println("successfully file created");	
	
				
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ComparingTwoFiles ctf = new ComparingTwoFiles();
		
		ctf.write1();

	}

}
