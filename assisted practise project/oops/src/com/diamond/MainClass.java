package com.diamond;

public class MainClass implements First,Second{
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        MainClass ob = new MainClass(); 
        ob.show(); 
    } 

}
