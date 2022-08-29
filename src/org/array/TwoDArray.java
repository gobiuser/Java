package org.array;

public class TwoDArray {
	public static void main(String[] args) {
	int a[][]=new int [2][2];	
	
	a[0][0]=10;
	a[0][1]=20;
	a[1][0]=30;
	a[1][1]=40;		
		
	System.out.println(a[0][0]);	
	System.out.println("-----------------");	
		
		//foreach loop
	 for (int[] is : a) {
		 for (int i : is) {
			 
			 System.out.println(i);
			
		}
		
	}
	 System.out.println("------------------");
	
	 
	
	}

}
