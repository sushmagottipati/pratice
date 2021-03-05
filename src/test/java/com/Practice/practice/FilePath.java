package com.Practice.practice;

import java.io.File;

public class FilePath {
	
	String path = "C:\\Users\\dell\\Desktop\\LoginPage.java";


	public void files() {
		
		
		File file = new File(path);
		if(file.exists()) {
			System.out.println("file is exist");
		}else
		{
			System.out.println("file not exist");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilePath filepath = new FilePath();
		
		filepath.files();
		
		

	}

}
