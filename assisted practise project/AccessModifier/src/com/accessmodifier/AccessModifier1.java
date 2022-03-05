package com.accessmodifier;

public class AccessModifier1 {
public static void main(String[] args) {
	System.out.println("private access modifier");
	PrivateAccessModifier obj= new PrivateAccessModifier();
	//obj.display();
	//so here we cannot access the private method of another class
}
}
