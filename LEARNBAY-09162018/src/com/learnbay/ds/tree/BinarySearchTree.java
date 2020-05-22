package com.learnbay.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author n
 * 
 * Binary Search Tree (BST) - ALL ON LEFT < ROOT < ALL ON RIGHT
 * 
 * @see Node#insert(Node, int)
 * @see Node#traversePreOrder(Node)
 * @see Node#traverseInOrder(Node)
 * @see Node#traversePostOrder(Node)
 *
 */
public class BinarySearchTree {

	/**
	 * A node which has a value and left and right child 
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
		 * @param head 
		 * @param val
		 * 
		 * this is a BST so insertion on left is possible when the value is greather than the root
		 * and right is possible when it is lesser.
		 * 
		 */
		public void insert(Node head, int val) {
			
			Node fn = head;
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
			
			while(null != cur){
				if(val == cur.val) return cur;
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
	 * Traverse the tree in pre-order resulting in root --> left --> right
	 * 
	 * @param head
	 */
	private static void traversePreOrder(Node head) {

		List<Integer> l = new ArrayList<>();
		Stack<Node> st = new Stack<>();
		
		if (null == head) return;
		
		else{
			st.push(head);
			while(!st.isEmpty()){
				Node temp = st.pop();
				l.add(temp.val);
				if(temp.right != null){
					st.push(temp.right);
				}
				if(temp.left != null){
					st.push(temp.left);
				}
			}
		}
		System.out.println("Traversed in pre-order: "+l);
	}
	
	/**
	 * Traverse the tree in pre-order resulting in  left --> root --> right
	 * 
	 * @param head
	 */
	private static void traverseInOrder(Node head) {
		
		Stack<Node> st = new Stack<>();
		List<Integer> l = new ArrayList<>();
		
		Node current = head;
		
		while(current != null || !st.isEmpty()){
			while(current != null)
			{
				st.push(current);
				current = current.left;
			}
			current = st.pop();
			l.add(current.val);
			current = current.right;
			}
		System.out.println("Travserse In-Order: "+l);
		}
	
	/**
	 * Traverse the tree in pre-order resulting in  left --> right --> root
	 * 
	 * @param head
	 */
	private static void traversePostOrder(Node head) {
		if( head == null ) return;
		 
		Stack<Node> s = new Stack<>( );
		List<Integer> l = new ArrayList<>();
		
		Node current = head;
 
		while( true ) {
 
			if( current != null ) {
				if( current.right != null ) 
					s.push( current.right );
				s.push( current );
				current = current.left;
				continue;
			}
 
			if( s.isEmpty( ) ) 
				return;
			current = s.pop( );
 
			if( current.right != null && ! s.isEmpty( ) && current.right == s.peek( ) ) {
				s.pop( );
				s.push( current );
				current = current.right;
			} else {
				l.add(current.val);
				current = null;
			}
			if( s.isEmpty( ) ) 
			System.out.println("Travserse Post-Order: "+l);
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		Node node = new Node(10);
		node.insert(node, 30);
		node.insert(node, 25);
		node.insert(node, 50);
		
		node.insert(node, 5);
		node.insert(node, 6);
		node.insert(node, 4);
		node.insert(node, 3);
		
		node.find(node, 3);
		
		traversePreOrder(node);
		traverseInOrder(node);
		traversePostOrder(node);
	}

}
}
