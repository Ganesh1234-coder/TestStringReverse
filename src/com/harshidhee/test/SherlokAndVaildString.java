package com.harshidhee.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlokAndVaildString {

    // Complete the isValid function below.
    static String isValid(String s) {
    		int count[]=new int[26];
    		
    		for(int i=0;i<26;i++) {
    			count[s.charAt(i)-'a']++;
    		}
    		
    		int i, freq=0,count_freq=0;
    		for( i=0 ;i<26;i++) {
    			if(count[i]!=0) {
    				freq=count[i];
    				count_freq=1;
    				break;
    			}
    		}
    		
    		int j, freq1=0,count_freq1=0;
    		for(  j=i+1;j<26;j++) {
    			if(count[j]!=0) {
    				if(count[j]==freq) {
    					count_freq++;
    				}else {
    					count_freq1=1;
    					count_freq1=count[j];
    					break;
    				}
    			}
    		}
    		
    		for(int k=j+1;k<26;k++) {
    			if(count[k]!=0) {
    				if(count[k]==freq) {
    					count_freq++;
    				}
    				if(count[k]==freq1) {
    					count_freq1++;
    				}else {
    					return "NO";
    				}
    			}
    			if(count_freq>1 && count_freq1>1) {
    				return "NO";
    			}
    		}
    		
    	return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        String s = scanner.nextLine();

        String result = isValid(s);

  System.out.println(result);

        scanner.close();
    }
}
