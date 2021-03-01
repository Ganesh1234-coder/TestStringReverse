package com.harshidhee.test;

import java.util.Arrays;

public class StringThirdLargest {

public static void main(String[] args) {

	String[] names = {"hello","hi","welcome","bye","seeyou"};
 
		 //Sort the array by supplying the lambda expression to compare two strings in the array         
		Arrays.sort(names, (x,y) -> Integer.compare(x.length(),y.length())); 
         
		System.out.println(Arrays.deepToString(names));
		System.out.println(names[2]);
		
	}
	  

	
	
}
