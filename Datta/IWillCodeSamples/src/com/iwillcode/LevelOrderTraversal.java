package com.iwillcode;

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
		// Early exit condition
		if (root == null || (root.left == null && root.right == null)) {
			return "Root is " + root.content + ". Can't traverse further";
		}

		StringJoiner output = new StringJoiner(" ");
		currentLevel.add(root);
		boolean leftToRight = true;
		while (true) {
			// Exit condition
			if (currentLevel.isEmpty() && nextLevel.isEmpty()) {
				break;
			}

			// Print
			if (leftToRight) {
				for (Node node : currentLevel) {
					output.add(node.content);
				}
			} else {
				for (int i = currentLevel.size() - 1; i >= 0; i--) {
					output.add(currentLevel.get(i).content);
				}
			}

			// Level order read
			for (Node node : currentLevel) {
				if (node.left != null) {
					nextLevel.add(node.left);
				}

				if (node.right != null) {
					nextLevel.add(node.right);
				}
			}

			// Housekeeping
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
			copyLevel.add(copyNode(node.content, node.left, node.right, node.parent));
		}
		return copyLevel;
	}
	
	private Node copyNode(String content, Node left, Node right, Node parent) {
		Node node = new Node();
		node.content = content;
		node.left = left;
		node.right = right;
		node.parent = parent;
		return node;
	}
	
	private class Node {
		public String content;
		public Node left;
		public Node right;
		public Node parent;
	}
}
