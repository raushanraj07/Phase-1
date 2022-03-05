package com.sort;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Element after insertion sort");
		int arr[]= {12,5,4,2,3,20};
	insertionSort(arr);
	for (int element : arr) {
		System.out.print(element+" ");
	}
		
	}
	
	public static void insertionSort(int[] arr){

	    int len = arr.length;
	    for(int j=1;j<len;j++){
	    int key = arr[j];
	    int i=j-1;
	    while ((i>-1) && (arr[i]>key)){

	        arr[i+1]=arr[i];
	        i--;
	    }
	    arr[i+1]=key;
	         }

	    }

	
	
	
	}