package com.inheritance;

public class Car {
	
	    public int gear; 
	    public int speed; 
	    public Car(int gear, int speed) 
	    { 
	        this.gear = gear; 
	        this.speed = speed; 
	    } 
	    public void applyBrake(int decrement) 
	    { 
	        speed -= decrement; 
	    } 
	    public void speedUp(int increment) 
	    { 
	        speed += increment; 
	    }  
	    public String toString()  
	    { 
	        return("No of gears in car are " + gear + "\n" + "speed of MountainBike is " + speed); 
	    }  

}
