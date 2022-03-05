package com.synchronization;

public class ThreadSend extends Thread{
	private String msg; 
    private Thread t; 
    Sender  sender; 
    ThreadSend(String m,  Sender obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 

}
