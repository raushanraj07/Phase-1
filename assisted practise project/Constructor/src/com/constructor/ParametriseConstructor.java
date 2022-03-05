package com.constructor;

public class ParametriseConstructor {

	int empno;
	String empname;
	
	ParametriseConstructor(int i, String n) {
		empno=i;
		empname=n;
	
		
	}
	public void show() {
		System.out.println(empno+" "+empname);
	}
	public static void main(String[] args) {
		
		ParametriseConstructor p1=new ParametriseConstructor(24, "raj");
		p1.show();
		ParametriseConstructor p2=new ParametriseConstructor(25, "golu");
	     p2.show();
	}

}
