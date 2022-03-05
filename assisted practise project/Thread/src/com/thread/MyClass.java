package com.thread;

public class MyClass {

	private static Object LOCK=new Object();
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);
          System.out.println("Thread "+Thread.currentThread().getName()+" is woken after sleeping for 2 second");
          synchronized (LOCK) {
			LOCK.wait(2000);
			System.out.println("object "+LOCK+" is woken after"+"waiting for 2 second");
			
		}
	}
}
