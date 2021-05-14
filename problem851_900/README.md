## Daily Coding Problem: Problem #851 [Medium]

This problem was asked by Facebook.

A graph is minimally-connected if it is connected and there is no edge that can be removed while still leaving the graph connected. For example, any binary tree is minimally-connected.

Given an undirected graph, check if the graph is minimally-connected. You can choose to represent the graph as either an adjacency matrix or adjacency list.

## Daily Coding Problem: Problem #852 [Medium]

This problem was asked by Facebook.

Given a circular array, compute its maximum subarray sum in O(n) time. A subarray can be empty, and in this case the sum is 0.

For example, given `[8, -1, 3, 4]`, return `15` as we choose the numbers `3`, `4`, and `8` where the `8` is obtained from wrapping around.

Given `[-4, 5, 1, 0]`, return `6` as we choose the numbers `5` and `1`.

## Daily Coding Problem: Problem #853 [Hard]

Find an efficient algorithm to find the smallest distance (measured in number of words) between any two given words in a string.

For example, given words "hello", and "world" and a text content of "dog cat hello cat dog dog hello cat world", return 1 because there's only one word "cat" in between the two words.

## Daily Coding Problem: Problem #854 [Medium]

This problem was asked by Amazon.

Given a string s and an integer k, break up the string into multiple lines such that each line has a length of k or less. You must break it up so that words don't break across lines. Each line has to have the maximum possible amount of words. If there's no way to break the text up, then return null.

You can assume that there are no spaces at the ends of the string and that there is exactly one space between each word.

For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, you should return: ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. No string in the list has a length of more than 10.

## Daily Coding Problem: Problem #855 [Hard]

This problem was asked by Microsoft.

You have an N by N board. Write a function that, given N, returns the number of possible arrangements of the board where N queens can be placed on the board without threatening each other, i.e. no two queens share the same row, column, or diagonal.

## Daily Coding Problem: Problem #856 [Medium]

This problem was asked by Quora.

You are given a list of `(website, user)` pairs that represent users visiting websites. Come up with a program that identifies the top `k` pairs of websites with the greatest similarity.

For example, suppose `k = 1`, and the list of tuples is:

```
[('a', 1), ('a', 3), ('a', 5),
 ('b', 2), ('b', 6),
 ('c', 1), ('c', 2), ('c', 3), ('c', 4), ('c', 5)
 ('d', 4), ('d', 5), ('d', 6), ('d', 7),
 ('e', 1), ('e', 3), ('e': 5), ('e', 6)]
```

Then a reasonable similarity metric would most likely conclude that `a` and `e` are the most similar, so your program should return `[('a', 'e')]`.

## Daily Coding Problem: Problem #857 [Hard]

This problem was asked by LinkedIn.

You are given a binary tree in a peculiar string representation. Each node is written in the form `(lr)`, where `l` corresponds to the left child and `r` corresponds to the right child.

If either `l` or `r` is null, it will be represented as a zero. Otherwise, it will be represented by a new `(lr)` pair.

Here are a few examples:

- A root node with no children: `(00)`
- A root node with two children: `((00)(00))`
- An unbalanced tree with three consecutive left children: `((((00)0)0)0)`

Given this representation, determine the depth of the tree.

## Daily Coding Problem: Problem #858 [Easy]

This problem was asked by Microsoft.

Compute the running median of a sequence of numbers. That is, given a stream of numbers, print out the median of the list so far on each new element.

Recall that the median of an even-numbered list is the average of the two middle numbers.

For example, given the sequence [2, 1, 5, 7, 2, 0, 5], your algorithm should print out:

```
2
1.5
2
3.5
2
2
2
```

## Daily Coding Problem: Problem #859 [Medium]

This problem was asked by Yelp.

The horizontal distance of a binary tree node describes how far left or right the node will be when the tree is printed out.

More rigorously, we can define it as follows:

- The horizontal distance of the root is 0.
- The horizontal distance of a left child is `hd(parent) - 1`.
- The horizontal distance of a right child is `hd(parent) + 1`.

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

## Daily Coding Problem: Problem #860 [Hard]

This problem was asked by Facebook.

Implement regular expression matching with the following special characters:

- `.` (period) which matches any single character
- `*` (asterisk) which matches zero or more of the preceding element

That is, implement a function that takes in a string and a valid regular expression and returns whether or not the string matches the regular expression.

For example, given the regular expression "ra." and the string "ray", your function should return true. The same regular expression on the string "raymond" should return false.

Given the regular expression ".*at" and the string "chat", your function should return true. The same regular expression on the string "chats" should return false.

## Daily Coding Problem: Problem #861 [Hard]

This problem was asked by Two Sigma.

A knight is placed on a given square on an `8 x 8` chessboard. It is then moved randomly several times, where each move is a standard [knight move](https://en.wikipedia.org/wiki/Knight_(chess)#Movement). If the knight jumps off the board at any point, however, it is not allowed to jump back on.

After `k` moves, what is the probability that the knight remains on the board?

## Daily Coding Problem: Problem #862 [Medium]

This problem was asked by Mozilla.

A bridge in a connected (undirected) graph is an edge that, if removed, causes the graph to become disconnected. Find all the bridges in a graph.

## Daily Coding Problem: Problem #863 [Medium]

This problem was asked by Jane Street.

Generate a finite, but an arbitrarily large binary tree quickly in O(1).

That is, `generate()` should return a tree whose size is unbounded but finite.

## Daily Coding Problem: Problem #864 [Medium]

This problem was asked by Glassdoor.

An imminent hurricane threatens the coastal town of Codeville. If at most two people can fit in a rescue boat, and the maximum weight limit for a given boat is `k`, determine how many boats will be needed to save everyone.

For example, given a population with weights `[100, 200, 150, 80]` and a boat limit of `200`, the smallest number of boats required will be three.

## Daily Coding Problem: Problem #865 [Medium]

This problem was asked by Samsung.

A group of houses is connected to the main water plant by means of a set of pipes. A house can either be connected by a set of pipes extending directly to the plant, or indirectly by a pipe to a nearby house which is otherwise connected.

For example, here is a possible configuration, where `A`, `B`, and `C` are houses, and arrows represent pipes:

```
A <--> B <--> C <--> plant
```

Each pipe has an associated cost, which the utility company would like to minimize. Given an undirected graph of pipe connections, return the lowest cost configuration of pipes such that each house has access to water.

In the following setup, for example, we can remove all but the pipes from `plant` to `A`, `plant` to `B`, and `B` to `C`, for a total cost of `16`.

```
pipes = {
    'plant': {'A': 1, 'B': 5, 'C': 20},
    'A': {'C': 15},
    'B': {'C': 10},
    'C': {}
}
```

## Daily Coding Problem: Problem #866 [Medium]

This problem was asked by Facebook.

Given an array of numbers representing the stock prices of a company in chronological order and an integer `k`, return the maximum profit you can make from `k` buys and sells. You must buy the stock before you can sell it, and you must sell the stock before you can buy it again.

For example, given `k` = 2 and the array `[5, 2, 4, 0, 1]`, you should return 3.

## Daily Coding Problem: Problem #867 [Easy]

This problem was asked by Google.

You are given an array of arrays of integers, where each array corresponds to a row in a triangle of numbers. For example, `[[1], [2, 3], [1, 5, 1]]` represents the triangle:

```
  1
 2 3
1 5 1
```

We define a path in the triangle to start at the top and go down one row at a time to an adjacent value, eventually ending with an entry on the bottom row. For example, 1 -> 3 -> 5. The weight of the path is the sum of the entries.

Write a program that returns the weight of the maximum weight path.

## Daily Coding Problem: Problem #868 [Easy]

This problem was asked by Amazon.

Given a string, determine whether any permutation of it is a palindrome.

For example, `carrace` should return true, since it can be rearranged to form `racecar`, which is a palindrome. `daily` should return false, since there's no rearrangement that can form a palindrome.

## Daily Coding Problem: Problem #869 [Easy]

This problem was asked by Google.

Determine whether a doubly linked list is a palindrome. What if it’s singly linked?

For example, `1 -> 4 -> 3 -> 4 -> 1` returns `True` while `1 -> 4` returns `False`.

## Daily Coding Problem: Problem #870 [Medium]

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

## Daily Coding Problem: Problem #871 [Hard]

This problem was asked by Grammarly.

[Soundex](https://en.wikipedia.org/wiki/Soundex) is an algorithm used to categorize phonetically, such that two names that sound alike but are spelled differently have the same representation.

Soundex maps every name to a string consisting of one letter and three numbers, like M460.

One version of the algorithm is as follows:

1. Remove consecutive consonants with the same sound (for example, change `ck -> c`).
2. Keep the first letter. The remaining steps only apply to the rest of the string.
3. Remove all vowels, including `y`, `w`, and `h`.
4. Replace all consonants with the following digits:
   - b, f, p, v → 1
   - c, g, j, k, q, s, x, z → 2
   - d, t → 3
   - l → 4
   - m, n → 5
   - r → 6
5. If you don't have three numbers yet, append zeros until you do. Keep the first three numbers.

Using this scheme, `Jackson` and `Jaxen` both map to `J250`.

Implement Soundex.

## Daily Coding Problem: Problem #872 [Medium]

This problem was asked by Dropbox.

Create an algorithm to efficiently compute the approximate median of a list of numbers.

More precisely, given an unordered list of `N` numbers, find an element whose rank is between `N / 4` and `3 * N / 4`, with a high level of certainty, in less than `O(N)` time.

## Daily Coding Problem: Problem #873 [Hard]

This problem was asked by Jane Street.

Given an arithmetic expression in [Reverse Polish Notation](https://en.wikipedia.org/wiki/Reverse_Polish_notation), write a program to evaluate it.

The expression is given as a list of numbers and operands. For example: `[5, 3, '+']` should return `5 + 3 = 8`.

For example, `[15, 7, 1, 1, '+', '-', '/', 3, '*', 2, 1, 1, '+', '+', '-']` should return `5`, since it is equivalent to ((15 / (7 - (1 + 1))) * 3) - (2 + (1 + 1)) = 5.

You can assume the given expression is always valid.

## Daily Coding Problem: Problem #874 [Hard]

This problem was asked by Amazon.

Given a string, find the longest palindromic contiguous substring. If there are more than one with the maximum length, return any one.

For example, the longest palindromic substring of "aabcdcb" is "bcdcb". The longest palindromic substring of "bananas" is "anana".

## Daily Coding Problem: Problem #875 [Hard]

This problem was asked by Google.

Suppose we represent our file system by a string in the following manner:

The string `"dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"` represents:

```
dir
    subdir1
    subdir2
        file.ext
```

The directory `dir` contains an empty sub-directory `subdir1` and a sub-directory `subdir2` containing a file `file.ext`.

The string `"dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"` represents:

```
dir
    subdir1
        file1.ext
        subsubdir1
    subdir2
        subsubdir2
            file2.ext
```

The directory `dir` contains two sub-directories `subdir1` and `subdir2`. `subdir1` contains a file `file1.ext` and an empty second-level sub-directory `subsubdir1`. `subdir2` contains a second-level sub-directory `subsubdir2` containing a file `file2.ext`.

We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is `"dir/subdir2/subsubdir2/file2.ext"`, and its length is 32 (not including the double quotes).

Given a string representing the file system in the above format, return the length of the longest absolute path to a file in the abstracted file system. If there is no file in the system, return 0.

Note:

The name of a file contains at least a period and an extension.

The name of a directory or sub-directory will not contain a period.

## Daily Coding Problem: Problem #876 [Medium]

This problem was asked by Palantir.

You are given a list of `N` numbers, in which each number is located at most `k` places away from its sorted position. For example, if `k = 1`, a given element at index `4` might end up at indices `3`, `4`, or `5`.

Come up with an algorithm that sorts this list in `O(N log k)` time.

## Daily Coding Problem: Problem #877 [Hard]

This problem was asked by Google.

Given two non-empty binary trees `s` and `t`, check whether tree `t` has exactly the same structure and node values with a subtree of `s`. A subtree of `s` is a tree consists of a node in `s` and all of this node's descendants. The tree `s` could also be considered as a subtree of itself.

## Daily Coding Problem: Problem #878 [Hard]

This problem was asked by Apple.

Given a tree, find the largest tree/subtree that is a BST.

Given a tree, return the size of the largest tree/subtree that is a BST.

## Daily Coding Problem: Problem #879 [Easy]

This problem was recently asked by Google.

Given a list of numbers and a number `k`, return whether any two numbers from the list add up to `k`.

For example, given `[10, 15, 3, 7]` and `k` of `17`, return true since `10 + 7` is `17`.

Bonus: Can you do this in one pass?

## Daily Coding Problem: Problem #880 [Hard]

This problem was asked by Google.

Given a string, split it into as few strings as possible such that each string is a palindrome.

For example, given the input string `racecarannakayak`, return `["racecar", "anna", "kayak"]`.

Given the input string `abc`, return `["a", "b", "c"]`.

## Daily Coding Problem: Problem #881 [Medium]

This problem was asked by Uber.

Implement a 2D iterator class. It will be initialized with an array of arrays, and should implement the following methods:

- `next()`: returns the next element in the array of arrays. If there are no more elements, raise an exception.
- `has_next()`: returns whether or not the iterator still has elements left.

For example, given the input [[1, 2], [3], [], [4, 5, 6]], calling `next()` repeatedly should output `1, 2, 3, 4, 5, 6`.

Do not use `flatten` or otherwise clone the arrays. Some of the arrays can be empty.

## Daily Coding Problem: Problem #882 [Hard]

This problem was asked by Airbnb.

An 8-puzzle is a game played on a 3 x 3 board of tiles, with the ninth tile missing. The remaining tiles are labeled 1 through 8 but shuffled randomly. Tiles may slide horizontally or vertically into an empty space, but may not be removed from the board.

Design a class to represent the board, and find a series of steps to bring the board to the state [[1, 2, 3], [4, 5, 6], [7, 8, None]].

## Daily Coding Problem: Problem #883 [Easy]

This problem was asked by PagerDuty.

Given a positive integer `N`, find the smallest number of steps it will take to reach `1`.

There are two kinds of permitted steps:

- You may decrement `N` to `N - 1`.
- If `a * b = N`, you may decrement `N` to the larger of `a` and `b`.

For example, given `100`, you can reach `1` in five steps with the following route: `100 -> 10 -> 9 -> 3 -> 2 -> 1`.

## Daily Coding Problem: Problem #884 [Easy]

This problem was asked by Two Sigma.

Using a function `rand7()` that returns an integer from 1 to 7 (inclusive) with uniform probability, implement a function `rand5()` that returns an integer from 1 to 5 (inclusive).

## Daily Coding Problem: Problem #885 [Hard]

This problem was asked by Google.

Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].

## Daily Coding Problem: Problem #886 [Easy]

This problem was asked by Google.

The edit distance between two strings refers to the minimum number of character insertions, deletions, and substitutions required to change one string to the other. For example, the edit distance between “kitten” and “sitting” is three: substitute the “k” for “s”, substitute the “e” for “i”, and append a “g”.

Given two strings, compute the edit distance between them.

## Daily Coding Problem: Problem #887 [Easy]

This problem was asked by Palantir.

The ancient Egyptians used to express fractions as a sum of several terms where each numerator is one. For example, `4 / 13` can be represented as `1 / 4 + 1 / 18 + 1 / 468`.

Create an algorithm to turn an ordinary fraction `a / b`, where `a < b`, into an Egyptian fraction.