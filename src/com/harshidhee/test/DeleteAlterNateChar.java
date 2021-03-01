package com.harshidhee.test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DeleteAlterNateChar {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

    	int[] count=new int[26];
    	int result=0;
    	for(int i=0;i<s.length();i++) {
    		count[s.charAt(i)-'a']++;
    	}
 	//System.out.println(Arrays.toString(count));
    	
    	for(int i=0;i<=(s.length()-1);i++) {
    		if(count[i]==count[i+1]) {
    			System.out.println(count[i]+" --->  "+count[i+1]);
    			result +=1;
    		}
    	}
    	
		return result;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    		 	System.out.println("enter a string");
    		 	String s=scanner.next();
    		 	System.out.println(alternatingCharacters(s));
        scanner.close();
    }
}
