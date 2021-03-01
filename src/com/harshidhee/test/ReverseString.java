package com.harshidhee.test;

 
public class ReverseString {

	public static void main(String[] args) {
		 String str="change string";
		 int len=str.length();
		 
		 char[] ch=str.toCharArray(); 
		 String revStr="";
		 for(int i=len-1;i>=0;i--) {
			 revStr += ch[i];
		 }
//	 System.out.println(ch[2]);
	System.out.println(revStr);	 
	}

}
