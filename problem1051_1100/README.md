

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