## Daily Coding Problem: Problem #1508 [Hard]

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index `i` of the new array is the product of all the numbers in the original array except the one at `i`.

For example, if our input was `[1, 2, 3, 4, 5]`, the expected output would be `[120, 60, 40, 30, 24]`. If our input was `[3, 2, 1]`, the expected output would be `[2, 3, 6]`.

Follow-up: what if you can't use division?

## Daily Coding Problem: Problem #1507 [Medium]

This problem was asked by Google.

Given the sequence of keys visited by a postorder traversal of a binary search tree, reconstruct the tree.

For example, given the sequence `2, 4, 3, 8, 7, 5`, you should construct the following tree:

```
    5
   / \
  3   7
 / \   \
2   4   8
```

## Daily Coding Problem: Problem #1506 [Hard]

This problem was asked by Salesforce.

Given an array of integers, find the maximum XOR of any two elements.

## Daily Coding Problem: Problem #1505 [Medium]

This problem was asked by Pinterest.

Given an integer list where each number represents the number of hops you can make, determine whether you can reach to the last index starting at index 0.

For example, `[2, 0, 1, 0]` returns `True` while `[1, 1, 0, 1]` returns `False`.

## Daily Coding Problem: Problem #1504 [Hard]

This problem was asked by Dropbox.

Implement an efficient string matching algorithm.

That is, given a string of length `N` and a pattern of length `k`, write a program that searches for the pattern in the string with less than `O(N * k)` worst-case time complexity.

If the pattern is found, return the start index of its location. If not, return `False`.

## Daily Coding Problem: Problem #1503 [Easy]

This problem was asked by Google.

The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.

For example, given the set `{1, 2, 3}`, it should return `{{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}`.

You may also use a list or array to represent a set.

## Daily Coding Problem: Problem #1502 [Hard]

This problem was asked by Palantir.

Given a number represented by a list of digits, find the next greater permutation of a number, in terms of lexicographic ordering. If there is not greater permutation possible, return the permutation with the lowest value/ordering.

For example, the list `[1,2,3]` should return `[1,3,2]`. The list `[1,3,2]` should return `[2,1,3]`. The list `[3,2,1]` should return `[1,2,3]`.

Can you perform the operation without allocating extra memory (disregarding the input memory)?

## Daily Coding Problem: Problem #1501 [Easy]

This problem was asked by Apple.

Given the root of a binary tree, find the most frequent subtree sum. The subtree sum of a node is the sum of all values under a node, including the node itself.

For example, given the following tree:

```
  5
 / \
2  -5
```

Return `2` as it occurs twice: once as the left leaf, and once as the sum of `2 + 5 - 5`.
