package com.linear;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]= {70,80,90,100,110};
		System.out.println("Enter key for linear search");
		
         Scanner scanner=new Scanner(System.in);
         
         int key= scanner.nextInt();
         int result =linearSearch(arr,key);
         
         if(result==-1) {
        	 System.out.println("Element not found");
        	 
         }
         else {
        	 System.out.println("Element at index number "+result);
         }
	}
      public static int linearSearch(int arr[], int key) {
    	  
    	 int len= arr.length;
    	 int index=-1;
         for(int i=0;i<len;i++) {
        	 if(arr[i]==key) {
        	   index=i;
        		
        	 }
         }
         return index;
      }
}
