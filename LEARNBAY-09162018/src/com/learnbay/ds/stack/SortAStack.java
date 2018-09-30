package com.learnbay.ds.stack;

/**
 * @author n
 * 
 * Sort an unsorted stack either in ascending or descending order with the help of another stack.
 *
 */
public class SortAStack {
	
	public static void main(String[] args){
		
		java.util.Stack<Integer> stackMain = new java.util.Stack<>();
		stackMain.push(5);
		stackMain.push(9);
		stackMain.push(2);
		stackMain.push(4);
		stackMain.push(7);
		
		System.out.println("orginal elements: "+stackMain);
		
		java.util.Stack<Integer> stackTemp = new java.util.Stack<>();
		
		while(!stackMain.isEmpty()){
			
			int cur = stackMain.pop();
			
			while(!stackTemp.isEmpty() && cur < stackTemp.peek()){
				stackMain.push(stackTemp.pop());
			}
			stackTemp.push(cur);
		}
		System.out.println("sorted elements in descending order: "+stackTemp);
		
		
		/*NOW SORTING ELEMENTS IN ASCENDING ORDER - Just change '>' to '<' above.*/
		
		
		
	}
}
