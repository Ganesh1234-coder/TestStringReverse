package com.harshidhee.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingStringAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	 int[] count1=new int[26];
    	 int[] count2=new int[26];
    	 int result=0;
    	 char[] c=null;
    	 for(int i=0;i<a.length();i++) {
    		 count1[a.charAt(i)-'a']++;
    	 }
    	 for(int i=0;i<b.length();i++) {
    		 count2[b.charAt(i)-'a']++;
    	 }
    	 for(int i=0;i<26;i++) {
    		 result += Math.abs(count1[i]-count2[i]);
    		 
    	 }
    	  
    	 return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
System.out.println("enter 1st string");
        String a = scanner.nextLine();
        System.out.println("enter 2nd string");
        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        System.out.println(res);
        scanner.close();
    }
}
