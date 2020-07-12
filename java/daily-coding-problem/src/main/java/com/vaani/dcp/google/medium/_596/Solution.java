package com.vaani.dcp.google.medium._596;

import com.vaani.dsa.ds.algos.tree.binary.InvertBinaryTree;
import com.vaani.dsa.ds.core.tree.binarytree.simple.BinaryTreeNode;

/*
Invert a binary tree.

For example, given the following tree:

```
    a
   / \
  b   c
 / \  /
d   e f
```

should become:

```
  a
 / \
 c  b
 \  / \
  f e  d
```

 */
public class Solution {

    public static void main(String[] args) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        BinaryTreeNode tree = new BinaryTreeNode(1);
        invertBinaryTree.invertTreeIterative(tree);
    }
}
