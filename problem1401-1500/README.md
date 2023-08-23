## Daily Coding Problem: Problem #1493 [Easy]

This problem was asked by Netflix.

Given an array of integers, determine whether it contains a Pythagorean triplet. Recall that a Pythogorean triplet `(a, b, c)` is defined by the equation `a``2``+ b``2``= c``2`.

## Daily Coding Problem: Problem #1492 [Easy]

This problem was asked by Snapchat.

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

## Daily Coding Problem: Problem #1491 [Medium]

This problem was asked by Microsoft.

Describe and give an example of each of the following types of polymorphism:

- Ad-hoc polymorphism
- Parametric polymorphism
- Subtype polymorphism

## Daily Coding Problem: Problem #1490 [Medium]

This problem was asked by Google.

You are given an array of length `n + 1` whose elements belong to the set `{1, 2, ..., n}`. By the pigeonhole principle, there must be a duplicate. Find it in linear time and space.

## Daily Coding Problem: Problem #1489 [Medium]

This problem was asked by Stripe.

Write a map implementation with a get function that lets you retrieve the value of a key at a particular time.

It should contain the following methods:

- `set(key, value, time)`: sets key to value for t = time.
- `get(key, time)`: gets the key at t = time.

The map should work like this. If we set a key at a particular time, it will maintain that value forever or until it gets set at a later time. In other words, when we get a key at a time, it should return the value that was set for that key set at the most recent time.

Consider the following examples:

```
d.set(1, 1, 0) # set key 1 to value 1 at time 0
d.set(1, 2, 2) # set key 1 to value 2 at time 2
d.get(1, 1) # get key 1 at time 1 should be 1
d.get(1, 3) # get key 1 at time 3 should be 2
d.set(1, 1, 5) # set key 1 to value 1 at time 5
d.get(1, 0) # get key 1 at time 0 should be null
d.get(1, 10) # get key 1 at time 10 should be 1
d.set(1, 1, 0) # set key 1 to value 1 at time 0
d.set(1, 2, 0) # set key 1 to value 2 at time 0
d.get(1, 0) # get key 1 at time 0 should be 2
```

## Daily Coding Problem: Problem #1488 [Hard]

This problem was asked by Airbnb.

We're given a hashmap associating each `courseId` key with a list of `courseIds` values, which represents that the prerequisites of `courseId` are `courseIds`. Return a sorted ordering of courses such that we can finish all courses.

Return null if there is no such ordering.

For example, given {'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []}, should return ['CSC100', 'CSC200', 'CSCS300'].

## Daily Coding Problem: Problem #1487 [Hard]

This problem was asked by Palantir.

Typically, an implementation of in-order traversal of a binary tree has `O(h)` space complexity, where `h` is the height of the tree. Write a program to compute the in-order traversal of a binary tree using `O(1)` space.

## Daily Coding Problem: Problem #1486 [Medium]

This problem was asked by LinkedIn.

Given a linked list of numbers and a pivot `k`, partition the linked list so that all nodes less than `k` come before nodes greater than or equal to `k`.

For example, given the linked list `5 -> 1 -> 8 -> 0 -> 3` and `k = 3`, the solution could be `1 -> 0 -> 5 -> 8 -> 3`.

## Daily Coding Problem: Problem #1485 [Easy]

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

## Daily Coding Problem: Problem #1484 [Easy]

This problem was asked by Amazon.

Given an integer `N`, construct all possible binary search trees with `N` nodes.

## Daily Coding Problem: Problem #1483 [Medium]

This problem was asked by Square.

A competitive runner would like to create a route that starts and ends at his house, with the condition that the route goes entirely uphill at first, and then entirely downhill.

Given a dictionary of places of the form `{location: elevation}`, and a dictionary mapping paths between some of these locations to their corresponding distances, find the length of the shortest route satisfying the condition above. Assume the runner's home is location `0`.

For example, suppose you are given the following input:

```
elevations = {0: 5, 1: 25, 2: 15, 3: 20, 4: 10}
paths = {
    (0, 1): 10,
    (0, 2): 8,
    (0, 3): 15,
    (1, 3): 12,
    (2, 4): 10,
    (3, 4): 5,
    (3, 0): 17,
    (4, 0): 10
}
```

In this case, the shortest valid path would be `0 -> 2 -> 4 -> 0`, with a distance of `28`.

## Daily Coding Problem: Problem #1482 [Easy]

This problem was asked by Palantir.

Write a program that checks whether an integer is a palindrome. For example, `121` is a palindrome, as well as `888`. `678` is not a palindrome. Do not convert the integer into a string.

## Daily Coding Problem: Problem #1481 [Hard]

This problem was asked by Facebook.

Given a string and a set of delimiters, reverse the words in the string while maintaining the relative order of the delimiters. For example, given "hello/world:here", return "here/world:hello"

Follow-up: Does your solution work for the following cases: "hello/world:here/", "hello//world:here"

## Daily Coding Problem: Problem #1480 [Medium]

This problem was asked by Amazon.

Given an array of a million integers between zero and a billion, out of order, how can you efficiently sort it? Assume that you cannot store an array of a billion elements in memory.

## Daily Coding Problem: Problem #1479 [Medium]

This problem was asked by Amazon.

Given a pivot `x`, and a list `lst`, partition the list into three parts.

- The first part contains all elements in `lst` that are less than `x`
- The second part contains all elements in `lst` that are equal to `x`
- The third part contains all elements in `lst` that are larger than `x`

Ordering within a part can be arbitrary.

For example, given `x = 10` and `lst = [9, 12, 3, 5, 14, 10, 10]`, one partition may be `[9, 3, 5, 10, 10, 12, 14]`.

## Daily Coding Problem: Problem #1478 [Easy]

This problem was asked by Google.

Given the root of a binary tree, return a deepest node. For example, in the following tree, return d.

```
    a
   / \
  b   c
 /
d
```

## Daily Coding Problem: Problem #1477 [Easy]

This problem was asked by Google.

A regular number in mathematics is defined as one which evenly divides some power of `60`. Equivalently, we can say that a regular number is one whose only prime divisors are `2`, `3`, and `5`.

These numbers have had many applications, from helping ancient Babylonians keep time to tuning instruments according to the diatonic scale.

Given an integer `N`, write a program that returns, in order, the first `N` regular numbers.

## Daily Coding Problem: Problem #1476 [Easy]

This problem was asked by Facebook.

Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.

For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.

## Daily Coding Problem: Problem #1475 [Medium]

This problem was asked by Twitter.

Implement an autocomplete system. That is, given a query string `s` and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string `de` and the set of strings [`dog`, `deer`, `deal`], return [`deer`, `deal`].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

## Daily Coding Problem: Problem #1474 [Easy]

This problem was asked by Facebook.

Boggle is a game played on a `4 x 4` grid of letters. The goal is to find as many words as possible that can be formed by a sequence of adjacent letters in the grid, using each cell at most once. Given a game board and a dictionary of valid words, implement a Boggle solver.

## Daily Coding Problem: Problem #1473 [Medium]

This problem was asked by Apple.

Suppose you have a multiplication table that is N by N. That is, a 2D array where the value at the `i`-th row and `j`-th column is `(i + 1) * (j + 1)` (if 0-indexed) or `i * j` (if 1-indexed).

Given integers N and X, write a function that returns the number of times X appears as a value in an N by N multiplication table.

For example, given N = 6 and X = 12, you should return 4, since the multiplication table looks like this:

| 1 | 2 | 3 | 4 | 5 | 6 |

| 2 | 4 | 6 | 8 | 10 | 12 |

| 3 | 6 | 9 | 12 | 15 | 18 |

| 4 | 8 | 12 | 16 | 20 | 24 |

| 5 | 10 | 15 | 20 | 25 | 30 |

| 6 | 12 | 18 | 24 | 30 | 36 |

And there are 4 12's in the table.

## Daily Coding Problem: Problem #1472 [Easy]

This problem was asked by Facebook.

Given a list of integers, return the largest product that can be made by multiplying any three integers.

For example, if the list is `[-10, -10, 5, 2]`, we should return `500`, since that's `-10 * -10 * 5`.

You can assume the list has at least three integers.

## Daily Coding Problem: Problem #1471 [Hard]

This problem was asked by Netflix.

Given a sorted list of integers of length `N`, determine if an element `x` is in the list without performing any multiplication, division, or bit-shift operations.

Do this in `O(log N)` time.

## Daily Coding Problem: Problem #1470 [Medium]

This problem was asked by Facebook.

Given a positive integer `n`, find the smallest number of squared integers which sum to `n`.

For example, given `n` = 13, return 2 since 13 = 32 + 22 = 9 + 4.

Given `n` = 27, return 3 since 27 = 32 + 32 + 32 = 9 + 9 + 9.

## Daily Coding Problem: Problem #1469 [Hard]

This problem was asked by Oracle.

You are presented with an `8` by `8` matrix representing the positions of pieces on a chess board. The only pieces on the board are the black king and various white pieces. Given this matrix, determine whether the king is in check.

For details on how each piece moves, see [here](https://en.wikipedia.org/wiki/Chess_piece#Moves_of_the_pieces).

For example, given the following matrix:

```
...K....
........
.B......
......P.
.......R
..N.....
........
.....Q..
```

You should return `True`, since the bishop is attacking the king diagonally.

## Daily Coding Problem: Problem #1468 [Hard]

This problem was asked by Google.

A knight's tour is a sequence of moves by a knight on a chessboard such that all squares are visited once.

Given N, write a function to return the number of knight's tours on an N by N chessboard.

## Daily Coding Problem: Problem #1467 [Easy]

This problem was asked by Microsoft.

Given a number in the form of a list of digits, return all possible permutations.

For example, given `[1,2,3]`, return `[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]`.

## Daily Coding Problem: Problem #1466 [Medium]

This problem was asked by Google.

You are given a set of synonyms, such as `(big, large)` and `(eat, consume)`. Using this set, determine if two sentences with the same number of words are equivalent.

For example, the following two sentences are equivalent:

- "He wants to eat food."
- "He wants to consume food."

Note that the synonyms `(a, b)` and `(a, c)` do not necessarily imply `(b, c)`: consider the case of `(coach, bus)` and `(coach, teacher)`.

Follow-up: what if we can assume that `(a, b)` and `(a, c)` do in fact imply `(b, c)`?

## Daily Coding Problem: Problem #1465 [Medium]

This problem was asked by Square.

In front of you is a row of `N` coins, with values `v1`, `v1`, ..., `vn`.

You are asked to play the following game. You and an opponent take turns choosing either the first or last coin from the row, removing it from the row, and receiving the value of the coin.

Write a program that returns the maximum amount of money you can win with certainty, if you move first, assuming your opponent plays optimally.

## Daily Coding Problem: Problem #1464 [Medium]

This problem was asked by Facebook.

Given an array of integers in which two elements appear exactly once and all other elements appear exactly twice, find the two elements that appear only once.

For example, given the array `[2, 4, 6, 8, 10, 2, 6, 10]`, return `4` and `8`. The order does not matter.

Follow-up: Can you do this in linear time and constant space?

## Daily Coding Problem: Problem #1463 [Easy]

This problem was asked by Netflix.

Given an array of integers, determine whether it contains a Pythagorean triplet. Recall that a Pythogorean triplet `(a, b, c)` is defined by the equation `a^2``+ b^2``= c^2`.

## Daily Coding Problem: Problem #1462 [Hard]

This problem was asked by Jane Street.

Given an arithmetic expression in [Reverse Polish Notation](https://en.wikipedia.org/wiki/Reverse_Polish_notation), write a program to evaluate it.

The expression is given as a list of numbers and operands. For example: `[5, 3, '+']` should return `5 + 3 = 8`.

For example, `[15, 7, 1, 1, '+', '-', '/', 3, '*', 2, 1, 1, '+', '+', '-']` should return `5`, since it is equivalent to ((15 / (7 - (1 + 1))) * 3) - (2 + (1 + 1)) = 5.

You can assume the given expression is always valid.

## Daily Coding Problem: Problem #1461 [Medium]

This problem was asked by Goldman Sachs.

You are given `N` identical eggs and access to a building with `k` floors. Your task is to find the lowest floor that will cause an egg to break, if dropped from that floor. Once an egg breaks, it cannot be dropped again. If an egg breaks when dropped from the `x``th` floor, you can assume it will also break when dropped from any floor greater than `x`.

Write an algorithm that finds the minimum number of trial drops it will take, in the worst case, to identify this floor.

For example, if `N = 1` and `k = 5`, we will need to try dropping the egg at every floor, beginning with the first, until we reach the fifth floor, so our solution will be `5`.

## Daily Coding Problem: Problem #1460 [Easy]

This problem was asked by Apple.

A fixed point in an array is an element whose value is equal to its index. Given a sorted array of distinct elements, return a fixed point, if one exists. Otherwise, return `False`.

For example, given `[-6, 0, 2, 40]`, you should return `2`. Given `[1, 5, 7, 8]`, you should return `False`.

## Daily Coding Problem: Problem #1459 [Medium]

This problem was asked by Google.

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

## Daily Coding Problem: Problem #1458 [Medium]

This problem was asked by Flipkart.

[Snakes and Ladders](https://en.wikipedia.org/wiki/Snakes_and_Ladders) is a game played on a `10 x 10` board, the goal of which is get from square `1` to square `100`. On each turn players will roll a six-sided die and move forward a number of spaces equal to the result. If they land on a square that represents a snake or ladder, they will be transported ahead or behind, respectively, to a new square.

Find the smallest number of turns it takes to play snakes and ladders.

For convenience, here are the squares representing snakes and ladders, and their outcomes:

```
snakes = {16: 6, 48: 26, 49: 11, 56: 53, 62: 19, 64: 60, 87: 24, 93: 73, 95: 75, 98: 78}
ladders = {1: 38, 4: 14, 9: 31, 21: 42, 28: 84, 36: 44, 51: 67, 71: 91, 80: 100}
```

## Daily Coding Problem: Problem #1457 [Hard]

This problem was asked by Google.

Implement an LFU (Least Frequently Used) cache. It should be able to be initialized with a cache size `n`, and contain the following methods:

- `set(key, value)`: sets `key` to `value`. If there are already `n` items in the cache and we are adding a new item, then it should also remove the least frequently used item. If there is a tie, then the least recently used key should be removed.
- `get(key)`: gets the value at `key`. If no such key exists, return null.

Each operation should run in O(1) time.

## Daily Coding Problem: Problem #1456 [Easy]

This problem was asked by Google.

Given a string, return the first recurring character in it, or null if there is no recurring character.

For example, given the string "acbbac", return "b". Given the string "abcdef", return null.

## Daily Coding Problem: Problem #1455 [Easy]

This problem was asked by Google.

You are given an array of arrays of integers, where each array corresponds to a row in a triangle of numbers. For example, `[[1], [2, 3], [1, 5, 1]]` represents the triangle:

```
  1
 2 3
1 5 1
```

We define a path in the triangle to start at the top and go down one row at a time to an adjacent value, eventually ending with an entry on the bottom row. For example, 1 -> 3 -> 5. The weight of the path is the sum of the entries.

Write a program that returns the weight of the maximum weight path.

## Daily Coding Problem: Problem #1454 [Medium]

This problem was asked by Facebook.

A graph is minimally-connected if it is connected and there is no edge that can be removed while still leaving the graph connected. For example, any binary tree is minimally-connected.

Given an undirected graph, check if the graph is minimally-connected. You can choose to represent the graph as either an adjacency matrix or adjacency list.

## Daily Coding Problem: Problem #1453 [Easy]

This problem was asked by Twitter.

A permutation can be specified by an array `P`, where `P[i]` represents the location of the element at `i` in the permutation. For example, `[2, 1, 0]` represents the permutation where elements at the index `0` and `2` are swapped.

Given an array and a permutation, apply the permutation to the array. For example, given the array `["a", "b", "c"]` and the permutation `[2, 1, 0]`, return `["c", "b", "a"]`.

## Daily Coding Problem: Problem #1452 [Medium]

This problem was asked by Palantir.

You are given a list of `N` numbers, in which each number is located at most `k` places away from its sorted position. For example, if `k = 1`, a given element at index `4` might end up at indices `3`, `4`, or `5`.

Come up with an algorithm that sorts this list in `O(N log k)` time.

## Daily Coding Problem: Problem #1451 [Hard]

This problem was asked by Palantir.

Given a number represented by a list of digits, find the next greater permutation of a number, in terms of lexicographic ordering. If there is not greater permutation possible, return the permutation with the lowest value/ordering.

For example, the list `[1,2,3]` should return `[1,3,2]`. The list `[1,3,2]` should return `[2,1,3]`. The list `[3,2,1]` should return `[1,2,3]`.

Can you perform the operation without allocating extra memory (disregarding the input memory)?

## Daily Coding Problem: Problem #1450 [Medium]

The Tower of Hanoi is a puzzle game with three rods and n disks, each a different size.

All the disks start off on the first rod in a stack. They are ordered by size, with the largest disk on the bottom and the smallest one at the top.

The goal of this puzzle is to move all the disks from the first rod to the last rod while following these rules:

- You can only move one disk at a time.
- A move consists of taking the uppermost disk from one of the stacks and placing it on top of another stack.
- You cannot place a larger disk on top of a smaller disk.

Write a function that prints out all the steps necessary to complete the Tower of Hanoi. You should assume that the rods are numbered, with the first rod being 1, the second (auxiliary) rod being 2, and the last (goal) rod being 3.

For example, with n = 3, we can do this in 7 moves:

```
Move 1 to 3
Move 1 to 2
Move 3 to 2
Move 1 to 3
Move 2 to 1
Move 2 to 3
Move 1 to 3
```

## Daily Coding Problem: Problem #1449 [Medium]

This problem was asked by Facebook.

You are given an array of non-negative integers that represents a two-dimensional elevation map where each element is unit-width wall and the integer is the height. Suppose it will rain and all spots between two walls get filled up.

Compute how many units of water remain trapped on the map in O(N) time and O(1) space.

For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.

Given the input [3, 0, 1, 3, 0, 5], we can hold 3 units in the first index, 2 in the second, and 3 in the fourth index (we cannot hold 5 since it would run off to the left), so we can trap 8 units of water.

## Daily Coding Problem: Problem #1448 [Medium]

This problem was asked by LinkedIn.

A wall consists of several rows of bricks of various integer lengths and uniform height. Your goal is to find a vertical line going from the top to the bottom of the wall that cuts through the fewest number of bricks. If the line goes through the edge between two bricks, this does not count as a cut.

For example, suppose the input is as follows, where values in each row represent the lengths of bricks in that row:

```
[[3, 5, 1, 1],
 [2, 3, 3, 2],
 [5, 5],
 [4, 4, 2],
 [1, 3, 3, 3],
 [1, 1, 6, 1, 1]]
```

The best we can we do here is to draw a line after the eighth brick, which will only require cutting through the bricks in the third and fifth row.

Given an input consisting of brick lengths for each row such as the one above, return the fewest number of bricks that must be cut to create a vertical line.

## Daily Coding Problem: Problem #1447 [Medium]

This problem was asked by Facebook.

Mastermind is a two-player game in which the first player attempts to guess the secret code of the second. In this version, the code may be any six-digit number with all distinct digits.

Each turn the first player guesses some number, and the second player responds by saying how many digits in this number correctly matched their location in the secret code. For example, if the secret code were `123456`, then a guess of `175286` would score two, since `1` and `6` were correctly placed.

Write an algorithm which, given a sequence of guesses and their scores, determines whether there exists some secret code that could have produced them.

For example, for the following scores you should return `True`, since they correspond to the secret code `123456`:

```
{175286: 2, 293416: 3, 654321: 0}
```

However, it is impossible for any key to result in the following scores, so in this case you should return `False`:

```
{123456: 4, 345678: 4, 567890: 4}
```

## Daily Coding Problem: Problem #1446 [Medium]

This problem was asked by Google.

Given a set of closed intervals, find the smallest set of numbers that covers all the intervals. If there are multiple smallest sets, return any of them.

For example, given the intervals `[0, 3], [2, 6], [3, 4], [6, 9]`, one set of numbers that covers all these intervals is `{3, 6}`.

## Daily Coding Problem: Problem #1445 [Easy]

This problem was asked by Jane Street.

The United States uses the imperial system of weights and measures, which means that there are many different, seemingly arbitrary units to measure distance. There are 12 inches in a foot, 3 feet in a yard, 22 yards in a chain, [and so on](https://en.wikipedia.org/wiki/Imperial_units#Length).

Create a data structure that can efficiently convert a certain quantity of one unit to the correct amount of any other unit. You should also allow for additional units to be added to the system.

## Daily Coding Problem: Problem #1444 [Medium]

This problem was asked by Yahoo.

Recall that a full binary tree is one in which each node is either a leaf node, or has two children. Given a binary tree, convert it to a full one by removing nodes with only one child.

For example, given the following tree:

```
         0
      /     \
    1         2
  /            \
3                 4
  \             /   \
    5          6     7
```

You should convert it to:

```
     0
  /     \
5         4
        /   \
       6     7
```

## Daily Coding Problem: Problem #1443 [Hard]

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

## Daily Coding Problem: Problem #1442 [Easy]

This problem was asked by Amazon.

Implement a stack API using only a heap. A stack implements the following methods:

- `push(item)`, which adds an element to the stack
- `pop()`, which removes and returns the most recently added element (or throws an error if there is nothing on the stack)

Recall that a heap has the following operations:

- `push(item)`, which adds a new key to the heap
- `pop()`, which removes and returns the max value of the heap

## Daily Coding Problem: Problem #1441 [Easy]

This problem was asked by Google.

UTF-8 is a character encoding that maps each symbol to one, two, three, or four bytes.

For example, the Euro sign, €, corresponds to the three bytes `11100010 10000010 10101100`. The rules for mapping characters are as follows:

- For a single-byte character, the first bit must be zero.
- For an `n`-byte character, the first byte starts with `n` ones and a zero. The other `n - 1` bytes all start with `10`.

Visually, this can be represented as follows.

```
 Bytes   |           Byte format
-----------------------------------------------
   1     | 0xxxxxxx
   2     | 110xxxxx 10xxxxxx
   3     | 1110xxxx 10xxxxxx 10xxxxxx
   4     | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
```

Write a program that takes in an array of integers representing byte values, and returns whether it is a valid UTF-8 encoding.

## Daily Coding Problem: Problem #1440 [Easy]

This problem was asked by Zillow.

A ternary search tree is a trie-like data structure where each node may have up to three children. Here is an example which represents the words `code`, `cob`, `be`, `ax`, `war`, and `we`.

```
       c
    /  |  \
   b   o   w
 / |   |   |
a  e   d   a
|    / |   | \ 
x   b  e   r  e  
```

The tree is structured according to the following rules:

- left child nodes link to words lexicographically earlier than the parent prefix
- right child nodes link to words lexicographically later than the parent prefix
- middle child nodes continue the current word

For instance, since `code` is the first word inserted in the tree, and `cob` lexicographically precedes `cod`, `cob` is represented as a left child extending from `cod`.

Implement insertion and search functions for a ternary search tree.

## Daily Coding Problem: Problem #1439 [Easy]

This problem was asked by Microsoft.

Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down.

For example, given the following matrix:

```
[['F', 'A', 'C', 'I'],
 ['O', 'B', 'Q', 'P'],
 ['A', 'N', 'O', 'B'],
 ['M', 'A', 'S', 'S']]
```

and the target word 'FOAM', you should return true, since it's the leftmost column. Similarly, given the target word 'MASS', you should return true, since it's the last row.

## Daily Coding Problem: Problem #1438 [Medium]

This problem was asked by Square.

You are given a histogram consisting of rectangles of different heights. These heights are represented in an input list, such that `[1, 3, 2, 5]` corresponds to the following diagram:

```
      x
      x  
  x   x
  x x x
x x x x
```

Determine the area of the largest rectangle that can be formed only from the bars of the histogram. For the diagram above, for example, this would be six, representing the `2 x 3` area at the bottom right.

## Daily Coding Problem: Problem #1437 [Hard]

This problem was asked by Microsoft.

Given an array of numbers, find the length of the longest increasing subsequence in the array. The subsequence does not necessarily have to be contiguous.

For example, given the array [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15], the longest increasing subsequence has length 6: it is 0, 2, 6, 9, 11, 15.

## Daily Coding Problem: Problem #1436 [Easy]

This problem was asked by Google.

Given an array of elements, return the length of the longest subarray where all its elements are distinct.

For example, given the array `[5, 1, 3, 5, 2, 3, 4, 1]`, return 5 as the longest subarray of distinct elements is `[5, 2, 3, 4, 1]`.

## Daily Coding Problem: Problem #1435 [Medium]

This problem was asked by Microsoft.

Implement the singleton pattern with a twist. First, instead of storing one instance, store two instances. And in every even call of `getInstance()`, return the first instance and in every odd call of `getInstance()`, return the second instance.

## Daily Coding Problem: Problem #1434 [Medium]

This problem was asked by Airbnb.

You are given a huge list of airline ticket prices between different cities around the world on a given day. These are all direct flights. Each element in the list has the format `(source_city, destination, price)`.

Consider a user who is willing to take up to `k` connections from their origin city `A` to their destination `B`. Find the cheapest fare possible for this journey and print the itinerary for that journey.

For example, our traveler wants to go from `JFK` to `LAX` with up to `3` connections, and our input flights are as follows:

```
[
    ('JFK', 'ATL', 150),
    ('ATL', 'SFO', 400),
    ('ORD', 'LAX', 200),
    ('LAX', 'DFW', 80),
    ('JFK', 'HKG', 800),
    ('ATL', 'ORD', 90),
    ('JFK', 'LAX', 500),
]
```

Due to some improbably low flight prices, the cheapest itinerary would be `JFK -> ATL -> ORD -> LAX`, costing $440.

## Daily Coding Problem: Problem #1433 [Medium]

This problem was asked by Nest.

Create a basic sentence checker that takes in a stream of characters and determines whether they form valid sentences. If a sentence is valid, the program should print it out.

We can consider a sentence valid if it conforms to the following rules:

1. The sentence must start with a capital letter, followed by a lowercase letter or a space.
2. All other characters must be lowercase letters, separators (`,`,`;`,`:`) or terminal marks (`.`,`?`,`!`,`‽`).
3. There must be a single space between each word.
4. The sentence must end with a terminal mark immediately following a word.

## Daily Coding Problem: Problem #1432 [Medium]

This question was asked by Snapchat.

Given the head to a singly linked list, where each node also has a “random” pointer that points to anywhere in the linked list, deep clone the list.

## Daily Coding Problem: Problem #1431 [Medium]

This problem was asked by MongoDB.

Given a list of elements, find the majority element, which appears more than half the time (`> floor(len(lst) / 2.0)`).

You can assume that such element exists.

For example, given `[1, 2, 1, 1, 3, 4, 0]`, return 1.

## Daily Coding Problem: Problem #1430 [Easy]

This problem was asked by Facebook.

You have a large array with most of the elements as zero.

Use a more space-efficient data structure, SparseArray, that implements the same interface:

- `init(arr, size)`: initialize with the original large array and size.
- `set(i, val)`: updates index at `i` with `val`.
- `get(i)`: gets the value at index `i`.

## Daily Coding Problem: Problem #1429 [Easy]

This problem was asked by Sumo Logic.

Given a array that's sorted but rotated at some unknown pivot, in which all elements are distinct, find a "peak" element in `O(log N)` time.

An element is considered a peak if it is greater than both its left and right neighbors. It is guaranteed that the first and last elements are lower than all others.

## Daily Coding Problem: Problem #1428 [Hard]

This problem was asked by Microsoft.

Given an array of positive integers, divide the array into two subsets such that the difference between the sum of the subsets is as small as possible.

For example, given `[5, 10, 15, 20, 25]`, return the sets `{10, 25}` and `{5, 15, 20}`, which has a difference of 5, which is the smallest possible difference.

## Daily Coding Problem: Problem #1427 [Easy]

This problem was asked by Amazon.

Given an array and a number `k` that's smaller than the length of the array, rotate the array to the right `k` elements in-place.

## Daily Coding Problem: Problem #1426 [Hard]

This problem was asked by Salesforce.

Given an array of integers, find the maximum XOR of any two elements.

## Daily Coding Problem: Problem #1425 [Easy]

This problem was asked by Microsoft.

Suppose an arithmetic expression is given as a binary tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.

Given the root to such a tree, write a function to evaluate it.

For example, given the following tree:

```
    *
   / \
  +    +
 / \  / \
3  2  4  5
```

You should return 45, as it is (3 + 2) * (4 + 5).

## Daily Coding Problem: Problem #1424 [Easy]

This problem was asked by Microsoft.

Implement a URL shortener with the following methods:

- `shorten(url)`, which shortens the url into a six-character alphanumeric string, such as `zLg6wl`.
- `restore(short)`, which expands the shortened string into the original url. If no such shortened string exists, return null.

Hint: What if we enter the same URL twice?

## Daily Coding Problem: Problem #1423 [Medium]

This problem was asked by Google.

You are given an array of nonnegative integers. Let's say you start at the beginning of the array and are trying to advance to the end. You can advance at most, the number of steps that you're currently on. Determine whether you can get to the end of the array.

For example, given the array `[1, 3, 1, 2, 0, 1]`, we can go from indices `0 -> 1 -> 3 -> 5`, so return `true`.

Given the array `[1, 2, 1, 0, 0]`, we can't reach the end, so return `false`.

## Daily Coding Problem: Problem #1422 [Hard]

This problem was asked by Airbnb.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be `0` or negative.

For example, `[2, 4, 6, 2, 5]` should return `13`, since we pick `2`, `6`, and `5`. `[5, 1, 1, 5]` should return `10`, since we pick `5` and `5`.

Follow-up: Can you do this in O(N) time and constant space?

## Daily Coding Problem: Problem #1421 [Hard]

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index `i` of the new array is the product of all the numbers in the original array except the one at `i`.

For example, if our input was `[1, 2, 3, 4, 5]`, the expected output would be `[120, 60, 40, 30, 24]`. If our input was `[3, 2, 1]`, the expected output would be `[2, 3, 6]`.

Follow-up: what if you can't use division?

## Daily Coding Problem: Problem #1420 [Medium]

This problem was asked by Amazon.

Given a string s and an integer k, break up the string into multiple lines such that each line has a length of k or less. You must break it up so that words don't break across lines. Each line has to have the maximum possible amount of words. If there's no way to break the text up, then return null.

You can assume that there are no spaces at the ends of the string and that there is exactly one space between each word.

For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, you should return: ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. No string in the list has a length of more than 10.

## Daily Coding Problem: Problem #1419 [Medium]

This problem was asked by Google.

Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here", return "here world hello"

Follow-up: given a mutable string representation, can you perform this operation in-place?

## Daily Coding Problem: Problem #1418 [Medium]

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

## Daily Coding Problem: Problem #1417 [Easy]

This problem was asked by Wayfair.

You are given a `2 x N` board, and instructed to completely cover the board with the following shapes:

- Dominoes, or `2 x 1` rectangles.
- Trominoes, or `L`-shapes.

For example, if `N = 4`, here is one possible configuration, where `A` is a domino, and `B` and `C` are trominoes.

```
A B B C
A B C C
```

Given an integer `N`, determine in how many ways this task is possible.

## Daily Coding Problem: Problem #1416 [Hard]

This problem was asked by Facebook.

Given a string consisting of parentheses, single digits, and positive and negative signs, convert the string into a mathematical expression to obtain the answer.

Don't use `eval` or a similar built-in parser.

For example, given '-1 + (2 + 3)', you should return `4`.

## Daily Coding Problem: Problem #1415 [Easy]

This problem was asked by Stripe.

Write a function to flatten a nested dictionary. Namespace the keys with a period.

For example, given the following dictionary:

```
{
    "key": 3,
    "foo": {
        "a": 5,
        "bar": {
            "baz": 8
        }
    }
}
```

it should become:

```
{
    "key": 3,
    "foo.a": 5,
    "foo.bar.baz": 8
}
```

You can assume keys do not contain dots in them, i.e. no clobbering will occur.

## Daily Coding Problem: Problem #1414 [Easy]

This problem was asked by Bloomberg.

Determine whether there exists a one-to-one character mapping from one string `s1` to another `s2`.

For example, given `s1 = abc` and `s2 = bcd`, return `true` since we can map `a` to `b`, `b` to `c`, and `c` to `d`.

Given `s1 = foo` and `s2 = bar`, return `false` since the `o` cannot map to two characters.

## Daily Coding Problem: Problem #1413 [Medium]

This problem was asked by Square.

Given a string and a set of characters, return the shortest substring containing all the characters in the set.

For example, given the string "figehaeci" and the set of characters {a, e, i}, you should return "aeci".

If there is no substring containing all the characters in the set, return null.

## Daily Coding Problem: Problem #1412 [Medium]

This problem was asked by Jane Street.

Generate a finite, but an arbitrarily large binary tree quickly in O(1).

That is, `generate()` should return a tree whose size is unbounded but finite.

## Daily Coding Problem: Problem #1411 [Hard]

This problem was asked by Google.

Given two non-empty binary trees `s` and `t`, check whether tree `t` has exactly the same structure and node values with a subtree of `s`. A subtree of `s` is a tree consists of a node in `s` and all of this node's descendants. The tree `s` could also be considered as a subtree of itself.

## Daily Coding Problem: Problem #1410 [Hard]

This problem was asked by Salesforce.

Connect 4 is a game where opponents take turns dropping red or black discs into a `7 x 6` vertically suspended grid. The game ends either when one player creates a line of four consecutive discs of their color (horizontally, vertically, or diagonally), or when there are no more spots left in the grid.

Design and implement Connect 4.

## Daily Coding Problem: Problem #1409 [Easy]

This problem was asked by Microsoft.

The transitive closure of a graph is a measure of which vertices are reachable from other vertices. It can be represented as a matrix `M`, where `M[i][j] == 1` if there is a path between vertices `i` and `j`, and otherwise `0`.

For example, suppose we are given the following graph in adjacency list form:

```
graph = [
    [0, 1, 3],
    [1, 2],
    [2],
    [3]
]
```

The transitive closure of this graph would be:

```
[1, 1, 1, 1]
[0, 1, 1, 0]
[0, 0, 1, 0]
[0, 0, 0, 1]
```

Given a graph, find its transitive closure.

## Daily Coding Problem: Problem #1408 [Hard]

Given a list, sort it using this method: `reverse(lst, i, j)`, which reverses `lst` from `i` to `j`.

## Daily Coding Problem: Problem #1407 [Medium]

This problem was asked by Mailchimp.

You are given an array representing the heights of neighboring buildings on a city street, from east to west. The city assessor would like you to write an algorithm that returns how many of these buildings have a view of the setting sun, in order to properly value the street.

For example, given the array `[3, 7, 8, 3, 6, 1]`, you should return `3`, since the top floors of the buildings with heights `8`, `6`, and `1` all have an unobstructed view to the west.

Can you do this using just one forward pass through the array?

## Daily Coding Problem: Problem #1406 [Easy]

This problem was asked by Facebook.

Given a binary tree, return the level of the tree with minimum sum.

## Daily Coding Problem: Problem #1405 [Hard]

This problem was asked by Quantcast.

You are presented with an array representing a Boolean expression. The elements are of two kinds:

- `T` and `F`, representing the values `True` and `False`.
- `&`, `|`, and `^`, representing the bitwise operators for `AND`, `OR`, and `XOR`.

Determine the number of ways to group the array elements using parentheses so that the entire expression evaluates to `True`.

For example, suppose the input is `['F', '|', 'T', '&', 'T']`. In this case, there are two acceptable groupings: `(F | T) & T` and `F | (T & T)`.

## Daily Coding Problem: Problem #1404 [Medium]

This problem was asked by Microsoft.

Given a string and a pattern, find the starting indices of all occurrences of the pattern in the string. For example, given the string "abracadabra" and the pattern "abr", you should return `[0, 7]`.

## Daily Coding Problem: Problem #1403 [Hard]

This problem was asked by Two Sigma.

Alice wants to join her school's Probability Student Club. Membership dues are computed via one of two simple probabilistic games.

The first game: roll a die repeatedly. Stop rolling once you get a five followed by a six. Your number of rolls is the amount you pay, in dollars.

The second game: same, except that the stopping condition is a five followed by a five.

Which of the two games should Alice elect to play? Does it even matter? Write a program to simulate the two games and calculate their expected value.

## Daily Coding Problem: Problem #1402 [Easy]

This problem was asked by Amazon.

Huffman coding is a method of encoding characters based on their frequency. Each letter is assigned a variable-length binary string, such as `0101` or `111110`, where shorter lengths correspond to more common letters. To accomplish this, a binary tree is built such that the path from the root to any leaf uniquely maps to a character. When traversing the path, descending to a left child corresponds to a `0` in the prefix, while descending right corresponds to `1`.

Here is an example tree (note that only the leaf nodes have letters):

```
        *
      /   \
    *       *
   / \     / \
  *   a   t   *
 /             \
c               s
```

With this encoding, `cats` would be represented as `0000110111`.

Given a dictionary of character frequencies, build a Huffman tree, and use it to determine a mapping between characters and their encoded binary strings.

## Daily Coding Problem: Problem #1401 [Hard]

This problem was asked by Google.

Implement a file syncing algorithm for two computers over a low-bandwidth network. What if we know the files in the two computers are mostly the same?