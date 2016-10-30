package hackerrank;

public class isBST {
	/*
	 * Time complexity : O(n)
	 * Space complexity: unless the function call stack takes a constant time, this code will take O(n)
	 */
	static BST root;
	
	public static void main(String[] args){
		BST root = new BST(10);
		BST bst1 = new BST(7);
		BST bst2 = new BST(14);
		BST bst3 = new BST(5);
		BST bst4 = new BST(9);
		root.left = bst1;
		root.right = bst2;
		bst1.left = bst3;
		bst1.right = bst4;
		
		boolean checkingBST = checkBST(root);
		System.out.println(checkingBST);
	}
	
	private static boolean checkBST(BST root) {
		return checkBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
	}

	static boolean checkBSTUtil(BST node, int min, int max)
    {
        // empty tree is a binary tree
        if (node == null)
            return true;

        if (node.value < min || node.value > max)
            return false;
 
        // if duplicates were allowed, max for first recursion can be node.value
        // and min for second recursion can be node.value
        return (checkBSTUtil(node.left, min, node.value-1) &&
        		checkBSTUtil(node.right, node.value-1, max));
    }
}

class BST{
	BST left;
	BST right;
	int value;
	
	BST(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
}
