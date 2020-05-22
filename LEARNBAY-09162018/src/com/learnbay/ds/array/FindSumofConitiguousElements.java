package com.learnbay.ds.array;

/**
 * @author n
 *  
 * Find maximum sum of sub-array
 *  
 * Brute force can be applied but it will be O(n2)
 *  
 * So applying Kadane's algorithm
 *
 * Keep on adding the elements and check if sum > 0 then put it in a state . Compare it
 * with subsequent states. The max value of the state is your answer 
 * It is '7' in this case.
 * 
 * O(n) complexity
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
		
		System.out.println(maxSum);
		
	}
	
}
