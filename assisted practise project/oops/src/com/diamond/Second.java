package com.diamond;

public interface Second {
	default void show() 
    { 
        System.out.println("Default Second"); 
    } 

}
