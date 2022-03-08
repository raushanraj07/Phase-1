package com.longest;

public class Long
{
    
    public static int LIS(int[] arr, int i, int n, int prev)
    {
        
        if (i == n) {
            return 0;
        }
 
       
        int excl = LIS(arr, i + 1, n, prev);
 
        
        int incl = 0;
        if (arr[i] > prev) {
            incl = 1 + LIS(arr, i + 1, n, arr[i]);
        }
 
        
        return Integer.max(incl, excl);
    }
 
    public static void main(String[] args)
    {
        int[] arr = {4,3,2,1,5,6,8,9,10,22 };
 
        System.out.println("The length of the LISS is "
                        + LIS(arr, 0, arr.length, Integer.MIN_VALUE));
        for (int LIS : arr) {
        	System.out.print(LIS);
		}
    }
}