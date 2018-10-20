package com.learnbay.ds.tree;

/**
 * @author n
 * 
 * Just inserting the nodes on either left of right of the root.
 *  
 *
 */
public class BinaryTree {
	
	/**
	 * NODE which has a value, left and right child.
	 *
	 */
	static class Node {

		private int  value;
		private Node left;
		private Node right;
		
		public Node(int value){
			
			this.value = value;
			left = null;
			right= null;
		}

		
		/**
		 * @param rootNode 
		 * @param leftValue
		 * 
		 * Insert node to the left
		 * 
		 * Case 1: LEFT NULL   Case 2: LEFT NOT NULL
		 * 
		 */
		public void insertToLeft(Node node, int leftValue) {
			
				if(node.left == null){
					node.left = new Node(leftValue);
				}
				else{
					Node temp = node.left;
					node.left = new Node(leftValue);
					node.left.left = temp;
				}
		}
		
		
		/**
		 * @param rootNode 
		 * @param rightValue
		 * 
		 * Insert node to the right
		 * 
		 * Case 1: RIGHT NULL   Case 2: RIGHT NOT NULL
		 * 
		 *  
		 */
		public void insertToRight(Node node, int rightValue) {

			if(node.right == null){
				node.right = new Node(rightValue);
			}
			else{
				Node temp = node.right;
				node.right = new Node(rightValue);
				node.right.right = temp;
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args){

		Node rootNode = new Node(10);
		rootNode.insertToLeft(rootNode, 20);
		rootNode.insertToLeft(rootNode, 50);
		rootNode.insertToLeft(rootNode, 30);
		
		rootNode.insertToRight(rootNode, 70);
		rootNode.insertToRight(rootNode, 80);
		rootNode.insertToRight(rootNode, 90);
	}

}
