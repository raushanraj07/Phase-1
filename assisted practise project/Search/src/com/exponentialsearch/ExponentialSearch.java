package com.exponentialsearch;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	public static void main(String[] args) {
	
		int arr[]= {4,8,12,16,20,24};
		int length=arr.length;
System.out.println("Enter a key for exponential search");
Scanner scanner=new Scanner(System.in);
int key =scanner.nextInt();
int outcome=exponentialSearch(arr, length, key);
if(outcome<0) {
	System.out.println("Element not found");
}else {
	System.out.println("element found at index "+outcome);
}

	}
public static int exponentialSearch(int arr[],int length, int key) {
	if(arr[0]==key){
        return 0;
        }
    int i=1;
    while(i<length && arr[i]<=key){

        i=i*2;
    }
    return Arrays.binarySearch(arr,i/2,Math.min(i,length),key);
    }




}

