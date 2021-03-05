package com.Practice.practice;

public class Super2 extends Super1{


	String name="sushma";


	/*
	 * public void addtocart() {
	 * 
	 * System.out.println("second class"); }
	 */
	public void add()
	{
		super.addtocart();
		System.out.println(super.name);

	}
	/*
	 * public Colours enumPratice() { Colours col = Colours.Blue; return col; }
	 */
	
	public void coustmizedenums()
	{
		Colours[] tools=Colours.values();
		
		for (Colours colour : tools) {
			
			
			
			System.out.println("the qutomation tools are "+colour.name());
			
			System.out.println("the values "+colour.getvalues());

			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super2 sup=new Super2();

		sup.addtocart();
		sup.add();
		sup.coustmizedenums();
		
		
		




	}

}
