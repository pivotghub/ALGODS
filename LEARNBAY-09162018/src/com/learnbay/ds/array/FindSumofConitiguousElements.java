package com.learnbay.ds.array;

/**
 * @author n
 *  
 * Cadence algorithm
 *
 */
public class FindSumofConitiguousElements {

	public static void main(String[] args){
		
		int[] arr = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
		
		int sum = 0;
		int maxSum = 0;
		
		for(int i=0; i<arr.length; i++){
			 sum = sum + arr[i];
			 if(sum < 0){
				 sum = 0;
			 }
			 
			 if(maxSum < sum){
				 maxSum = sum;
			 }
		}
		
		
	}
	
}
