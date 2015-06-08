package com.problems.geeksforgeeks.trees;


public class DiameterOfTree {

	public static void main(String[] args) {
		//    		  50
		// 		 7   	    	2
		//	  3     2		10		30
		//		1					40
		
		TreeNode tree1 = new TreeNode(50);
		tree1.left = new TreeNode(7);
		tree1.right = new TreeNode(2);
		
		tree1.right.left = new TreeNode(10);
		tree1.right.right = new TreeNode(30);
		tree1.right.right.right = new TreeNode(40);
		
		tree1.left.left = new TreeNode(3);
		tree1.left.left.right = new TreeNode(1);
		tree1.left.right = new TreeNode(2);

		System.out.println(diameter(tree1));
	}

	public static int diameter(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int diameterOfCurrentNode = HeightOfTree.heightOfTree(root.left) + HeightOfTree.heightOfTree(root.right) + 1;
		return Math.max(diameterOfCurrentNode, Math.max(diameter(root.left), diameter(root.right)));

	}

}