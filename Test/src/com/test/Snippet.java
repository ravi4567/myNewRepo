package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Snippet {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
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
			int left[] = new int[n]; 
	        int right[] = new int[n]; 
	        int prod[] = new int[n]; 
	  
	        int i, j; 
	  
	        /* Left most element of left array is always 1 */
	        left[0] = 1; 
	  
	        /* Rightmost most element of right array is always 1 */
	        right[n - 1] = 1; 
	  
	        /* Construct the left array */
	        for (i = 1; i < n; i++) 
	            left[i] = array[i - 1] * left[i - 1]; 
	        System.out.println(Arrays.toString(left));
	  
	        /* Construct the right array */
	        for (j = n - 2; j >= 0; j--) 
	            right[j] = array[j + 1] * right[j + 1]; 
	        System.out.println(Arrays.toString(right));
	  
	        /* Construct the product array using 
	           left[] and right[] */
	        for (i = 0; i < n; i++) 
	            prod[i] = left[i] * right[i]; 
	  
	        /* print the constructed prod array */
	        for (i = 0; i < n; i++) 
	            System.out.print(prod[i] + " "); 
		
			System.out.println();
		}
	}
	
}



