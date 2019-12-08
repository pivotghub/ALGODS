package com.learnbay.ds.array;

import java.util.Arrays;

/**
 * @author nihar
 *
 *	Original List                   : 1 2 3 4 5 6 7
	After reversing all numbers     : 7 6 5 4 3 2 1
	After reversing first k numbers : 5 6 7 4 3 2 1
	After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
	
	Complexity Analysis

	Time complexity : O(n). n elements are reversed a total of three times.

	Space complexity : O(1). No extra space is used.
	
 */
public class RotateArrayThreeTypeReverse{

	public void rotate(int[] nums, int k) {
		
		if(nums.length < k)
    		return;
		
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
	
    public void reverse(int[] nums, int start, int end) {
    	
    	int temp;
        while(start < end) {
        	temp = nums[start];
        	nums[start] = nums[end];
        	nums[end] = temp;
        	start++;
        	end--;
        }
    }
    
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		new RotateArrayThreeTypeReverse().rotate(arr, 4);
		System.out.println("Final array: "+Arrays.toString(arr));
	} 
} 

