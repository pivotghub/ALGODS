package com.learnbay.ds.tree;


/**
 * @author n
 * 
 * Binary Search Tree (BST)  with recursive operations.
 * 
 * ALL ON LEFT < ROOT < ALL ON RIGHT
 *
 */
public class BSTWithRecursion {

	/**
	 * A sample Node which has a value and left and right child 
	 *
	 */
	static class Node{
		
		int val;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val = val;
		}

		/**
		 * @param node 
		 * @param val
		 * 
		 * insert with recursion.
		 * 
		 * this is a BST so insertion on left is possible when the value is greather than the root
		 * and right is possible when it is lesser.
		 * 
		 */
		public Node insert(Node node, int val) {
			
			if(null == node){
				return node = new Node(val);
			}
			if( val < node.val){
				node.left = insert(node.left, val);
			}
			else{
				node.right = insert(node.right, val);
			}
			return node;
		}
		
		
		/**
		 * 
		 * FIND A NODE WITH VALUE.
		 * 
		 * @param node
		 * @param val
		 * @return Node
		 */
		public Node find(Node node, int val){
			
			Node cur = node;
			
			if(val != cur.val){
				if(val < cur.val){
					cur = cur.left;
				}
				else{
					cur = cur.right;
				}
			}
			return cur;
		}
		
	
	/**
	 * @param head
	 */
	private static void traversePreOrder(Node head) {
		
		if(null == head){
			return;
		}
		System.out.println(head.val);
		traversePreOrder(head.left);
		traversePreOrder(head.right);
	}
		
		
	/**
	 * @param node
	 * 
	 * in-order traversal
	 * 
	 */
	/**
	 * @param node
	 */
	private static void traverseInorder(Node node) {
		
		if(node == null) return;     
		traverseInorder(node.left);
		System.out.println(node.val);
		traverseInorder(node.right);
	}
	
	/**
	 * @param node
	 */
	private static void traversePostOrder(Node node) {
		
		if(node == null) return;     
		traversePostOrder(node.left);
		traversePostOrder(node.right);
		System.out.println(node.val);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		Node node = new Node(30);
		node.insert(node, 10);
		node.insert(node, 50);
		
		node.insert(node, 5);
		node.insert(node, 4);
		node.insert(node, 1);
		node.insert(node, 3);
		
		traversePreOrder(node);
		System.out.println("\n\n");
		traverseInorder(node);
		System.out.println("\n\n");
		traversePostOrder(node);
	}

}
}
