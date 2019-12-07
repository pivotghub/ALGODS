package com.learnbay.ds.array;

import java.util.Arrays;

/**
 * 
 * @author n
 * 
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 *
 * INPUT: [1, 2, 3, 4, 5, 6, 7]
 * 
 * Rotation of the above array by 2 will make array
 * 
 * OUTPUT: [3, 4, 5, 6, 7, 1, 2]
 * 
 * HINT: *JUGGLING ALGORITHM
 * 
 * HINT: *EUCLIDIAN ALGORITHM TO FIND Greatest Common Divisor
 * 
 * 
 */
public class ArrayRotation {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		ArrayRotation a = new ArrayRotation();
		System.out.println("intial array: "+Arrays.toString(arr));
		a.rotateArray(arr, arr.length, 3);
	}

	private void rotateArray(int[] arr, int length, int rot) {
		
		int tempValue;
		int tempIndex = 0;
		int shiftElementIndex = 0;
		
		int gcd = findGCD(length, rot);
		System.out.println("gcd: "+gcd);
		
		for(int i = 0; i < gcd; i++) {
			
			shiftElementIndex = tempIndex = i; // 0
			
			while(shiftElementIndex + gcd <= length-1) {     //3 <= 11  //6 <=11
				tempValue = arr[tempIndex];     //1  //1
				shiftElementIndex = tempIndex + gcd;  //0+3 = 3
				arr[tempIndex] = arr[shiftElementIndex];  // 4
				arr[shiftElementIndex] = tempValue; // 1
				tempIndex = tempIndex + gcd; // 3
				System.out.println("value after rotation: "+Arrays.toString(arr));
			}
		}
	}

	private int findGCD(int length, int rot) {
		
		if(rot == 0)
			return length;
		else
			return findGCD(rot, length%rot);
	}

}
