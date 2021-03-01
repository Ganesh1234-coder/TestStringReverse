package com.harshidhee.test;

public class FindSumAndGreatOfArray {

	public static void main(String[] args) {

	int [] numbs= {1,2,3,4,5,15};
	int  x =numbs[0];
	int sum=0;
    for (int i=0 ; i<numbs.length;i++) {
    	  
    	if( numbs[i]>x) {
    		   x=numbs[i];
    	}
    	sum += numbs[i];
    	System.out.println(sum);
    }
    int y=sum-x;
if(x==y) System.out.println("true");
else System.out.println("false");
    
    
    System.out.println(x);
	}

}
