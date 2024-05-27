## Problem 201 (Easy)

This problem was asked by Google.

You are given an array of arrays of integers, where each array corresponds to a row in a triangle of numbers. For example, `[[1], [2, 3], [1, 5, 1]]` represents the triangle:

```
  1
 2 3
1 5 1
```

We define a path in the triangle to start at the top and go down one row at a time to an adjacent value, eventually ending with an entry on the bottom row. For example, `1 -> 3 -> 5`. The weight of the path is the sum of the entries.

Write a program that returns the weight of the maximum weight path.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution201.java)

---

## Problem 202 (Easy)

This problem was asked by Palantir.

Write a program that checks whether an integer is a palindrome. For example, `121` is a palindrome, as well as `888`. `678` is not a palindrome. Do not convert the integer into a string.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution202.java)

---

## Problem 203

This problem was asked by Uber.

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand. Find the minimum element in `O(log N)` time. You may assume the array does not contain duplicates.

For example, given `[5, 7, 10, 3, 4]`, return `3`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution203.java)

---

## Problem 204

This problem was asked by Amazon.

Given a complete binary tree, count the number of nodes in faster than `O(n)` time. Recall that a complete binary tree has every level filled except the last, and the nodes in the last level are filled starting from the left.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution204.java)

---

## Problem 205

This problem was asked by IBM.

Given an integer, find the next permutation of it in absolute order. For example, given `48975`, the next permutation would be `49578`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution205.java)

---

## Problem 206

This problem was asked by Twitter.

A permutation can be specified by an array `P`, where `P[i]` represents the location of the element at `i` in the permutation. For example, `[2, 1, 0]` represents the permutation where elements at the index `0` and `2` are swapped.

Given an array and a permutation, apply the permutation to the array. For example, given the array `["a", "b", "c"]` and the permutation `[2, 1, 0]`, return `["c", "b", "a"]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution206.java)

---

## Problem 207

This problem was asked by Dropbox.

Given an undirected graph `G`, check whether it is bipartite. Recall that a graph is bipartite if its vertices can be divided into two independent sets, `U` and `V`, such that no edge connects vertices of the same set.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution207.java)

---

## Problem 208

This problem was asked by LinkedIn.

Given a linked list of numbers and a pivot `k`, partition the linked list so that all nodes less than `k` come before nodes greater than or equal to `k`.

For example, given the linked list `5 -> 1 -> 8 -> 0 -> 3` and `k = 3`, the solution could be `1 -> 0 -> 5 -> 8 -> 3`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution208.java)

---

## Problem 209

This problem was asked by YouTube.

Write a program that computes the length of the longest common subsequence of three given strings. For example, given "epidemiologist", "refrigeration", and "supercalifragilisticexpialodocious", it should return `5`, since the longest common subsequence is "eieio".

[Solution](solutions/src/main/java/com/vaani/dcp/Solution209.java)

---

## Problem 210

This problem was asked by Apple.

A Collatz sequence in mathematics can be defined as follows. Starting with any positive integer:
* If `n` is even, the next number in the sequence is `n / 2`
* If `n` is odd, the next number in the sequence is `3n + 1`
It is conjectured that every such sequence eventually reaches the number `1`. Test this conjecture.

Bonus: What input `n <= 1000000` gives the longest sequence?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution210.java)

---

## Problem 211

This problem was asked by Microsoft.

Given a string and a pattern, find the starting indices of all occurrences of the pattern in the string. For example, given the string "abracadabra" and the pattern "abr", you should return `[0, 7]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution211.java)

---

## Problem 212

This problem was asked by Dropbox.

Spreadsheets often use this alphabetical encoding for its columns: "A", "B", "C", ..., "AA", "AB", ..., "ZZ", "AAA", "AAB", ....

Given a column number, return its alphabetical column id. For example, given `1`, return "A". Given `27`, return "AA".

[Solution](solutions/src/main/java/com/vaani/dcp/Solution212.java)

---

## Problem 213

This problem was asked by Snapchat.

Given a string of digits, generate all possible valid IP address combinations.

IP addresses must follow the format `A.B.C.D`, where `A`, `B`, `C`, and `D` are numbers between `0` and `255`. Zero-prefixed numbers, such as `01` and `065`, are not allowed, except for `0` itself.

For example, given "2542540123", you should return `['254.25.40.123', '254.254.0.123']`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution213.java)

---

## Problem 214

This problem was asked by Stripe.

Given an integer `n`, return the length of the longest consecutive run of `1`s in its binary representation.

For example, given `156`, you should return `3`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution214.java)

---

## Problem 215

This problem was asked by Yelp.

The horizontal distance of a binary tree node describes how far left or right the node will be when the tree is printed out.

More rigorously, we can define it as follows:
* The horizontal distance of the root is `0`.
* The horizontal distance of a left child is `hd(parent) - 1`.
* The horizontal distance of a right child is `hd(parent) + 1`.

For example, for the following tree, `hd(1) = -2`, and `hd(6) = 0`.

```
             5
          /     \
        3         7
      /  \      /   \
    1     4    6     9
   /                /
  0                8
```

The bottom view of a tree, then, consists of the lowest node at each horizontal distance. If there are two nodes at the same depth and horizontal distance, either is acceptable.

For this tree, for example, the bottom view could be `[0, 1, 3, 6, 8, 9]`.

Given the root to a binary tree, return its bottom view.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution215.java)

---

## Problem 216

This problem was asked by Facebook.

Given a number in Roman numeral format, convert it to decimal.

The values of Roman numerals are as follows:
```
{
    'M': 1000,
    'D': 500,
    'C': 100,
    'L': 50,
    'X': 10,
    'V': 5,
    'I': 1
}
```

In addition, note that the Roman numeral system uses subtractive notation for numbers such as `IV` and `XL`.

For the input `XIV`, for instance, you should return `14`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution216.java)

---

## Problem 217

This problem was asked by Oracle.

We say a number is sparse if there are no adjacent ones in its binary representation. For example, `21` (`10101`) is sparse, but `22` (`10110`) is not. For a given input `N`, find the smallest sparse number greater than or equal to `N`.

Do this in faster than `O(N log N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution217.java)

---

## Problem 218

This problem was asked by Yahoo.

Write an algorithm that computes the reversal of a directed graph. For example, if a graph consists of `A -> B -> C`, it should become `A <- B <- C`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution218.java)

---

## Problem 219

This problem was asked by Salesforce.

Connect 4 is a game where opponents take turns dropping red or black discs into a `7 x 6` vertically suspended grid. The game ends either when one player creates a line of four consecutive discs of their color (horizontally, vertically, or diagonally), or when there are no more spots left in the grid.

Design and implement Connect 4.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution219.java)

---

## Problem 220

This problem was asked by Square.

In front of you is a row of N coins, with values `v_1, v_2, ..., v_n`.

You are asked to play the following game. You and an opponent take turns choosing either the first or last coin from the row, removing it from the row, and receiving the value of the coin.

Write a program that returns the maximum amount of money you can win with certainty, if you move first, assuming your opponent plays optimally.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution220.java)

---

## Problem 221

This problem was asked by Zillow.

Let's define a "sevenish" number to be one which is either a power of `7`, or the sum of unique powers of `7`. The first few sevenish numbers are `1, 7, 8, 49`, and so on. Create an algorithm to find the `n`th sevenish number.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution221.java)

---

## Problem 222

This problem was asked by Quora.

Given an absolute pathname that may have `.` or `..` as part of it, return the shortest standardized path.

For example, given `/usr/bin/../bin/./scripts/../`, return `/usr/bin/`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution222.java)

---

## Problem 223

This problem was asked by Palantir.

Typically, an implementation of in-order traversal of a binary tree has `O(h)` space complexity, where `h` is the height of the tree. Write a program to compute the in-order traversal of a binary tree using `O(1)` space.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution223.java)

---

## Problem 224

This problem was asked by Amazon.

Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.

For example, for the input `[1, 2, 3, 10]`, you should return `7`.

Do this in `O(N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution224.java)

---

## Problem 225

This problem was asked by Bloomberg.

There are `N` prisoners standing in a circle, waiting to be executed. The executions are carried out starting with the `k`th person, and removing every successive `k`th person going clockwise until there is no one left.

Given `N` and `k`, write an algorithm to determine where a prisoner should stand in order to be the last survivor.

For example, if `N = 5` and `k = 2`, the order of executions would be `[2, 4, 1, 5, 3]`, so you should return `3`.

Bonus: Find an `O(log N)` solution if `k = 2`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution225.java)

---

## Problem 226

This problem was asked by Airbnb.

You come across a dictionary of sorted words in a language you've never seen before. Write a program that returns the correct order of letters in this language.

For example, given `['xww', 'wxyz', 'wxyw', 'ywx', 'ywz']`, you should return `['x', 'z', 'w', 'y']`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution226.java)

---

## Problem 227

This problem was asked by Facebook.

Boggle is a game played on a `4 x 4` grid of letters. The goal is to find as many words as possible that can be formed by a sequence of adjacent letters in the grid, using each cell at most once. Given a game board and a dictionary of valid words, implement a Boggle solver.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution227.java)

---

## Problem 228

This problem was asked by Twitter.

Given a list of numbers, create an algorithm that arranges them in order to form the largest possible integer. For example, given `[10, 7, 76, 415]`, you should return `77641510`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution228.java)

---

## Problem 229

This problem was asked by Flipkart.

Snakes and Ladders is a game played on a `10 x 10` board, the goal of which is get from square `1` to square `100`. On each turn players will roll a six-sided die and move forward a number of spaces equal to the result. If they land on a square that represents a snake or ladder, they will be transported ahead or behind, respectively, to a new square.

Find the smallest number of turns it takes to play snakes and ladders.

For convenience, here are the squares representing snakes and ladders, and their outcomes:

```
snakes = {16: 6, 48: 26, 49: 11, 56: 53, 62: 19, 64: 60, 87: 24, 93: 73, 95: 75, 98: 78}
ladders = {1: 38, 4: 14, 9: 31, 21: 42, 28: 84, 36: 44, 51: 67, 71: 91, 80: 100}
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution229.java)

---

## Problem 230

This problem was asked by Goldman Sachs.

You are given `N` identical eggs and access to a building with `k` floors. Your task is to find the lowest floor that will cause an egg to break, if dropped from that floor. Once an egg breaks, it cannot be dropped again. If an egg breaks when dropped from the `x`th floor, you can assume it will also break when dropped from any floor greater than `x`.

Write an algorithm that finds the minimum number of trial drops it will take, in the worst case, to identify this floor.

For example, if `N = 1` and `k = 5`, we will need to try dropping the egg at every floor, beginning with the first, until we reach the fifth floor, so our solution will be `5`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution230.java)

---

## Problem 231

This problem was asked by IBM.

Given a string with repeated characters, rearrange the string so that no two adjacent characters are the same. If this is not possible, return None.

For example, given "aaabbc", you could return "ababac". Given "aaab", return None.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution231.java)

---

## Problem 232

This problem was asked by Google.

Implement a PrefixMapSum class with the following methods:

`insert(key: str, value: int)`: Set a given key's value in the map. If the key already exists, overwrite the value.
`sum(prefix: str)`: Return the sum of all values of keys that begin with a given prefix.
For example, you should be able to run the following code:

```
mapsum.insert("columnar", 3)
assert mapsum.sum("col") == 3
```

```
mapsum.insert("column", 2)
assert mapsum.sum("col") == 5
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution232.java)

---

## Problem 233

This problem was asked by Apple.

Implement the function `fib(n)`, which returns the nth number in the Fibonacci sequence, using only `O(1)` space.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution233.java)

---

## Problem 234

This problem was asked by Microsoft.

Recall that the minimum spanning tree is the subset of edges of a tree that connect all its vertices with the smallest possible total edge weight. Given an undirected graph with weighted edges, compute the maximum weight spanning tree.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution234.java)

---

## Problem 235

This problem was asked by Facebook.

Given an array of numbers of length `N`, find both the minimum and maximum using less than `2 * (N - 2)` comparisons.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution235.java)

---

## Problem 236

This problem was asked by Nvidia.

You are given a list of N points `(x1, y1), (x2, y2), ..., (xN, yN)` representing a polygon. You can assume these points are given in order; that is, you can construct the polygon by connecting point 1 to point 2, point 2 to point 3, and so on, finally looping around to connect point N to point 1.

Determine if a new point p lies inside this polygon. (If p is on the boundary of the polygon, you should return False).

[Solution](solutions/src/main/java/com/vaani/dcp/Solution236.md)

---

## Problem 237

This problem was asked by Amazon.

A tree is symmetric if its data and shape remain unchanged when it is reflected about the root node. The following tree is an example:

```
        4
      / | \
    3   5   3
  /           \
9              9
```

Given a k-ary tree, determine whether it is symmetric.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution237.java)

---

## Problem 238

This problem was asked by MIT.

Blackjack is a two player card game whose rules are as follows:
* The player and then the dealer are each given two cards.
* The player can then "hit", or ask for arbitrarily many additional cards, so long as their total does not exceed 21.
* The dealer must then hit if their total is 16 or lower, otherwise pass.
* Finally, the two compare totals, and the one with the greatest sum not exceeding 21 is the winner.

For this problem, cards values are counted as follows: each card between 2 and 10 counts as their face value, face cards count as 10, and aces count as 1.

Given perfect knowledge of the sequence of cards in the deck, implement a blackjack solver that maximizes the player's score (that is, wins minus losses).

[Solution](solutions/src/main/java/com/vaani/dcp/Solution238.java)

---

## Problem 239

This problem was asked by Uber.

One way to unlock an Android phone is through a pattern of swipes across a 1-9 keypad.

For a pattern to be valid, it must satisfy the following:

All of its keys must be distinct.
It must not connect two keys by jumping over a third key, unless that key has already been used.
For example, `4 - 2 - 1 - 7` is a valid pattern, whereas `2 - 1 - 7` is not.

Find the total number of valid unlock patterns of length N, where `1 <= N <= 9`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution239.java)

---

## Problem 240

This problem was asked by Spotify.

There are `N` couples sitting in a row of length `2 * N`. They are currently ordered randomly, but would like to rearrange themselves so that each couple's partners can sit side by side.
What is the minimum number of swaps necessary for this to happen?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution240.md)

---

## Problem 241

This problem was asked by Palantir.

In academia, the h-index is a metric used to calculate the impact of a researcher's papers. It is calculated as follows:

A researcher has index `h` if at least `h` of her `N` papers have `h` citations each. If there are multiple `h` satisfying this formula, the maximum is chosen.

For example, suppose `N = 5`, and the respective citations of each paper are `[4, 3, 0, 1, 5]`. Then the h-index would be `3`, since the researcher has `3` papers with at least `3` citations.

Given a list of paper citations of a researcher, calculate their h-index.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution241.java)

---

## Problem 242

This problem was asked by Twitter.

You are given an array of length 24, where each element represents the number of new subscribers during the corresponding hour. Implement a data structure that efficiently supports the following:
* `update(hour: int, value: int)`: Increment the element at index hour by value.
* `query(start: int, end: int)`: Retrieve the number of subscribers that have signed up between start and end (inclusive).
You can assume that all values get cleared at the end of the day, and that you will not be asked for start and end values that wrap around midnight.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution242.java)

---

## Problem 243

This problem was asked by Etsy.

Given an array of numbers `N` and an integer `k`, your task is to split `N` into `k` partitions such that the maximum sum of any partition is minimized. Return this sum.

For example, given `N = [5, 1, 2, 7, 3, 4]` and `k = 3`, you should return `8`, since the optimal partition is `[5, 1, 2], [7], [3, 4]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution243.java)

---

## Problem 244

This problem was asked by Square.

The Sieve of Eratosthenes is an algorithm used to generate all prime numbers smaller than N. The method is to take increasingly larger prime numbers, and mark their multiples as composite.

For example, to find all primes less than 100, we would first mark `[4, 6, 8, ...]` (multiples of two), then `[6, 9, 12, ...]` (multiples of three), and so on. Once we have done this for all primes less than `N`, the unmarked numbers that remain will be prime.

Implement this algorithm.

Bonus: Create a generator that produces primes indefinitely (that is, without taking `N` as an input).

[Solution](solutions/src/main/java/com/vaani/dcp/Solution244.java)

---

## Problem 245

This problem was asked by Yelp.

You are given an array of integers, where each element represents the maximum number of steps that can be jumped going forward from that element. Write a function to return the minimum number of jumps you must take in order to get from the start to the end of the array.

For example, given `[6, 2, 4, 0, 5, 1, 1, 4, 2, 9]`, you should return `2`, as the optimal solution involves jumping from `6` to `5`, and then from `5` to `9`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution245.java)

---

## Problem 246

This problem was asked by Dropbox.

Given a list of words, determine whether the words can be chained to form a circle. A word `X` can be placed in front of another word `Y` in a circle if the last character of `X` is same as the first character of `Y`.

For example, the words `['chair', 'height', 'racket', 'touch', 'tunic']` can form the following circle: `chair -> racket -> touch -> height -> tunic -> chair`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution246.java)

---

## Problem 247

This problem was asked by PayPal.

Given a binary tree, determine whether or not it is height-balanced. A height-balanced binary tree can be defined as one in which the heights of the two subtrees of any node never differ by more than one.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution247.java)

---

## Problem 248

This problem was asked by Nvidia.

Find the maximum of two numbers without using any if-else statements, branching, or direct comparisons.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution248.java)

---

### Problem 249

This problem was asked by Salesforce.

Given an array of integers, find the maximum XOR of any two elements.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution249.java)

---

### Problem 250

This problem was asked by Google.

A cryptarithmetic puzzle is a mathematical game where the digits of some numbers are represented by letters. Each letter represents a unique digit.

For example, a puzzle of the form:

```
  SEND
+ MORE
--------
 MONEY
```
may have the solution:

`{'S': 9, 'E': 5, 'N': 6, 'D': 7, 'M': 1, 'O': 0, 'R': 8, 'Y': 2}`

Given a three-word puzzle like the one above, create an algorithm that finds a solution.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution250.java)

---

### Problem 251

This problem was asked by Amazon.

Given an array of a million integers between zero and a billion, out of order, how can you efficiently sort it? Assume that you cannot store an array of a billion elements in memory.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution251.md)

---

### Problem 252

This problem was asked by Palantir.

The ancient Egyptians used to express fractions as a sum of several terms where each numerator is one. For example, `4 / 13` can be represented as `1 / (4 + 1 / (18 + (1 / 468)))`.

Create an algorithm to turn an ordinary fraction `a / b`, where `a < b`, into an Egyptian fraction.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution252.java)

---

### Problem 253

This problem was asked by PayPal.

Given a string and a number of lines `k`, print the string in zigzag form. In zigzag, characters are printed out diagonally from top left to bottom right until reaching the kth line, then back up to top right, and so on.

For example, given the sentence `"thisisazigzag"` and `k = 4`, you should print:

```
t     a     g
 h   s z   a
  i i   i z
   s     g
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution253.java)

---

### Problem 254

This problem was asked by Yahoo.

Recall that a full binary tree is one in which each node is either a leaf node, or has two children. Given a binary tree, convert it to a full one by removing nodes with only one child.

For example, given the following tree:

```
         a
      /     \
    b         c
  /            \
d                 e
  \             /   \
    f          g     h
```

You should convert it to:

```
     a
  /     \
f         e
        /   \
       g     h
```
[Solution](solutions/src/main/java/com/vaani/dcp/Solution254.java)

---

### Problem 255

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution255.java)

---

### Problem 256

This problem was asked by Fitbit.

Given a linked list, rearrange the node values such that they appear in alternating `low -> high -> low -> high` ... form. For example, given `1 -> 2 -> 3 -> 4 -> 5`, you should return `1 -> 3 -> 2 -> 5 -> 4`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution256.java)

---

### Problem 257

This problem was asked by WhatsApp.

Given an array of integers out of order, determine the bounds of the smallest window that must be sorted in order for the entire array to be sorted. For example, given `[3, 7, 5, 6, 9]`, you should return `(1, 3)`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution257.java)

---

### Problem 258

This problem was asked by Morgan Stanley.

In Ancient Greece, it was common to write text with the first line going left to right, the second line going right to left, and continuing to go back and forth. This style was called "boustrophedon".

Given a binary tree, write an algorithm to print the nodes in boustrophedon order.

For example, given the following tree:

```
       1
    /     \
  2         3
 / \       / \
4   5     6   7
```

You should return `[1, 3, 2, 4, 5, 6, 7]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution258.java)

---

### Problem 259

This problem was asked by Two Sigma.

Ghost is a two-person word game where players alternate appending letters to a word. The first person who spells out a word, or creates a prefix for which there is no possible continuation, loses. Here is a sample game:

```
Player 1: g
Player 2: h
Player 1: o
Player 2: s
Player 1: t [loses]
```

Given a dictionary of words, determine the letters the first player should start with, such that with optimal play they cannot lose.

For example, if the dictionary is `["cat", "calf", "dog", "bear"]`, the only winning start letter would be b.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution259.java)

---

### Problem 260

This problem was asked by Pinterest.

The sequence `[0, 1, ..., N]` has been jumbled, and the only clue you have for its order is an array representing whether each number is larger or smaller than the last. Given this information, reconstruct an array that is consistent with it. For example, given `[None, +, +, -, +]`, you could return `[1, 2, 3, 0, 4]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution260.java)

---

### Problem 261

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
With this encoding, cats would be represented as `0000110111`.

Given a dictionary of character frequencies, build a Huffman tree, and use it to determine a mapping between characters and their encoded binary strings.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution261.java)

---

### Problem 262

This problem was asked by Mozilla.

A bridge in a connected (undirected) graph is an edge that, if removed, causes the graph to become disconnected. Find all the bridges in a graph.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution262.md)

---

### Problem 263

This problem was asked by Nest.

Create a basic sentence checker that takes in a stream of characters and determines whether they form valid sentences. If a sentence is valid, the program should print it out.

We can consider a sentence valid if it conforms to the following rules:
* The sentence must start with a capital letter, followed by a lowercase letter or a space.
* All other characters must be lowercase letters, separators `(,,;,:)` or terminal marks `(.,?,!,‽)`.
* There must be a single space between each word.
* The sentence must end with a terminal mark immediately following a word.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution263.java)

---

### Problem 264

This problem was asked by LinkedIn.

Given a set of characters `C` and an integer `k`, a De Bruijn sequence is a cyclic sequence in which every possible `k`-length string of characters in `C` occurs exactly once.

For example, suppose `C = {0, 1}` and `k = 3`. Then our sequence should contain the substrings `{'000', '001', '010', '011', '100', '101', '110', '111'}`, and one possible solution would be `00010111`.

Create an algorithm that finds a De Bruijn sequence.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution264.java)

---

### Problem 265

This problem was asked by Atlassian.

MegaCorp wants to give bonuses to its employees based on how many lines of codes they have written. They would like to give the smallest positive amount to each worker consistent with the constraint that if a developer has written more lines of code than their neighbor, they should receive more money.

Given an array representing a line of seats of employees at MegaCorp, determine how much each one should get paid.

For example, given `[10, 40, 200, 1000, 60, 30]`, you should return `[1, 2, 3, 4, 2, 1]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution265.java)

---

### Problem 266

This problem was asked by Pivotal.

A step word is formed by taking a given word, adding a letter, and anagramming the result. For example, starting with the word "APPLE", you can add an "A" and anagram to get "APPEAL".

Given a dictionary of words and an input word, create a function that returns all valid step words.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution266.java)

---

### Problem 267

This problem was asked by Oracle.

You are presented with an 8 by 8 matrix representing the positions of pieces on a chess board. The only pieces on the board are the black king and various white pieces. Given this matrix, determine whether the king is in check.

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution267.java)

---

### Problem 268

This problem was asked by Indeed.

Given a 32-bit positive integer `N`, determine whether it is a power of four in faster than `O(log N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution268.java)

---

### Problem 269

This problem was asked by Microsoft.

You are given an string representing the initial conditions of some dominoes. Each element can take one of three values:
* `L`, meaning the domino has just been pushed to the left,
* `R`, meaning the domino has just been pushed to the right, or
* `.`, meaning the domino is standing still.

Determine the orientation of each tile when the dominoes stop falling. Note that if a domino receives a force from the left and right side simultaneously, it will remain upright.

For example, given the string `.L.R....L`, you should return `LL.RRRLLL`.

Given the string `..R...L.L`, you should return `..RR.LLLL`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution269.java)

---

### Problem 270

This problem was asked by Twitter.

A network consists of nodes labeled `0` to `N`. You are given a list of edges `(a, b, t)`, describing the time `t` it takes for a message to be sent from node `a` to node `b`. Whenever a node receives a message, it immediately passes the message on to a neighboring node, if possible.

Assuming all nodes are connected, determine how long it will take for every node to receive a message that begins at node `0`.

For example, given `N = 5`, and the following edges:

```
edges = [
    (0, 1, 5),
    (0, 2, 3),
    (0, 5, 4),
    (1, 3, 8),
    (2, 3, 1),
    (3, 5, 10),
    (3, 4, 5)
]
```

You should return `9`, because propagating the message from `0 -> 2 -> 3 -> 4` will take that much time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution270.java)

---

### Problem 271

This problem was asked by Netflix.

Given a sorted list of integers of length `N`, determine if an element `x` is in the list without performing any multiplication, division, or bit-shift operations.

Do this in `O(log N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution271.java)

---

### Problem 272

This problem was asked by Spotify.

Write a function, `throw_dice(N, faces, total)`, that determines how many ways it is possible to throw `N` dice with some number of faces each to get a specific total.

For example, `throw_dice(3, 6, 7)` should equal `15`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution272.java)

---

### Problem 273

This problem was asked by Apple.

A fixed point in an array is an element whose value is equal to its index. Given a sorted array of distinct elements, return a fixed point, if one exists. Otherwise, return `False`.

For example, given `[-6, 0, 2, 40]`, you should return `2`. Given `[1, 5, 7, 8]`, you should return `False`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution273.java)

---

### Problem 274

This problem was asked by Facebook.

Given a string consisting of parentheses, single digits, and positive and negative signs, convert the string into a mathematical expression to obtain the answer.

Don't use eval or a similar built-in parser.

For example, given `'-1 + (2 + 3)'`, you should return `4`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution274.java)

---

### Problem 275

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

Given an integer `N`, print the `Nth` term of this sequence.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution275.java)

---

### Problem 276

This problem was asked by Dropbox.

Implement an efficient string matching algorithm.

That is, given a string of length `N` and a pattern of length `k`, write a program that searches for the pattern in the string with less than `O(N * k)` worst-case time complexity.

If the pattern is found, return the start index of its location. If not, return `False`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution276.java)

---

### Problem 277

This problem was asked by Google.

UTF-8 is a character encoding that maps each symbol to one, two, three, or four bytes.

For example, the Euro sign, `€`, corresponds to the three bytes `11100010 10000010 10101100`. The rules for mapping characters are as follows:
* For a single-byte character, the first bit must be zero.
* For an `n`-byte character, the first byte starts with `n` ones and a zero. The other `n - 1` bytes all start with `10`.
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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution277.java)

---

### Problem 278

This problem was asked by Amazon.

Given an integer `N`, construct all possible binary search trees with `N` nodes.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution278.java)

---

### Problem 279

This problem was asked by Twitter.

A classroom consists of N students, whose friendships can be represented in an adjacency list. For example, the following descibes a situation where `0` is friends with `1` and `2`, `3` is friends with `6`, and so on.

```
{
    0: [1, 2],
    1: [0, 5],
    2: [0],
    3: [6],
    4: [],
    5: [1],
    6: [3]
}
```
Each student can be placed in a friend group, which can be defined as the transitive closure of that student's friendship relations. In other words, this is the smallest set such that no student in the group has any friends outside this group. For the example above, the friend groups would be `{0, 1, 2, 5}, {3, 6}, {4}`.

Given a friendship list such as the one above, determine the number of friend groups in the class.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution279.java)

---

### Problem 280

This problem was asked by Pandora.

Given an undirected graph, determine if it contains a cycle.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution280.java)

---

### Problem 281

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution281.java)

---

### Problem 282

This problem was asked by Netflix.

Given an array of integers, determine whether it contains a Pythagorean triplet. Recall that a Pythogorean triplet `(a, b, c)` is defined by the equation `a^2 + b^2 = c^2`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution282.java)

---

### Problem 283

This problem was asked by Google.

A regular number in mathematics is defined as one which evenly divides some power of `60`. Equivalently, we can say that a regular number is one whose only prime divisors are `2`, `3`, and `5`.

These numbers have had many applications, from helping ancient Babylonians keep time to tuning instruments according to the diatonic scale.

Given an integer `N`, write a program that returns, in order, the first `N` regular numbers.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution283.java)

---

### Problem 284

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution284.java)

---

### Problem 285

This problem was asked by Mailchimp.

You are given an array representing the heights of neighboring buildings on a city street, from east to west. The city assessor would like you to write an algorithm that returns how many of these buildings have a view of the setting sun, in order to properly value the street.

For example, given the array `[3, 7, 8, 3, 6, 1]`, you should return `3`, since the top floors of the buildings with heights `8`, `6`, and `1` all have an unobstructed view to the west.

Can you do this using just one forward pass through the array?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution285.java)

---

### Problem 286

This problem was asked by VMware.

The skyline of a city is composed of several buildings of various widths and heights, possibly overlapping one another when viewed from a distance. We can represent the buildings using an array of `(left, right, height)` tuples, which tell us where on an imaginary `x`-axis a building begins and ends, and how tall it is. The skyline itself can be described by a list of `(x, height)` tuples, giving the locations at which the height visible to a distant observer changes, and each new height.

Given an array of buildings as described above, create a function that returns the skyline.

For example, suppose the input consists of the buildings `[(0, 15, 3), (4, 11, 5), (19, 23, 4)]`. In aggregate, these buildings would create a skyline that looks like the one below.

```
     ______  
    |      |        ___
 ___|      |___    |   | 
|   |   B  |   |   | C |
| A |      | A |   |   |
|   |      |   |   |   |
------------------------
```

As a result, your function should return `[(0, 3), (4, 5), (11, 3), (15, 0), (19, 4), (23, 0)]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution286.java)

---

### Problem 287

This problem was asked by Quora.

You are given a list of (website, user) pairs that represent users visiting websites. Come up with a program that identifies the top `k` pairs of websites with the greatest similarity.

For example, suppose `k = 1`, and the list of tuples is:

```
[('a', 1), ('a', 3), ('a', 5),
 ('b', 2), ('b', 6),
 ('c', 1), ('c', 2), ('c', 3), ('c', 4), ('c', 5),
 ('d', 4), ('d', 5), ('d', 6), ('d', 7),
 ('e', 1), ('e', 3), ('e', 5), ('e', 6)]
```

Then a reasonable similarity metric would most likely conclude that `a` and `e` are the most similar, so your program should return `[('a', 'e')]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution287.java)

---

### Problem 288

This problem was asked by Salesforce.

The number `6174` is known as Kaprekar's contant, after the mathematician who discovered an associated property: for all four-digit numbers with at least two distinct digits, repeatedly applying a simple procedure eventually results in this value. The procedure is as follows:

For a given input `x`, create two new numbers that consist of the digits in `x` in ascending and descending order.
Subtract the smaller number from the larger number.
For example, this algorithm terminates in three steps when starting from `1234`:

```
4321 - 1234 = 3087
8730 - 0378 = 8352
8532 - 2358 = 6174
```

Write a function that returns how many steps this will take for a given input `N`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution288.java)

---

### Problem 289

This problem was asked by Google.

The game of Nim is played as follows. Starting with three heaps, each containing a variable number of items, two players take turns removing one or more items from a single pile. The player who eventually is forced to take the last stone loses. For example, if the initial heap sizes are 3, 4, and 5, a game could be played as shown below:

| A   | B   | C   |
| --- | --- | --- |
| 3   | 4   | 5   |
| 3   | 1   | 5   |
| 3   | 1   | 3   |
| 0   | 1   | 3   |
| 0   | 1   | 0   |
| 0   | 0   | 0   |

In other words, to start, the first player takes three items from pile `B`. The second player responds by removing two stones from pile `C`. The game continues in this way until player one takes last stone and loses.

Given a list of non-zero starting values `[a, b, c]`, and assuming optimal play, determine whether the first player has a forced win.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution289.java)

---

### Problem 290

This problem was asked by Facebook.

On a mysterious island there are creatures known as Quxes which come in three colors: red, green, and blue. One power of the Qux is that if two of them are standing next to each other, they can transform into a single creature of the third color.

Given N Quxes standing in a line, determine the smallest number of them remaining after any possible sequence of such transformations.

For example, given the input `['R', 'G', 'B', 'G', 'B']`, it is possible to end up with a single Qux through the following steps:

```
        Arrangement       |   Change
----------------------------------------
['R', 'G', 'B', 'G', 'B'] | (R, G) -> B
['B', 'B', 'G', 'B']      | (B, G) -> R
['B', 'R', 'B']           | (R, B) -> G
['B', 'G']                | (B, G) -> R
['R']                     |
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution290.java)

---

### Problem 291

This problem was asked by Glassdoor.

An imminent hurricane threatens the coastal town of Codeville. If at most two people can fit in a rescue boat, and the maximum weight limit for a given boat is `k`, determine how many boats will be needed to save everyone.

For example, given a population with weights `[100, 200, 150, 80]` and a boat limit of `200`, the smallest number of boats required will be three.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution291.java)

---

### Problem 292

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution292.java)

---

### Problem 293

This problem was asked by Uber.

You have N stones in a row, and would like to create from them a pyramid. This pyramid should be constructed such that the height of each stone increases by one until reaching the tallest stone, after which the heights decrease by one. In addition, the start and end stones of the pyramid should each be one stone high.

You can change the height of any stone by paying a cost of `1` unit to lower its height by `1`, as many times as necessary. Given this information, determine the lowest cost method to produce this pyramid.

For example, given the stones `[1, 1, 3, 3, 2, 1]`, the optimal solution is to pay 2 to create `[0, 1, 2, 3, 2, 1]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution293.java)

---

### Problem 294

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution294.java)

---

### Problem 295

This problem was asked by Stitch Fix.

Pascal's triangle is a triangular array of integers constructed with the following formula:

The first row consists of the number 1.
For each subsequent row, each element is the sum of the numbers directly above it, on either side.
For example, here are the first few rows:
```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```

Given an input `k`, return the `k`th row of Pascal's triangle.

Bonus: Can you do this using only `O(k)` space?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution295.java)

---

### Problem 296

This problem was asked by Etsy.

Given a sorted array, convert it into a height-balanced binary search tree.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution296.java)

---

### Problem 297

This problem was asked by Amazon.

At a popular bar, each customer has a set of favorite drinks, and will happily accept any drink among this set. For example, in the following situation, customer 0 will be satisfied with drinks `0`, `1`, `3`, or `6`.

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution297.java)

---

### Problem 298

This problem was asked by Google.

A girl is walking along an apple orchard with a bag in each hand. She likes to pick apples from each tree as she goes along, but is meticulous about not putting different kinds of apples in the same bag.

Given an input describing the types of apples she will pass on her path, in order, determine the length of the longest portion of her path that consists of just two types of apple trees.

For example, given the input `[2, 1, 2, 3, 3, 1, 3, 5]`, the longest portion will involve types `1` and `3`, with a length of four.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution298.java)

---

### Problem 299

This problem was asked by Samsung.

A group of houses is connected to the main water plant by means of a set of pipes. A house can either be connected by a set of pipes extending directly to the plant, or indirectly by a pipe to a nearby house which is otherwise connected.

For example, here is a possible configuration, where A, B, and C are houses, and arrows represent pipes:
`A <--> B <--> C <--> plant`

Each pipe has an associated cost, which the utility company would like to minimize. Given an undirected graph of pipe connections, return the lowest cost configuration of pipes such that each house has access to water.

In the following setup, for example, we can remove all but the pipes from plant to A, plant to B, and B to C, for a total cost of 16.

```python
pipes = {
    'plant': {'A': 1, 'B': 5, 'C': 20},
    'A': {'C': 15},
    'B': {'C': 10},
    'C': {}
}
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution299.java)

---

### Problem 300

This problem was asked by Uber.

On election day, a voting machine writes data in the form `(voter_id, candidate_id)` to a text file. Write a program that reads this file as a stream and returns the top 3 candidates at any given time. If you find a voter voting more than once, report this as fraud.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution300.java)

---
