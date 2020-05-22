package com.learnbay.ds.array;


/**
 * @author n
 * 
 * Given an array of n elements which contains
 *  
 * elements from 0 to n-1, 
 * 
 * with any of these numbers appearing any number of times. 
 * Find these repeating numbers in O(n) and using O(1) memory space.
 * 
 *
 *1,2,2, 3 will result in 2
 *
 */
public class FindElementDuplicate {

	public static void main(String[] args) {

		int arr[] = new int[]{1,2,2,3};
		
		 int i;  
	        System.out.println("The repeating elements are : ");
	    
	        for (i = 0; i < arr.length; i++)
	        {

	        	if (arr[Math.abs(arr[i])] >= 0)
	                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	            else
	                System.out.print(Math.abs(arr[i]) + " ");
	        }       
		
		
	}

}
