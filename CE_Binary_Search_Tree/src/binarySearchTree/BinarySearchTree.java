// Assignement CE_Binary_Search_Tree
// Program BinarySearchTree
// Author Christian Makoma
// Created Mar 5, 2020


package binarySearchTree;

//Java program to demonstrate Insert, print traversal - inorder, preorder and postorder and delete operation in binary search tree 

class BinarySearchTree 
{ 
	/* Class containing left and right child of current node and key value*/
	class Node 
	{ 
		int key; 
		Node left, right; 

		public Node(int item) 
		{ 
			key = item; 
			left = right = null; 
		} 
	} 

	// Root of BST 
	Node root; 

	// Constructor 
	BinarySearchTree() 
	{ 
		root = null; 
	} 

	// This method mainly calls deleteRec() 
	void deleteKey(int key) 
	{ 
		root = deleteRec(root, key); 
	} 

	/* A recursive function to insert a new key in BST */
	Node deleteRec(Node root, int key) 
	{ 
		/* Base Case: If the tree is empty */
		if (root == null) return root; 

		/* Otherwise, recur down the tree */
		if (key < root.key) 
			root.left = deleteRec(root.left, key); 
		else if (key > root.key) 
			root.right = deleteRec(root.right, key); 

		// if key is same as root's key, then This is the node 
		// to be deleted 
		else
		{ 
			// node with only one child or no child 
			if (root.left == null) 
				return root.right; 
			else if (root.right == null) 
				return root.left; 

			// node with two children: Get the inorder successor (smallest 
			// in the right subtree) 
			root.key = minValue(root.right); 

			// Delete the inorder successor 
			root.right = deleteRec(root.right, root.key); 
		} 

		return root; 
	} 

	int minValue(Node root) 
	{ 
		int minv = root.key; 
		while (root.left != null) 
		{ 
			minv = root.left.key; 
			root = root.left; 
		} 
		return minv; 
	} 

	// This method mainly calls insertRec() 
	void insert(int key) 
	{ 
		root = insertRec(root, key); 
	} 

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) 
	{ 

		/* If the tree is empty, return a new node */
		if (root == null) 
		{ 
			root = new Node(key); 
			return root; 
		} 

		/* Otherwise, recur down the tree */
		if (key < root.key) 
			root.left = insertRec(root.left, key); 
		else if (key > root.key) 
			root.right = insertRec(root.right, key); 

		/* return the (unchanged) node pointer */
		return root; 
	} 

	// Create method mainly calls printInOrder() 
	/*Complete this code*/
	public void printInOrder(Node node) {
		if(node.left != null) {
			printInOrder(node.left);
		}
		
		System.out.print(node.key + " ");
		
		if(node.right != null) {
			printInOrder(node.right);
		}
	}
	
	// Create method mainly calls printPreOrder() 
	/*Complete this code*/
	
	public void printPreOrder(Node node) {
		System.out.print(node.key + " ");
		
		if(node.left != null) {
			printPreOrder(node.left);
		}
	
		if(node.right != null) {
			printPreOrder(node.right);
		}
	}

    // Create method mainly calls printPosOrder() 
	/*Complete this code*/
	
	public void printPosOrder(Node node) {
		
		if(node.left != null) {
			printPosOrder(node.left);
		}
	
		if(node.right != null) {
			printPosOrder(node.right);
		}
		
		System.out.print(node.key + " ");
	}

	

	// Driver Program to test above functions 
	public static void main(String[] args) 

	{ 
		BinarySearchTree tree = new BinarySearchTree(); 

		/*Create following BST 
		   50 
		  /  \ 
		30    70 
		/ \   / \ 
	   20 40 60 80 
		 Insert this element in the tree and print the original tree*/
	
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		
		
		
		print(tree);
		
		
		System.out.println("Delete 20");
		tree.deleteKey(20);
		printModified(tree);
		
		System.out.println("Delete 70");
		tree.deleteKey(70);
		printModified(tree);

		System.out.println("Delete 60");
		tree.deleteKey(60);
		printModified(tree);
		
		
	}

	private static void print(BinarySearchTree tree) {
		System.out.print("Inorder traversal of the given tree:	");
		tree.printInOrder(tree.root);
		System.out.println();
		System.out.print("PreOrder traversal of the given tree:	");
		tree.printPreOrder(tree.root);
		System.out.println();
		System.out.print("PosOrder traversal of the given tree:	");
		tree.printPosOrder(tree.root);
		System.out.println();
		System.out.println();
	} 
	
	private static void printModified(BinarySearchTree tree) {
		System.out.print("Inorder traversal of the modified tree:		");
		tree.printInOrder(tree.root);
		System.out.println();
		System.out.print("PreOrder traversal of the modified tree:	");
		tree.printPreOrder(tree.root);
		System.out.println();
		System.out.print("PosOrder traversal of the modified tree:	");
		tree.printPosOrder(tree.root);
		System.out.println();
		System.out.println();
	} 
	
	
} 
