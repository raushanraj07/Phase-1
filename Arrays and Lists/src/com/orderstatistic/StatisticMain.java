package com.orderstatistic;

public class StatisticMain {

	public static void main(String[] args) {
	
	     OrderStatistic ob = new OrderStatistic(); 
        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
        int n = arr.length,m = 1; 
        System.out.println("m'th smallest element is "+ ob.mthSmallest(arr, 0, n-1, m)); 

	}

}
