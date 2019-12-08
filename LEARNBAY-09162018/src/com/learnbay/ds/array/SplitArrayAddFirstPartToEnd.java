package com.learnbay.ds.array;

import java.util.Arrays;

/**
 * @author nihar
 * 
 * There is a given an array and split it from a specified position, and move the first part of array add to the end.
 * 
 *  Input : arr[] = {12, 10, 5, 6, 52, 36}
            k = 2
	Output : arr[] = {5, 6, 52, 36, 12, 10}
	
	Explanation : Split from index 2 and first part {12, 10} add to the end .
	
 *	Time Complexity: O(nk)
 *	Space Complexity: O(1)
 *
 */
public class SplitArrayAddFirstPartToEnd {

	public static void main(String[] args) {

	  int arr[] = { 12, 10, 5, 6, 52, 36 }; 
	  int n = arr.length; 
	  int position = 2; 
	  
	  for(int i=0; i<position; i++) {
		
		int value1 = arr[0];
		for(int j=0; j<n-1; j++) {
			arr[j] = arr[j+1];
		}
			arr[n-1] = value1;
		}
	  
	  System.out.println("Final array: "+Arrays.toString(arr));
		
	}

}
