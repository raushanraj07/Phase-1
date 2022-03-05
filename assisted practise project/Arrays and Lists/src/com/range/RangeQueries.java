package com.range;

public class RangeQueries {
	static int l = 16;
    static int I = 100000; 
    static long table[][] = new long[I][l + 1]; 
    static void buildSparseTable(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            table[i][0] = arr[i]; 
        for (int j = 1; j <= l; j++) 
            for (int i = 0; i <= n - (1 << j); i++) 
                table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1]; 
    } 
    static long query(int L, int R) 
    {
        long answer = 0; 
        for (int j = l; j >= 0; j--)  
        { 
            if (L + (1 << j) - 1 <= R)  
            { 
                answer = answer + table[L][j];
                L += 1 << j; 
            } 
        } 
        return answer; 
    }
    public static void main(String args[]) 
    { 
        int arr[] = { 2,5,6,7,1,2,7,9 }; 
        int n = arr.length; 
        buildSparseTable(arr, n); 
        System.out.println(query(0, 5)); 
        System.out.println(query(3, 5)); 
        System.out.println(query(2, 4)); 
    } 
}


