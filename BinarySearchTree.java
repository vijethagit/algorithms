package google;

public class BinarySearchTree {
	class Node {
		Integer key;
		String value;
		Node left, right;
		
		public Node(Integer key) {
			this.key = key;
			this.value = key.toString();
			this.left = this.right = null;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Integer getKey() {
			return key;
		}

	
	}

	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinarySearchTree() {
		root = null;
	}

	public Node insertion(Node root, Node newNode) {
		if (root == null) {
			root = new Node(newNode.getKey());
			return root;
		}
		if (newNode.getKey() <= root.getKey()) {
			root.left = insertion (root.getLeft(), newNode);
		} else {
			root.right = insertion (root.getRight(), newNode);
		}
		return root;
	}
	
	public void inorderTraversal(Node root) {
		if(root != null) {
			inorderTraversal(root.getLeft());
			System.out.println(root.getKey());
			inorderTraversal(root.getRight());
		}
	}
	
	
	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		Integer[] input = new Integer[] {8, 3, 10, 1, 6, 14, 4, 7, 13};
		for (int i = 0; i < input.length; i++) {
			Node newNode = bst.new Node(input[i]);
			bst.root =  bst.insertion(bst.getRoot(), newNode);
		}
		bst.inorderTraversal(bst.getRoot());
	}
}
