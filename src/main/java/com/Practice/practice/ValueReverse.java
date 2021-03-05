package com.Practice.practice;

public class ValueReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.out.println(Sample.name);

		
		
		int num=153,rev=0, value;
				while(num!=0)
				{
					value=num%10;
					rev=rev*10+value;
					num=num/10;
					System.out.println("reverse value is "+ rev);
				}
				
				
				String string = "sushma";
			      String reverse = new StringBuffer(string).reverse().toString();
			      System.out.println("\nString before reverse: "+string);
			      System.out.println("String after reverse: "+reverse);
			      
			      
			      
			      String name="siva";
			      int size=name.length();
			      System.out.println(size);
			      for(int i=size;i>0;--i)
			    	  
			      {
			    	  System.out.print(name.charAt(i-1));  
			    	  

			      }
			   
		
		
	}

}
