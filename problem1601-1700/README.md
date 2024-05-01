## Daily Coding Problem: Problem #1693 [Easy]

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

## Daily Coding Problem: Problem #1692 [Easy]

This problem was asked by Microsoft.

Given a clock time in `hh:mm` format, determine, to the nearest degree, the angle between the hour and the minute hands.

Bonus: When, during the course of a day, will the angle be zero?

## Daily Coding Problem: Problem #1691 [Medium]

This problem was asked by Facebook.

Given an integer n, find the next biggest integer with the same number of 1-bits on. For example, given the number 6 (`0110` in binary), return 9 (`1001`).

## Daily Coding Problem: Problem #1690 [Easy]

This problem was asked by Facebook.

Boggle is a game played on a `4 x 4` grid of letters. The goal is to find as many words as possible that can be formed by a sequence of adjacent letters in the grid, using each cell at most once. Given a game board and a dictionary of valid words, implement a Boggle solver.

## Daily Coding Problem: Problem #1689 [Medium]

This problem was asked by Google.

Given a linked list, sort it in O(n log n) time and constant space.

For example, the linked list `4 -> 1 -> -3 -> 99` should become `-3 -> 1 -> 4 -> 99`.

## Daily Coding Problem: Problem #1688 [Medium]

This problem was asked by Jane Street.

`cons(a, b)` constructs a pair, and `car(pair)` and `cdr(pair)` returns the first and last element of that pair. For example, `car(cons(3, 4))` returns `3`, and `cdr(cons(3, 4))` returns `4`.

Given this implementation of cons:

```
def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
```

Implement `car` and `cdr`.

## Daily Coding Problem: Problem #1687 [Easy]

This problem was asked by Google.

Given the root of a binary tree, return a deepest node. For example, in the following tree, return d.

```
    a
   / \
  b   c
 /
d
```

## Daily Coding Problem: Problem #1686 [Hard]

Good morning! Here's your coding interview problem for today.

Given a list, sort it using this method: `reverse(lst, i, j)`, which reverses `lst` from `i` to `j`.

## Daily Coding Problem: Problem #1685 [Medium]

This problem was asked by Spotify.

You have access to ranked lists of songs for various users. Each song is represented as an integer, and more preferred songs appear earlier in each list. For example, the list `[4, 1, 7]` indicates that a user likes song `4` the best, followed by songs `1` and `7`.

Given a set of these ranked lists, interleave them to create a playlist that satisfies everyone's priorities.

For example, suppose your input is `{[1, 7, 3], [2, 1, 6, 7, 9], [3, 9, 5]}`. In this case a satisfactory playlist could be `[2, 1, 6, 7, 3, 9, 5]`.

## Daily Coding Problem: Problem #1684 [Easy]

This problem was asked by Google.

The edit distance between two strings refers to the minimum number of character insertions, deletions, and substitutions required to change one string to the other. For example, the edit distance between “kitten” and “sitting” is three: substitute the “k” for “s”, substitute the “e” for “i”, and append a “g”.

Given two strings, compute the edit distance between them.

## Daily Coding Problem: Problem #1683 [Easy]

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

## Daily Coding Problem: Problem #1682 [Medium]

This problem was asked by Google.

Given an undirected graph represented as an adjacency matrix and an integer k, write a function to determine whether each vertex in the graph can be colored such that no two adjacent vertices share the same color using at most k colors.

## Daily Coding Problem: Problem #1681 [Medium]

This problem was asked by Google.

Given a string of parentheses, write a function to compute the minimum number of parentheses to be removed to make the string valid (i.e. each open parenthesis is eventually closed).

For example, given the string "()())()", you should return 1. Given the string ")(", you should return 2, since we must remove all of them.

## Daily Coding Problem: Problem #1680 [Medium]

This problem was asked by Nvidia.

You are given a list of `N` points `(x``1``, y``1``)`, `(x``2``, y``2``)`, ..., `(x``N``, y``N``)` representing a polygon. You can assume these points are given in order; that is, you can construct the polygon by connecting point `1` to point `2`, point `2` to point `3`, and so on, finally looping around to connect point `N` to point `1`.

Determine if a new point `p` lies inside this polygon. (If `p` is on the boundary of the polygon, you should return `False`).

## Daily Coding Problem: Problem #1679 [Hard]

This problem was asked by Apple.

Given a tree, find the largest tree/subtree that is a BST.

Given a tree, return the size of the largest tree/subtree that is a BST.

## Daily Coding Problem: Problem #1678 [Medium]

This question was asked by ContextLogic.

Implement division of two positive integers without using the division, multiplication, or modulus operators. Return the quotient as an integer, ignoring the remainder.

## Daily Coding Problem: Problem #1677 [Easy]

This problem was asked by Google.

Determine whether a doubly linked list is a palindrome. What if it’s singly linked?

For example, `1 -> 4 -> 3 -> 4 -> 1` returns `True` while `1 -> 4` returns `False`.

## Daily Coding Problem: Problem #1676 [Easy]

This problem was asked by Google.

Implement a `PrefixMapSum` class with the following methods:

- `insert(key: str, value: int)`: Set a given key's value in the map. If the key already exists, overwrite the value.
- `sum(prefix: str)`: Return the sum of all values of keys that begin with a given prefix.

For example, you should be able to run the following code:

```
mapsum.insert("columnar", 3)
assert mapsum.sum("col") == 3

mapsum.insert("column", 2)
assert mapsum.sum("col") == 5
```

## Daily Coding Problem: Problem #1675 [Easy]

This problem was asked by Pandora.

Given an undirected graph, determine if it contains a cycle.

## Daily Coding Problem: Problem #1674 [Hard]

This problem was asked by Google.

Implement a file syncing algorithm for two computers over a low-bandwidth network. What if we know the files in the two computers are mostly the same?

## Daily Coding Problem: Problem #1673 [Hard]

This problem was asked by Citrix.

You are given a circular lock with three wheels, each of which display the numbers `0` through `9` in order. Each of these wheels rotate clockwise and counterclockwise.

In addition, the lock has a certain number of "dead ends", meaning that if you turn the wheels to one of these combinations, the lock becomes stuck in that state and cannot be opened.

Let us consider a "move" to be a rotation of a single wheel by one digit, in either direction. Given a lock initially set to `000`, a target combination, and a list of dead ends, write a function that returns the minimum number of moves required to reach the target state, or `None` if this is impossible.

## Daily Coding Problem: Problem #1672 [Hard]

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

## Daily Coding Problem: Problem #1671 [Medium]

This problem was asked by Google.

You are given an N by M 2D matrix of lowercase letters. Determine the minimum number of columns that can be removed to ensure that each row is ordered from top to bottom lexicographically. That is, the letter at each column is lexicographically later as you go down each row. It does not matter whether each row itself is ordered lexicographically.

For example, given the following table:

```
cba
daf
ghi
```

This is not ordered because of the a in the center. We can remove the second column to make it ordered:

```
ca
df
gi
```

So your function should return 1, since we only needed to remove 1 column.

As another example, given the following table:

```
abcdef
```

Your function should return 0, since the rows are already ordered (there's only one row).

As another example, given the following table:

```
zyx
wvu
tsr
```

Your function should return 3, since we would need to remove all the columns to order it.

## Daily Coding Problem: Problem #1670 [Medium]

This problem was asked by Lyft.

Given a list of integers and a number K, return which contiguous elements of the list sum to K.

For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4], since 2 + 3 + 4 = 9.

## Daily Coding Problem: Problem #1669 [Easy]

This problem was asked by Google.

Given a sorted list of integers, square the elements and give the output in sorted order.

For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].

## Daily Coding Problem: Problem #1668 [Easy]

This problem was asked by Microsoft.

A number is considered perfect if its digits sum up to exactly 10.

Given a positive integer `n`, return the `n`-th perfect number.

For example, given 1, you should return 19. Given 2, you should return 28.

## Daily Coding Problem: Problem #1667 [Hard]

This problem was asked by Airbnb.

We're given a hashmap associating each `courseId` key with a list of `courseIds` values, which represents that the prerequisites of `courseId` are `courseIds`. Return a sorted ordering of courses such that we can finish all courses.

Return null if there is no such ordering.

For example, given {'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []}, should return ['CSC100', 'CSC200', 'CSCS300'].

## Daily Coding Problem: Problem #1666 [Easy]

This problem was asked by Amazon.

Given `n` numbers, find the greatest common denominator between them.

For example, given the numbers `[42, 56, 14]`, return `14`.

## Daily Coding Problem: Problem #1665 [Medium]

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

## Daily Coding Problem: Problem #1664 [Easy]

This problem was asked by Twitter.

A permutation can be specified by an array `P`, where `P[i]` represents the location of the element at `i` in the permutation. For example, `[2, 1, 0]` represents the permutation where elements at the index `0` and `2` are swapped.

Given an array and a permutation, apply the permutation to the array. For example, given the array `["a", "b", "c"]` and the permutation `[2, 1, 0]`, return `["c", "b", "a"]`.

## Daily Coding Problem: Problem #1663 [Hard]

This problem was asked by Apple.

Given a linked list, uniformly shuffle the nodes. What if we want to prioritize space over time?

## Daily Coding Problem: Problem #1662 [Hard]

This problem was asked by Google.

Implement an LFU (Least Frequently Used) cache. It should be able to be initialized with a cache size `n`, and contain the following methods:

- `set(key, value)`: sets `key` to `value`. If there are already `n` items in the cache and we are adding a new item, then it should also remove the least frequently used item. If there is a tie, then the least recently used key should be removed.
- `get(key)`: gets the value at `key`. If no such key exists, return null.

Each operation should run in O(1) time.

## Daily Coding Problem: Problem #1661 [Medium]

This problem was asked by Triplebyte.

Implement a data structure which carries out the following operations without resizing the underlying array:

- `add(value)`: Add a value to the set of values.
- `check(value)`: Check whether a value is in the set.

The `check` method may return occasional false positives (in other words, incorrectly identifying an element as part of the set), but should always correctly identify a true element.

## Daily Coding Problem: Problem #1660 [Hard]

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

## Daily Coding Problem: Problem #1659 [Easy]

This problem was asked by WhatsApp.

Given an array of integers out of order, determine the bounds of the smallest window that must be sorted in order for the entire array to be sorted. For example, given `[3, 7, 5, 6, 9]`, you should return `(1, 3)`.

## Daily Coding Problem: Problem #1658 [Easy]

This problem was asked by Google.

You are given an array of arrays of integers, where each array corresponds to a row in a triangle of numbers. For example, `[[1], [2, 3], [1, 5, 1]]` represents the triangle:

```
  1
 2 3
1 5 1
```

We define a path in the triangle to start at the top and go down one row at a time to an adjacent value, eventually ending with an entry on the bottom row. For example, 1 -> 3 -> 5. The weight of the path is the sum of the entries.

Write a program that returns the weight of the maximum weight path.

## Daily Coding Problem: Problem #1657 [Easy]

This problem was asked by Airbnb.

Given a linked list and a positive integer `k`, rotate the list to the right by `k` places.

For example, given the linked list `7 -> 7 -> 3 -> 5` and `k = 2`, it should become `3 -> 5 -> 7 -> 7`.

Given the linked list `1 -> 2 -> 3 -> 4 -> 5` and `k = 3`, it should become `3 -> 4 -> 5 -> 1 -> 2`.

## Daily Coding Problem: Problem #1656 [Medium]

This problem was asked by Twitter.

Implement an autocomplete system. That is, given a query string `s` and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string `de` and the set of strings [`dog`, `deer`, `deal`], return [`deer`, `deal`].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

## Daily Coding Problem: Problem #1655 [Medium]

This problem was asked by Google.

What will this code print out?

```
def make_functions():
    flist = []

    for i in [1, 2, 3]:
        def print_i():
            print(i)
        flist.append(print_i)

    return flist

functions = make_functions()
for f in functions:
    f()
```

How can we make it print out what we apparently want?

## Daily Coding Problem: Problem #1654 [Hard]

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

## Daily Coding Problem: Problem #1653 [Easy]

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

## Daily Coding Problem: Problem #1652 [Medium]

This problem was asked by Quora.

Given a string, find the palindrome that can be made by inserting the fewest number of characters as possible anywhere in the word. If there is more than one palindrome of minimum length that can be made, return the lexicographically earliest one (the first one alphabetically).

For example, given the string "race", you should return "ecarace", since we can add three letters to it (which is the smallest amount to make a palindrome). There are seven other palindromes that can be made from "race" by adding three letters, but "ecarace" comes first alphabetically.

As another example, given the string "google", you should return "elgoogle".

## Daily Coding Problem: Problem #1651 [Hard]

This problem was asked by Apple.

You are going on a road trip, and would like to create a suitable music playlist. The trip will require `N` songs, though you only have `M` songs downloaded, where `M < N`. A valid playlist should select each song at least once, and guarantee a buffer of `B` songs between repeats.

Given `N`, `M`, and `B`, determine the number of valid playlists.

## Daily Coding Problem: Problem #1650 [Hard]

This problem was asked by Microsoft.

Recall that the minimum spanning tree is the subset of edges of a tree that connect all its vertices with the smallest possible total edge weight. Given an undirected graph with weighted edges, compute the *maximum* weight spanning tree.

## Daily Coding Problem: Problem #1649 [Easy]

This problem was asked by Dropbox.

Spreadsheets often use this alphabetical encoding for its columns: "A", "B", "C", ..., "AA", "AB", ..., "ZZ", "AAA", "AAB", ....

Given a column number, return its alphabetical column id. For example, given `1`, return "A". Given `27`, return "AA".

## Daily Coding Problem: Problem #1648 [Medium]

This problem was asked by Quora.

Given an absolute pathname that may have `.` or `..` as part of it, return the shortest standardized path.

For example, given "/usr/bin/../bin/./scripts/../", return "/usr/bin/".

## Daily Coding Problem: Problem #1647 [Medium]

This problem was asked by Square.

In front of you is a row of `N` coins, with values `v``1`, `v``1`, ..., `v``n`.

You are asked to play the following game. You and an opponent take turns choosing either the first or last coin from the row, removing it from the row, and receiving the value of the coin.

Write a program that returns the maximum amount of money you can win with certainty, if you move first, assuming your opponent plays optimally.

## Daily Coding Problem: Problem #1646 [Medium]

This problem was asked by Facebook.

Write a function that rotates a list by k elements. For example, `[1, 2, 3, 4, 5, 6]` rotated by two becomes `[3, 4, 5, 6, 1, 2]`. Try solving this without creating a copy of the list. How many swap or move operations do you need?

## Daily Coding Problem: Problem #1645 [Hard]

This problem was asked by Facebook.

Implement regular expression matching with the following special characters:

- `.` (period) which matches any single character
- `*` (asterisk) which matches zero or more of the preceding element

That is, implement a function that takes in a string and a valid regular expression and returns whether or not the string matches the regular expression.

For example, given the regular expression "ra." and the string "ray", your function should return true. The same regular expression on the string "raymond" should return false.

Given the regular expression ".*at" and the string "chat", your function should return true. The same regular expression on the string "chats" should return false.

## Daily Coding Problem: Problem #1644 [Easy]

This problem was asked by IBM.

Given an integer, find the next permutation of it in absolute order. For example, given `48975`, the next permutation would be `49578`.

## Daily Coding Problem: Problem #1643 [Easy]

This problem was asked by Facebook.

Given a 32-bit integer, return the number with its bits reversed.

For example, given the binary number `1111 0000 1111 0000 1111 0000 1111 0000`, return `0000 1111 0000 1111 0000 1111 0000 1111`.

## Daily Coding Problem: Problem #1642 [Hard]

Find an efficient algorithm to find the smallest distance (measured in number of words) between any two given words in a string.

For example, given words "hello", and "world" and a text content of "dog cat hello cat dog dog hello cat world", return 1 because there's only one word "cat" in between the two words.

## Daily Coding Problem: Problem #1641 [Easy]

This problem was asked by Amazon.

Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.

## Daily Coding Problem: Problem #1640 [Hard]

This problem was asked by Google.

You're given a string consisting solely of `(`, `)`, and `*`. `*` can represent either a `(`, `)`, or an empty string. Determine whether the parentheses are balanced.

For example, `(()*` and `(*)` are balanced. `)*(` is not balanced.

## Daily Coding Problem: Problem #1639 [Medium]

This problem was asked by Google.

We can determine how "out of order" an array A is by counting the number of inversions it has. Two elements `A[i]` and `A[j]` form an inversion if `A[i] > A[j]` but `i < j`. That is, a smaller element appears after a larger element.

Given an array, count the number of inversions it has. Do this faster than O(N^2) time.

You may assume each element in the array is distinct.

For example, a sorted list has zero inversions. The array [2, 4, 1, 3, 5] has three inversions: (2, 1), (4, 1), and (4, 3). The array [5, 4, 3, 2, 1] has ten inversions: every distinct pair forms an inversion.

## Daily Coding Problem: Problem #1638 [Easy]

This problem was asked by Google.

Given the head of a singly linked list, swap every two nodes and return its head.

For example, given `1 -> 2 -> 3 -> 4`, return `2 -> 1 -> 4 -> 3`.

## Daily Coding Problem: Problem #1637 [Hard]

This problem was asked by Netflix.

Given a sorted list of integers of length `N`, determine if an element `x` is in the list without performing any multiplication, division, or bit-shift operations.

Do this in `O(log N)` time.

## Daily Coding Problem: Problem #1636 [Hard]

This problem was asked by Google.

Given a string which we can delete at most k, return whether you can make a palindrome.

For example, given 'waterrfetawx' and a k of 2, you could delete f and x to get 'waterretaw'.

## Daily Coding Problem: Problem #1635 [Hard]

This problem was asked by Microsoft.

Let X be a set of n intervals on the real line. We say that a set of points P "stabs" X if every interval in X contains at least one point in P. Compute the smallest set of points that stabs X.

For example, given the intervals `[(1, 4), (4, 5), (7, 9), (9, 12)]`, you should return `[4, 9]`.

## Daily Coding Problem: Problem #1634 [Medium]

This problem was asked by Facebook.

Given a `start` word, an `end` word, and a dictionary of valid words, find the shortest transformation sequence from `start` to `end` such that only one letter is changed at each step of the sequence, and each transformed word exists in the dictionary. If there is no possible transformation, return null. Each word in the dictionary have the same length as `start` and `end` and is lowercase.

For example, given `start = "dog"`, `end = "cat"`, and `dictionary = {"dot", "dop", "dat", "cat"}`, return `["dog", "dot", "dat", "cat"]`.

Given `start = "dog"`, `end = "cat"`, and `dictionary = {"dot", "tod", "dat", "dar"}`, return null as there is no possible transformation from `dog` to `cat`.

## Daily Coding Problem: Problem #1633 [Medium]

This problem was asked by Facebook.

Given three 32-bit integers x, y, and b, return x if b is 1 and y if b is 0, using only mathematical or bit operations. You can assume b can only be 1 or 0.

## Daily Coding Problem: Problem #1632 [Hard]

This problem was asked by Microsoft.

Given an array of positive integers, divide the array into two subsets such that the difference between the sum of the subsets is as small as possible.

For example, given `[5, 10, 15, 20, 25]`, return the sets `{10, 25}` and `{5, 15, 20}`, which has a difference of 5, which is the smallest possible difference.

## Daily Coding Problem: Problem #1631 [Medium]

This problem was asked by LinkedIn.

Determine whether a tree is a valid binary search tree.

A binary search tree is a tree with two children, `left` and `right`, and satisfies the constraint that the key in the `left` child must be less than or equal to the root and the key in the `right` child must be greater than or equal to the root.

## Daily Coding Problem: Problem #1630 [Medium]

This problem was asked by Facebook.

Given a binary tree, return all paths from the root to leaves.

For example, given the tree:

```
   1
  / \
 2   3
    / \
   4   5
```

Return `[[1, 2], [1, 3, 4], [1, 3, 5]]`.

## Daily Coding Problem: Problem #1629 [Medium]

This problem was asked by Amazon.

Given a pivot `x`, and a list `lst`, partition the list into three parts.

- The first part contains all elements in `lst` that are less than `x`
- The second part contains all elements in `lst` that are equal to `x`
- The third part contains all elements in `lst` that are larger than `x`

Ordering within a part can be arbitrary.

For example, given `x = 10` and `lst = [9, 12, 3, 5, 14, 10, 10]`, one partition may be `[9, 3, 5, 10, 10, 12, 14]`.

## Daily Coding Problem: Problem #1628 [Medium]

This problem was asked by Facebook.

Given an N by N matrix, rotate it by 90 degrees clockwise.

For example, given the following matrix:

```
[[1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]]
```

you should return:

```
[[7, 4, 1],
 [8, 5, 2],
 [9, 6, 3]]
```

Follow-up: What if you couldn't use any extra space?

## Daily Coding Problem: Problem #1627 [Easy]

This problem was asked by Facebook.

Given a function `f`, and `N` return a debounced `f` of `N` milliseconds.

That is, as long as the debounced `f` continues to be invoked, `f` itself will not be called for `N` milliseconds.

## Daily Coding Problem: Problem #1626 [Easy]

This problem was asked by Microsoft.

Let's represent an integer in a linked list format by having each node represent a digit in the number. The nodes make up the number in reversed order.

For example, the following linked list:

```
1 -> 2 -> 3 -> 4 -> 5
```

is the number 54321.

Given two linked lists in this format, return their sum in the same linked list format.

For example, given

```
9 -> 9
5 -> 2
```

return 124 (99 + 25) as:

```
4 -> 2 -> 1
```

## Daily Coding Problem: Problem #1625 [Medium]

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

## Daily Coding Problem: Problem #1624 [Medium]

This problem was asked by Salesforce.

The number 6174 is known as Kaprekar's contant, after the mathematician who discovered an associated property: for all four-digit numbers with at least two distinct digits, repeatedly applying a simple procedure eventually results in this value. The procedure is as follows:

- For a given input `x`, create two new numbers that consist of the digits in `x` in ascending and descending order.
- Subtract the smaller number from the larger number.

For example, this algorithm terminates in three steps when starting from `1234`:

- `4321 - 1234 = 3087`
- `8730 - 0378 = 8352`
- `8532 - 2358 = 6174`

Write a function that returns how many steps this will take for a given input `N`.

## Daily Coding Problem: Problem #1623 [Medium]

This problem was asked by Google.

You are given a set of synonyms, such as `(big, large)` and `(eat, consume)`. Using this set, determine if two sentences with the same number of words are equivalent.

For example, the following two sentences are equivalent:

- "He wants to eat food."
- "He wants to consume food."

Note that the synonyms `(a, b)` and `(a, c)` do not necessarily imply `(b, c)`: consider the case of `(coach, bus)` and `(coach, teacher)`.

Follow-up: what if we can assume that `(a, b)` and `(a, c)` do in fact imply `(b, c)`?

## Daily Coding Problem: Problem #1622 [Hard]

This problem was asked by Amazon.

Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

## Daily Coding Problem: Problem #1621 [Easy]

This problem was asked by Google.

A regular number in mathematics is defined as one which evenly divides some power of `60`. Equivalently, we can say that a regular number is one whose only prime divisors are `2`, `3`, and `5`.

These numbers have had many applications, from helping ancient Babylonians keep time to tuning instruments according to the diatonic scale.

Given an integer `N`, write a program that returns, in order, the first `N` regular numbers.

## Daily Coding Problem: Problem #1620 [Hard]

This problem was asked by Dropbox.

Sudoku is a puzzle where you're given a partially-filled 9 by 9 grid with digits. The objective is to fill the grid with the constraint that every row, column, and box (3 by 3 subgrid) must contain all of the digits from 1 to 9.

Implement an efficient sudoku solver.

## Daily Coding Problem: Problem #1619 [Hard]

This problem was asked by Google.

Given two non-empty binary trees `s` and `t`, check whether tree `t` has exactly the same structure and node values with a subtree of `s`. A subtree of `s` is a tree consists of a node in `s` and all of this node's descendants. The tree `s` could also be considered as a subtree of itself.

## Daily Coding Problem: Problem #1618 [Easy]

This problem was asked by Zillow.

Let's define a "sevenish" number to be one which is either a power of `7`, or the sum of unique powers of `7`. The first few sevenish numbers are `1`, `7`, `8`, `49`, and so on. Create an algorithm to find the `n`th sevenish number.

## Daily Coding Problem: Problem #1617 [Easy]

This problem was asked by Microsoft.

You are given an string representing the initial conditions of some dominoes. Each element can take one of three values:

- `L`, meaning the domino has just been pushed to the left,
- `R`, meaning the domino has just been pushed to the right, or
- `.`, meaning the domino is standing still.

Determine the orientation of each tile when the dominoes stop falling. Note that if a domino receives a force from the left and right side simultaneously, it will remain upright.

For example, given the string `.L.R....L`, you should return `LL.RRRLLL`.

Given the string `..R...L.L`, you should return `..RR.LLLL`.

## Daily Coding Problem: Problem #1616 [Easy]

This problem was asked by Alibaba.

Given an even number (greater than 2), return two prime numbers whose sum will be equal to the given number.

A solution will always exist. See [Goldbach’s conjecture](https://en.wikipedia.org/wiki/Goldbach's_conjecture).

Example:

```
Input: 4
Output: 2 + 2 = 4
```

If there are more than one solution possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b, and [c, d] is another solution with c <= d, then

```
[a, b] < [c, d]
```

If a < c OR a==c AND b < d.

## Daily Coding Problem: Problem #1615 [Easy]

This problem was asked by Amazon.

Given an array and a number `k` that's smaller than the length of the array, rotate the array to the right `k` elements in-place.

## Daily Coding Problem: Problem #1614 [Medium]

This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

## Daily Coding Problem: Problem #1613 [Hard]

This problem was asked by VMware.

The skyline of a city is composed of several buildings of various widths and heights, possibly overlapping one another when viewed from a distance. We can represent the buildings using an array of `(left, right, height)` tuples, which tell us where on an imaginary x-axis a building begins and ends, and how tall it is. The skyline itself can be described by a list of `(x, height)` tuples, giving the locations at which the height visible to a distant observer changes, and each new height.

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

## Daily Coding Problem: Problem #1612 [Hard]

This problem was asked by Etsy.

Given a sorted array, convert it into a height-balanced binary search tree.

## Daily Coding Problem: Problem #1611 [Easy]

This problem was asked by Yahoo.

You are given a string of length `N` and a parameter `k`. The string can be manipulated by taking one of the first `k` letters and moving it to the end.

Write a program to determine the lexicographically smallest string that can be created after an unlimited number of moves.

For example, suppose we are given the string `daily` and `k = 1`. The best we can create in this case is `ailyd`.

## Daily Coding Problem: Problem #1610 [Medium]

This problem was asked by Facebook.

Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.

## Daily Coding Problem: Problem #1609 [Hard]

This problem was asked by Twitter.

You are given an array of length `24`, where each element represents the number of new subscribers during the corresponding hour. Implement a data structure that efficiently supports the following:

- `update(hour: int, value: int)`: Increment the element at index `hour` by `value`.
- `query(start: int, end: int)`: Retrieve the number of subscribers that have signed up between `start` and `end` (inclusive).

You can assume that all values get cleared at the end of the day, and that you will not be asked for `start` and `end` values that wrap around midnight.

## Daily Coding Problem: Problem #1608 [Medium]

This problem was asked by Microsoft.

Write a program to determine how many distinct ways there are to create a max heap from a list of `N` given integers.

For example, if `N = 3`, and our integers are `[1, 2, 3]`, there are two ways, shown below.

```
  3      3
 / \    / \
1   2  2   1
```

## Daily Coding Problem: Problem #1607 [Easy]

This problem was asked by Bloomberg.

Determine whether there exists a one-to-one character mapping from one string `s1` to another `s2`.

For example, given `s1 = abc` and `s2 = bcd`, return `true` since we can map `a` to `b`, `b` to `c`, and `c` to `d`.

Given `s1 = foo` and `s2 = bar`, return `false` since the `o` cannot map to two characters.

## Daily Coding Problem: Problem #1606 [Easy]

This problem was asked by PayPal.

Given a binary tree, determine whether or not it is height-balanced. A height-balanced binary tree can be defined as one in which the heights of the two subtrees of any node never differ by more than one.

## Daily Coding Problem: Problem #1605 [Easy]

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

## Daily Coding Problem: Problem #1604 [Easy]

This problem was asked by Oracle.

Given a binary search tree, find the floor and ceiling of a given integer. The floor is the highest element in the tree less than or equal to an integer, while the ceiling is the lowest element in the tree greater than or equal to an integer.

If either value does not exist, return None.

## Daily Coding Problem: Problem #1603 [Easy]

This problem was asked by Pivotal.

Write an algorithm that finds the total number of set bits in all integers between `1` and `N`.

## Daily Coding Problem: Problem #1602 [Medium]

This problem was asked by LinkedIn.

You are given a string consisting of the letters `x` and `y`, such as `xyxxxyxyy`. In addition, you have an operation called `flip`, which changes a single `x` to `y` or vice versa.

Determine how many times you would need to apply this operation to ensure that all `x`'s come before all `y`'s. In the preceding example, it suffices to flip the second and sixth characters, so you should return `2`.

## Daily Coding Problem: Problem #1601 [Easy]

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
