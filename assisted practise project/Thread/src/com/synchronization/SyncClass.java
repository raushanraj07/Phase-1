package com.synchronization;

public class SyncClass {

	public static void main(String[] args) {
	   
	        Sender snd = new Sender(); 
	        ThreadSend S1 = 
	            new ThreadSend( " Hi " , snd ); 
	        ThreadSend S2 = 
	            new ThreadSend( " Bye " , snd ); 
	        S1.start(); 
	        S2.start(); 
	        try
	        { 
	            S1.join(); 
	            S2.join(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println("Interrupted"); 
	        } 

	}

}
