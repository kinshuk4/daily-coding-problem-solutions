package com.vaani.dcp.apple._093;

import org.apache.commons.lang3.NotImplementedException;

/**
 *
 * */
public class Solution {

    public static void main(String... args) {
        Node root = generate();
    }

    public static int getLargestBstSize(Node node) {
        throw new NotImplementedException("Yet not implemented");
    }

    private static boolean isBst(Node node) {
        if(node == null)
            return true;

        boolean bst = true;

        if(node.left != null) {
            bst &= isBst(node.left);
        }
        throw new NotImplementedException("Yet not implemented");

    }

    private static Node generate() {
        return null;
    }

    public static final class Node {
        private final int val;
        private Node left;
        private Node right;
        private int size = -1;

        public Node(int val) {
            this.val = val;
        }
    }

}
