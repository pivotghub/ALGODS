package tree;

/**
 * 
 * Pre-Order, In-Order, Post-Order Tree Traversal
 * 
 * @author nihar
 *
 */
public class TreeTraversalPreorder {

	Tree root = null;
	
	public static void main(String[] args) {
		
		TreeTraversalPreorder t = new TreeTraversalPreorder();	
		t.root= new Tree(1);
		t.root.setLeft(new Tree(12));
		t.root.setRight(new Tree(9));
		
		t.root.getLeft().setLeft(new Tree(5));
		t.root.getLeft().setRight(new Tree(6));
		
		System.out.println(t.root);
		
		t.traversePreOrder(t.root);
		System.out.println("\n\n");
		t.traverseInOrder(t.root);
		System.out.println("\n\n");
		t.traversePostOrder(t.root);
		
	}

	private void traversePostOrder(Tree root) {
		if(root == null) {
			return;
		}
		traversePostOrder(root.getLeft());
		traversePostOrder(root.getRight());
		System.out.println(root.getData());
	}

	
	
	private void traverseInOrder(Tree root) {
		if(root == null) {
			return;
		}
		traverseInOrder(root.getLeft());
		System.out.println(root.getData());
		traverseInOrder(root.getRight());
	}

	private void traversePreOrder(Tree root) {
		if(root == null) {
			return;
		}
		System.out.println(root.getData());
		traversePreOrder(root.getLeft());
		traversePreOrder(root.getRight());
	}
	
}
