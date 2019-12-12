package com.learnbay.ds.array;

import java.util.Arrays;

/**
 * 
 * @author NI20058726
 *
 *         Given an array, cyclically rotate the array clockwise by 'one'.
 * 
 *         Input: arr[] = {1, 2, 3, 4, 5}
 * 
 *         Output: arr[] = {5, 1, 2, 3, 4}
 * 
 */

public class CyclicRotationOnebyOne {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}

		arr[0] = temp;
		System.out.println("Final array: " + Arrays.toString(arr));
	}

}
