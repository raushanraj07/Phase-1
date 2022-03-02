package com.methods;
//call by value

public class CallMethod {

	int val=150;
	int operation (int val) {
		val=val*10/100;
		return (val);
		
	}
	public static void main(String[] args) {
		CallMethod obj=new CallMethod();
		System.out.println("before operation value is "+ obj.val);
		obj.operation(150);
		System.out.println("after operation value is "+ obj.val);

		
	}

}
