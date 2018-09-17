package com.learnbay.ds.array;


/**
 * @author n
 * 
 * Simple example to find the missing element in an array
 * 
 *
 */
public class FindingMissingElement {

	public static void main(String[] args) {

		int arr[] = new int[]{1, 2, 4, 5, 3};
		
		int mp = (6*7)/2;
		
		int sum = 0;
		for(int i=0; i< arr.length; i++){
			sum = sum+arr[i];
		}
		
		System.out.println("the missing number is : "+(mp-sum));
		
	}

}
 