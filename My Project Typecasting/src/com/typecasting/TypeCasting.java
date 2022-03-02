package com.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		
        
	//implicit typecasting
		System.out.println("implicit type casting");
	  char ch='G';
	  //convert into int 
	  int i=ch;
	  System.out.println(i);
	  
	  
	  //covert int into float
	  float f=ch;
	  System.out.println(f);
	  
	  //convert into long and double
	  
	  long l=ch;
	  System.out.println(l);
	  
	  double d=ch;
	  System.out.println(d);
	  
	  
	  
	  //explicit type casting
	  System.out.println("explicit type casting");
	  
	  double e=59.5;
	  int x=(int)d;
	  System.out.println(e);
	  System.out.println(x);
	}

}
