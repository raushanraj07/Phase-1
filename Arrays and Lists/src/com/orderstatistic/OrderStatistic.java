package com.orderstatistic;

public class OrderStatistic {
	int mthSmallest(int arr[], int l, int r, int m) 
	{ 
         		if (m > 0 && m <= r - l + 1) 
    		{ 
        			int p = randomPartition(arr, l, r); 
        			if (p-l == m-1) 
            			return arr[p]; 
        			if (p-l > m-1) 
            			return mthSmallest(arr, l, p-1, m); 
        			return mthSmallest(arr, p+1, r, m-p+l-1); 
    		} 
    return Integer.MAX_VALUE; 
} 
void swap(int arr[], int i, int j) 
{ 
    int temp = arr[i]; 
    arr[i] = arr[j]; 
    arr[j] = temp; 
} 
int partition(int arr[], int l, int r) 
{ 
    int x = arr[r], i = l; 
    for (int j = l; j <= r - 1; j++) 
    { 
        if (arr[j] <= x) 
        { 
            swap(arr, i, j); 
            i++; 
        } 
    } 
    swap(arr, i, r); 
    return i; 
} 
int randomPartition(int arr[], int l, int r) 
{ 
    int n = r-l+1; 
    int pivot = (int)(Math.random()) * (n-1); 
    swap(arr, l + pivot, r); 
    return partition(arr, l, r); 
} 

}
