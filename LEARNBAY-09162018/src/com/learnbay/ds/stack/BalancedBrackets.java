package com.learnbay.ds.stack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author n
 * 
 *         https://www.hackerrank.com/challenges/balanced-brackets/problem
 * 
 * 
 *         y this logic, we say a sequence of brackets is balanced if the
 *         following conditions are met:
 * 
 *         1. It contains no unmatched brackets. 2. The subset of brackets
 *         enclosed within the confines of a matched pair of brackets is also a
 *         matched pair of brackets
 * 
 * 
 * 
 *         Sample Input 3 {[()]} {[(])} {{[[(())]]}}
 *
 *         Sample Output YES NO YES
 *
 */
public class BalancedBrackets {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\brac.txt"));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String s = scanner.nextLine();

			String result = isBalanced(s);
			System.out.println(result);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();
		scanner.close();
	}

	static String isBalanced(String s) {

		java.util.Stack<Character> stack = new java.util.Stack<>();

		char[] mainarray = s.toCharArray();
		if (mainarray.length % 2 != 0) {
			return "NO";
		}

		for (char c : mainarray) {

			if (c == '(' || c == '{' || c == '[')
				stack.push(c);
			else {

				if (stack.isEmpty())
					return "NO";

				else if (c == ')' || c == '}' || c == ']') {
					if (!isAPair(stack.pop(), c)) {
						return "NO";
					}
				}
			}
		}
		
		if(stack.isEmpty())
			return "YES";
		else
			return "NO";
		
	}

	/**
	 * @param pop
	 * @param c
	 * 
	 *            Compare '(' with ')'
	 */
	private static boolean isAPair(Character pop, char c) {

		if (pop == '(' && c == ')')
			return true;
		if (pop == '{' && c == '}')
			return true;
		if (pop == '[' && c == ']')
			return true;

		return false;

	}
}
