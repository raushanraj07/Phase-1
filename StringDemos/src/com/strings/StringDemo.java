package com.strings;

public class StringDemo {

	public static void main(String[] args) {
		String str1=new String("java");
		String str4=new String("java");
		String str2="python";
		String str3="python";
		
		System.out.println(str1.toString());
		System.out.println(str2);
		
		System.out.println(str1.equals(str4));//compare value only
		System.out.println(str1==str4);//compare their hashcode 
		

	}

}
