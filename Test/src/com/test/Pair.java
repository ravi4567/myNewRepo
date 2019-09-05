package com.test;
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    int array[]=new int[n];
		    String str = br.readLine();
		    String[] strs = str.trim().split("\\s+");
		    
		    for(int i=0;i<n;i++){
		        array[i]=Integer.parseInt(strs[i]);
		    }
		    int k = Integer.parseInt(br.readLine());
		    int low=0;
		    int high=n-1;
		    while(low<high){
		        if(array[low]+array[high]==k){
		            System.out.println(array[low++]+" "+array[high--]+" "+k);
		            
		        }
		        else if(array[low]+array[high]<k){
		           low++;
		        }
		        else{
		            high--;
		        }
		    }
		    
		}
	}
}