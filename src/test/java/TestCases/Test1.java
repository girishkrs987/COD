package TestCases;

public class Test1 {

	
	
	
	int phone= 876869799; 
	
	String name= "Girish";
	
	public static void main(String[] args) {
		
		
		// difeernt data types 
		 // int, string , boolean , double , float 
		 
		int i =100 ; 
		int j=10; 
		 double m=467; 
		 
		 char BG='k'; 
		 
		 String str= " hi sandeep for testing";
		 
		 boolean bn=true;
		 
		 boolean bm=false;
		
		System.out.println("I value of "    +i );
		System.out.println("j value of "   +j);
		System.out.println("M value of "   +m);
		System.out.println("BG value of "   +BG);
		
		System.out.println("string data "   +str);
		
		sum(); 
		
		
		boolean d=(i<j);
		
		System.out.println("the conditions of this atament is "    +d);
		
		System.out.println(str.length());
		// how to create the object , 
		
		Test1 pho=new Test1(); 
		
		System.out.println("My phone number is" +pho.phone);
		
		//System.out.println(a);
		System.out.println("inside main method "+pho.name);
		System.out.println("inside main method "+pho.phone);
		
		sub();
		

	}


	public static void sum() {
		
		int a=20;
		int b=30;
		int c=a+b; 
		Test1 pho=new Test1();
		System.out.println("The sum of a & b values is "+c);
		
		
		System.out.println("inside sum method "+pho.name);
		System.out.println("inside sum method "+pho.phone);
		
	}
	
	
public static void sub() {
		
	Test1 pho=new Test1(); 
	System.out.println("subtraction method ");
	
	System.out.println("inside sub method "+pho.name);
	System.out.println("inside sub method "+pho.phone);
		
	
}}

