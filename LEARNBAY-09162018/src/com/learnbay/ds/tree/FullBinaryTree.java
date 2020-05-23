package tree;

/**
 * 
 * Check if a binary tree is a full binary tree.
 * 
 * A full binary Tree is a binary tree where every node has 0 or 2 child/
 * children.
 * 
 * @author nihar
 *
 */
public class FullBinaryTree {

	public static void main(String arg[]) {

		Tree root = new Tree(1);
		root.setLeft(new Tree(2));
		root.setRight(new Tree(3));
		root.getLeft().setLeft(new Tree(4));
		root.getLeft().setRight(new Tree(5));

		System.out.println("Tree in hand: " + root);

		FullBinaryTree f = new FullBinaryTree();
		System.out.println("Is this a full binary tree ?  Answer is " + f.isFullBTree(root));
	}

	private boolean isFullBTree(Tree tree) {

		if (tree == null)
			return true;

		if (tree.getLeft() == null && tree.getRight() == null)
			return true;

		if (tree.getLeft() != null && tree.getRight() != null) {
			return isFullBTree(tree.getLeft()) && isFullBTree(tree.getRight());
		}
		return false;
	}
}
