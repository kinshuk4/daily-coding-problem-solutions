## Daily Coding Problem: Problem #1706 [Medium]

This problem was asked by Microsoft.

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example, given `[100, 4, 200, 1, 3, 2]`, the longest consecutive element sequence is `[1, 2, 3, 4]`. Return its length: `4`.

Your algorithm should run in `O(n)` complexity.

## Daily Coding Problem: Problem #1705 [Medium]

This problem was asked by Yext.

Two nodes in a binary tree can be called cousins if they are on the same level of the tree but have different parents. For example, in the following diagram `4` and `6` are cousins.

```
    1
   / \
  2   3
 / \   \
4   5   6
```

Given a binary tree and a particular node, find all cousins of that node.

## Daily Coding Problem: Problem #1704 [Medium]

This problem was asked by Amazon.

At a popular bar, each customer has a set of favorite drinks, and will happily accept any drink among this set. For example, in the following situation, customer `0` will be satisfied with drinks `0`, `1`, `3`, or `6`.

```
preferences = {
    0: [0, 1, 3, 6],
    1: [1, 4, 7],
    2: [2, 4, 7, 5],
    3: [3, 2, 5],
    4: [5, 8]
}
```

A lazy bartender working at this bar is trying to reduce his effort by limiting the drink recipes he must memorize. Given a dictionary input such as the one above, return the fewest number of drinks he must learn in order to satisfy all customers.

For the input above, the answer would be `2`, as drinks `1` and `5` will satisfy everyone.

## Daily Coding Problem: Problem #1703 [Hard]

This problem was asked by Goldman Sachs.

Given a list of numbers `L`, implement a method `sum(i, j)` which returns the sum from the sublist `L[i:j]` (including `i`, excluding `j`).

For example, given `L = [1, 2, 3, 4, 5]`, `sum(1, 3)` should return `sum([2, 3])`, which is `5`.

You can assume that you can do some pre-processing. `sum()` should be optimized over the pre-processing step.

## Daily Coding Problem: Problem #1702 [Medium]

This question was asked by Google.

Given an N by M matrix consisting only of 1's and 0's, find the largest rectangle containing only 1's and return its area.

For example, given the following matrix:

```
[[1, 0, 0, 0],
 [1, 0, 1, 1],
 [1, 0, 1, 1],
 [0, 1, 0, 0]]
```

Return 4.

## Daily Coding Problem: Problem #1701 [Easy]

This problem was asked by Uber.

On election day, a voting machine writes data in the form `(voter_id, candidate_id)` to a text file. Write a program that reads this file as a stream and returns the top `3` candidates at any given time. If you find a voter voting more than once, report this as fraud.