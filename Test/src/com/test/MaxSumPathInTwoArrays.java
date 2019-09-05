package com.test;

public class MaxSumPathInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = {2, 3, 7, 10, 12, 15, 30, 34}; 
        int ar2[] = {1, 5, 7, 8, 10, 15, 16, 19}; 
        int m = ar1.length; 
        int n = ar2.length; 
        System.out.println("Maximum sum path is :" +  
        		getMaxSum(ar1, ar2, m, n)); 
	}
	
	static int getMaxSum(int array1[],int array2[],int m,int n) {
		int i=0,j=0;int sum1=0,sum2=0,result=0;
		while(i<m && j<n) {
			
			if(array1[i]<array2[j])
				sum1+=array1[i++];
			else if(array2[j]<array1[i])
				sum2+=array2[j++];
			else {
				 
				result+=Math.max(sum1, sum2);
				sum1 = 0; 
                sum2 = 0;
				while(i<m && j<n && array1[i]==array2[j]) {
					result+=array1[i++];
					j++;
				}
			}
		}
		while (i < m) 
            sum1 += array1[i++]; 
          
        // Add remaining elements of ar2[] 
        while (j < n)  
            sum2 += array2[j++]; 
  
        // Add maximum of two sums of remaining elements 
        result += Math.max(sum1, sum2); 
  
        return result; 
	}

}
