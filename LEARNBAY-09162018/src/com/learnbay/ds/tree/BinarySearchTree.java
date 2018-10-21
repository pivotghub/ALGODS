package com.learnbay.ds.tree;

/**
 * @author n
 * 
 * Binary Search Tree (BST)  
 * 
 * ALL ON LEFT < ROOT < ALL ON RIGHT
 *
 */
public class BinarySearchTree {

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
		 * this is a BST so insertion on left is possible when the value is greather than the root
		 * and right is possible when it is lesser.
		 * 
		 */
		public void insert(Node node, int val) {
			
			Node fn = node;
			Node parent = null;
			while(true){
				parent = fn;
				if(val > fn.val){
					fn = fn.right;
					if(fn == null){
						parent.right = new Node(val);
						break;
					}
				}
				else{
					fn = fn.left;
					if(fn == null){
						parent.left = new Node(val);
						break;
					}
				}
			}
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
	 * @param args
	 */
	public static void main(String[] args){
		
		Node node = new Node(10);
		node.insert(node, 30);
		node.insert(node, 50);
		
		node.insert(node, 5);
		node.insert(node, 4);
		node.insert(node, 1);
		node.insert(node, 3);
	}
}
}
