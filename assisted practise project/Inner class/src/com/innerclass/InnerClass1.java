package com.innerclass;

public class InnerClass1 {
 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InnerClass1 obj=new InnerClass1();
		InnerClass1.Inner in=obj.new Inner();  
		in.hello();  
	}

}
