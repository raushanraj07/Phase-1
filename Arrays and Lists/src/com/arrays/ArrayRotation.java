package com.arrays;

public class ArrayRotation {
	
	public void rotate(int[] l, int n) {
		if(n>l.length)
			n=n%l.length;
		int[] result=new int[l.length];
		for(int i=0;i<n;i++) {
			result[i]=l[l.length-n+i];
		}
		int j=0;
		for(int i=n;i<l.length;i++) {
			result[i]=l[j];
			j++;
			
		}
		System.arraycopy(result, 0, l, 0, l.length);
	}




	}


