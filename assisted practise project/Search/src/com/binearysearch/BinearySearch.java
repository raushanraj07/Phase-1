package com.binearysearch;

import java.util.Scanner;

public class BinearySearch {

	public static void main(String[] args) {
	
		int arr[]= {10,11,12,13,14};
		int len=arr.length;
		int start=0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter key for binary search");
		int key= scanner.nextInt();
		binearySearch(arr,start,key,len);
		
	}
	public static void binearySearch(int[] arr, int start, int key, int length){

        int midValue = (start+length)/2;
        while(start<=length){

            if(arr[midValue]<key){

                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
            if(start>length){

                System.out.println("Element is not found");
            }


}
}