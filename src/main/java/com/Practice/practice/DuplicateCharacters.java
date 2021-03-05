package com.Practice.practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.print.DocFlavor.CHAR_ARRAY;


public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  String name;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter name");
		  name = sc.nextLine();

	      char[] ch = name.toCharArray(); 
	      int count;
	      
	     int size=name.length();
	     
	     for(int i=0;i<size;i++)
	     {
	    	 count=1;
	    	 for(int j=i+1;j<size;j++)
	    	 {
	    		 
	    		 if(ch[i]==ch[j])
	    		 {
	    			 count=count+1;
	   	          //System.out.print(ch[j]);
	   	          ch[j]='0';
	   	      // System.out.print(count);
	   	        
	    		 }	
	    		 
	    	 }
	    	 

		       if(ch[i]!='0')
				{
					System.out.println(ch[i]+"             "+count);
				}
	     }
	     
	     
	     
	     
		
	    
	}

}
