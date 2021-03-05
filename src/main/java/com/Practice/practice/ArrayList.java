package com.Practice.practice;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ArrayList {

    List<String> array = new java.util.ArrayList<String>();

	public void looping()
	{
        
        
        array.add("facebook");
        
        array.add("redbus");
        
        array.add("whatsup");
        
        array.add("phonepay");
        
        array.add("phonepay");
        
        array.add("youtube");
        
	}
	
	
	public void For() {
		
		for(int i = 0; i < array.size(); i++)
		{
			System.out.println("using for loop " +array.get(i));
		}
		
	}
	
	
	public void ForEach() {
		
		for (String string : array) {
			
			System.out.println("using for each loop " +string);
			
		}
	}
	
	public void Iterators()
	{
		Iterator<String>  it = array.iterator();
		
		while(it.hasNext())
		{
			System.out.println("using iterator " +it.next());
		}
		
		
	}
	
	public void LIterators()
	{
		
		ListIterator<String>  lit = array.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println("using list iterator " +lit.next());
			
			 
		}
	}
	
	public void While()
	
	{
		
		int i=0;
		
		while(i<array.size())
		{
			System.out.println("using while loop "+array.get(i));
			
			i++;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.looping();
		
		//list.For();
		
		//list.ForEach();
		
		//list.Iterators();
		
		//list.LIterators();
		
		list.While();

	}

}
