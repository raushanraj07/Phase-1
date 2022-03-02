package com.constructor;

public class DefaultConstructor {
	
	int rollnumber=20;
	String name="Ranjan";
	
	public void show() {
		System.out.println(rollnumber+" "+name);
	}

	public static void main(String[] args) {
		
		 DefaultConstructor d1=new DefaultConstructor();
		 d1.show();
	}

}
