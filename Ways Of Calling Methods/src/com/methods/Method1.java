package com.methods;

public class Method1 {
	public int addNumber(int a, int b) {
		return a+b;
		
	}

	public static void main(String[] args) {
		Method1 obj= new Method1();
		int z= obj.addNumber(60, 65);
		System.out.println("addition of two number is "+ z);
	}

}
