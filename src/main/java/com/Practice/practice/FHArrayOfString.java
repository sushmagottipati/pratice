package com.Practice.practice;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FHArrayOfString {
	

    String arr[] = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };

	public void fileWrite() throws IOException {

	      FileWriter writer = new FileWriter ("C:\\Users\\dell\\Desktop\\Auto.txt",true);
	        
	      //PrintWriter pw=new PrintWriter("C:\\\\Users\\\\dell\\\\Desktop\\Auto.txt");
	      int len = arr.length;
	      for (int i = 0; i < len; i++) {
	    	  
	    	  
	         writer.write(arr[i] + " " );
	         
	         writer.write("\r\n");
	         
	      }
	      writer.close();
	      
	     // pw.close();
	      
	      System.out.println("file is taking the string");
	   }
	
	public void fileRead() throws IOException {
		
		
		FileReader fr=new FileReader("C:\\Users\\dell\\Desktop\\Auto.txt");
		
       
		 int i;    
		 
	        while((i=fr.read())!=-1)  
	        {	
	        
	        	
	        System.out.print((char)i);  
	        }
	        
	       
	        fr.close();    

		
	}
	


	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FHArrayOfString fh=new FHArrayOfString();
		fh.fileWrite();
		
		fh.fileRead();
		
		

	}

}
