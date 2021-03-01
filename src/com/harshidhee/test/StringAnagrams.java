package com.harshidhee.test;

public class StringAnagrams {

	public static void main(String[] args) {
			
			String s1="cde";
			String s2="abc";
			int[] s1Arr=new int[256];
			int[] s2Arr=new int[256];
			int s1Len=s1.length();
			int s2Len=s2.length();
			
			//convert string tostring array 
			for(int i=0;i<s1Len;i++)  
				s1Arr[s1.charAt(i)]++;
			for(int j=0;j<s2Len;j++)
				s2Arr[s2.charAt(j)]++;
			
			char[] arrS1=new char[s1Len];
			char[] arrS2=new char[s2Len];
			for(int i=0;i<s1Len;i++) {
				arrS1[i]=s1.charAt(i);
			}
			for(int i=0;i<s2Len;i++) {
				arrS2[i]=s2.charAt(i);
			}
			
			int count=0;
			char s=0;
			for(int i=0;i<arrS1.length;i++) {
				for(int j=0;j<arrS2.length;j++) {
					if(arrS1[i]!=arrS2[j] ){
						count++;
					}else {
						s=arrS1[i];
					}
				}
			}
			
			System.out.println("unmatched varibale::"+count/2);
			System.out.println("matched varibale::"+s);
	}

}
