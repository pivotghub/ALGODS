package com.learnbay.ds.stack;

import java.util.Scanner;

/**
 * @author n
 * 
 *         Create a simple text editor using stack from HACKERRANK
 * 
 * @see https://www.hackerrank.com/challenges/simple-text-editor/problem
 *
 *
 *      In this challenge, you must implement a simple text editor. Initially,
 *      your editor contains an empty string, . You must perform operations of
 *      the following types:
 * 
 *      append - Append string to the end of . delete - Delete the last
 *      characters of . print - Print the character of . undo - Undo the last
 *      (not previously undone) operation of type or , reverting to the state it
 *      was in prior to that operation.
 * 
 * 
 *      Sample Input
 * 
 *      8 1 abc 3 3 2 3 1 xy 3 2 4 4 3 1
 * 
 * 
 *      Sample Output
 * 
 *      c y a
 * 
 * 
 */
public class SimpleTextEditorDriver {

	public static void main(String[] args) {

		java.util.Stack<String> stack = new java.util.Stack<>();
		String S = "";

		Scanner sc = new Scanner(System.in);
		int numberOfOperations = sc.nextInt();

		if (numberOfOperations == 0) {
			System.out.println("Exit!");
		}

		for (int x = 0; x < numberOfOperations; x++) {

			int option = sc.nextInt();

			switch (option) {

			// append new string
			case 1:
				stack.push(S);
				String s = sc.next();
				S = S+s;
				break;
				
			// delete last k character(s)
			case 2:
				stack.push(S);
				int dt = sc.nextInt();
				S = S.substring(0, S.length() - dt);
				break;
				
			// print k characters
			case 3:
				int prc = sc.nextInt();
				System.out.println(S.charAt(prc-1));
				break;
				
			// undo the last operation
			case 4:
				S = stack.pop();
				break;
				
			default:
				break;
			}

		}
	}
}
