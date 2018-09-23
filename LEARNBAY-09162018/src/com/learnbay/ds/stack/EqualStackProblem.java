package com.learnbay.ds.stack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author n
 * 
 *         Equal Stack problem in hackerrank
 * 
 *         {@link} https://www.hackerrank.com/challenges/equal-stacks/problem
 * 
 *         You have three stacks of cylinders where each cylinder has the same
 *         diameter, but they may vary in height. You can change the height of a
 *         stack by removing and discarding its topmost cylinder any number of
 *         times.
 * 
 *         Find the maximum possible height of the stacks such that all of the
 *         stacks are exactly the same height. This means you must remove zero
 *         or more cylinders from the top of zero or more of the three stacks
 *         until they're all the same height, then print the height. The
 *         removals must be performed in such a way as to maximize the height.
 * 
 *         Note: An empty stack is still a stack.
 * 
 *         Input Format
 * 
 *         The first line contains three space-separated integers, , , and ,
 *         describing the respective number of cylinders in stacks , , and . The
 *         subsequent lines describe the respective heights of each cylinder in
 *         a stack from top to bottom:
 * 
 *         The second line contains space-separated integers describing the
 *         cylinder heights in stack . The first element is the top of the
 *         stack. The third line contains space-separated integers describing
 *         the cylinder heights in stack . The first element is the top of the
 *         stack. The fourth line contains space-separated integers describing
 *         the cylinder heights in stack . The first element is the top of the
 *         stack. Constraints
 * 
 *         Output Format
 * 
 *         Print a single integer denoting the maximum height at which all
 *         stacks will be of equal height.
 * 
 *         Sample Input
 * 
 *         5 3 4 3 2 1 1 1 4 3 2 1 1 4 1
 * 
 *         Sample Output
 * 
 *         5 (deducting 3, 4 and (1,1) from the corresponding stacks will result
 *         in 5 if you add remaining digits)
 * 
 * 
 *
 */
public class EqualStackProblem {

	static java.util.Stack<Integer> stack1 = new java.util.Stack<>();
	static java.util.Stack<Integer> stack2 = new java.util.Stack<>();
	static java.util.Stack<Integer> stack3 = new java.util.Stack<>();
	
	
	/*
	 * Complete the equalStacks function below.
	 */
	static int equalStacks(int[] h1, int[] h2, int[] h3) {
		
		/*Push elements in all the queues in reverse order as 1,1,4,1 has to be put in reverse order.*/
		
		
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		for(int iDx = h1.length-1; iDx >= 0;iDx--){
			sum1 = sum1 + h1[iDx];
			stack1.push(h1[iDx]);
		}
		
		for(int iDx = h2.length-1; iDx >= 0; iDx--){
			sum2 = sum2 + h2[iDx];
			stack2.push(h2[iDx]);
		}
		
		for(int iDx = h3.length-1; iDx >= 0; iDx--){
			sum3 = sum3 + h3[iDx];
			stack3.push(h3[iDx]);
		}
		
		/*in case sum of the individual elements of the queues are equal return any sum. Else prorceed if any one of
		 * them is different. Find the max of all and to pop the element where ever you find that
		 * the sum belonging to a particualt stack is bigger than the other two.*/
		
		if (!(sum1 == sum2 && sum2 == sum3)) {

			while (sum1 != sum2 || sum2 != sum3) {

				java.util.Stack<Integer> stackTobeOperatedOn = maxOf(sum1, sum2, sum3);

				if (stackTobeOperatedOn == stack1) {
					sum1 = sum1 - stackTobeOperatedOn.pop();
				}
				if (stackTobeOperatedOn == stack2) {
					sum2 = sum2 - stackTobeOperatedOn.pop();
				}
				if (stackTobeOperatedOn == stack3) {
					sum3 = sum3 - stackTobeOperatedOn.pop();
				}
			}
		}
		return sum1;
	}
	
	
	private static Stack<Integer> maxOf(int sum1, int sum2, int sum3) {

		int[] arr = new int[] { sum1, sum2, sum3 };
		int maxSumIndex = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				maxSumIndex = i + 1;
			}
		}
		if (maxSumIndex == 0) {
			return stack1;
		} else if (maxSumIndex == 1) {
			return stack2;
		} else if (maxSumIndex == 2) {
			return stack3;
		}
		return null;
	}
	

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\brac.txt"));

		String[] n1N2N3 = scanner.nextLine().split(" ");

		int n1 = Integer.parseInt(n1N2N3[0].trim());

		int n2 = Integer.parseInt(n1N2N3[1].trim());

		int n3 = Integer.parseInt(n1N2N3[2].trim());

		int[] h1 = new int[n1];

		String[] h1Items = scanner.nextLine().split(" ");

		for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
			int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
			h1[h1Itr] = h1Item;
		}

		int[] h2 = new int[n2];

		String[] h2Items = scanner.nextLine().split(" ");

		for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
			int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
			h2[h2Itr] = h2Item;
		}

		int[] h3 = new int[n3];

		String[] h3Items = scanner.nextLine().split(" ");

		for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
			int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
			h3[h3Itr] = h3Item;
		}

		int result = equalStacks(h1, h2, h3);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}
}
