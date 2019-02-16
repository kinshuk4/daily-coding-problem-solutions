151

Given a 2-D matrix representing an image, a location of a pixel in the screen and a color `C`, replace the color of the given pixel and all adjacent same colored pixels with `C`.

For example, given the following matrix, and location pixel of (2, 2), and 'G' for green:

```
B B W
W W W
W W W
B B B
```

Becomes

```
B B G
G G G
G G G
B B B
```

152

This problem was asked by Triplebyte.

You are given `n` numbers as well as `n` probabilities that sum up to 1. Write a function to generate one of the numbers with its corresponding probability.

For example, given the numbers `[1, 2, 3, 4]` and probabilities `[0.1, 0.5, 0.2, 0.2]`, your function should return `1` 10% of the time, `2` 50% of the time, and 3 and 4 20% of the time.

You can generate random numbers between 0 and 1 uniformly.

## 174

This problem was asked by Microsoft.
Describe and give an example of each of the following types of polymorphism:

    Ad-hoc polymorphism
    Parametric polymorphism
    Subtype polymorphism

## 175
This problem was asked by Google.

You are given a starting state start, a list of transition probabilities for a Markov chain, and a number of steps num_steps. Run the Markov chain starting from start for num_steps and compute the number of times we visited each state.

For example, given the starting state a, number of steps 5000, and the following transition probabilities:

[
('a', 'a', 0.9),
('a', 'b', 0.075),
('a', 'c', 0.025),
('b', 'a', 0.15),
('b', 'b', 0.8),
('b', 'c', 0.05),
('c', 'a', 0.25),
('c', 'b', 0.25),
('c', 'c', 0.5)
]
One instance of running this Markov chain might produce { 'a': 3012, 'b': 1656, 'c': 332 }.

## 177
This problem was asked by Airbnb.

Given a linked list and a positive integer k, rotate the list to the right by k places.

For example, given the linked list 7 -> 7 -> 3 -> 5 and k = 2, it should become 3 -> 5 -> 7 -> 7.

Given the linked list 1 -> 2 -> 3 -> 4 -> 5 and k = 3, it should become 3 -> 4 -> 5 -> 1 -> 2.


## 179
> This problem was asked by Google.

 Given the sequence of keys visited by a postorder traversal of a binary search tree, reconstruct the tree.

 For example, given the sequence 2, 4, 3, 8, 7, 5, you should construct the following tree:

     5
    / \
   3   7
  / \   \
 2   4   8



## 181
This problem was asked by Google.

Given a string, split it into as few strings as possible such that each string is a palindrome.

For example, given the input string racecarannakayak, return ["racecar", "anna", "kayak"].

Given the input string abc, return ["a", "b", "c"].


## 182
This problem was asked by Facebook.

A graph is minimally-connected if it is connected and there is no edge that can be removed while still leaving the graph connected. For example, any binary tree is minimally-connected.

Given an undirected graph, check if the graph is minimally-connected. You can choose to represent the graph as either an adjacency matrix or adjacency list.