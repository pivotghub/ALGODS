package com.learnbay.ds.array;

/**
 * @author nihar
 *
 * Find intersection and union of two sorted and rotated arrays having integers.
 * 
 * no duplicate elements
 * 
 * Time Complexity : O(m + n) for union and intersectionoperation.
 * 
 * 
 */
public class UnionAndIntersectionOftwoSortedAndRotatedArrays {

	public static void main(String[] args) {

		int[] arr1 = {7, 8, 8, 99, 222};
		int[] arr2 = {6, 7, 8, 15};
		
		new UnionAndIntersectionOftwoSortedAndRotatedArrays().printUnion(arr1, arr2);
		new UnionAndIntersectionOftwoSortedAndRotatedArrays().printIntersection(arr1, arr2);
	}

	private void printIntersection(int[] arr1, int[] arr2) {
		
		System.out.println("\n\n***PRINT INTERSECTION***");
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		int i = 0, j = 0;
		while(i < l1 && j < l2){
			if(arr1[i] == arr2[j]) {
				System.out.println(arr1[i++]);
				j++;
			}
			else {
				if(arr1[i] < arr2[j])
					i++;
				else
					j++;
			}
		}
		
	}

	private void printUnion(int[] arr1, int[] arr2) {
		
		System.out.println("***PRINT UNION***");
		int i = 0, j = 0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				System.out.println(arr1[i++]+" ");
			}
			else if(arr1[i] > arr2[j]){
				System.out.println(arr2[j++]+" ");
			}
			else{
				System.out.println(arr1[i++]+" ");
				j++;
			}
		}
		
		while(i<arr1.length) {
			 System.out.print(arr1[i++]+" "); 
		}
		while(j<arr2.length) {
			 System.out.print(arr2[j++]+" "); 
		}
		
	}

}
