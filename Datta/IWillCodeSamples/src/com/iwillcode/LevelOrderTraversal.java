package com.iwillcode;

/*

Problem:
Given an binary tree, print the nodes in zig-zag manner.
Structure of a node: 

class Node {
    String content;
    Node leftChild;
    Node rightChild;
    Node parent;
}
Expected method to write: public String printZigZagTree(Node root);

               1
             /    \ 
           2        3
          / \     /  \
         4   5   6     7
         |   |  / \    \
         9  10 11 12   13

Expected output: 1, 3, 2, 4, 5, 6, 7, 13, 12, 11, 10, 9

 */

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class LevelOrderTraversal {
	private List<Node> currentLevel;
	private List<Node> nextLevel;

	public LevelOrderTraversal() {
		currentLevel = new LinkedList<Node>();
		nextLevel = new LinkedList<Node>();
	}

	public String zigZagTraversal(Node root) {
		StringJoiner output = new StringJoiner(" ");
		if (root == null || (root.left == null && root.right == null)) {
			return "Root is " + root.content + ". Can't traverse further";
		}

		currentLevel.add(root);
		boolean leftToRight = true;
		while (true) {
			if (currentLevel.isEmpty() && nextLevel.isEmpty()) {
				break;
			}

			if (leftToRight) {
				for (Node node : currentLevel) {
					output.add(node.content);
				}
			} else {
				for (int i = currentLevel.size() - 1; i >= 0; i--) {
					output.add(currentLevel.get(i).content);
				}
			}

			for (Node node : currentLevel) {
				if (node.left != null) {
					nextLevel.add(node.left);
				}

				if (node.right != null) {
					nextLevel.add(node.right);
				}
			}

			currentLevel.clear();
			currentLevel = deepCopy(nextLevel);
			nextLevel.clear();
			leftToRight = !leftToRight;
		}

		return output.toString();
	}
	
	private List<Node> deepCopy(List<Node> level) {
		List<Node> copyLevel = new LinkedList<Node>();
		for (Node node : level) {
			Node copyNode = new Node();
			copyNode.content = node.content;
			copyNode.left = node.left;
			copyNode.right = node.right;
			copyNode.parent = node.parent;
			copyLevel.add(copyNode);
		}
		return copyLevel;
	}

	public static void main(String[] args) {
		LevelOrderTraversal traversal = new LevelOrderTraversal();
		Node root = traversal.new Node();
		
		Node n2 = traversal.new Node();
		Node n3 = traversal.new Node();
		
		Node n4 = traversal.new Node();
		Node n5 = traversal.new Node();
		Node n6 = traversal.new Node();
		Node n7 = traversal.new Node();
		
		Node n9 = traversal.new Node();
		Node n10 = traversal.new Node();
		Node n11 = traversal.new Node();
		Node n12 = traversal.new Node();
		Node n13 = traversal.new Node();
		
		setNode(n13, "13", null, null, n7);
		setNode(n12, "12", null, null, n6);
		setNode(n11, "11", null, null, n6);
		setNode(n10, "10", null, null, n5);
		setNode(n9, "9", null, null, n4);
		
		setNode(n4, "4", n9, null, n2);
		setNode(n5, "5", n10, null, n2);
		setNode(n6, "6", n11, n12, n3);
		setNode(n7, "7", null, n13, n3);
		
		setNode(n2, "2", n4, n5, root);
		setNode(n3, "3", n6, n7, root);
		
		setNode(root, "1", n2, n3, null);

		System.out.println(traversal.zigZagTraversal(root));
	}

	private static void setNode(Node node, String content, Node left, Node right, Node parent) {
		node.content = content;
		node.left = left;
		node.right = right;
		node.parent = parent;
	}
	
	class Node {
		public String content;
		public Node left;
		public Node right;
		public Node parent;
	}
}