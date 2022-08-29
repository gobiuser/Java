package org.array;

public class ForArray {
public static void main(String[] args) {
	int a[] =new int [4];
	
	a[0]=10;
	a[1]=20;
	a[2]=30;
	
	//foreach loop 
	for (int i : a) {
		System.out.println(i);
		
	}
	
	//normal for loop
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		
	}
}
}
