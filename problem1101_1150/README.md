## Daily Coding Problem: Problem #1101 [Easy]

This problem was asked by Amazon.

Consider the following scenario: there are `N` mice and `N` holes placed at integer points along a line. Given this, find a method that maps mice to holes such that the largest number of steps any mouse takes is minimized.

Each move consists of moving one mouse one unit to the left or right, and only one mouse can fit inside each hole.

For example, suppose the mice are positioned at `[1, 4, 9, 15]`, and the holes are located at `[10, -5, 0, 16]`. In this case, the best pairing would require us to send the mouse at `1` to the hole at `-5`, so our function should return `6`.

## Daily Coding Problem: Problem #1102 [Medium]

This problem was asked by Walmart Labs.

There are `M` people sitting in a row of `N` seats, where `M < N`. Your task is to redistribute people such that there are no gaps between any of them, while keeping overall movement to a minimum.

For example, suppose you are faced with an input of `[0, 1, 1, 0, 1, 0, 0, 0, 1]`, where `0` represents an empty seat and `1` represents a person. In this case, one solution would be to place the person on the right in the fourth seat. We can consider the cost of a solution to be the sum of the absolute distance each person must move, so that the cost here would be five.

Given an input such as the one above, return the lowest possible cost of moving people to remove all gaps.

## Daily Coding Problem: Problem #1103 [Medium]

This problem was asked by Slack.

You are given an N by M matrix of `0`s and `1`s. Starting from the top left corner, how many ways are there to reach the bottom right corner?

You can only move right and down. `0` represents an empty space while `1` represents a wall you cannot walk through.

For example, given the following matrix:

```
[[0, 0, 1],
 [0, 0, 1],
 [1, 0, 0]]
```

Return two, as there are only two ways to get to the bottom right:

- Right, down, down, right
- Down, right, down, right

The top left corner and bottom right corner will always be `0`.

## Daily Coding Problem: Problem #1104 [Easy]

This problem was asked by Yelp.

Given a mapping of digits to letters (as in a phone number), and a digit string, return all possible letters the number could represent. You can assume each valid number in the mapping is a single digit.

For example if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …} then “23” should return [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"].

## Daily Coding Problem: Problem #1105 [Medium]

This problem was asked by Facebook.

Given a multiset of integers, return whether it can be partitioned into two subsets whose sums are the same.

For example, given the multiset `{15, 5, 20, 10, 35, 15, 10}`, it would return true, since we can split it up into `{15, 5, 10, 15, 10}` and `{20, 35},` which both add up to `55`.

Given the multiset `{15, 5, 20, 10, 35}`, it would return false, since we can't split it up into two subsets that add up to the same sum.

## Daily Coding Problem: Problem #1106 [Medium]

This problem was asked by Mailchimp.

You are given an array representing the heights of neighboring buildings on a city street, from east to west. The city assessor would like you to write an algorithm that returns how many of these buildings have a view of the setting sun, in order to properly value the street.

For example, given the array `[3, 7, 8, 3, 6, 1]`, you should return `3`, since the top floors of the buildings with heights `8`, `6`, and `1` all have an unobstructed view to the west.

Can you do this using just one forward pass through the array?

## Daily Coding Problem: Problem #1107 [Hard]

This problem was asked by Adobe.

You are given a tree with an even number of nodes. Consider each connection between a parent and child node to be an "edge". You would like to remove some of these edges, such that the disconnected subtrees that remain each have an even number of nodes.

For example, suppose your input was the following tree:

```
   1
  / \ 
 2   3
    / \ 
   4   5
 / | \
6  7  8
```

In this case, removing the edge (3, 4) satisfies our requirement.

Write a function that returns the *maximum* number of edges you can remove while still satisfying this requirement.

## Daily Coding Problem: Problem #1108 [Easy]

This problem was asked by Pandora.

Given an undirected graph, determine if it contains a cycle.

## Daily Coding Problem: Problem #1109 [Medium]

This problem was asked by Amazon.

Given a pivot `x`, and a list `lst`, partition the list into three parts.

- The first part contains all elements in `lst` that are less than `x`
- The second part contains all elements in `lst` that are equal to `x`
- The third part contains all elements in `lst` that are larger than `x`

Ordering within a part can be arbitrary.

For example, given `x = 10` and `lst = [9, 12, 3, 5, 14, 10, 10]`, one partition may be `[9, 3, 5, 10, 10, 12, 14]`.

## Daily Coding Problem: Problem #1110 [Easy]

This problem was asked by Netflix.

Given an array of integers, determine whether it contains a Pythagorean triplet. Recall that a Pythogorean triplet `(a, b, c)` is defined by the equation `a^2 + b^2 = c^2`.

## Daily Coding Problem: Problem #1111 [Medium]

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

## Daily Coding Problem: Problem #1112 [Easy]

This question was asked by Apple.

Given a binary tree, find a minimum path sum from root to a leaf.

For example, the minimum path in this tree is [10, 5, 1, -1], which has sum 15.

```
  10
 /  \
5    5
 \     \
   2    1
       /
     -1
```

## Daily Coding Problem: Problem #1113 [Easy]

This problem was asked by Palantir.

A typical American-style crossword puzzle grid is an `N x N` matrix with black and white squares, which obeys the following rules:

- Every white square must be part of an "across" word and a "down" word.
- No word can be fewer than three letters long.
- Every white square must be reachable from every other white square.
- The grid is rotationally symmetric (for example, the colors of the top left and bottom right squares must match).

Write a program to determine whether a given matrix qualifies as a crossword grid.

## Daily Coding Problem: Problem #1114 [Easy]

This problem was asked by Uber.

On election day, a voting machine writes data in the form `(voter_id, candidate_id)` to a text file. Write a program that reads this file as a stream and returns the top `3` candidates at any given time. If you find a voter voting more than once, report this as fraud.

## Daily Coding Problem: Problem #1115 [Medium]

This question was asked by Google.

Given an integer `n` and a list of integers `l`, write a function that randomly generates a number from `0` to `n-1` that isn't in `l` (uniform).

## Daily Coding Problem: Problem #1116 [Hard]

This problem was asked by Google.

A quack is a data structure combining properties of both stacks and queues. It can be viewed as a list of elements written left to right such that three operations are possible:

- `push(x)`: add a new item `x` to the left end of the list
- `pop()`: remove and return the item on the left end of the list
- `pull()`: remove the item on the right end of the list.

Implement a quack using three stacks and `O(1)` additional memory, so that the amortized time for any push, pop, or pull operation is `O(1)`.

## Daily Coding Problem: Problem #1117 [Hard]

This problem was asked by Microsoft.

Implement 3 stacks using a single list:

```
class Stack:
    def __init__(self):
        self.list = []

    def pop(self, stack_number):
        pass

    def push(self, item, stack_number):
        pass
```

## Daily Coding Problem: Problem #1118 [Easy]

This problem was asked by Dropbox.

What does the below code snippet print out? How can we fix the anonymous functions to behave as we'd expect?

```python
functions = []
for i in range(10):
    functions.append(lambda : i)

for f in functions:
    print(f())
```

## Daily Coding Problem: Problem #1119 [Medium]

This problem was asked by Etsy.

Given an array of numbers `N` and an integer `k`, your task is to split `N` into `k` partitions such that the maximum sum of any partition is minimized. Return this sum.

For example, given `N = [5, 1, 2, 7, 3, 4]` and `k = 3`, you should return `8`, since the optimal partition is `[5, 1, 2], [7], [3, 4]`.

## Daily Coding Problem: Problem #1120 [Easy]

This problem was asked by Google.

You are in an infinite 2D grid where you can move in any of the 8 directions:

```
 (x,y) to
    (x+1, y),
    (x - 1, y),
    (x, y+1),
    (x, y-1),
    (x-1, y-1),
    (x+1,y+1),
    (x-1,y+1),
    (x+1,y-1)
```

You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

Example:

```
Input: [(0, 0), (1, 1), (1, 2)]
Output: 2
```

It takes 1 step to move from `(0, 0)` to `(1, 1)`. It takes one more step to move from `(1, 1)` to `(1, 2)`.
