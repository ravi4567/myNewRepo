package com.test;
/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    int q=n;
		    int p=0;
		    while(n>0){
		        int r = n%10;
		        p = r+p;
		        n=n/10;
		    }
		    if(isPalindrome(p)){
		        System.out.println("YES");
		    }
		    else{
		       System.out.println("NO"); 
		    }
		}
	}

	private static boolean isPalindrome(int n) {
		// TODO Auto-generated method stub
		int q=0;int org=n;
		while(n>0) {
			int r=n%10;
			q=q*100+r;
			n=n/10;
		}
		if(org==n) {
			return true;
		}
		return false;
	}
}
