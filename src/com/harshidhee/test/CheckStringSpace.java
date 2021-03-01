package com.harshidhee.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckStringSpace {

	public static void main(String[] args) {
			 
			String[] s1= {"this "," is "," ","my ","laptop"};
			String[] s2= {" this"," is "," my","laptop"};
			int count=0;
			for(int i=0;i<s1.length;i++) {
				if(s1[i]==null || s1[1].trim().length()==0||s1[i]==" ") {
					count++;
				}
			}
			
			List<String> arr=new ArrayList(Arrays.asList(s1));
				for(int i=0;i<s2.length;i++) {
					arr.add(s1.length+i,s2[i]);
					//System.out.println(s1.length+"  "+s2[i]);
				}
			//	 String[] s3=  (String[]) arr.toArray();
			
			System.out.println(arr);
			System.out.println(count);
			//System.out.println(Arrays.deepToString(s3));
	}

}
