

## Daily Coding Problem: Problem #1051 [Medium]

This problem was asked by Amazon.

An sorted array of integers was rotated an unknown number of times.

Given such an array, find the index of the element in the array in faster than linear time. If the element doesn't exist in the array, return null.

For example, given the array [13, 18, 25, 2, 8, 10] and the element 8, return 4 (the index of 8 in the array).

You can assume all the integers in the array are unique.

## Daily Coding Problem: Problem #1052 [Hard]

This problem was asked by Twitter.

A teacher must divide a class of students into two teams to play dodgeball. Unfortunately, not all the kids get along, and several refuse to be put on the same team as that of their enemies.

Given an adjacency list of students and their enemies, write an algorithm that finds a satisfactory pair of teams, or returns `False` if none exists.

For example, given the following enemy graph you should return the teams `{0, 1, 4, 5}` and `{2, 3}`.

```
students = {
    0: [3],
    1: [2],
    2: [1, 4],
    3: [0, 4, 5],
    4: [2, 3],
    5: [3]
}
```

On the other hand, given the input below, you should return `False`.

```
students = {
    0: [3],
    1: [2],
    2: [1, 3, 4],
    3: [0, 2, 4, 5],
    4: [2, 3],
    5: [3]
}
```

## Daily Coding Problem: Problem #1053 [Hard]

This problem was asked by Uber.

A rule looks like this:

```
A NE B
```

This means this means point `A` is located northeast of point `B`.

```
A SW C
```

means that point `A` is southwest of `C`.

Given a list of rules, check if the sum of the rules validate. For example:

```
A N B
B NE C
C N A
```

does not validate, since `A` cannot be both north and south of `C`.

```
A NW B
A N B
```

is considered valid.

## Daily Coding Problem: Problem #1054 [Medium]

This problem was asked by Microsoft.

Implement the singleton pattern with a twist. First, instead of storing one instance, store two instances. And in every even call of `getInstance()`, return the first instance and in every odd call of `getInstance()`, return the second instance.

## Daily Coding Problem: Problem #1055 [Medium]

This problem was asked by Amazon.

Given a node in a binary search tree, return the next bigger element, also known as the inorder successor.

For example, the inorder successor of 22 is 30.

```
   10
  /  \
 5    30
     /  \
   22    35
```

You can assume each node has a `parent` pointer.

## Daily Coding Problem: Problem #1056 [Medium]

This problem was asked by Epic.

The "look and say" sequence is defined as follows: beginning with the term `1`, each subsequent term visually describes the digits appearing in the previous term. The first few terms are as follows:

```
1
11
21
1211
111221
```

As an example, the fourth term is `1211`, since the third term consists of one `2` and one `1`.

Given an integer `N`, print the `N`th term of this sequence.

## Daily Coding Problem: Problem #1057 [Easy]

This problem was asked by Amazon.

Given an integer `N`, construct all possible binary search trees with `N` nodes.

## Daily Coding Problem: Problem #1058 [Medium]

This problem was asked by Dropbox.

Given an undirected graph G, check whether it is bipartite. Recall that a graph is bipartite if its vertices can be divided into two independent sets, U and V, such that no edge connects vertices of the same set.

## Daily Coding Problem: Problem #1059 [Hard]

This problem was asked by Quora.

Word sense disambiguation is the problem of determining which sense a word takes on in a particular setting, if that word has multiple meanings. For example, in the sentence "I went to get money from the *bank*", bank probably means the place where people deposit money, not the land beside a river or lake.

Suppose you are given a list of meanings for several words, formatted like so:

```
{
    "word_1": ["meaning one", "meaning two", ...],
    ...
    "word_n": ["meaning one", "meaning two", ...]
}
```

Given a sentence, most of whose words are contained in the meaning list above, create an algorithm that determines the likely sense of each possibly ambiguous word.

## Daily Coding Problem: Problem #1060 [Easy]

This problem was asked by Facebook.

Given a function `f`, and `N` return a debounced `f` of `N` milliseconds.

That is, as long as the debounced `f` continues to be invoked, `f` itself will not be called for `N` milliseconds.

## Daily Coding Problem: Problem #1061 [Easy]

This problem was asked by Google.

You are given an M by N matrix consisting of booleans that represents a board. Each True boolean represents a wall. Each False boolean represents a tile you can walk on.

Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps required to reach the end coordinate from the start. If there is no possible path, then return null. You can move up, left, down, and right. You cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:

```
[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]
```

and start = `(3, 0)` (bottom left) and end = `(0, 0)` (top left), the minimum number of steps required to reach the end is 7, since we would need to go through `(1, 2)` because there is a wall everywhere else on the second row.

## Daily Coding Problem: Problem #1062 [Easy]

This problem was asked by Google.

Given the head of a singly linked list, swap every two nodes and return its head.

For example, given `1 -> 2 -> 3 -> 4`, return `2 -> 1 -> 4 -> 3`.

## Daily Coding Problem: Problem #1063 [Easy]

This problem was asked by Sumo Logic.

Given a array that's sorted but rotated at some unknown pivot, in which all elements are distinct, find a "peak" element in `O(log N)` time.

An element is considered a peak if it is greater than both its left and right neighbors. It is guaranteed that the first and last elements are lower than all others.

## Daily Coding Problem: Problem #1064 [Easy]

This problem was asked by Two Sigma.

Using a function `rand5()` that returns an integer from 1 to 5 (inclusive) with uniform probability, implement a function `rand7()` that returns an integer from 1 to 7 (inclusive).

## Daily Coding Problem: Problem #1065 [Medium]

This problem was asked by Yahoo.

Write an algorithm that computes the reversal of a directed graph. For example, if a graph consists of `A` -> `B` -> `C`, it should become `A <- B <- C`.

## Daily Coding Problem: Problem #1066 [Hard]

This problem was asked by Amazon.

The [stable marriage problem](https://en.wikipedia.org/wiki/Stable_marriage_problem) is defined as follows:

Suppose you have `N` men and `N` women, and each person has ranked their prospective opposite-sex partners in order of preference.

For example, if `N = 3`, the input could be something like this:

```
guy_preferences = {
    'andrew': ['caroline', 'abigail', 'betty'],
    'bill': ['caroline', 'betty', 'abigail'],
    'chester': ['betty', 'caroline', 'abigail'],
}

gal_preferences = {
    'abigail': ['andrew', 'bill', 'chester'],
    'betty': ['bill', 'andrew', 'chester'],
    'caroline': ['bill', 'chester', 'andrew']
}
```

Write an algorithm that pairs the men and women together in such a way that no two people of opposite sex would both rather be with each other than with their current partners.

## Daily Coding Problem: Problem #1067 [Medium]

This question was asked by BufferBox.

Given a binary tree where all nodes are either `0` or `1`, prune the tree so that subtrees containing all `0`s are removed.

For example, given the following tree:

```
   0
  / \
 1   0
    / \
   1   0
  / \
 0   0
```

should be pruned to:

```
   0
  / \
 1   0
    /
   1
```

We do not remove the tree at the root or its left child because it still has a `1` as a descendant.

## Daily Coding Problem: Problem #1068 [Easy]

This problem was asked by Microsoft.

You are given an string representing the initial conditions of some dominoes. Each element can take one of three values:

- `L`, meaning the domino has just been pushed to the left,
- `R`, meaning the domino has just been pushed to the right, or
- `.`, meaning the domino is standing still.

Determine the orientation of each tile when the dominoes stop falling. Note that if a domino receives a force from the left and right side simultaneously, it will remain upright.

For example, given the string `.L.R....L`, you should return `LL.RRRLLL`.

Given the string `..R...L.L`, you should return `..RR.LLLL`.

## Daily Coding Problem: Problem #1069 [Medium]

This problem was asked by Square.

In front of you is a row of `N` coins, with values `v``1`, `v``1`, ..., `v``n`.

You are asked to play the following game. You and an opponent take turns choosing either the first or last coin from the row, removing it from the row, and receiving the value of the coin.

Write a program that returns the maximum amount of money you can win with certainty, if you move first, assuming your opponent plays optimally.

## Daily Coding Problem: Problem #1070 [Easy]

This problem was asked by Google.

A girl is walking along an apple orchard with a bag in each hand. She likes to pick apples from each tree as she goes along, but is meticulous about not putting different kinds of apples in the same bag.

Given an input describing the types of apples she will pass on her path, in order, determine the length of the longest portion of her path that consists of just two types of apple trees.

For example, given the input `[2, 1, 2, 3, 3, 1, 3, 5]`, the longest portion will involve types `1` and `3`, with a length of four.

## Daily Coding Problem: Problem #1071 [Hard]

This problem was asked by Google.

Given a list of integers S and a target number k, write a function that returns a subset of S that adds up to k. If such a subset cannot be made, then return null.

Integers can appear more than once in the list. You may assume all numbers in the list are positive.

For example, given S = [12, 1, 61, 5, 9, 2] and k = 24, return [12, 9, 2, 1] since it sums up to 24.

## Daily Coding Problem: Problem #1072 [Easy]

This problem was asked by Facebook.

Given a binary tree, return the level of the tree with minimum sum.

## Daily Coding Problem: Problem #1073 [Medium]

This problem was asked by Apple.

Implement a job scheduler which takes in a function `f` and an integer `n`, and calls `f` after `n` milliseconds.

## Daily Coding Problem: Problem #1074 [Hard]

This problem was asked by Twitter.

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree. Assume that each node in the tree also has a pointer to its parent.

According to the definition of [LCA on Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor): “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

## Daily Coding Problem: Problem #1075 [Easy]

This problem was asked by Apple.

Implement the function `fib(n)`, which returns the `n``th` number in the Fibonacci sequence, using only `O(1)` space.

## Daily Coding Problem: Problem #1076 [Medium]

This problem was asked by Squarespace.

Write a function, `add_subtract`, which alternately adds and subtracts curried arguments. Here are some sample operations:

```
add_subtract(7) -> 7

add_subtract(1)(2)(3) -> 1 + 2 - 3 -> 0

add_subtract(-5)(10)(3)(9) -> -5 + 10 - 3 + 9 -> 11
```

## Daily Coding Problem: Problem #1077 [Easy]

This problem was asked by Amazon.

A tree is symmetric if its data and shape remain unchanged when it is reflected about the root node. The following tree is an example:

```
        4
      / | \
    3   5   3
  /           \
9              9
```

Given a `k`-ary tree, determine whether it is symmetric.

## Daily Coding Problem: Problem #1078 [Easy]

This problem was asked by Google.

Given a binary tree of integers, find the maximum path sum between two nodes. The path must go through at least one node, and does not need to go through the root.
