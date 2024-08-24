# Daily Coding Problem

One problem a day. This repository contains solutions to problems sent by [dailycodingproblem.com](dailycodingproblem.com).

Now lets go through the problems.

## Problems

### Problem 1 (Easy)

> This problem was recently asked by Google.

Given a list of numbers and a number `k`, return whether any two numbers from the list add up to `k`.

For example, given `[10, 15, 3, 7]` and `k` of `17`, return `true` since `10 + 7` is `17`.

Bonus: Can you do this in one pass?

[Solution](https://k5kc.com/cs/algorithms/2sum-problem/)

---

### Problem 2 (Hard)

> This problem was asked by Uber

Given an array of integers, return a new array such that each element at index `i` of the new array is the product of all the numbers in the original array except the one at `i`.

For example, if our input was `[1, 2, 3, 4, 5]`, the expected output would be `[120, 60, 40, 30, 24]`. If our input was `[3, 2, 1]`, the expected output would be `[2, 3, 6]`.

Follow-up: what if you can't use division?

[Solution](https://k5kc.com/cs/algorithms/product-of-array-except-self/)

---

### Problem 3 (Medium)

> This problem was recently asked by Google.

Given the root to a binary tree, implement `serialize(root)`, which serializes the tree into a string, and `deserialize(s)`, which deserializes the string back into the tree.

For example, given the following `Node` class

```python
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
```

The following test should pass:

```python
node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'
```

[Solution](https://k5kc.com/cs/algorithms/serialize-and-deserialize-binary-tree/)

---

### Problem 4 (Hard)

> This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input `[3, 4, -1, 1]` should give `2`. The input `[1, 2, 0]` should give `3`.

You can modify the input array in-place.

[Solution](https://k5kc.com/cs/algorithms/first-missing-positive-problem/)

---

### Problem 5 (Medium)

> This problem was asked by Jane Street.

`cons(a, b)` constructs a pair, and `car(pair)` and `cdr(pair)` returns the first and last element of that pair. For example, `car(cons(3, 4))` returns `3`, and `cdr(cons(3, 4))` returns `4`.

Given this implementation of cons:

```python
def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
```

Implement `car` and `cdr`.

[Solution](https://k5kc.com/cs/pl/problems/implementing-car-and-cdr-functions-for-pair-construction/)

---

### Problem 6 (Hard)

> This problem was asked by Google.

An XOR linked list is a more memory efficient doubly linked list. Instead of each node holding `next` and `prev` fields, it holds a field named `both`, which is an XOR of the next node and the previous node. Implement an XOR linked list; it has an `add(element)` which adds the element to the end, and a `get(index)` which returns the node at index.

If using a language that has no pointers (such as Python), you can assume you have access to `get_pointer` and `dereference_pointer` functions that converts between nodes and memory addresses.

[Solution](https://k5kc.com/cs/algorithms/xor-doubly-linked-list/)

---

### Problem 7 (Medium)

> This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

[Solution](https://k5kc.com/cs/algorithms/decode-ways-problem/)

---

### Problem 8 (Easy)

> This problem was asked by Google.

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

```
   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
```

[Solution](https://k5kc.com/cs/algorithms/count-univalue-subtrees-problem/)

---

### Problem 9 (Hard)

> This problem was asked by Airbnb.

This problem was asked by Airbnb.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be `0` or negative.

For example, `[2, 4, 6, 2, 5]` should return `13`, since we pick `2`, `6`, and `5`. `[5, 1, 1, 5]` should return `10`, since we pick `5` and `5`.

Follow-up: Can you do this in O(N) time and constant space?

[Solution](https://k5kc.com/cs/algorithms/house-robber-1/)

---

### Problem 10 (Medium)

> This problem was asked by Apple.

Implement a job scheduler which takes in a function `f` and an integer `n`, and calls `f` after `n` milliseconds.

[Solution](https://k5kc.com/cs/pl/problems/implement-job-scheduler-with-delay-function-execution/)

---

### Problem 11 (Medium)

> This problem was asked by Twitter.

Implement an autocomplete system. That is, given a query string `s` and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string `de` and the set of strings [`dog`, `deer`, `deal`], return [`deer`, `deal`].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

[Solution](https://k5kc.com/cs/algorithms/autocomplete-suggestion-system/)

---

### Problem 12 (Hard)

> This problem was asked by Amazon.

There exists a staircase with N steps, and you can climb up either 1  or 2 steps at a time. Given N, write a function that returns the number  of unique ways you can climb the staircase. The order of the steps  matters. For example, if N is 4, then there are 5 unique ways:

```
1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2
```

What if, instead of being able to climb 1 or 2 steps at a time, you  could climb any number from a set of positive integers X? For example,  if `X = {1, 3, 5}`, you could climb 1, 3, or 5 steps at a time.

[Solution](https://k5kc.com/cs/algorithms/climbing-stairs-problem-1-take-atmost-2-steps/)

---

### Problem 13 (Hard)

> This problem was asked by Amazon.

Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters. For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

[Solution](https://k5kc.com/cs/algorithms/longest-substring-with-at-most-k-distinct-characters/)

---

### Problem 14 (Medium)

> This problem was asked by Google.

The area of a circle is defined as `πr^2`. Estimate `π` to 3 decimal places using a Monte Carlo method. Hint: The basic equation of a circle is `x^2 + y^2 = r^2`.

[Solution](https://k5kc.com/cs/algorithms/estimating-the-value-of-pi-using-monte-carlo-method/)

### Problem 15 (Medium)

> This problem was asked by Facebook.

Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.

[Solution](https://k5kc.com/cs/algorithms/reservoir-sampling-explained/)

### Problem 16 (Easy)

> This problem was asked by Twitter.

You run an e-commerce website and want to record the last `N` `order` ids in a log. Implement a data structure to accomplish this, with the following API:

- record(order_id): adds the order_id to the log
- get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.

You should be as efficient with time and space as possible.

[Solution](https://k5kc.com/cs/algorithms/design-log-order-records/)

### Problem 17 (Hard)

> This problem was asked by Google.

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

[Solution](https://k5kc.com/cs/algorithms/longest-absolute-file-path-problem/)

### Problem 18 (Hard)

> This problem was asked by Google.

Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

- 10 = max(10, 5, 2)
- 7 = max(5, 2, 7)
- 8 = max(2, 7, 8)
- 8 = max(7, 8, 7)

Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.

[Solution](https://k5kc.com/cs/algorithms/sliding-window-maximum-problem/)

### Problem 19 (Medium)

> This problem was asked by Facebook.

A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.

[Solution](https://k5kc.com/cs/algorithms/paint-house-2-n-houses-with-k-colors-with-no-two-adjacent-houses-with-same-color/)

### Problem 20 (Easy)

> This problem was asked by Google.

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.

[Solution](https://k5kc.com/cs/algorithms/intersection-of-two-linked-lists-problem/)

### Problem 21 (Easy)

> This problem was asked by Snapchat.

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

[Solution](https://k5kc.com/cs/algorithms/meeting-rooms-2-minimum-meeting-rooms-required/).

### Problem 22 (Medium)

> This problem was asked by Microsoft.

Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list. If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.

For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

[Solution](https://k5kc.com/cs/algorithms/word-break-2-construct-a-sentence/)

---

### Problem 23 (Easy)

> This problem was asked by Google.

You are given an M by N matrix consisting of booleans that represents a board. Each True boolean represents a wall. Each False boolean represents a tile you can walk on.

Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps required to reach the end coordinate from the start. If there is no possible path, then return null. You can move up, left, down, and right. You cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:

```python
[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]
```

and start = `(3, 0)` (bottom left) and end = `(0, 0)` (top left), the minimum number of steps required to reach the end is 7, since we would need to go through `(1, 2)` because there is a wall everywhere else on the second row.

[Solution](https://k5kc.com/cs/algorithms/find-the-shortest-path-between-2-cells-in-boolean-maze/)

---

### Problem 24 (Medium)

> This problem was asked by Google.

Implement locking in a binary tree. A binary tree node can be locked or unlocked only if all of its descendants or ancestors are not locked.

Design a binary tree node class with the following methods:

- `is_locked`, which returns whether the node is locked
- `lock`, which attempts to lock the node. If it cannot be locked, then it should return false. Otherwise, it should lock it and return true.
- `unlock`, which unlocks the node. If it cannot be unlocked, then it should return false. Otherwise, it should unlock it and return true.

You may augment the node to add parent pointers or any other property you would like. You may assume the class is used in a single-threaded program, so there is no need for actual locks or mutexes. Each method should run in O(h), where h is the height of the tree.

[Solution](https://k5kc.com/cs/algorithms/locking-and-unlocking-resources-represented-as-binary-tree-nodes/)

---

### Problem 25 (Hard)

> This problem was asked by Facebook.

Implement regular expression matching with the following special characters:

- `.` (period) which matches any single character
- `*` (asterisk) which matches zero or more of the preceding element

That is, implement a function that takes in a string and a valid regular expression and returns whether or not the string matches the regular expression.

For example, given the regular expression "ra." and the string "ray", your function should return true. The same regular expression on the string "raymond" should return false.

Given the regular expression ".*at" and the string "chat", your function should return true. The same regular expression on the string "chats" should return false.

[Solution](https://k5kc.com/cs/algorithms/regular-expression-matching-problem/)

---

### Problem 26 (Medium)

> This problem was asked by Google.

Given a singly linked list and an integer k, remove the kth last element from the list. k is guaranteed to be smaller than the length of the list.

The list is very long, so making more than one pass is prohibitively expensive.

Do this in constant space and in one pass.

[Solution](https://k5kc.com/cs/algorithms/remove-nth-node-from-end-of-list/)

---

### Problem 27 (Easy)

> This problem was asked by Facebook.

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.

[Solution](https://k5kc.com/cs/algorithms/valid-parentheses-problem/)

---

### Problem 28 (Medium)

> This problem was asked by Palantir.

Write an algorithm to justify text. Given a sequence of words and an integer line length k, return a list of strings which represents each line, fully justified.

More specifically, you should have as many words as possible in each line. There should be at least one space between each word. Pad extra spaces when necessary so that each line has exactly length k. Spaces should be distributed as equally as possible, with the extra spaces, if any, distributed starting from the left.

If you can only fit one word on a line, then you should pad the right-hand side with spaces.

Each word is guaranteed not to be longer than k.

For example, given the list of words ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"] and k = 16, you should return the following:

["the  quick brown", # 1 extra space on the left
"fox  jumps  over", # 2 extra spaces distributed evenly
"the   lazy   dog"] # 4 extra spaces distributed evenly

[Solution](https://k5kc.com/cs/algorithms/text-justification-problem/)

---

### Problem 29 (Easy)

> This problem was asked by Amazon.

Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.

[Solution](https://k5kc.com/cs/algorithms/run-length-encoding/)

---

### Problem 30 (Medium)

> This problem was asked by Facebook.

You are given an array of non-negative integers that represents a two-dimensional elevation map where each element is unit-width wall and the integer is the height. Suppose it will rain and all spots between two walls get filled up.

Compute how many units of water remain trapped on the map in O(N) time and O(1) space.

For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.

Given the input [3, 0, 1, 3, 0, 5], we can hold 3 units in the first index, 2 in the second, and 3 in the fourth index (we cannot hold 5 since it would run off to the left), so we can trap 8 units of water.

[Solution](https://k5kc.com/cs/algorithms/trapping-rain-water-problem/)

---

### Problem 31 (Easy)

> This problem was asked by Google.

The edit distance between two strings refers to the minimum number of character insertions, deletions, and substitutions required to change one string to the other. For example, the edit distance between “kitten” and “sitting” is three: substitute the “k” for “s”, substitute the “e” for “i”, and append a “g”.

Given two strings, compute the edit distance between them.

[Solution](https://k5kc.com/cs/algorithms/edit-distance-problem/)

---

### Problem 32 (Hard)

> This problem was asked by Jane Street.

Suppose you are given a table of currency exchange rates, represented as a 2D array. Determine whether there is a possible arbitrage: that is, whether there is some sequence of trades you can make, starting with some amount A of any currency, so that you can end up with some amount greater than A of that currency.

There are no transaction costs and you can trade fractional quantities.

[Solution](https://k5kc.com/cs/algorithms/check-currency-arbitrage-with-bellman-ford/)

---

### Problem 33 (Easy)

> This problem was asked by Microsoft.

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

[Solution](https://k5kc.com/cs/algorithms/find-median-from-data-stream/)

---

### Problem 34 (Medium)

> This problem was asked by Quora.

Given a string, find the palindrome that can be made by inserting the fewest number of characters as possible anywhere in the word. If there is more than one palindrome of minimum length that can be made, return the lexicographically earliest one (the first one alphabetically).

For example, given the string "race", you should return "ecarace", since we can add three letters to it (which is the smallest amount to make a palindrome). There are seven other palindromes that can be made from "race" by adding three letters, but "ecarace" comes first alphabetically.

As another example, given the string "google", you should return "elgoogle".

[Solution](https://k5kc.com/cs/algorithms/minimum-insertion-steps-to-make-a-string-palindrome-problem/)

---

### Problem 35 (Hard)

> This problem was asked by Google.

Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].

[Solution](https://k5kc.com/cs/algorithms/dutch-national-flag-dnf-problem/)

---

### Problem 36 (Medium)

> This problem was asked by Dropbox.

Given the root to a binary search tree, find the second largest node in the tree.

[Solution](https://k5kc.com/cs/algorithms/second-largest-element-in-binary-search-tree/)

---

### Problem 37 (Easy)

> This problem was asked by Google.

The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.

For example, given the set `{1, 2, 3}`, it should return `{{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}`.

You may also use a list or array to represent a set.

[Solution](https://k5kc.com/cs/algorithms/subsets-1-problem/)

---

### Problem 38 (Hard)

> This problem was asked by Microsoft.

You have an N by N board. Write a function that, given N, returns the number of possible arrangements of the board where N queens can be placed on the board without threatening each other, i.e. no two queens share the same row, column, or diagonal.

[Solution](https://k5kc.com/cs/algorithms/n-queens-problem/)

---

### Problem 39 (Medium)

> This problem was asked by Dropbox.

Conway's Game of Life takes place on an infinite two-dimensional board of square cells. Each cell is either dead or alive, and at each tick, the following rules apply:

- Any live cell with less than two live neighbours dies.
- Any live cell with two or three live neighbours remains living.
- Any live cell with more than three live neighbours dies.
- Any dead cell with exactly three live neighbours becomes a live cell.

A cell neighbours another cell if it is horizontally, vertically, or diagonally adjacent.

Implement Conway's Game of Life. It should be able to be initialized with a starting list of live cell coordinates and the number of steps it should run for. Once initialized, it should print out the board state at each step. Since it's an infinite board, print out only the relevant coordinates, i.e. from the top-leftmost live cell to bottom-rightmost live cell.

You can represent a live cell with an asterisk (`*`) and a dead cell with a dot (`.`).

[Solution](https://k5kc.com/cs/algorithms/game-of-life-problem/)

### Problem 40 (Hard)

> This problem was asked by Google.

Given an array of integers where every integer occurs three times except for one integer, which only occurs once, find and return the non-duplicated integer.

For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.

Do this in O(N) time and O(1) space.

[Solution](https://k5kc.com/cs/algorithms/single-number-2-all-elements-except-one-occur-thrice/)

### Problem 41 (Medium)

> This problem was asked by Facebook.

Given an unordered list of flights taken by someone, each represented as (origin, destination) pairs, and a starting airport, compute the person's itinerary. If no such itinerary exists, return null. If there are multiple possible itineraries, return the lexicographically smallest one. All flights must be used in the itinerary.

For example, given the list of flights [('SFO', 'HKO'), ('YYZ', 'SFO'), ('YUL', 'YYZ'), ('HKO', 'ORD')] and starting airport 'YUL', you should return the list ['YUL', 'YYZ', 'SFO', 'HKO', 'ORD'].

Given the list of flights [('SFO', 'COM'), ('COM', 'YYZ')] and starting airport 'COM', you should return null.

Given the list of flights [('A', 'B'), ('A', 'C'), ('B', 'C'), ('C', 'A')] and starting airport 'A', you should return the list ['A', 'B', 'C', 'A', 'C'] even though ['A', 'C', 'A', 'B', 'C'] is also a valid itinerary. However, the first one is lexicographically smaller.

[Solution](https://k5kc.com/cs/algorithms/reconstruct-itinerary-problem/)

### Problem 42 (Hard)

> This problem was asked by Google.

Given a list of integers S and a target number k, write a function that returns a subset of S that adds up to k. If such a subset cannot be made, then return null.

Integers can appear more than once in the list. You may assume all numbers in the list are positive.

For example, given S = [12, 1, 61, 5, 9, 2] and k = 24, return [12, 9, 2, 1] since it sums up to 24.

[Solution](https://k5kc.com/cs/algorithms/subarray-sum-equals-k-problem/)

### Problem 43 (Easy)

> This problem was asked by Amazon.

Implement a stack that has the following methods:

- push(val), which pushes an element onto the stack
- pop(), which pops off and returns the topmost element of the stack. If there are no elements in the stack, then it should throw an error or return null.
- max(), which returns the maximum value in the stack currently. If there are no elements in the stack, then it should throw an error or return null.

Each method should run in constant time.

[Solution](https://k5kc.com/cs/algorithms/max-stack-problem/)

### Problem 44 (Medium)

> This problem was asked by Google.

We can determine how "out of order" an array A is by counting the number of inversions it has. Two elements `A[i]` and `A[j]` form an inversion if `A[i] > A[j]` but `i < j`. That is, a smaller element appears after a larger element.

Given an array, count the number of inversions it has. Do this faster than O(N^2) time.

You may assume each element in the array is distinct.

For example, a sorted list has zero inversions. The array [2, 4, 1, 3, 5] has three inversions: (2, 1), (4, 1), and (4, 3). The array [5, 4, 3, 2, 1] has ten inversions: every distinct pair forms an inversion.

[Solution](https://k5kc.com/cs/algorithms/count-inversions-count-smaller-on-right/)

### Problem 45 (Easy)

> This problem was asked by Two Sigma.

Using a function `rand5()` that returns an integer from 1 to 5 (inclusive) with uniform probability, implement a function `rand7()` that returns an integer from 1 to 7 (inclusive).

[Solution](https://k5kc.com/cs/algorithms/implement-rand7-using-rand5-/)

### Problem 46 (Hard)

> This problem was asked by Amazon.

Given a string, find the longest palindromic contiguous substring. If there are more than one with the maximum length, return any one.

For example, the longest palindromic substring of "aabcdcb" is "bcdcb". The longest palindromic substring of "bananas" is "anana".

[Solution](https://k5kc.com/cs/algorithms/longest-palindromic-substring-problem/)

### Problem 47 (Easy)

> This problem was asked by Facebook.

Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.

For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.

[Solution](https://k5kc.com/cs/algorithms/best-time-to-buy-and-sell-stock-1-only-one-transaction/)

### Problem 48 (Medium)

> This problem was asked by Google.

Given pre-order and in-order traversals of a binary tree, write a function to reconstruct the tree.

For example, given the following preorder traversal:

[a, b, d, e, c, f, g]

And the following inorder traversal:

[d, b, e, a, f, c, g]

You should return the following tree:

```java
    a
   / \
  b   c
 / \ / \
d  e f  g
```

[Solution](https://k5kc.com/cs/algorithms/construct-binary-tree-from-inorder-and-preorder-traversal/)

### Problem 49 (Medium)

> This problem was asked by Amazon.

Given an array of numbers, find the maximum sum of any contiguous subarray of the array.

For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.

Given the array [-5, -1, -8, -9], the maximum sum would be 0, since we would not take any elements.

Do this in O(N) time.

[Solution](https://k5kc.com/cs/algorithms/maximum-subarray-sum/)

### Problem 50 (Easy)

> This problem was asked by Microsoft.

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

[Solution](https://k5kc.com/cs/algorithms/evaluation-of-arithmetic-expression-tree/)

---

### Problem 51 (Medium)

> This problem was asked by Facebook.

Given a function that generates perfectly random numbers between 1 and k (inclusive), where k is an input, write a function that shuffles a deck of cards represented as an array using only swaps.

It should run in O(N) time.

Hint: Make sure each one of the 52! permutations of the deck is equally likely.

[Solution](https://k5kc.com/cs/algorithms/fisher-yates-shuffle/)

---

### Problem 52 (Hard)

> This problem was asked by Google.

Implement an LRU (Least Recently Used) cache. It should be able to be initialized with a cache size `n`, and contain the following methods:

- `set(key, value)`: sets `key` to `value`. If there are already `n` items in the cache and we are adding a new item, then it should also remove the least recently used item.
- `get(key)`: gets the value at `key`. If no such key exists, return null.

Each operation should run in O(1) time.

[Solution](https://k5kc.com/cs/algorithms/design-lru-cache/)

---

### Problem 53 (Medium)

> This problem was asked by Apple.

Implement a queue using two stacks. Recall that a queue is a FIFO (first-in, first-out) data structure with the following methods: `enqueue`, which inserts an element into the queue, and `dequeue`, which removes it

[Solution](https://k5kc.com/cs/algorithms/implement-queue-using-stacks/)

---

### Problem 54 (Hard)

> This problem was asked by Dropbox.

Sudoku is a puzzle where you're given a partially-filled 9 by 9 grid with digits. The objective is to fill the grid with the constraint that every row, column, and box (3 by 3 subgrid) must contain all of the digits from 1 to 9.

Implement an efficient sudoku solver

[Solution](https://k5kc.com/cs/algorithms/sudoku-solver-problem/)

---

### Problem 55 (Easy)

> This problem was asked by Microsoft.

Implement a URL shortener with the following methods:

- `shorten(url)`, which shortens the url into a six-character alphanumeric string, such as `zLg6wl`.
- `restore(short)`, which expands the shortened string into the original url. If no such shortened string exists, return null.

Hint: What if we enter the same URL twice?

[Solution](https://k5kc.com/cs/algorithms/encode-and-decode-tinyurl-problem/)

---

### Problem 56 (Medium)

> This problem was asked by Google.

Given an undirected graph represented as an adjacency matrix and an integer k, write a function to determine whether each vertex in the graph can be colored such that no two adjacent vertices share the same color using at most k colors.

[Solution](https://k5kc.com/cs/algorithms/m-coloring-problem-undirected-graph-as-adjacency-matrix/)

---

### Problem 57 (Medium)

> This problem was asked by Amazon.

Given a string s and an integer k, break up the string into multiple lines such that each line has a length of k or less. You must break it up so that words don't break across lines. Each line has to have the maximum possible amount of words. If there's no way to break the text up, then return null.

You can assume that there are no spaces at the ends of the string and that there is exactly one space between each word.

For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, you should return: ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. No string in the list has a length of more than 10.

[Solution](https://k5kc.com/cs/algorithms/text-justification-problem/)

---

### Problem 58 (Medium)

> This problem was asked by Amazon.

An sorted array of integers was rotated an unknown number of times.

Given such an array, find the index of the element in the array in faster than linear time. If the element doesn't exist in the array, return null.

For example, given the array `[13, 18, 25, 2, 8, 10]` and the element 8, return 4 (the index of 8 in the array).

You can assume all the integers in the array are unique.

[Solution](https://k5kc.com/cs/algorithms/search-in-rotated-sorted-array/)

---

### Problem 59 (Hard)

> This problem was asked by Google.

Implement a file syncing algorithm for two computers over a low-bandwidth network. What if we know the files in the two computers are mostly the same?

[Solution](https://k5kc.com/cs/algorithms/low-bandwidth-almost-similar-file-syncing-algorithm-between-two-computers/)

---

### Problem 60 (Medium)

> This problem was asked by Facebook.

Given a multiset of integers, return whether it can be partitioned into two subsets whose sums are the same.

For example, given the multiset `{15, 5, 20, 10, 35, 15, 10}`, it would return true, since we can split it up into `{15, 5, 10, 15, 10}` and `{20, 35},` which both add up to `55`.

Given the multiset `{15, 5, 20, 10, 35}`, it would return false, since we can't split it up into two subsets that add up to the same sum.

[Solution](https://k5kc.com/cs/algorithms/partition-equal-subset-sum-problem/)

---

### Problem 61 (Medium)

> This problem was asked by Google.

Implement integer exponentiation. That is, implement the `pow(x, y)` function, where `x` and `y` are integers and returns `x^y`.

Do this faster than the naive method of repeated multiplication.

For example, `pow(2, 10)` should return 1024.

[Solution](https://k5kc.com/cs/algorithms/implement-power-function-1/)

---

### Problem 62 (Medium)

> This problem was asked by Facebook.

There is an N by M matrix of zeroes. Given N and M, write a function to count the number of ways of starting at the top-left corner and getting to the bottom-right corner. You can only move right or down.

For example, given a 2 by 2 matrix, you should return 2, since there are two ways to get to the bottom-right:

- Right, then down
- Down, then right

Given a 5 by 5 matrix, there are 70 ways to get to the bottom-right.

[Solution](https://k5kc.com/cs/algorithms/unique-paths-in-grid-1-count-all-paths-moving-right-or-down/)

---

### Problem 63 (Easy)

> This problem was asked by Microsoft.

Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down.

For example, given the following matrix:

```
[['F', 'A', 'C', 'I'],
 ['O', 'B', 'Q', 'P'],
 ['A', 'N', 'O', 'B'],
 ['M', 'A', 'S', 'S']]
```

and the target word 'FOAM', you should return true, since it's the leftmost column. Similarly, given the target word 'MASS', you should return true, since it's the last row.

[Solution](https://k5kc.com/cs/algorithms/word-search-1-find-if-word-exists/)

---

### Problem 64 (Hard)

> This problem was asked by Google.

A knight's tour is a sequence of moves by a knight on a chessboard such that all squares are visited once.

Given N, write a function to return the number of knight's tours on an N by N chessboard

[Solution](https://k5kc.com/cs/algorithms/count-knight-s-tour/)

---

### Problem 65 (Easy)

> This problem was asked by Amazon.

Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.

For example, given the following matrix:

```
[[1,  2,  3,  4,  5],
 [6,  7,  8,  9,  10],
 [11, 12, 13, 14, 15],
 [16, 17, 18, 19, 20]]
```

You should print out the following:

```java
1
2
3
4
5
10
15
20
19
18
17
16
11
6
7
8
9
14
13
12
```

[Solution](https://k5kc.com/cs/algorithms/spiral-matrix-1-return/)

### Problem 66 (Medium)

> This problem was asked by Square.

Assume you have access to a function `toss_biased()` which returns 0 or 1 with a probability that's not 50-50 (but also not 0-100 or 100-0). You do not know the bias of the coin.

Write a function to simulate an unbiased coin toss.

[Solution](https://k5kc.com/cs/algorithms/simulating-an-unbiased-coin-toss-using-a-biased-coin/)

---

### Problem 67 (Hard)

> This problem was asked by Google.

Implement an LFU (Least Frequently Used) cache. It should be able to be initialized with a cache size `n`, and contain the following methods:

- `set(key, value)`: sets `key` to `value`. If there are already `n` items in the cache and we are adding a new item, then it should also remove the least frequently used item. If there is a tie, then the least recently used key should be removed.
- `get(key)`: gets the value at `key`. If no such key exists, return null.

Each operation should run in O(1) time.

[Solution](https://k5kc.com/cs/algorithms/lfu-cache-problem/)

---

### Problem 68 (Medium)

> This problem was asked by Google.

On our special chessboard, two bishops attack each other if they share the same diagonal. This includes bishops that have another bishop located between them, i.e. bishops can attack through pieces.

You are given N bishops, represented as (row, column) tuples on a M by M chessboard. Write a function to count the number of pairs of bishops that attack each other. The ordering of the pair doesn't matter: (1, 2) is considered the same as (2, 1).

For example, given M = 5 and the list of bishops:

- (0, 0)
- (1, 2)
- (2, 2)
- (4, 0)

The board would look like this:

```
[b 0 0 0 0]
[0 0 b 0 0]
[0 0 b 0 0]
[0 0 0 0 0]
[b 0 0 0 0]
```

You should return 2, since bishops 1 and 3 attack each other, as well as bishops 3 and 4.

[Solution](https://k5kc.com/cs/algorithms/bishop-diagonally-attack-on-chess-board-problem/)

---

### Problem 69 (Easy)

> This problem was asked by Facebook.

Given a list of integers, return the largest product that can be made by multiplying any three integers.

For example, if the list is `[-10, -10, 5, 2]`, we should return `500`, since that's `-10 * -10 * 5`.

You can assume the list has at least three integers

[Solution](https://k5kc.com/cs/algorithms/maximum-product-of-three-numbers-problem/)

---

### Problem 70 (Easy)

> This problem was asked by Microsoft.

A number is considered perfect if its digits sum up to exactly 10.

Given a positive integer `n`, return the `n`-th perfect number.

For example, given 1, you should return 19. Given 2, you should return 28.

[Solution](https://k5kc.com/cs/algorithms/nth-number-with-sum-of-digits-as-10/)

---

### Problem 71 (Easy)

> This problem was asked by Two Sigma.

Using a function `rand7()` that returns an integer from 1 to 7 (inclusive) with uniform probability, implement a function `rand5()` that returns an integer from 1 to 5 (inclusive)

[Solution](https://k5kc.com/cs/algorithms/implement-rand5-using-rand7-/)

---

### Problem 72 (Hard)

> This problem was asked by Google.

In a directed graph, each node is assigned an uppercase letter. We define a path's value as the number of most frequently-occurring letter along that path. For example, if a path in the graph goes through "ABACA", the value of the path is 3, since there are 3 occurrences of 'A' on the path.

Given a graph with `n` nodes and `m` directed edges, return the largest value path of the graph. If the largest value is infinite, then return null.

The graph is represented with a string and an edge list. The `i`-th character represents the uppercase letter of the `i`-th node. Each tuple in the edge list `(i, j)` means there is a directed edge from the `i`-th node to the `j`-th node. Self-edges are possible, as well as multi-edges.

For example, the following input graph:

```d
ABACA
[(0, 1),
 (0, 2),
 (2, 3),
 (3, 4)]
```

Would have maximum value 3 using the path of vertices `[0, 2, 3, 4]`, `(A, A, C, A)`.

The following input graph:

```d
[(0, 0)]
```

Should return null, since we have an infinite loop.

[Solution](https://k5kc.com/cs/algorithms/largest-value-path-in-a-directed-graph-problem/)

---

### Problem 73 (Easy)

> This problem was asked by Google.

Given the head of a singly linked list, reverse it in-place.

[Solution](https://k5kc.com/cs/algorithms/reverse-linked-list-problem/)

---

### Problem 74 (Medium)

> This problem was asked by Apple.

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

[Solution](https://k5kc.com/cs/algorithms/number-of-cells-in-multiplication-table-containing-x/)

---

### Problem 75 (Hard)

> This problem was asked by Microsoft.

Given an array of numbers, find the length of the longest increasing subsequence in the array. The subsequence does not necessarily have to be contiguous.

For example, given the array [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15], the longest increasing subsequence has length 6: it is 0, 2, 6, 9, 11, 15.

[Solution](https://k5kc.com/cs/algorithms/longest-increasing-subsequence-lis-problem/)

---

### Problem 76 (Medium)

> This problem was asked by Google.

You are given an N by M 2D matrix of lowercase letters. Determine the minimum number of columns that can be removed to ensure that each row is ordered from top to bottom lexicographically. That is, the letter at each column is lexicographically later as you go down each row. It does not matter whether each row itself is ordered lexicographically.

For example, given the following table:

```d
cba
daf
ghi
```

This is not ordered because of the a in the center. We can remove the second column to make it ordered:

```d
ca
df
gi
```

So your function should return 1, since we only needed to remove 1 column.

As another example, given the following table:

```d
abcdef
```

Your function should return 0, since the rows are already ordered (there's only one row).

As another example, given the following table:

```d
zyx
wvu
tsr
```

Your function should return 3, since we would need to remove all the columns to order it.

---

### Problem 77 (Easy)

> This problem was asked by Snapchat.

Given a list of possibly overlapping intervals, return a new list of intervals where all overlapping intervals have been merged.

The input list is not necessarily ordered in any way.

For example, given [(1, 3), (5, 8), (4, 10), (20, 25)], you should return [(1, 3), (4, 10), (20, 25)].

[Solution](https://k5kc.com/cs/algorithms/merge-overlapping-intervals/)

---

### Problem 78 (Medium)

> This problem was asked recently by Google.

Given k sorted singly linked lists, write a function to merge all the lists into one sorted singly linked list.

[Solution](https://k5kc.com/cs/algorithms/merge-k-sorted-lists/)

---

### Problem 79 (Medium)

> This problem was asked by Facebook.

Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.

For example, given the array [10, 5, 7], you should return true, since we can modify the 10 into a 1 to make the array non-decreasing.

Given the array [10, 5, 1], you should return false, since we can't modify any one element to get a non-decreasing array.

[Solution](https://k5kc.com/cs/algorithms/non-decreasing-array-problem/)

---

### Problem 80 (Easy)

> This problem was asked by Google.

Given the root of a binary tree, return a deepest node. For example, in the following tree, return d.

```
    a
   / \
  b   c
 /
d
```

[Solution](https://k5kc.com/cs/algorithms/find-deepest-node-in-a-binary-tree/)

---

### Problem 81 (Easy)

> This problem was asked by Yelp.

Given a mapping of digits to letters (as in a phone number), and a digit string, return all possible letters the number could represent. You can assume each valid number in the mapping is a single digit.

For example if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …} then “23” should return [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"].

[Solution](https://k5kc.com/cs/algorithms/letter-combinations-of-a-phone-number-problem/)

---

### Problem 82 (Easy)

> This problem was asked Microsoft.

Using a read7() method that returns 7 characters from a file, implement readN(n) which reads n characters.

For example, given a file with the content “Hello world”, three read7() returns “Hello w”, “orld” and then “”.


---

### Problem 83 (Medium)

> This problem was asked by Google.

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

[Solution](https://k5kc.com/cs/algorithms/invert-binary-tree-problem/)

---

### Problem 84 (Medium)

> This problem was asked by Amazon.

Given a matrix of 1s and 0s, return the number of "islands" in the matrix. A 1 represents land and 0 represents water, so an island is a group of 1s that are neighboring whose perimeter is surrounded by water.

For example, this matrix has 4 islands.

```d
1 0 0 0 0
0 0 1 1 0
0 1 1 0 0
0 0 0 0 0
1 1 0 0 1
1 1 0 0 1
```

[Solution](https://k5kc.com/cs/algorithms/number-of-islands/)

---

### Problem 85 (Medium)

> This problem was asked by Facebook.

Given three 32-bit integers x, y, and b, return x if b is 1 and y if b is 0, using only mathematical or bit operations. You can assume b can only be 1 or 0.

---

### Problem 86 (Medium)

> This problem was asked by Google.

Given a string of parentheses, write a function to compute the minimum number of parentheses to be removed to make the string valid (i.e. each open parenthesis is eventually closed).

For example, given the string "()())()", you should return 1. Given the string ")(", you should return 2, since we must remove all of them.

[Solution](https://k5kc.com/cs/algorithms/minimum-remove-to-make-valid-parentheses/)

---

### Problem 88 (Medium)

This question was asked by ContextLogic.

Implement division of two positive integers without using the division, multiplication, or modulus operators. Return the quotient as an integer, ignoring the remainder.

[Solution](https://k5kc.com/cs/algorithms/divide-two-integers-problem/)

---

### Problem 89 (Medium)

> This problem was asked by LinkedIn.

Determine whether a tree is a valid binary search tree.

A binary search tree is a tree with two children, `left` and `right`, and satisfies the constraint that the key in the `left` child must be less than or equal to the root and the key in the `right`child must be greater than or equal to the root.

[Solution](https://k5kc.com/cs/algorithms/validate-binary-search-tree-problem/)

---

### Problem 90 (Medium)

> This question was asked by Google.

Given an integer `n` and a list of integers `l`, write a function that randomly generates a number from `0` to `n-1` that isn't in `l` (uniform).

---

### Problem 91 (Easy)

> This problem was asked by Dropbox.

What does the below code snippet print out? How can we fix the anonymous functions to behave as we'd expect?

```python
functions = []
for i in range(10):
    functions.append(lambda : i)

for f in functions:
    print(f())
```

---

### Problem 92 (Hard)

> This problem was asked by Airbnb.

We're given a hashmap associating each `courseId` key with a list of `courseIds` values, which represents that the prerequisites of `courseId` are `courseIds`. Return a sorted ordering of courses such that we can finish all courses.

Return null if there is no such ordering.

For example, given {'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []}, should return ['CSC100', 'CSC200', 'CSCS300'].

### Problem 93 (Hard)

> This problem was asked by Apple.

Given a tree, find the largest tree/subtree that is a BST.

Given a tree, return the size of the largest tree/subtree that is a BST.

---

### Problem 94 (Easy)

> This problem was asked by Google.

Given a binary tree of integers, find the maximum path sum between two nodes. The path must go through at least one node, and does not need to go through the root.

---

### Problem 95 (Hard)

> This problem was asked by Palantir.

Given a number represented by a list of digits, find the next greater permutation of a number, in terms of lexicographic ordering. If there is not greater permutation possible, return the permutation with the lowest value/ordering.

For example, the list `[1,2,3]` should return `[1,3,2]`. The list `[1,3,2]` should return `[2,1,3]`. The list `[3,2,1]` should return `[1,2,3]`.

Can you perform the operation without allocating extra memory (disregarding the input memory)?

---

### Problem 96 (Easy)

> This problem was asked by Microsoft.

Given a number in the form of a list of digits, return all possible permutations.

For example, given `[1,2,3]`, return `[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]`.

---

### Problem 97 (Medium)

> This problem was asked by Stripe.

Write a map implementation with a get function that lets you retrieve the value of a key at a particular time.

It should contain the following methods:

- `set(key, value, time)`: sets key to value for t = time.
- `get(key, time)`: gets the key at t = time.

The map should work like this. If we set a key at a particular time, it will maintain that value forever or until it gets set at a later time. In other words, when we get a key at a time, it should return the value that was set for that key set at the most recent time.

Consider the following examples:

```python
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

---

### Problem 98 (Easy)

> This problem was asked by Coursera.

Given a 2D board of characters and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

For example, given the following board:

```python
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
```

`exists(board, "ABCCED")` returns `true`, `exists(board, "SEE")` returns `true`, `exists(board, "ABCB")` returns `false`.

---

### Problem 99 (Medium)

> This problem was asked by Microsoft.

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example, given `[100, 4, 200, 1, 3, 2]`, the longest consecutive element sequence is `[1, 2, 3, 4]`. Return its length: `4`.

Your algorithm should run in `O(n)` complexity.

---

### Problem 100 (Easy)

> This problem was asked by Google.

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

It takes 1 step to move from `(0, 0)` to `(1, 1)`. It takes one more step to move from `(1, 1)`to `(1, 2)`.

---

### Problem 101 (Easy)

> This problem was asked by Alibaba.

Given an even number (greater than 2), return two prime numbers whose sum will be equal to the given number.

A solution will always exist. See [Goldbach’s conjecture](https://en.wikipedia.org/wiki/Goldbach%27s_conjecture).

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

### Problem 102 (Medium)

> This problem was asked by Lyft.

Given a list of integers and a number K, return which contiguous elements of the list sum to K.

For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4], since 2 + 3 + 4 = 9.

### Problem 103 (Medium)

> This problem was asked by Square.

Given a string and a set of characters, return the shortest substring containing all the characters in the set.

For example, given the string "figehaeci" and the set of characters {a, e, i}, you should return "aeci".

If there is no substring containing all the characters in the set, return null.

### Problem 104 (Easy)

> This problem was asked by Google.

Determine whether a doubly linked list is a palindrome. What if it’s singly linked?

For example, `1 -> 4 -> 3 -> 4 -> 1` returns `True` while `1 -> 4` returns `False`.

### Problem 105 (Easy)

> This problem was asked by Facebook.

Given a function `f`, and `N` return a debounced `f` of `N` milliseconds.

That is, as long as the debounced `f` continues to be invoked, `f` itself will not be called for `N`milliseconds.

### Problem 106 (Medium)

> This problem was asked by Pinterest.

Given an integer list where each number represents the number of hops you can make, determine whether you can reach to the last index starting at index 0.

For example, `[2, 0, 1, 0]` returns `True` while `[1, 1, 0, 1]` returns `False`.

### Problem 107 (Easy)

> This problem was asked by Microsoft.

Print the nodes in a binary tree level-wise. For example, the following should print 1, 2, 3, 4, 5.

```
  1
 / \
2   3
   / \
  4   5
```

### Problem 108 (Easy)

> This problem was asked by Google.

Given two strings A and B, return whether or not A can be shifted some number of times to get B.

For example, if A is `abcde` and B is `cdeab`, return true. If A is `abc` and B is `acb`, return false.

### Problem 109 (Medium)

> This problem was asked by Cisco.

Given an unsigned 8-bit integer, swap its even and odd bits. The 1st and 2nd bit should be swapped, the 3rd and 4th bit should be swapped, and so on.

For example, `10101010` should be `01010101`. `11100010` should be `11010001`.

[Solution](https://k5kc.com/cs/algorithms/swap-odd-and-even-bits-in-an-integer/)

Bonus: Can you do this in one line?

### Problem 110 (Medium)

> This problem was asked by Facebook.

Given a binary tree, return all paths from the root to leaves.

For example, given the tree

```
   1
  / \
 2   3
    / \
   4   5
```

Return `[[1, 2], [1, 3, 4], [1, 3, 5]]`.

### Problem 111 (Hard)

> This problem was asked by Google.

Given a word W and a string `S`, find all starting indices in `S` which are anagrams of `W`.

For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.

### Problem 112 (Hard)

> This problem was asked by Twitter.

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree. Assume that each node in the tree also has a pointer to its parent.

According to the definition of [LCA on Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor): “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

### Problem 113 (Medium)

> This problem was asked by Google.

Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here", return "here world hello"

Follow-up: given a mutable string representation, can you perform this operation in-place?

### Problem 114 (Hard)

> This problem was asked by Facebook.

Given a string and a set of delimiters, reverse the words in the string while maintaining the relative order of the delimiters. For example, given "hello/world:here", return "here/world:hello"

Follow-up: Does your solution work for the following cases: "hello/world:here/", "hello//world:here"

![Solution](https://k5kc.com/cs/algorithms/reverse-words-in-a-string-keep-delimiters-in-order/)

### Problem 115 (Hard)

> This problem was asked by Google.

Given two non-empty binary trees `s` and `t`, check whether tree `t` has exactly the same structure and node values with a subtree of `s`. A subtree of `s` is a tree consists of a node in `s` and all of this node's descendants. The tree `s` could also be considered as a subtree of itself.

### Problem 116 (Medium)

> This problem was asked by Jane Street.

Generate a finite, but an arbitrarily large binary tree quickly in O(1).

That is, `generate()` should return a tree whose size is unbounded but finite.

### Problem 117 (Easy)

> This problem was asked by Facebook.

Given a binary tree, return the level of the tree with minimum sum.

![Solution](https://k5kc.com/cs/algorithms/minimum-level-sum-of-a-binary-tree-problem/)

### Problem 118 (Easy)

> This problem was asked by Google.

Given a sorted list of integers, square the elements and give the output in sorted order.

For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].

### Problem 119 (Medium)

> This problem was asked by Google.

Given a set of closed intervals, find the smallest set of numbers that covers all the intervals. If there are multiple smallest sets, return any of them.

For example, given the intervals `[0, 3], [2, 6], [3, 4], [6, 9]`, one set of numbers that covers all these intervals is `{3, 6}`.

### Problem 120 (Medium)

> This problem was asked by Microsoft.

Implement the singleton pattern with a twist. First, instead of storing one instance, store two instances. And in every even call of `getInstance()`, return the first instance and in every odd call of `getInstance()`, return the second instance.

### Problem 121 (Hard)

> This problem was asked by Google.

Given a string which we can delete at most k, return whether you can make a palindrome.

For example, given 'waterrfetawx' and a k of 2, you could delete f and x to get 'waterretaw'.

### Problem 122 (Medium)

This question was asked by Zillow.

You are given a 2-d `matrix` where each cell represents number of coins in that cell. Assuming we start at `matrix[0][0]`, and can only move right or down, find the maximum number of coins you can collect by the bottom right corner.

For example, in this matrix

```
0 3 1 1
2 0 0 4
1 5 3 1
```

The most we can collect is 0 + 2 + 1 + 5 + 3 + 1 = 12 coins.

### Problem 123 (Hard)

> This problem was asked by LinkedIn.

Given a string, return whether it represents a number. Here are the different kinds of numbers:

- "10", a positive integer
- "-10", a negative integer
- "10.1", a positive real number
- "-10.1", a negative real number
- "1e5", a number in scientific notation

And here are examples of non-numbers:

- "a"
- "x 1"
- "a -2"
- "-"

### Problem 124 (Easy)

> This problem was asked by Microsoft.

You have `n` fair coins and you flip them all at the same time. Any that come up tails you set aside. The ones that come up heads you flip again. How many rounds do you expect to play before only one coin remains?

Write a function that, given `n`, returns the number of rounds you'd expect to play until one coin remains.

### Problem 125 (Easy)

> This problem was asked by Google.

Given the root of a binary search tree, and a target `K`, return two nodes in the tree whose sum equals `K`.

For example, given the following tree and `K` of 20

```
    10
   /   \
 5      15
       /  \
     11    15
```

Return the nodes `5` and `15`.

### Problem 126 (Medium)

> This problem was asked by Facebook.

Write a function that rotates a list by k elements. For example, `[1, 2, 3, 4, 5, 6]` rotated by two becomes `[3, 4, 5, 6, 1, 2]`. Try solving this without creating a copy of the list. How many swap or move operations do you need?

### Problem 127 (Easy)

> This problem was asked by Microsoft.

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

### Problem 128 (Medium)

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

### Problem 129 (Medium)

Given a real number `n`, find the square root of n. For example, given `n = 9`, return `3`.

### Problem 130 (Medium)

> This problem was asked by Facebook.

Given an array of numbers representing the stock prices of a company in chronological order and an integer `k`, return the maximum profit you can make from `k` buys and sells. You must buy the stock before you can sell it, and you must sell the stock before you can buy it again.

For example, given `k` = 2 and the array `[5, 2, 4, 0, 1]`, you should return 3.

### Problem 131 (Medium)

This question was asked by Snapchat.

Given the head to a singly linked list, where each node also has a “random” pointer that points to anywhere in the linked list, deep clone the list.

### Problem 132 (Easy)

> This question was asked by Riot Games.

Design and implement a HitCounter class that keeps track of requests (or hits). It should support the following operations:

- `record(timestamp)`: records a hit that happened at `timestamp`
- `total()`: returns the total number of hits recorded
- `range(lower, upper)`: returns the number of hits that occurred between timestamps `lower` and `upper` (inclusive)

Follow-up: What if our system has limited memory?

### Problem 133 (Medium)

> This problem was asked by Amazon.

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

[Solution](https://k5kc.com/cs/algorithms/inorder-successor-in-binary-search-tree-using-parent-link/)

### Problem 134 (Easy)

> This problem was asked by Facebook.

You have a large array with most of the elements as zero.

Use a more space-efficient data structure, SparseArray, that implements the same interface:

- `init(arr, size)`: initialize with the original large array and size.
- `set(i, val)`: updates index at `i` with `val`.
- `get(i)`: gets the value at index `i`.

### Problem 135 (Easy)

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

### Problem 136 (Medium)

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

### Problem 137 (Medium)

> This problem was asked by Amazon.

Implement a bit array.

A bit array is a space efficient array that holds a value of `1` or `0` at each index.

- `init(size)`: initialize the array with `size`
- `set(i, val)`: updates index at `i` with `val` where `val` is either `1` or `0`.
- `get(i)`: gets the value at index `i`.

### Problem 138 (Hard)

> This problem was asked by Google.

Find the minimum number of coins required to make `n` cents.

You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.

For example, given `n = 16`, return `3` since we can make it with a 10¢, a 5¢, and a 1¢.

### Problem 139 (Medium)

> This problem was asked by Google.

Given an `iterator` with methods `next()` and `hasNext()`, create a wrapper iterator, `PeekableInterface`, which also implements `peek()`. `peek` shows the next element that would be returned on `next()`.

Here is the interface:

```
class PeekableInterface(object):
    def __init__(self, iterator):
        pass

    def peek(self):
        pass

    def next(self):
        pass

    def hasNext(self):
        pass
```

### Problem 140 (Medium)

> This problem was asked by Facebook.

Given an array of integers in which two elements appear exactly once and all other elements appear exactly twice, find the two elements that appear only once.

For example, given the array `[2, 4, 6, 8, 10, 2, 6, 10]`, return `4` and `8`. The order does not matter.

Follow-up: Can you do this in linear time and constant space?

### Problem 141 (Hard)

> This problem was asked by Microsoft.

Implement 3 stacks using a single list:

```python
class Stack:
    def __init__(self):
        self.list = []

    def pop(self, stack_number):
        pass

    def push(self, item, stack_number):
        pass
```

### Problem 142 (Hard)

> This problem was asked by Google.

You're given a string consisting solely of `(`, `)`, and `*`. `*` can represent either a `(`, `)`, or an empty string. Determine whether the parentheses are balanced.

For example, `(()*` and `(*)` are balanced. `)*(` is not balanced.

### Problem 143 (Medium)

> This problem was asked by Amazon.

Given a pivot `x`, and a list `lst`, partition the list into three parts.

- The first part contains all elements in `lst` that are less than `x`
- The second part contains all elements in `lst` that are equal to `x`
- The third part contains all elements in `lst` that are larger than `x`

Ordering within a part can be arbitrary.

For example, given `x = 10` and `lst = [9, 12, 3, 5, 14, 10, 10]`, one partition may be `[9, 3, 5, 10, 10, 12, 14]`.

### Problem 144 (Medium)

> This problem was asked by Google.

Given an array of numbers and an index `i`, return the index of the nearest larger number of the number at index `i`, where distance is measured in array indices.

For example, given `[4, 1, 3, 5, 6]` and index `0`, you should return `3`.

If two distances to larger numbers are the equal, then return any one of them. If the array at `i`doesn't have a nearest larger integer, then return null.

Follow-up: If you can preprocess the array, can you do this in constant time?

### Problem 145 (Easy)

> This problem was asked by Google.

Given the head of a singly linked list, swap every two nodes and return its head.

For example, given `1 -> 2 -> 3 -> 4`, return `2 -> 1 -> 4 -> 3`.

### Problem 146 (Medium)

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

### Problem 147 (Hard)

Given a list, sort it using this method: `reverse(lst, i, j)`, which sorts `lst` from `i` to `j`.

### Problem 148 (Medium)

> This problem was asked by Apple.

[Gray code](https://en.wikipedia.org/wiki/Gray_code) is a binary code where each successive value differ in only one bit, as well as when wrapping around. Gray code is common in hardware so that we don't see temporary spurious values during transitions.

Given a number of bits `n`, generate a possible gray code for it.

For example, for n = `2`, one gray code would be `[00, 01, 11, 10]`.

### Problem 149 (Hard)

> This problem was asked by Goldman Sachs.

Given a list of numbers `L`, implement a method `sum(i, j)` which returns the sum from the sublist `L[i:j]` (including `i`, excluding `j`).

For example, given `L = [1, 2, 3, 4, 5]`, `sum(1, 3)` should return `sum([2, 3])`, which is `5`.

You can assume that you can do some pre-processing. `sum()` should be optimized over the pre-processing step.

### Problem 150 (Hard)

> This problem was asked by LinkedIn.

Given a list of points, a central point, and an integer `k`, find the nearest `k` points from the central point.

For example, given the list of points `[(0, 0), (5, 4), (3, 1)]`, the central point `(1, 2)`, and `k` = 2, return `[(0, 0), (3, 1)]`

---

### Problem 151 (Medium)

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

[Solution](https://k5kc.com/cs/algorithms/flood-fill-problem/)

### Problem 152 (Medium)

> This problem was asked by Triplebyte.

You are given `n` numbers as well as `n` probabilities that sum up to 1. Write a function to generate one of the numbers with its corresponding probability.

For example, given the numbers `[1, 2, 3, 4]` and probabilities `[0.1, 0.5, 0.2, 0.2]`, your function should return `1` 10% of the time, `2` 50% of the time, and 3 and 4 20% of the time.

You can generate random numbers between 0 and 1 uniformly.

### Problem 153 (Hard)

Find an efficient algorithm to find the smallest distance (measured in number of words) between any two given words in a string.

For example, given words "hello", and "world" and a text content of "dog cat hello cat dog dog hello cat world", return 1 because there's only one word "cat" in between the two words.

### Problem 154 (Easy)

> This problem was asked by Amazon.

Implement a stack API using only a heap. A stack implements the following methods:

- `push(item)`, which adds an element to the stack
- `pop()`, which removes and returns the most recently added element (or throws an error if there is nothing on the stack)

Recall that a heap has the following operations:

- `push(item)`, which adds a new key to the heap
- `pop()`, which removes and returns the max value of the heap

### Problem 155 (Medium)

> This problem was asked by MongoDB.

Given a list of elements, find the majority element, which appears more than half the time (`> floor(len(lst) / 2.0)`).

You can assume that such element exists.

For example, given `[1, 2, 1, 1, 3, 4, 0]`, return 1.

### Problem 156 (Medium)

> This problem was asked by Facebook.

Given a positive integer `n`, find the smallest number of squared integers which sum to `n`.

For example, given `n` = 13, return 2 since 13 = 3^2 + 2^2 = 9 + 4.

Given `n` = 27, return 3 since 27 = 3^2 + 3^2 + 3^2 = 9 + 9 + 9.

[Solution](https://k5kc.com/cs/algorithms/least-number-of-perfect-squares-that-sums-to-n/)

### Problem 157 (Easy)

> This problem was asked by Amazon.

Given a string, determine whether any permutation of it is a palindrome.

For example, `carrace` should return true, since it can be rearranged to form `racecar`, which is a palindrome. `daily` should return false, since there's no rearrangement that can form a palindrome.

### Problem 158 (Medium)

> This problem was asked by Slack.

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

### Problem 159 (Easy)

> This problem was asked by Google.

Given a string, return the first recurring character in it, or null if there is no recurring character.

For example, given the string "acbbac", return "b". Given the string "abcdef", return null.

### Problem 160 (Hard)

> This problem was asked by Uber.

Given a tree where each edge has a weight, compute the length of the longest path in the tree.

For example, given the following tree:

```
   a
  /|\
 b c d
    / \
   e   f
  / \
 g   h
```

and the weights: `a-b: 3, a-c: 5, a-d: 8, d-e: 2, d-f: 4, e-g: 1, e-h: 1`, the longest path would be `c -> a -> d -> f`, with a length of 17.

The path does not have to pass through the root, and each node can have any amount of children.

### Problem 161 (Easy)

> This problem was asked by Facebook.

Given a 32-bit integer, return the number with its bits reversed.

For example, given the binary number `1111 0000 1111 0000 1111 0000 1111 0000`, return `0000 1111 0000 1111 0000 1111 0000 1111`.

### Problem 162 (Medium)

> This problem was asked by Square.

Given a list of words, return the shortest unique prefix of each word. For example, given the list:

- dog
- cat
- apple
- apricot
- fish

Return the list:

- d
- c
- app
- apr
- f

### Problem 163 (Hard)

> This problem was asked by Jane Street.

Given an arithmetic expression in [Reverse Polish Notation](https://en.wikipedia.org/wiki/Reverse_Polish_notation), write a program to evaluate it.

The expression is given as a list of numbers and operands. For example: `[5, 3, '+']` should return `5 + 3 = 8`.

For example, `[15, 7, 1, 1, '+', '-', '/', 3, '*', 2, 1, 1, '+', '+', '-']`should return `5`, since it is equivalent to ((15 / (7 - (1 + 1))) * 3) - (2 + (1 + 1)) = 5.

You can assume the given expression is always valid.

### Problem 164 (Medium)

> This problem was asked by Google.

You are given an array of length `n + 1` whose elements belong to the set `{1, 2, ..., n}`. By the pigeonhole principle, there must be a duplicate. Find it in linear time and space.

### Problem 165 (Medium)

> This problem was asked by Google.

Given an array of integers, return a new array where each element in the new array is the number of smaller elements to the right of that element in the original input array.

For example, given the array `[3, 4, 9, 6, 1]`, return `[1, 1, 2, 1, 0]`, since:

- There is 1 smaller element to the right of 3
- There is 1 smaller element to the right of 4
- There are 2 smaller elements to the right of 9
- There is 1 smaller element to the right of 6
- There are no smaller elements to the right of 1

### Problem 166 (Medium)

> This problem was asked by Uber.

Implement a 2D iterator class. It will be initialized with an array of arrays, and should implement the following methods:

- `next()`: returns the next element in the array of arrays. If there are no more elements, raise an exception.
- `has_next()`: returns whether or not the iterator still has elements left.

For example, given the input [[1, 2], [3], [], [4, 5, 6]], calling `next()` repeatedly should output `1, 2, 3, 4, 5, 6`.

Do not use `flatten` or otherwise clone the arrays. Some of the arrays can be empty.

### Problem 167 (Hard)

> This problem was asked by Airbnb.

Given a list of words, find all pairs of unique indices such that the concatenation of the two words is a palindrome.

For example, given the list `["code", "edoc", "da", "d"]`, return `[(0, 1), (1, 0), (2, 3)]`.

### Problem 168 (Medium)

> This problem was asked by Facebook.

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

### Problem 169 (Medium)

> This problem was asked by Google.

Given a linked list, sort it in O(n log n) time and constant space.

For example, the linked list `4 -> 1 -> -3 -> 99` should become `-3 -> 1 -> 4 -> 99`.

### Problem 170 (Medium)

> This problem was asked by Facebook.

Given a `start` word, an `end` word, and a dictionary of valid words, find the shortest transformation sequence from `start` to `end` such that only one letter is changed at each step of the sequence, and each transformed word exists in the dictionary. If there is no possible transformation, return null. Each word in the dictionary have the same length as `start` and `end`and is lowercase.

For example, given `start = "dog"`, `end = "cat"`, and `dictionary = {"dot", "dop", "dat", "cat"}`, return `["dog", "dot", "dat", "cat"]`.

Given `start = "dog"`, `end = "cat"`, and `dictionary = {"dot", "tod", "dat", "dar"}`, return null as there is no possible transformation from `dog` to `cat`.

### Problem 171 (Easy)

> This problem was asked by Amazon.

You are given a list of data entries that represent entries and exits of groups of people into a building. An entry looks like this:

```
{"timestamp": 1526579928, count: 3, "type": "enter"}
```

This means 3 people entered the building. An exit looks like this:

```
{"timestamp": 1526580382, count: 2, "type": "exit"}
```

This means that 2 people exited the building. `timestamp` is in [Unix time](https://en.wikipedia.org/wiki/Unix_time).

Find the busiest period in the building, that is, the time with the most people in the building. Return it as a pair of `(start, end)` timestamps. You can assume the building always starts off and ends up empty, i.e. with 0 people inside.

### Problem 172 (Medium)

> This problem was asked by Dropbox.

Given a string `s` and a list of words `words`, where each word is the same length, find all starting indices of substrings in `s` that is a concatenation of every word in `words` exactly once.

For example, given s = "dogcatcatcodecatdog" and words = ["cat", "dog"], return [0, 13], since "dogcat" starts at index 0 and "catdog" starts at index 13.

Given s = "barfoobazbitbyte" and words = ["dog", "cat"], return [] since there are no substrings composed of "dog" and "cat" in `s`.

The order of the indices does not matter.

### Problem 173 (Easy)

> This problem was asked by Stripe.

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

### Problem 174 (Medium)

> This problem was asked by Microsoft.

Describe and give an example of each of the following types of polymorphism:

- Ad-hoc polymorphism
- Parametric polymorphism
- Subtype polymorphism

### Problem 175 (Easy)
>
> This problem was asked by Google.

You are given a starting state `start`, a list of transition probabilities for a Markov chain, and a number of steps `num_steps`. Run the Markov chain starting from `start` for `num_steps` and compute the number of times we visited each state.

For example, given the starting state `a`, number of steps 5000, and the following transition probabilities:

```
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
```

One instance of running this Markov chain might produce `{ 'a': 3012, 'b': 1656, 'c': 332 }`.

### Problem 176 (Easy)

> This problem was asked by Bloomberg.

Determine whether there exists a one-to-one character mapping from one string `s1` to another `s2`.

For example, given `s1 = abc` and `s2 = bcd`, return `true` since we can map `a` to `b`, `b` to `c`, and `c` to `d`.

Given `s1 = foo` and `s2 = bar`, return `false` since the `o` cannot map to two characters.

### Problem 177 (Easy)

> This problem was asked by Airbnb.

Given a linked list and a positive integer `k`, rotate the list to the right by `k` places.

For example, given the linked list `7 -> 7 -> 3 -> 5` and `k = 2`, it should become `3 -> 5 -> 7 -> 7`.

Given the linked list `1 -> 2 -> 3 -> 4 -> 5` and `k = 3`, it should become `3 -> 4 -> 5 -> 1 -> 2`.

### Problem 178 (Hard)

> This problem was asked by Two Sigma.

Alice wants to join her school's Probability Student Club. Membership dues are computed via one of two simple probabilistic games.

The first game: roll a die repeatedly. Stop rolling once you get a five followed by a six. Your number of rolls is the amount you pay, in dollars.

The second game: same, except that the stopping condition is a five followed by a five.

Which of the two games should Alice elect to play? Does it even matter? Write a program to simulate the two games and calculate their expected value.

### Problem 179 (Medium)

> This problem was asked by Google.

 Given the sequence of keys visited by a postorder traversal of a binary search tree, reconstruct the tree.

 For example, given the sequence `2, 4, 3, 8, 7, 5`, you should construct the following tree:

```d
        5
       / \
      3   7
     / \   \
    2   4   8
```

### Problem 180 (Medium)

> This problem was asked by Google.

Given a stack of N elements, interleave the first half of the stack with the second half reversed using only one other queue. This should be done in-place.

Recall that you can only push or pop from a stack, and enqueue or dequeue from a queue.

For example, if the stack is [1, 2, 3, 4, 5], it should become [1, 5, 2, 4, 3]. If the stack is [1, 2, 3, 4], it should become [1, 4, 2, 3].

Hint: Try working backwards from the end state.

### Problem 181 (Hard)
>
> This problem was asked by Google.

Given a string, split it into as few strings as possible such that each string is a palindrome.

For example, given the input string `racecarannakayak`, return `["racecar", "anna", "kayak"]`.

Given the input string `abc`, return `["a", "b", "c"]`.

### Problem 182 (Medium)

> This problem was asked by Facebook.

A graph is minimally-connected if it is connected and there is no edge that can be removed while still leaving the graph connected. For example, any binary tree is minimally-connected.

Given an undirected graph, check if the graph is minimally-connected. You can choose to represent the graph as either an adjacency matrix or adjacency list.

### Problem 183 (Hard)

> This problem was asked by Twitch.

Describe what happens when you type a URL into your browser and press Enter.

[Solution](https://k5kc.com/cs/system-design/what-happens-when-you-type-an-url-in-the-browser-and-press-enter/)

### Problem 184 (Easy)

> This problem was asked by Amazon.

Given `n` numbers, find the greatest common denominator between them.

For example, given the numbers `[42, 56, 14]`, return `14`.

### Problem 185 (Easy)

> This problem was asked by Google.

Given two rectangles on a 2D graph, return the area of their intersection. If the rectangles don't intersect, return 0.

For example, given the following rectangles:

```python
{
    "top_left": (1, 4),
    "dimensions": (3, 3) # width, height
}
```

and

```python
{
    "top_left": (0, 5),
    "dimensions" (4, 3) # width, height
}
```

return 6.

### Problem 186 (Hard)

> This problem was asked by Microsoft.

Given an array of positive integers, divide the array into two subsets such that the difference between the sum of the subsets is as small as possible.

For example, given `[5, 10, 15, 20, 25]`, return the sets `{10, 25}` and `{5, 15, 20}`, which has a difference of 5, which is the smallest possible difference.

### Problem 187 (Easy)

> This problem was asked by Google.

You are given given a list of rectangles represented by min and max x- and y-coordinates. Compute whether or not a pair of rectangles overlap each other. If one rectangle completely covers another, it is considered overlapping.

For example, given the following rectangles:

```
{
    "top_left": (1, 4),
    "dimensions": (3, 3) # width, height
},
{
    "top_left": (-1, 3),
    "dimensions": (2, 1)
},
{
    "top_left": (0, 5),
    "dimensions": (4, 3)
}
```

return `true` as the first and third rectangle overlap each other.

### Problem 188 (Medium)

> This problem was asked by Google.

What will this code print out?

```python
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

### Problem 189 (Easy)

> This problem was asked by Google.

Given an array of elements, return the length of the longest subarray where all its elements are distinct.

For example, given the array `[5, 1, 3, 5, 2, 3, 4, 1]`, return 5 as the longest subarray of distinct elements is `[5, 2, 3, 4, 1]`.

### Problem 190 (Medium)

> This problem was asked by Facebook.

Given a circular array, compute its maximum subarray sum in O(n) time.

For example, given `[8, -1, 3, 4]`, return `15` as we choose the numbers `3`, `4`, and `8` where the `8` is obtained from wrapping around.

Given `[-4, 5, 1, 0]`, return `6` as we choose the numbers `5` and `1`.

### Problem 191 (Easy)

> This problem was asked by Stripe.

Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Intervals can "touch", such as `[0, 1]` and `[1, 2]`, but they won't be considered overlapping.

For example, given the intervals `(7, 9), (2, 4), (5, 8)`, return 1 as the last interval can be removed and the first two won't overlap.

The intervals are not necessarily sorted in any order.

### Problem 192 (Medium)

> This problem was asked by Google.

You are given an array of nonnegative integers. Let's say you start at the beginning of the array and are trying to advance to the end. You can advance at most, the number of steps that you're currently on. Determine whether you can get to the end of the array.

For example, given the array `[1, 3, 1, 2, 0, 1]`, we can go from indices `0 -> 1 -> 3 -> 5`, so return `true`.

Given the array `[1, 2, 1, 0, 0]`, we can't reach the end, so return `false`.

### Problem 193 (Hard)

> This problem was asked by Affirm.

Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock. You're also given a number `fee` that represents a transaction fee for each buy and sell transaction.

You must buy before you can sell the stock, but you can make as many transactions as you like.

For example, given [1, 3, 2, 8, 4, 10] and `fee = 2`, you should return 9, since you could buy the stock at 1 dollar, and sell at 8 dollars, and then buy it at 4 dollars and sell it at 10 dollars. Since we did two transactions, there is a 4 dollar fee, so we have 7 + 6 = 13 profit minus 4 dollars of fees.

### Problem 194 (Easy)

> This problem was asked by Facebook.

Suppose you are given two lists of `n` points, one list p1, p2, ..., pn on the line y = 0 and the other list q1, q2, ..., qn on the line y = 1. Imagine a set of `n` line segments connecting each point pi to qi. Write an algorithm to determine how many pairs of the line segments intersect.

[Solution](https://k5kc.com/cs/algorithms/number-of-overlapping-lines-between-points-on-2-parallel-lines/)

### Problem 195 (Hard)

> This problem was asked by Google.

Let A be an N by M matrix in which every row and every column is sorted.

Given i1, j1, i2, and j2, compute the number of elements of M smaller than M[i1, j1] and larger than M[i2, j2].

For example, given the following matrix:

```
[[1, 3, 7, 10, 15, 20],
 [2, 6, 9, 14, 22, 25],
 [3, 8, 10, 15, 25, 30],
 [10, 11, 12, 23, 30, 35],
 [20, 25, 30, 35, 40, 45]]
```

And i1 = 1, j1 = 1, i2 = 3, j2 = 3, return 15 as there are 15 numbers in the matrix smaller than 6 or greater than 23.

### Problem 196 (Easy)

> This problem was asked by Apple.

Given the root of a binary tree, find the most frequent subtree sum. The subtree sum of a node is the sum of all values under a node, including the node itself.

For example, given the following tree:

```
  5
 / \
2  -5
```

Return `2` as it occurs twice: once as the left leaf, and once as the sum of `2 + 5 - 5`.

### Problem 197 (Easy)

> This problem was asked by Amazon.

Given an array and a number `k` that's smaller than the length of the array, rotate the array to the right `k` elements in-place.

### Problem 198 (Medium)

> This problem was asked by Google.

Given a set of distinct positive integers, find the largest subset such that every pair of elements in the subset (i, j) satisfies either i % j = 0 or j % i = 0.

For example, given the set [3, 5, 10, 20, 21], you should return [5, 10, 20]. Given [1, 3, 6, 24], return [1, 3, 6, 24].

### Problem 199 (Hard)

> This problem was asked by Facebook.

Given a string of parentheses, find the balanced string that can be produced from it using the minimum number of insertions and deletions. If there are multiple solutions, return any of them.

For example, given "(()", you could return "(())". Given "))()(", you could return "()()()()".

### Problem 200 (Hard)

> This problem was asked by Microsoft.

Let X be a set of n intervals on the real line. We say that a set of points P "stabs" X if every interval in X contains at least one point in P. Compute the smallest set of points that stabs X.

For example, given the intervals `[(1, 4), (4, 5), (7, 9), (9, 12)]`, you should return `[4, 9]`.

---

### Problem 201 (Easy)

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

### Problem 202 (Easy)

This problem was asked by Palantir.

Write a program that checks whether an integer is a palindrome. For example, `121` is a palindrome, as well as `888`. `678` is not a palindrome. Do not convert the integer into a string.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution202.java)

---

### Problem 203 (Medium)

This problem was asked by Uber.

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand. Find the minimum element in `O(log N)` time. You may assume the array does not contain duplicates.

For example, given `[5, 7, 10, 3, 4]`, return `3`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution203.java)

---

### Problem 204 (Easy)

> This problem was asked by Amazon.

Given a complete binary tree, count the number of nodes in faster than `O(n)` time. Recall that a complete binary tree has every level filled except the last, and the nodes in the last level are filled starting from the left.

[Solution](https://k5kc.com/cs/algorithms/count-complete-tree-nodes-problem/)

---

### Problem 205 (Easy)

This problem was asked by IBM.

Given an integer, find the next permutation of it in absolute order. For example, given `48975`, the next permutation would be `49578`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution205.java)

---

### Problem 206 (Easy)

This problem was asked by Twitter.

A permutation can be specified by an array `P`, where `P[i]` represents the location of the element at `i` in the permutation. For example, `[2, 1, 0]` represents the permutation where elements at the index `0` and `2` are swapped.

Given an array and a permutation, apply the permutation to the array. For example, given the array `["a", "b", "c"]` and the permutation `[2, 1, 0]`, return `["c", "b", "a"]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution206.java)

---

### Problem 207 (Medium)

This problem was asked by Dropbox.

Given an undirected graph `G`, check whether it is bipartite. Recall that a graph is bipartite if its vertices can be divided into two independent sets, `U` and `V`, such that no edge connects vertices of the same set.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution207.java)

---

### Problem 208 (Medium)

> This problem was asked by LinkedIn.

Given a linked list of numbers and a pivot `k`, partition the linked list so that all nodes less than `k` come before nodes greater than or equal to `k`.

For example, given the linked list `5 -> 1 -> 8 -> 0 -> 3` and `k = 3`, the solution could be `1 -> 0 -> 5 -> 8 -> 3`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution208.java)

---

### Problem 209 (Hard)

This problem was asked by YouTube.

Write a program that computes the length of the longest common subsequence of three given strings. For example, given "epidemiologist", "refrigeration", and "supercalifragilisticexpialodocious", it should return `5`, since the longest common subsequence is "eieio".

[Solution](solutions/src/main/java/com/vaani/dcp/Solution209.java)

---

### Problem 210 (Easy)

This problem was asked by Apple.

A Collatz sequence in mathematics can be defined as follows. Starting with any positive integer:

- If `n` is even, the next number in the sequence is `n / 2`
- If `n` is odd, the next number in the sequence is `3n + 1`
It is conjectured that every such sequence eventually reaches the number `1`. Test this conjecture.

Bonus: What input `n <= 1000000` gives the longest sequence?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution210.java)

---

### Problem 211 (Medium)

This problem was asked by Microsoft.

Given a string and a pattern, find the starting indices of all occurrences of the pattern in the string. For example, given the string "abracadabra" and the pattern "abr", you should return `[0, 7]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution211.java)

---

### Problem 212 (Easy)

This problem was asked by Dropbox.

Spreadsheets often use this alphabetical encoding for its columns: "A", "B", "C", ..., "AA", "AB", ..., "ZZ", "AAA", "AAB", ....

Given a column number, return its alphabetical column id. For example, given `1`, return "A". Given `27`, return "AA".

[Solution](solutions/src/main/java/com/vaani/dcp/Solution212.java)

---

### Problem 213 (Medium)

This problem was asked by Snapchat.

Given a string of digits, generate all possible valid IP address combinations.

IP addresses must follow the format `A.B.C.D`, where `A`, `B`, `C`, and `D` are numbers between `0` and `255`. Zero-prefixed numbers, such as `01` and `065`, are not allowed, except for `0` itself.

For example, given "2542540123", you should return `['254.25.40.123', '254.254.0.123']`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution213.java)

---

### Problem 214 (Easy)

This problem was asked by Stripe.

Given an integer `n`, return the length of the longest consecutive run of `1`s in its binary representation.

For example, given `156`, you should return `3`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution214.java)

---

### Problem 215 (Medium)

This problem was asked by Yelp.

The horizontal distance of a binary tree node describes how far left or right the node will be when the tree is printed out.

More rigorously, we can define it as follows:

- The horizontal distance of the root is `0`.
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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution215.java)

---

### Problem 216 (Medium)

> This problem was asked by Facebook.

Given a number in [Roman numeral](https://en.wikipedia.org/wiki/Roman_numerals) format, convert it to decimal.

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

In addition, note that the Roman numeral system uses [subtractive notation](https://en.wikipedia.org/wiki/Subtractive_notation) for numbers such as `IV` and `XL`.

For the input `XIV`, for instance, you should return `14`.

[Solution](https://k5kc.com/cs/algorithms/roman-to-integer-problem/)

---

### Problem 217 (Hard)

This problem was asked by Oracle.

We say a number is sparse if there are no adjacent ones in its binary representation. For example, `21` (`10101`) is sparse, but `22` (`10110`) is not. For a given input `N`, find the smallest sparse number greater than or equal to `N`.

Do this in faster than `O(N log N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution217.java)

---

### Problem 218 (Medium)

This problem was asked by Yahoo.

Write an algorithm that computes the reversal of a directed graph. For example, if a graph consists of `A -> B -> C`, it should become `A <- B <- C`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution218.java)

---

### Problem 219 (Hard)

This problem was asked by Salesforce.

Connect 4 is a game where opponents take turns dropping red or black discs into a `7 x 6` vertically suspended grid. The game ends either when one player creates a line of four consecutive discs of their color (horizontally, vertically, or diagonally), or when there are no more spots left in the grid.

Design and implement Connect 4.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution219.java)

---

### Problem 220 (Medium)

This problem was asked by Square.

In front of you is a row of N coins, with values `v_1, v_2, ..., v_n`.

You are asked to play the following game. You and an opponent take turns choosing either the first or last coin from the row, removing it from the row, and receiving the value of the coin.

Write a program that returns the maximum amount of money you can win with certainty, if you move first, assuming your opponent plays optimally.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution220.java)

---

### Problem 221 (Easy)

This problem was asked by Zillow.

Let's define a "sevenish" number to be one which is either a power of `7`, or the sum of unique powers of `7`. The first few sevenish numbers are `1, 7, 8, 49`, and so on. Create an algorithm to find the `n`th sevenish number.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution221.java)

---

### Problem 222 (Medium)

This problem was asked by Quora.

Given an absolute pathname that may have `.` or `..` as part of it, return the shortest standardized path.

For example, given `/usr/bin/../bin/./scripts/../`, return `/usr/bin/`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution222.java)

---

### Problem 223 (Hard)

> This problem was asked by Palantir.

Typically, an implementation of in-order traversal of a binary tree has `O(h)` space complexity, where `h` is the height of the tree. Write a program to compute the in-order traversal of a binary tree using `O(1)` space.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution223.java)

---

### Problem 224 (Easy)

This problem was asked by Amazon.

Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.

For example, for the input `[1, 2, 3, 10]`, you should return `7`.

Do this in `O(N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution224.java)

---

### Problem 225 (Easy)

This problem was asked by Bloomberg.

There are `N` prisoners standing in a circle, waiting to be executed. The executions are carried out starting with the `k`th person, and removing every successive `k`th person going clockwise until there is no one left.

Given `N` and `k`, write an algorithm to determine where a prisoner should stand in order to be the last survivor.

For example, if `N = 5` and `k = 2`, the order of executions would be `[2, 4, 1, 5, 3]`, so you should return `3`.

Bonus: Find an `O(log N)` solution if `k = 2`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution225.java)

---

### Problem 226 (Hard)

This problem was asked by Airbnb.

You come across a dictionary of sorted words in a language you've never seen before. Write a program that returns the correct order of letters in this language.

For example, given `['xww', 'wxyz', 'wxyw', 'ywx', 'ywz']`, you should return `['x', 'z', 'w', 'y']`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution226.java)

---

### Problem 227 (Easy)

This problem was asked by Facebook.

Boggle is a game played on a `4 x 4` grid of letters. The goal is to find as many words as possible that can be formed by a sequence of adjacent letters in the grid, using each cell at most once. Given a game board and a dictionary of valid words, implement a Boggle solver.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution227.java)

---

### Problem 228 (Medium)

This problem was asked by Twitter.

Given a list of numbers, create an algorithm that arranges them in order to form the largest possible integer. For example, given `[10, 7, 76, 415]`, you should return `77641510`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution228.java)

---

### Problem 229 (Medium)

This problem was asked by Flipkart.

[Snakes and Ladders](https://en.wikipedia.org/wiki/Snakes_and_Ladders) is a game played on a `10 x 10` board, the goal of which is get from square `1` to square `100`. On each turn players will roll a six-sided die and move forward a number of spaces equal to the result. If they land on a square that represents a snake or ladder, they will be transported ahead or behind, respectively, to a new square.

Find the smallest number of turns it takes to play snakes and ladders.

For convenience, here are the squares representing snakes and ladders, and their outcomes:

```
snakes = {16: 6, 48: 26, 49: 11, 56: 53, 62: 19, 64: 60, 87: 24, 93: 73, 95: 75, 98: 78}
ladders = {1: 38, 4: 14, 9: 31, 21: 42, 28: 84, 36: 44, 51: 67, 71: 91, 80: 100}
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution229.java)

---

### Problem 230 (Medium)

> This problem was asked by Goldman Sachs.

You are given `N` identical eggs and access to a building with `k` floors. Your task is to find the lowest floor that will cause an egg to break, if dropped from that floor. Once an egg breaks, it cannot be dropped again. If an egg breaks when dropped from the `x`th floor, you can assume it will also break when dropped from any floor greater than `x`.

Write an algorithm that finds the minimum number of trial drops it will take, in the worst case, to identify this floor.

For example, if `N = 1` and `k = 5`, we will need to try dropping the egg at every floor, beginning with the first, until we reach the fifth floor, so our solution will be `5`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution230.java)

---

### Problem 231 (Easy)

This problem was asked by IBM.

Given a string with repeated characters, rearrange the string so that no two adjacent characters are the same. If this is not possible, return `None`.

For example, given "aaabbc", you could return "ababac". Given "aaab", return `None`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution231.java)

---

### Problem 232 (Easy)

This problem was asked by Google.

Implement a `PrefixMapSum` class with the following methods:

`insert(key: str, value: int)`: Set a given key's value in the map. If the key already exists, overwrite the value.
`sum(prefix: str)`: Return the sum of all values of keys that begin with a given prefix.

For example, you should be able to run the following code:

```
mapsum.insert("columnar", 3)
assert mapsum.sum("col") == 3

mapsum.insert("column", 2)
assert mapsum.sum("col") == 5
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution232.java)

---

### Problem 233 (Easy)

This problem was asked by Apple.

Implement the function `fib(n)`, which returns the `nth` number in the Fibonacci sequence, using only `O(1)` space.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution233.java)

---

### Problem 234 (Hard)

This problem was asked by Microsoft.

Recall that the minimum spanning tree is the subset of edges of a tree that connect all its vertices with the smallest possible total edge weight. Given an undirected graph with weighted edges, compute the maximum weight spanning tree.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution234.java)

---

### Problem 235 (Hard)

This problem was asked by Facebook.

Given an array of numbers of length `N`, find both the minimum and maximum using less than `2 * (N - 2)` comparisons.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution235.java)

---

### Problem 236 (Medium)

This problem was asked by Nvidia.

You are given a list of `N` points `(x1, y1), (x2, y2), ..., (xN, yN)` representing a polygon. You can assume these points are given in order; that is, you can construct the polygon by connecting point `1` to point `2`, point `2` to point `3`, and so on, finally looping around to connect point `N` to point `1`.

Determine if a new point `p` lies inside this polygon. (If `p` is on the boundary of the polygon, you should return `False`).

[Solution](solutions/src/main/java/com/vaani/dcp/Solution236.md)

---

### Problem 237 (Easy)

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

### Problem 238 (Hard)

This problem was asked by MIT.

[Blackjack](https://en.wikipedia.org/wiki/Blackjack) is a two player card game whose rules are as follows:

- The player and then the dealer are each given two cards.
- The player can then "hit", or ask for arbitrarily many additional cards, so long as their total does not exceed `21`.
- The dealer must then hit if their total is `16` or lower, otherwise pass.
- Finally, the two compare totals, and the one with the greatest sum not exceeding `21` is the winner.

For this problem, cards values are counted as follows: each card between `2` and `10` counts as their face value, face cards count as `10`, and aces count as `1`.

Given perfect knowledge of the sequence of cards in the deck, implement a blackjack solver that maximizes the player's score (that is, wins minus losses).

[Solution](solutions/src/main/java/com/vaani/dcp/Solution238.java)

---

### Problem 239 (Medium)

> This problem was asked by Uber.

One way to unlock an Android phone is through a pattern of swipes across a `1-9` keypad.

For a pattern to be valid, it must satisfy the following:

- All of its keys must be distinct.
- It must not connect two keys by jumping over a third key, unless that key has already been used.

For example, `4 - 2 - 1 - 7` is a valid pattern, whereas `2 - 1 - 7` is not.

Find the total number of valid unlock patterns of length `N`, where `1 <= N <= 9`.

[Solution](https://k5kc.com/cs/algorithms/android-unlock-patterns-problem/)

---

### Problem 240 (Hard)

This problem was asked by Spotify.

There are `N` couples sitting in a row of length `2 * N`. They are currently ordered randomly, but would like to rearrange themselves so that each couple's partners can sit side by side.

What is the minimum number of swaps necessary for this to happen?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution240.md)

---

### Problem 241 (Easy)

This problem was asked by Palantir.

In academia, the h-index is a metric used to calculate the impact of a researcher's papers. It is calculated as follows:

A researcher has index `h` if at least `h` of her `N` papers have `h` citations each. If there are multiple `h` satisfying this formula, the maximum is chosen.

For example, suppose `N = 5`, and the respective citations of each paper are `[4, 3, 0, 1, 5]`. Then the h-index would be `3`, since the researcher has `3` papers with at least `3` citations.

Given a list of paper citations of a researcher, calculate their h-index.

[Solution](https://k5kc.com/cs/algorithms/get-equal-substrings-within-budget/)

---

### Problem 242 (Hard)

This problem was asked by Twitter.

You are given an array of length `24`, where each element represents the number of new subscribers during the corresponding hour. Implement a data structure that efficiently supports the following:

- `update(hour: int, value: int)`: Increment the element at index `hour` by `value`.
- `query(start: int, end: int)`: Retrieve the number of subscribers that have signed up between `start` and `end` (inclusive).

You can assume that all values get cleared at the end of the day, and that you will not be asked for `start` and `end` values that wrap around midnight.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution242.java)

---

### Problem 243 (Medium)

This problem was asked by Etsy.

Given an array of numbers `N` and an integer `k`, your task is to split `N` into `k` partitions such that the maximum sum of any partition is minimized. Return this sum.

For example, given `N = [5, 1, 2, 7, 3, 4]` and `k = 3`, you should return `8`, since the optimal partition is `[5, 1, 2], [7], [3, 4]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution243.java)

---

### Problem 244 (Easy)

This problem was asked by Square.

The Sieve of Eratosthenes is an algorithm used to generate all prime numbers smaller than N. The method is to take increasingly larger prime numbers, and mark their multiples as composite.

For example, to find all primes less than 100, we would first mark `[4, 6, 8, ...]` (multiples of two), then `[6, 9, 12, ...]` (multiples of three), and so on. Once we have done this for all primes less than `N`, the unmarked numbers that remain will be prime.

Implement this algorithm.

Bonus: Create a generator that produces primes indefinitely (that is, without taking `N` as an input).

[Solution](solutions/src/main/java/com/vaani/dcp/Solution244.java)

---

### Problem 245 (Medium)

This problem was asked by Yelp.

You are given an array of integers, where each element represents the maximum number of steps that can be jumped going forward from that element. Write a function to return the minimum number of jumps you must take in order to get from the start to the end of the array.

For example, given `[6, 2, 4, 0, 5, 1, 1, 4, 2, 9]`, you should return `2`, as the optimal solution involves jumping from `6` to `5`, and then from `5` to `9`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution245.java)

---

### Problem 246 (Medium)

This problem was asked by Dropbox.

Given a list of words, determine whether the words can be chained to form a circle. A word `X` can be placed in front of another word `Y` in a circle if the last character of `X` is same as the first character of `Y`.

For example, the words `['chair', 'height', 'racket', 'touch', 'tunic']` can form the following circle: `chair -> racket -> touch -> height -> tunic -> chair`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution246.java)

---

### Problem 247 (Medium)

This problem was asked by PayPal.

Given a binary tree, determine whether or not it is height-balanced. A height-balanced binary tree can be defined as one in which the heights of the two subtrees of any node never differ by more than one.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution247.java)

---

### Problem 248 (Hard)

This problem was asked by Nvidia.

Find the maximum of two numbers without using any if-else statements, branching, or direct comparisons.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution248.java)

---

### Problem 249 (Hard)

This problem was asked by Salesforce.

Given an array of integers, find the maximum XOR of any two elements.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution249.java)

---

### Problem 250 (Medium)

This problem was asked by Google.

A cryptarithmetic puzzle is a mathematical game where the digits of some numbers are represented by letters. Each letter represents a unique digit.

For example, a puzzle of the form:

```
  SEND
+ MORE
-----
 MONEY
```

may have the solution:

```
{'S': 9, 'E': 5, 'N': 6, 'D': 7, 'M': 1, 'O', 0, 'R': 8, 'Y': 2}
```

Given a three-word puzzle like the one above, create an algorithm that finds a solution.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution250.java)

---

### Problem 251 (Medium)

This problem was asked by Amazon.

Given an array of a million integers between zero and a billion, out of order, how can you efficiently sort it? Assume that you cannot store an array of a billion elements in memory.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution251.md)

---

### Problem 252 (Easy)

This problem was asked by Palantir.

The ancient Egyptians used to express fractions as a sum of several terms where each numerator is one. For example, `4 / 13` can be represented as `1 / (4 + 1 / (18 + (1 / 468)))`.

Create an algorithm to turn an ordinary fraction `a / b`, where `a < b`, into an Egyptian fraction.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution252.java)

---

### Problem 253 (Medium)

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

### Problem 254 (Medium)

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution254.java)

---

### Problem 255 (Easy)

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

### Problem 256 (Medium)

This problem was asked by Fitbit.

Given a linked list, rearrange the node values such that they appear in alternating `low -> high -> low -> high` ... form. For example, given `1 -> 2 -> 3 -> 4 -> 5`, you should return `1 -> 3 -> 2 -> 5 -> 4`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution256.java)

---

### Problem 257 (Easy)

This problem was asked by WhatsApp.

Given an array of integers out of order, determine the bounds of the smallest window that must be sorted in order for the entire array to be sorted. For example, given `[3, 7, 5, 6, 9]`, you should return `(1, 3)`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution257.java)

---

### Problem 258 (Easy)

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

### Problem 259 (Hard)

This problem was asked by Two Sigma.

Ghost is a two-person word game where players alternate appending letters to a word. The first person who spells out a word, or creates a prefix for which there is no possible continuation, loses. Here is a sample game:

- Player 1: `g`
- Player 2: `h`
- Player 1: `o`
- Player 2: `s`
- Player 1: `t` [loses]

Given a dictionary of words, determine the letters the first player should start with, such that with optimal play they cannot lose.

For example, if the dictionary is `["cat", "calf", "dog", "bear"]`, the only winning start letter would be `b`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution259.java)

---

### Problem 260 (Medium)

This problem was asked by Pinterest.

The sequence `[0, 1, ..., N]` has been jumbled, and the only clue you have for its order is an array representing whether each number is larger or smaller than the last. Given this information, reconstruct an array that is consistent with it. For example, given `[None, +, +, -, +]`, you could return `[1, 2, 3, 0, 4]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution260.java)

---

### Problem 261 (Easy)

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution261.java)

---

### Problem 262 (Medium)

This problem was asked by Mozilla.

A bridge in a connected (undirected) graph is an edge that, if removed, causes the graph to become disconnected. Find all the bridges in a graph.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution262.md)

---

### Problem 263 (Medium)

This problem was asked by Nest.

Create a basic sentence checker that takes in a stream of characters and determines whether they form valid sentences. If a sentence is valid, the program should print it out.

We can consider a sentence valid if it conforms to the following rules:

1. The sentence must start with a capital letter, followed by a lowercase letter or a space.
2. All other characters must be lowercase letters, separators (`,`,`;`,`:`) or terminal marks (`.`,`?`,`!`,`‽`).
3. There must be a single space between each word.
4. The sentence must end with a terminal mark immediately following a word.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution263.java)

---

### Problem 264 (Hard)

This problem was asked by LinkedIn.

Given a set of characters `C` and an integer `k`, a De Bruijn sequence is a cyclic sequence in which every possible `k`-length string of characters in `C` occurs exactly once.

For example, suppose `C = {0, 1}` and `k = 3`. Then our sequence should contain the substrings `{'000', '001', '010', '011', '100', '101', '110', '111'}`, and one possible solution would be `00010111`.

Create an algorithm that finds a De Bruijn sequence.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution264.java)

---

### Problem 265 (Easy)

This problem was asked by Atlassian.

MegaCorp wants to give bonuses to its employees based on how many lines of codes they have written. They would like to give the smallest positive amount to each worker consistent with the constraint that if a developer has written more lines of code than their neighbor, they should receive more money.

Given an array representing a line of seats of employees at MegaCorp, determine how much each one should get paid.

For example, given `[10, 40, 200, 1000, 60, 30]`, you should return `[1, 2, 3, 4, 2, 1]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution265.java)

---

### Problem 266 (Easy)

This problem was asked by Pivotal.

A step word is formed by taking a given word, adding a letter, and anagramming the result. For example, starting with the word "APPLE", you can add an "A" and anagram to get "APPEAL".

Given a dictionary of words and an input word, create a function that returns all valid step words.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution266.java)

---

### Problem 267 (Hard)

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution267.java)

---

### Problem 268 (Medium)

This problem was asked by Indeed.

Given a 32-bit positive integer `N`, determine whether it is a power of four in faster than `O(log N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution268.java)

---

### Problem 269 (Easy)

This problem was asked by Microsoft.

You are given an string representing the initial conditions of some dominoes. Each element can take one of three values:

- `L`, meaning the domino has just been pushed to the left,
- `R`, meaning the domino has just been pushed to the right, or
- `.`, meaning the domino is standing still.

Determine the orientation of each tile when the dominoes stop falling. Note that if a domino receives a force from the left and right side simultaneously, it will remain upright.

For example, given the string `.L.R....L`, you should return `LL.RRRLLL`.

Given the string `..R...L.L`, you should return `..RR.LLLL`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution269.java)

---

### Problem 270 (Medium)

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

### Problem 271 (Hard)

This problem was asked by Netflix.

Given a sorted list of integers of length `N`, determine if an element `x` is in the list without performing any multiplication, division, or bit-shift operations.

Do this in `O(log N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution271.java)

---

### Problem 272 (Medium)

This problem was asked by Spotify.

Write a function, `throw_dice(N, faces, total)`, that determines how many ways it is possible to throw `N` dice with some number of faces each to get a specific total.

For example, `throw_dice(3, 6, 7)` should equal `15`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution272.java)

---

### Problem 273 (Easy)

> This problem was asked by Apple.

A fixed point in an array is an element whose value is equal to its index. Given a sorted array of distinct elements, return a fixed point, if one exists. Otherwise, return `False`.

For example, given `[-6, 0, 2, 40]`, you should return `2`. Given `[1, 5, 7, 8]`, you should return `False`.

[Solution](https://k5kc.com/cs/algorithms/find-fixed-point-in-sorted-array/)

---

### Problem 274 (Hard)

> This problem was asked by Facebook.

Given a string consisting of parentheses, single digits, and positive and negative signs, convert the string into a mathematical expression to obtain the answer.

Don't use eval or a similar built-in parser.

For example, given `'-1 + (2 + 3)'`, you should return `4`.

[Solution](https://k5kc.com/cs/algorithms/basic-calculator-1-problem/)

---

### Problem 275 (Medium)

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

### Problem 276 (Hard)

This problem was asked by Dropbox.

Implement an efficient string matching algorithm.

That is, given a string of length `N` and a pattern of length `k`, write a program that searches for the pattern in the string with less than `O(N * k)` worst-case time complexity.

If the pattern is found, return the start index of its location. If not, return `False`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution276.java)

---

### Problem 277 (Easy)

This problem was asked by Google.

UTF-8 is a character encoding that maps each symbol to one, two, three, or four bytes.

For example, the Euro sign, `€`, corresponds to the three bytes `11100010 10000010 10101100`. The rules for mapping characters are as follows:

- For a single-byte character, the first bit must be zero.
- For an `n`-byte character, the first byte starts with `n` ones and a zero. The other `n - 1` bytes all start with `10`.
Visually, this can be represented as follows.

```
 Bytes   |           Byte format
--------------------------
   1     | 0xxxxxxx
   2     | 110xxxxx 10xxxxxx
   3     | 1110xxxx 10xxxxxx 10xxxxxx
   4     | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
```

Write a program that takes in an array of integers representing byte values, and returns whether it is a valid UTF-8 encoding.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution277.java)

---

### Problem 278 (Easy)

This problem was asked by Amazon.

Given an integer `N`, construct all possible binary search trees with `N` nodes.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution278.java)

---

### Problem 279 (Easy)

This problem was asked by Twitter.

A classroom consists of `N` students, whose friendships can be represented in an adjacency list. For example, the following descibes a situation where `0` is friends with `1` and `2`, `3` is friends with `6`, and so on.

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

### Problem 280 (Easy)

This problem was asked by Pandora.

Given an undirected graph, determine if it contains a cycle.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution280.java)

---

### Problem 281 (Medium)

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

### Problem 282 (Easy)

This problem was asked by Netflix.

Given an array of integers, determine whether it contains a Pythagorean triplet. Recall that a Pythogorean triplet `(a, b, c)` is defined by the equation `a^2 + b^2 = c^2`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution282.java)

---

### Problem 283 (Easy)

This problem was asked by Google.

A regular number in mathematics is defined as one which evenly divides some power of `60`. Equivalently, we can say that a regular number is one whose only prime divisors are `2`, `3`, and `5`.

These numbers have had many applications, from helping ancient Babylonians keep time to tuning instruments according to the diatonic scale.

Given an integer `N`, write a program that returns, in order, the first `N` regular numbers.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution283.java)

---

### Problem 284 (Medium)

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

### Problem 285 (Medium)

> This problem was asked by Mailchimp.

You are given an array representing the heights of neighboring buildings on a city street, from east to west. The city assessor would like you to write an algorithm that returns how many of these buildings have a view of the setting sun, in order to properly value the street.

For example, given the array `[3, 7, 8, 3, 6, 1]`, you should return `3`, since the top floors of the buildings with heights `8`, `6`, and `1` all have an unobstructed view to the west.

Can you do this using just one forward pass through the array?

[Solution](https://k5kc.com/cs/algorithms/buildings-with-sunset-view-problem/)

---

### Problem 286 (Hard)

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
------------
```

As a result, your function should return `[(0, 3), (4, 5), (11, 3), (15, 0), (19, 4), (23, 0)]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution286.java)

---

### Problem 287 (Medium)

This problem was asked by Quora.

You are given a list of `(website, user)` pairs that represent users visiting websites. Come up with a program that identifies the top `k` pairs of websites with the greatest similarity.

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

### Problem 288 (Medium)

This problem was asked by Salesforce.

The number 6174 is known as Kaprekar's contant, after the mathematician who discovered an associated property: for all four-digit numbers with at least two distinct digits, repeatedly applying a simple procedure eventually results in this value. The procedure is as follows:

- For a given input `x`, create two new numbers that consist of the digits in `x` in ascending and descending order.
- Subtract the smaller number from the larger number.

For example, this algorithm terminates in three steps when starting from `1234`:

- `4321 - 1234 = 3087`
- `8730 - 0378 = 8352`
- `8532 - 2358 = 6174`

Write a function that returns how many steps this will take for a given input `N`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution288.java)

---

### Problem 289 (Hard)

This problem was asked by Google.

The game of Nim is played as follows. Starting with three heaps, each containing a variable number of items, two players take turns removing one or more items from a single pile. The player who eventually is forced to take the last stone loses. For example, if the initial heap sizes are `3`, `4`, and `5`, a game could be played as shown below:

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

### Problem 290 (Easy)

This problem was asked by Facebook.

On a mysterious island there are creatures known as Quxes which come in three colors: red, green, and blue. One power of the Qux is that if two of them are standing next to each other, they can transform into a single creature of the third color.

Given N Quxes standing in a line, determine the smallest number of them remaining after any possible sequence of such transformations.

For example, given the input `['R', 'G', 'B', 'G', 'B']`, it is possible to end up with a single Qux through the following steps:

```
        Arrangement       |   Change
----------------------
['R', 'G', 'B', 'G', 'B'] | (R, G) -> B
['B', 'B', 'G', 'B']      | (B, G) -> R
['B', 'R', 'B']           | (R, B) -> G
['B', 'G']                | (B, G) -> R
['R']                     |
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution290.java)

---

### Problem 291 (Medium)

This problem was asked by Glassdoor.

An imminent hurricane threatens the coastal town of Codeville. If at most two people can fit in a rescue boat, and the maximum weight limit for a given boat is `k`, determine how many boats will be needed to save everyone.

For example, given a population with weights `[100, 200, 150, 80]` and a boat limit of `200`, the smallest number of boats required will be three.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution291.java)

---

### Problem 292 (Hard)

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

### Problem 293 (Hard)

This problem was asked by Uber.

You have `N` stones in a row, and would like to create from them a pyramid. This pyramid should be constructed such that the height of each stone increases by one until reaching the tallest stone, after which the heights decrease by one. In addition, the start and end stones of the pyramid should each be one stone high.

You can change the height of any stone by paying a cost of `1` unit to lower its height by `1`, as many times as necessary. Given this information, determine the lowest cost method to produce this pyramid.

For example, given the stones `[1, 1, 3, 3, 2, 1]`, the optimal solution is to pay `2` to create `[0, 1, 2, 3, 2, 1]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution293.java)

---

### Problem 294 (Medium)

> This problem was asked by Square.

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

[Solution](https://k5kc.com/cs/algorithms/shortest-uphill-downhill-route-for-a-competitive-runner/)

---

### Problem 295 (Medium)

> This problem was asked by Stitch Fix.

Pascal's triangle is a triangular array of integers constructed with the following formula:

- The first row consists of the number `1`.
- For each subsequent row, each element is the sum of the numbers directly above it, on either side.

For example, here are the first few rows:

```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```

Given an input `k`, return the `k``th` row of Pascal's triangle.

Bonus: Can you do this using only `O(k)` space?

[Solution](https://k5kc.com/cs/algorithms/pascal-s-triangle-1-generate-first-n-rows/)

---

### Problem 296 (Hard)

This problem was asked by Etsy.

Given a sorted array, convert it into a height-balanced binary search tree.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution296.java)

---

### Problem 297 (Medium)

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

### Problem 298 (Easy)

This problem was asked by Google.

A girl is walking along an apple orchard with a bag in each hand. She likes to pick apples from each tree as she goes along, but is meticulous about not putting different kinds of apples in the same bag.

Given an input describing the types of apples she will pass on her path, in order, determine the length of the longest portion of her path that consists of just two types of apple trees.

For example, given the input `[2, 1, 2, 3, 3, 1, 3, 5]`, the longest portion will involve types `1` and `3`, with a length of four.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution298.java)

---

### Problem 299 (Medium)

This problem was asked by Samsung.

A group of houses is connected to the main water plant by means of a set of pipes. A house can either be connected by a set of pipes extending directly to the plant, or indirectly by a pipe to a nearby house which is otherwise connected.

For example, here is a possible configuration, where `A`, `B`, and `C` are houses, and arrows represent pipes:
```
A <--> B <--> C <--> plant
```

Each pipe has an associated cost, which the utility company would like to minimize. Given an undirected graph of pipe connections, return the lowest cost configuration of pipes such that each house has access to water.

In the following setup, for example, we can remove all but the pipes from `plant` to `A`, `plant` to `B`, and `B` to `C`, for a total cost of `16`.

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

### Problem 300 (Easy)

This problem was asked by Uber.

On election day, a voting machine writes data in the form `(voter_id, candidate_id)` to a text file. Write a program that reads this file as a stream and returns the top `3` candidates at any given time. If you find a voter voting more than once, report this as fraud.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution300.java)

---

### Problem 301 (Medium)

This problem was asked by Triplebyte.

Implement a data structure which carries out the following operations without resizing the underlying array:

- `add(value)`: Add a value to the set of values.
- `check(value)`: Check whether a value is in the set.

The `check` method may return occasional false positives (in other words, incorrectly identifying an element as part of the set), but should always correctly identify a true element.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution301.java)

---

### Problem 302 (Medium)

> This problem was asked by Uber.

You are given a 2-d matrix where each cell consists of either `/`, `\`, or an empty space. Write an algorithm that determines into how many regions the slashes divide the space.

For example, suppose the input for a three-by-six grid is the following:

```
\    /
 \  /
  \/
```

Considering the edges of the matrix as boundaries, this divides the grid into three triangles, so you should return `3`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution302.java)

---

### Problem 303 (Easy)

This problem was asked by Microsoft.

Given a clock time in `hh:mm` format, determine, to the nearest degree, the angle between the hour and the minute hands.

Bonus: When, during the course of a day, will the angle be zero?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution303.java)

---

### Problem 304 (Hard)

This problem was asked by Two Sigma.

A knight is placed on a given square on an `8 x 8` chessboard. It is then moved randomly several times, where each move is a standard [knight move](https://en.wikipedia.org/wiki/Knight_(chess)#Movement). If the knight jumps off the board at any point, however, it is not allowed to jump back on.

After `k` moves, what is the probability that the knight remains on the board?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution304.java)

---

### Problem 305 (Easy)

This problem was asked by Amazon.

Given a linked list, remove all consecutive nodes that sum to zero. Print out the remaining nodes.

For example, suppose you are given the input `3 -> 4 -> -7 -> 5 -> -6 -> 6`. In this case, you should first remove `3 -> 4 -> -7`, then `-6 -> 6`, leaving only `5`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution305.java)

---

### Problem 306 (Medium)

> This problem was asked by Palantir.

You are given a list of `N` numbers, in which each number is located at most `k` places away from its sorted position. For example, if `k = 1`, a given element at index `4` might end up at indices `3`, `4`, or `5`.

Come up with an algorithm that sorts this list in `O(N log k)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution306.java)

---

### Problem 307 (Easy)

This problem was asked by Oracle.

Given a binary search tree, find the floor and ceiling of a given integer. The floor is the highest element in the tree less than or equal to an integer, while the ceiling is the lowest element in the tree greater than or equal to an integer.

If either value does not exist, return None.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution307.java)

---

### Problem 308 (Hard)

This problem was asked by Quantcast.

You are presented with an array representing a Boolean expression. The elements are of two kinds:

- `T` and `F`, representing the values `True` and `False`.
- `&`, `|`, and `^`, representing the bitwise operators for `AND`, `OR`, and `XOR`.

Determine the number of ways to group the array elements using parentheses so that the entire expression evaluates to `True`.

For example, suppose the input is `['F', '|', 'T', '&', 'T']`. In this case, there are two acceptable groupings: `(F | T) & T` and `F | (T & T)`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution308.java)

---

### Problem 309 (Medium)

This problem was asked by Walmart Labs.

There are `M` people sitting in a row of `N` seats, where `M < N`. Your task is to redistribute people such that there are no gaps between any of them, while keeping overall movement to a minimum.

For example, suppose you are faced with an input of `[0, 1, 1, 0, 1, 0, 0, 0, 1]`, where `0` represents an empty seat and `1` represents a person. In this case, one solution would be to place the person on the right in the fourth seat. We can consider the cost of a solution to be the sum of the absolute distance each person must move, so that the cost here would be five.

Given an input such as the one above, return the lowest possible cost of moving people to remove all gaps.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution309.java)

---

### Problem 310 (Easy)

This problem was asked by Pivotal.

Write an algorithm that finds the total number of set bits in all integers between `1` and `N`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution310.java)

### Problem 311 (Easy)

> This problem was asked by Sumo Logic.

Given a array that's sorted but rotated at some unknown pivot, in which all elements are distinct, find a "peak" element in `O(log N)` time.

An element is considered a peak if it is greater than both its left and right neighbors. It is guaranteed that the first and last elements are lower than all others.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution311.java)

---

### Problem 312 (Easy)

This problem was asked by Wayfair.

You are given a `2 x N` board, and instructed to completely cover the board with the following shapes:

- Dominoes, or `2 x 1` rectangles.
- Trominoes, or L-shapes.

For example, if `N = 4`, here is one possible configuration, where A is a domino, and B and C are trominoes.

```
A B B C
A B C C
```

Given an integer `N`, determine in how many ways this task is possible.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution312.java)

---

### Problem 313 (Hard)

This problem was asked by Citrix.

You are given a circular lock with three wheels, each of which display the numbers `0` through `9` in order. Each of these wheels rotate clockwise and counterclockwise.

In addition, the lock has a certain number of "dead ends", meaning that if you turn the wheels to one of these combinations, the lock becomes stuck in that state and cannot be opened.

Let us consider a "move" to be a rotation of a single wheel by one digit, in either direction. Given a lock initially set to `000`, a target combination, and a list of dead ends, write a function that returns the minimum number of moves required to reach the target state, or `None` if this is impossible.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution313.java)

---

### Problem 314 (Medium)

This problem was asked by Spotify.

You are the technical director of WSPT radio, serving listeners nationwide. For simplicity's sake we can consider each listener to live along a horizontal line stretching from `0` (west) to `1000` (east).

Given a list of `N` listeners, and a list of `M` radio towers, each placed at various locations along this line, determine what the minimum broadcast range would have to be in order for each listener's home to be covered.

For example, suppose `listeners = [1, 5, 11, 20]`, and `towers = [4, 8, 15]`. In this case the minimum range would be `5`, since that would be required for the tower at position `15` to reach the listener at position `20`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution314.java)

---

### Problem 315 (Easy)

This problem was asked by Google.

In linear algebra, a Toeplitz matrix is one in which the elements on any given diagonal from top left to bottom right are identical.

Here is an example:

```
1 2 3 4 8
5 1 2 3 4
4 5 1 2 3
7 4 5 1 2
```

Write a program to determine whether a given input is a Toeplitz matrix.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution315.java)

---

### Problem 316 (Medium)

This problem was asked by Snapchat.

You are given an array of length `N`, where each element `i` represents the number of ways we can produce `i` units of change. For example, `[1, 0, 1, 1, 2]` would indicate that there is only one way to make `0`, `2`, or `3` units, and two ways of making `4` units.

Given such an array, determine the denominations that must be in use. In the case above, for example, there must be coins with value `2`, `3`, and `4`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution316.java)

---

### Problem 317 (Medium)

This problem was asked by Yahoo.

Write a function that returns the bitwise `AND` of all integers between `M` and `N`, inclusive.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution317.java)

---

### Problem 318 (Hard)

This problem was asked by Apple.

You are going on a road trip, and would like to create a suitable music playlist. The trip will require `N` songs, though you only have `M` songs downloaded, where `M < N`. A valid playlist should select each song at least once, and guarantee a buffer of `B` songs between repeats.

Given `N`, `M`, and `B`, determine the number of valid playlists.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution318.java)

---

### Problem 319 (Hard)

This problem was asked by Airbnb.

An 8-puzzle is a game played on a `3 x 3` board of tiles, with the ninth tile missing. The remaining tiles are labeled `1` through `8` but shuffled randomly. Tiles may slide horizontally or vertically into an empty space, but may not be removed from the board.

Design a class to represent the board, and find a series of steps to bring the board to the state `[[1, 2, 3], [4, 5, 6], [7, 8, None]]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution319.java)

---

### Problem 320 (Medium)

This problem was asked by Amazon.

Given a string, find the length of the smallest window that contains every distinct character. Characters may appear more than once in the window.

For example, given "jiujitsu", you should return `5`, corresponding to the final five letters.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution320.java)

---

### Problem 321 (Easy)

This problem was asked by PagerDuty.

Given a positive integer `N`, find the smallest number of steps it will take to reach `1`.

There are two kinds of permitted steps:

- You may decrement `N` to `N - 1`.
- If `a * b = N`, you may decrement `N` to the larger of `a` and `b`.

For example, given `100`, you can reach `1` in five steps with the following route: `100 -> 10 -> 9 -> 3 -> 2 -> 1`.

[Solution](https://k5kc.com/cs/algorithms/minimum-steps-to-reduce-number-to-1/)

---

### Problem 322 (Medium)

> This problem was asked by Flipkart.

Starting from 0 on a number line, you would like to make a series of jumps that lead to the integer N.

On the `ith` jump, you may move exactly `i` places to the left or right.

Find a path with the fewest number of jumps required to get from `0` to `N`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution322.java)

---

### Problem 323 (Medium)

> This problem was asked by Dropbox.

Create an algorithm to efficiently compute the approximate median of a list of numbers.

More precisely, given an unordered list of `N` numbers, find an element whose rank is between `N / 4` and `3 * N / 4`, with a high level of certainty, in less than `O(N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution323.java)

---

### Problem 324 (Easy)

This problem was asked by Amazon.

Consider the following scenario: there are `N` mice and `N` holes placed at integer points along a line. Given this, find a method that maps mice to holes such that the largest number of steps any mouse takes is minimized.

Each move consists of moving one mouse one unit to the left or right, and only one mouse can fit inside each hole.

For example, suppose the mice are positioned at `[1, 4, 9, 15]`, and the holes are located at `[10, -5, 0, 16]`. In this case, the best pairing would require us to send the mouse at `1` to the hole at `-5`, so our function should return `6`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution324.java)

---

### Problem 325 (Easy)

This problem was asked by Jane Street.

The United States uses the imperial system of weights and measures, which means that there are many different, seemingly arbitrary units to measure distance. There are 12 inches in a foot, 3 feet in a yard, 22 yards in a chain, and so on.

Create a data structure that can efficiently convert a certain quantity of one unit to the correct amount of any other unit. You should also allow for additional units to be added to the system.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution325.java)

---

### Problem 326 (Hard)

This problem was asked by Netflix.

A Cartesian tree with sequence `S` is a binary tree defined by the following two properties:

It is heap-ordered, so that each parent value is strictly less than that of its children.
An in-order traversal of the tree produces nodes with values that correspond exactly to `S`.
For example, given the sequence `[3, 2, 6, 1, 9]`, the resulting Cartesian tree would be:

```
      1
    /   \   
  2       9
 / \
3   6
```

Given a sequence `S`, construct the corresponding Cartesian tree.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution326.java)

---

### Problem 327 (Easy)

This problem was asked by Salesforce.

Write a program to merge two binary trees. Each node in the new tree should hold a value equal to the sum of the values of the corresponding nodes of the input trees.

If only one input tree has a node in a given position, the corresponding node in the new tree should match that input node.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution327.java)

---

### Problem 328 (Medium)

This problem was asked by Facebook.

In chess, the Elo rating system is used to calculate player strengths based on game results.

A simplified description of the Elo system is as follows. Every player begins at the same score. For each subsequent game, the loser transfers some points to the winner, where the amount of points transferred depends on how unlikely the win is. For example, a 1200-ranked player should gain much more points for beating a 2000-ranked player than for beating a 1300-ranked player.

Implement this system.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution328.java)

---

### Problem 329 (Hard)

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution329.java)

---

### Problem 330 (Hard)

This problem was asked by Dropbox.

A Boolean formula can be said to be satisfiable if there is a way to assign truth values to each variable such that the entire formula evaluates to true.

For example, suppose we have the following formula, where the symbol `¬` is used to denote negation:

```
(¬c OR b) AND (b OR c) AND (¬b OR c) AND (¬c OR ¬a)
```

One way to satisfy this formula would be to let `a = False`, `b = True`, and `c = True`.

This type of formula, with `AND` statements joining tuples containing exactly one `OR`, is known as `2-CNF`.

Given a `2-CNF` formula, find a way to assign truth values to satisfy it, or return `False` if this is impossible.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution330.java)

---

### Problem 331 (Medium)

This problem was asked by LinkedIn.

You are given a string consisting of the letters `x` and `y`, such as `xyxxxyxyy`. In addition, you have an operation called flip, which changes a single `x` to `y` or vice versa.

Determine how many times you would need to apply this operation to ensure that all `x`'s come before all `y`'s. In the preceding example, it suffices to flip the second and sixth characters, so you should return `2`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution331.java)

---

### Problem 332 (Easy)

> This problem was asked by Jane Street.

Given integers `M` and `N`, write a program that counts how many positive integer pairs `(a, b)` satisfy the following conditions:

- `a + b = M`
- `a XOR b = N`

[Solution](solutions/src/main/java/com/vaani/dcp/Solution332.java)

---

### Problem 333 (Medium)

This problem was asked by Pinterest.

At a party, there is a single person who everyone knows, but who does not know anyone in return (the "celebrity"). To help figure out who this is, you have access to an `O(1)` method called `knows(a, b)`, which returns `True` if person `a` knows person `b`, else `False`.

Given a list of `N` people and the above operation, find a way to identify the celebrity in `O(N)` time.

[Solution](https://k5kc.com/cs/algorithms/find-the-celebrity-problem/)

---

### Problem 334 (Easy)

This problem was asked by Twitter.

The `24` game is played as follows. You are given a list of four integers, each between `1` and `9`, in a fixed order. By placing the operators `+`, `-`, `*`, and `/` between the numbers, and grouping them with parentheses, determine whether it is possible to reach the value `24`.

For example, given the input `[5, 2, 7, 8]`, you should return True, since `(5 * 2 - 7) * 8 = 24`.

Write a function that plays the `24` game.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution334.java)

---

### Problem 335 (Hard)

This problem was asked by Google.

PageRank is an algorithm used by Google to rank the importance of different websites. While there have been changes over the years, the central idea is to assign each site a score based on the importance of other pages that link to that page.

More mathematically, suppose there are `N` sites, and each site `i` has a certain count `Ci` of outgoing links. Then the score for a particular site `Sj` is defined as :

```
score(Sj) = (1 - d) / N + d * (score(Sx) / Cx+ score(Sy) / Cy+ ... + score(Sz) / Cz))
```

Here, `Sx, Sy, ..., Sz` denote the scores of all the other sites that have outgoing links to `Sj`, and `d` is a damping factor, usually set to around `0.85`, used to model the probability that a user will stop searching.

Given a directed graph of links between various websites, write a program that calculates each site's page rank.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution335.java)

---

### Problem 336 (Medium)

This problem was asked by Microsoft.

Write a program to determine how many distinct ways there are to create a max heap from a list of `N` given integers.

For example, if `N = 3`, and our integers are `[1, 2, 3]`, there are two ways, shown below.

```
  3      3
 / \    / \
1   2  2   1
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution336.java)

---

### Problem 337 (Hard)

This problem was asked by Apple.

Given a linked list, uniformly shuffle the nodes. What if we want to prioritize space over time?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution337.java)

---

### Problem 338 (Medium)

This problem was asked by Facebook.

Given an integer `n`, find the next biggest integer with the same number of `1`-bits on. For example, given the number `6` (`0110` in binary), return `9` (`1001`).

[Solution](solutions/src/main/java/com/vaani/dcp/Solution338.java)

---

### Problem 339 (Easy)

This problem was asked by Microsoft.

Given an array of numbers and a number `k`, determine if there are three entries in the array which add up to the specified number `k`. For example, given `[20, 303, 3, 4, 25]` and `k = 49`, return true as `20 + 4 + 25 = 49`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution339.java)

---

### Problem 340 (Easy)

This problem was asked by Google.

Given a set of points (x, y) on a 2D cartesian plane, find the two closest points. For example, given the points `[(1, 1), (-1, -1), (3, 4), (6, 1), (-1, -6), (-4, -3)]`, return `[(-1, -1), (1, 1)]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution340.java)

---

### Problem 341 (Easy)

This problem was asked by Google.

You are given an N by N matrix of random letters and a dictionary of words. Find the maximum number of words that can be packed on the board from the given dictionary.

A word is considered to be able to be packed on the board if:

- It can be found in the dictionary
- It can be constructed from untaken letters by other words found so far on the board
- The letters are adjacent to each other (vertically and horizontally, not diagonally).
- Each tile can be visited only once by any word.

For example, given the following dictionary:

```
{ 'eat', 'rain', 'in', 'rat' }
```

and matrix:

```
[['e', 'a', 'n'],
 ['t', 't', 'i'],
 ['a', 'r', 'a']]
```

Your function should return 3, since we can make the words 'eat', 'in', and 'rat' without them touching each other. We could have alternatively made 'eat' and 'rain', but that would be incorrect since that's only 2 words.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution341.java)

---

### Problem 342 (Medium)

This problem was asked by Stripe.

`reduce` (also known as `fold`) is a function that takes in an array, a combining function, and an initial value and builds up a result by calling the combining function on each element of the array, left to right. For example, we can write `sum()` in terms of `reduce`:

```
def add(a, b):
    return a + b

def sum(lst):
    return reduce(lst, add, 0)
```

This should call `add` on the initial value with the first element of the array, and then the result of that with the second element of the array, and so on until we reach the end, when we return the sum of the array.

Implement your own version of `reduce`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution342.java)

---

### Problem 343 (Medium)

This problem was asked by Google.

Given a binary search tree and a range `[a, b]` (inclusive), return the sum of the elements of the binary search tree within the range.

For example, given the following tree:

```
    5
   / \
  3   8
 / \ / \
2  4 6  10
```

and the range `[4, 9]`, return `23` (5 + 4 + 6 + 8).

[Solution](solutions/src/main/java/com/vaani/dcp/Solution343.java)

---

### Problem 344 (Hard)

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

In this case, removing the edge `(3, 4)` satisfies our requirement.

Write a function that returns the _maximum_ number of edges you can remove while still satisfying this requirement.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution344.java)

---

### Problem 345 (Medium)

This problem was asked by Google.

You are given a set of synonyms, such as `(big, large)` and `(eat, consume)`. Using this set, determine if two sentences with the same number of words are equivalent.

For example, the following two sentences are equivalent:

- "He wants to eat food."
- "He wants to consume food."

Note that the synonyms `(a, b)` and `(a, c)` do not necessarily imply `(b, c)`: consider the case of `(coach, bus)` and `(coach, teacher)`.

Follow-up: what if we can assume that `(a, b)` and `(a, c)` do in fact imply `(b, c)`?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution345.java)

---

### Problem 346 (Medium)

> This problem was asked by Airbnb.

You are given a huge list of airline ticket prices between different cities around the world on a given day. These are all direct flights. Each element in the list has the format `(source_city, destination, price)`.

Consider a user who is willing to take up to `k` connections from their origin city `A` to their destination `B`. Find the cheapest fare possible for this journey and print the itinerary for that journey.

For example, our traveler wants to go from `JFK` to `LAX` with up to `3` connections, and our input flights are as follows:

```python
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

[Solution](https://k5kc.com/cs/algorithms/cheapest-flights-within-k-stops-problem/)

---

### Problem 347 (Easy)

This problem was asked by Yahoo.

You are given a string of length `N` and a parameter `k`. The string can be manipulated by taking one of the first `k` letters and moving it to the end.

Write a program to determine the lexicographically smallest string that can be created after an unlimited number of moves.

For example, suppose we are given the string `daily` and `k = 1`. The best we can create in this case is `ailyd`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution347.java)

---

### Problem 348 (Easy)

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution348.java)

---

### Problem 349 (Hard)

> This problem was asked by Grammarly.

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

---

### Problem 350 (Medium)

This problem was asked by Uber.

Write a program that determines the smallest number of perfect squares that sum up to `N`.

Here are a few examples:

- Given `N = 4`, return `1` `(4)`
- Given `N = 17`, return `2` `(16 + 1)`
- Given `N = 18`, return `2` `(9 + 9)`

[Solution](https://k5kc.com/cs/algorithms/least-number-of-perfect-squares-that-sums-to-n/)

---

### Problem 351 (Hard)

This problem was asked by Quora.

Word sense disambiguation is the problem of determining which sense a word takes on in a particular setting, if that word has multiple meanings. For example, in the sentence "I went to get money from the _bank_", bank probably means the place where people deposit money, not the land beside a river or lake.

Suppose you are given a list of meanings for several words, formatted like so:

```
{
    "word_1": ["meaning one", "meaning two", ...],
    ...
    "word_n": ["meaning one", "meaning two", ...]
}
```

Given a sentence, most of whose words are contained in the meaning list above, create an algorithm that determines the likely sense of each possibly ambiguous word.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution351.md)

---

### Problem 352 (Easy)

This problem was asked by Palantir.

A typical American-style crossword puzzle grid is an `N x N` matrix with black and white squares, which obeys the following rules:

- Every white square must be part of an "across" word and a "down" word.
- No word can be fewer than three letters long.
- Every white square must be reachable from every other white square.
- The grid is rotationally symmetric (for example, the colors of the top left and bottom right squares must match).

Write a program to determine whether a given matrix qualifies as a crossword grid.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution352.md)

---

### Problem 353 (Medium)

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution353.java)

---

### Problem 354 (Hard)

> This problem was asked by Google.

Design a system to crawl and copy all of Wikipedia using a distributed network of machines.

More specifically, suppose your server has access to a set of client machines. Your client machines can execute code you have written to access Wikipedia pages, download and parse their data, and write the results to a database.

Some questions you may want to consider as part of your solution are:

- How will you reach as many pages as possible?
- How can you keep track of pages that have already been visited?
- How will you deal with your client machines being blacklisted?
- How can you update your database when Wikipedia pages are added or updated?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution354.md)

---

### Problem 355 (Hard)

This problem was asked by Airbnb.

You are given an array `X` of floating-point numbers `x1, x2, ... xn`. These can be rounded up or down to create a corresponding array `Y` of integers `y1, y2, ... yn`.

Write an algorithm that finds an appropriate `Y` array with the following properties:

- The rounded sums of both arrays should be equal.
- The absolute pairwise difference between elements is minimized. In other words, `|x1- y1| + |x2- y2| + ... + |xn- yn|` should be as small as possible.

For example, suppose your input is `[1.3, 2.3, 4.4]`. In this case you cannot do better than `[1, 2, 5]`, which has an absolute difference of `|1.3 - 1| + |2.3 - 2| + |4.4 - 5| = 1`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution355.java)

---

### Problem 356 (Hard)

This problem was asked by Netflix.

Implement a queue using a set of fixed-length arrays.

The queue should support `enqueue`, `dequeue`, and `get_size` operations.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution356.java)

---

### Problem 357 (Hard)

This problem was asked by LinkedIn.

You are given a binary tree in a peculiar string representation. Each node is written in the form `(lr)`, where `l` corresponds to the left child and `r` corresponds to the right child.

If either `l` or `r` is null, it will be represented as a zero. Otherwise, it will be represented by a new `(lr)` pair.

Here are a few examples:

- A root node with no children: `(00)`
- A root node with two children: `((00)(00))`
- An unbalanced tree with three consecutive left children: `((((00)0)0)0)`

Given this representation, determine the depth of the tree.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution357.java)

---

### Problem 358 (Hard)

This problem was asked by Dropbox.

Create a data structure that performs all the following operations in `O(1)` time:

- `plus`: Add a key with value 1. If the key already exists, increment its value by one.
- `minus`: Decrement the value of a key. If the key's value is currently 1, remove it.
- `get_max`: Return a key with the highest value.
- `get_min`: Return a key with the lowest value.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution358.java)

---

### Problem 359 (Easy)

This problem was asked by Slack.

You are given a string formed by concatenating several words corresponding to the integers zero through nine and then anagramming.

For example, the input could be 'niesevehrtfeev', which is an anagram of 'threefiveseven'. Note that there can be multiple instances of each integer.

Given this string, return the original integers in sorted order. In the example above, this would be `357`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution359.java)

---

### Problem 360 (Medium)

This problem was asked by Spotify.

You have access to ranked lists of songs for various users. Each song is represented as an integer, and more preferred songs appear earlier in each list. For example, the list `[4, 1, 7]` indicates that a user likes song `4` the best, followed by songs `1` and `7`.

Given a set of these ranked lists, interleave them to create a playlist that satisfies everyone's priorities.

For example, suppose your input is `{[1, 7, 3], [2, 1, 6, 7, 9], [3, 9, 5]}`. In this case a satisfactory playlist could be `[2, 1, 6, 7, 3, 9, 5]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution360.java)

---

### Problem 361 (Medium)

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

[Solution](solutions/src/main/java/com/vaani/dcp/Solution361.java)

---

### Problem 362 (Easy)

> This problem was asked by Twitter.

A strobogrammatic number is a positive number that appears the same after being rotated 180 degrees. For example, `16891` is strobogrammatic.

Create a program that finds all strobogrammatic numbers with `N` digits.

[Solution](https://k5kc.com/cs/algorithms/strobogrammatic-number-2-generate-for-length-n/)

---

### Problem 363 (Medium)

Write a function, `add_subtract`, which alternately adds and subtracts curried arguments. Here are some sample operations:

```
add_subtract(7) -> 7
add_subtract(1)(2)(3) -> 1 + 2 - 3 -> 0
add_subtract(-5)(10)(3)(9) -> -5 + 10 - 3 + 9 -> 11
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution363.java)

---

### Problem 364 (Medium)

This problem was asked by Facebook.

Describe an algorithm to compute the longest increasing subsequence of an array of numbers in `O(n log n)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution364.java)

---

### Problem 365 (Hard)

This problem was asked by Google.

A quack is a data structure combining properties of both stacks and queues. It can be viewed as a list of elements written left to right such that three operations are possible:

- `push(x)`: add a new item `x` to the left end of the list
- `pop()`: remove and return the item on the left end of the list
- `pull()`: remove the item on the right end of the list.

Implement a quack using three stacks and `O(1)` additional memory, so that the amortized time for any push, pop, or pull operation is `O(1)`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution365.java)

---

### Problem 367 (Medium)

This problem was asked by Two Sigma.

Given two sorted iterators, merge it into one iterator.

For example, given these two iterators:

```
foo = iter([5, 10, 15])
bar = iter([3, 8, 9])
```

You should be able to do:

```
for num in merge_iterators(foo, bar):
    print(num)

# 3
# 5
# 8
# 9
# 10
# 15
```

Bonus: Make it work without pulling in the contents of the iterators in memory.

### Problem 368 (Hard)

This problem was asked by Google.

Implement a key value store, where keys and values are integers, with the following methods:

- `update(key, vl)`: updates the value at `key` to `val`, or sets it if doesn't exist
- `get(key)`: returns the value with key, or `None` if no such value exists
- `max_key(val)`: returns the largest key with value `val`, or `None` if no key with that value exists

For example, if we ran the following calls:

```
kv.update(1, 1)
kv.update(2, 1)
```

And then called `kv.max_key(1)`, it should return `2`, since it's the largest key with value `1`.

### Problem 369 (Medium)

This problem was asked by Two Sigma.

You’re tracking stock price at a given instance of time. Implement an API with the following functions: add(), update(), remove(), which adds/updates/removes a datapoint for the stock price you are tracking. The data is given as (timestamp, price), where timestamp is specified in unix epoch time.

Also, provide max(), min(), and average() functions that give the max/min/average of all values seen thus far.

### Problem 370 (Easy)

This problem was asked by Postmates.

The “active time” of a courier is the time between the pickup and dropoff of a delivery. Given a set of data formatted like the following:

```
(delivery id, timestamp, pickup/dropoff)
```

Calculate the total active time in seconds. A courier can pick up multiple orders before dropping them off. The timestamp is in unix epoch seconds.

For example, if the input is the following:

```
(1, 1573280047, 'pickup')
(1, 1570320725, 'dropoff')
(2, 1570321092, 'pickup')
(3, 1570321212, 'pickup')
(3, 1570322352, 'dropoff')
(2, 1570323012, 'dropoff')
```

The total active time would be 1260 seconds.

### Problem 371 (Hard)

This problem was asked by Google.

You are given a series of arithmetic equations as a string, such as:

```
y = x + 1
5 = x + 3
10 = z + y + 2
```

The equations use addition only and are separated by newlines. Return a mapping of all variables to their values. If it's not possible, then return null. In this example, you should return:

```
{
  x: 2,
  y: 3,
  z: 5
}
```

### Problem 372 (Easy)

This problem was asked by Amazon.

Write a function that takes a natural number as input and returns the number of digits the input has.

Constraint: don't use any loops.

### Problem 373 (Hard)

This problem was asked by Facebook.

Given a list of integers L, find the maximum length of a sequence of consecutive numbers that can be formed using elements from L.

For example, given `L = [5, 2, 99, 3, 4, 1, 100]`, return 5 as we can build a sequence `[1, 2, 3, 4, 5]` which has length 5.

### Problem 374 (Hard)

This problem was asked by Amazon.

Given a sorted array `arr` of distinct integers, return the lowest index `i` for which `arr[i] == i`. Return `null` if there is no such index.

For example, given the array `[-5, -3, 2, 3]`, return `2` since `arr[2] == 2`. Even though `arr[3] == 3`, we return 2 since it's the lowest index.

### Problem 375 (Medium)

This problem was asked by Google.

The h-index is a metric used to measure the impact and productivity of a scientist or researcher.

A scientist has index _h_ if _h_ of their _N_ papers have **at least** _h_ citations each, and the other _N - h_ papers have no more than _h_ citations each. If there are multiple possible values for _h_, the maximum value is used.

Given an array of natural numbers, with each value representing the number of citations of a researcher's paper, return the h-index of that researcher.

For example, if the array was:

```
[4, 0, 0, 2, 3]
```

This means the researcher has 5 papers with 4, 1, 0, 2, and 3 citations respectively. The h-index for this researcher is 2, since they have 2 papers with at least 2 citations and the remaining 3 papers have no more than 2 citations.

### Problem 376 (Easy)

This problem was asked by Google.

You are writing an AI for a 2D map game. You are somewhere in a 2D grid, and there are coins strewn about over the map.

Given the position of all the coins and your current position, find the closest coin to you in terms of Manhattan distance. That is, you can move around up, down, left, and right, but not diagonally. If there are multiple possible closest coins, return any of them.

For example, given the following map, where you are `x`, coins are `o`, and empty spaces are `.` (top left is 0, 0):

```
------------
| . | . | x | . | o |
------------
| o | . | . | . | . |
------------
| o | . | . | . | o |
------------
| . | . | o | . | . |
------------
```

return `(0, 4)`, since that coin is closest. This map would be represented in our question as:

```
Our position: (0, 2)
Coins: [(### Problem 0, 4), (1, 0), (2, 0), (3, 2)]
```

### Problem 377 (Hard)

This problem was asked by Microsoft.

Given an array of numbers `arr` and a window of size `k`, print out the median of each window of size `k` starting from the left and moving right by one position each time.

For example, given the following array and `k = 3`:

```
[-1, 5, 13, 8, 2, 3, 3, 1]
```

Your function should print out the following:

```
5 <- median of [-1, 5, 13]
8 <- median of [5, 13, 8]
8 <- median of [13, 8, 2]
3 <- median of [8, 2, 3]
3 <- median of [2, 3, 3]
3 <- median of [3, 3, 1]
```

Recall that the median of an even-sized list is the average of the two middle numbers.

### Problem 378 (Medium)

This problem was asked by Coinbase.

Write a function that takes in a number, string, list, or dictionary and returns its JSON encoding. It should also handle nulls.

For example, given the following input:

```
[None, 123, ["a", "b"], {"c":"d"}]
```

You should return the following, as a string:

```
'[null, 123, ["a", "b"], {"c": "d"}]'
```

### Problem 379 (Easy)

This problem was asked by Microsoft.

Given a string, generate all possible subsequences of the string.

For example, given the string `xyz`, return an array or set with the following strings:

```
x
y
z
xy
xz
yz
xyz
```

Note that `zx` is not a valid subsequence since it is not in the order of the given string.

### Problem 380 (Medium)

This problem was asked by Nextdoor.

Implement integer division without using the division operator. Your function should return a tuple of (dividend, remainder) and it should take two numbers, the product and divisor.

For example, calling `divide(10, 3)` should return `(3, 1)` since the divisor is 3 and the remainder is 1.

Bonus: Can you do it in O(log n) time?

### Problem 381 (Easy)

This problem was asked by Paypal.

Read [this Wikipedia article on Base64 encoding](https://en.wikipedia.org/wiki/Base64).

Implement a function that converts a hex string to base64.

For example, the string:

```
deadbeef
```

should produce:

```
3q2+7w==
```

### Problem 382 (Easy)

This problem was asked by Google.

Yesterday you implemented a function that encodes a hexadecimal string into Base64.

Write a function to decode a Base64 string back to a hexadecimal string.

For example, the following string:

```
3q2+7w==
```

should produce:

```
deadbeef
```

### Problem 383 (Medium)

This problem was asked by Gusto.

Implement the function `embolden(s, lst)` which takes in a string `s` and list of substrings `lst`, and wraps all substrings in `s` with an HTML bold tag `` and ``.

If two bold tags overlap or are contiguous, they should be merged.

For example, given `s = abcdefg` and `lst = ["bc", "ef"]`, return the string `abcdefg`.

Given `s = abcdefg` and `lst = ["bcd", "def"]`, return the string `abcdefg`, since they overlap.

### Problem 384 (Hard)

This problem was asked by WeWork.

You are given an array of integers representing coin denominations and a total amount of money. Write a function to compute the fewest number of coins needed to make up that amount. If it is not possible to make that amount, return null.

For example, given an array of `[1, 5, 10]` and an amount `56`, return `7` since we can use 5 dimes, 1 nickel, and 1 penny.

Given an array of `[5, 8]` and an amount `15`, return `3` since we can use 5 5-cent coins.

### Problem 385 (Medium)

This problem was asked by Apple.

You are given a hexadecimal-encoded string that has been XOR'd against a single char.

Decrypt the message. For example, given the string:

```
7a575e5e5d12455d405e561254405d5f1276535b5e4b12715d565b5c551262405d505e575f
```

You should be able to decrypt it and get:

```
Hello world from Daily Coding Problem
```

### Problem 386 (Easy)

This problem was asked by Twitter.

Given a string, sort it in decreasing order based on the frequency of characters. If there are multiple possible solutions, return any of them.

For example, given the string `tweet`, return `tteew`. `eettw` would also be acceptable.

### Problem 387 (Medium)

This problem was recently asked by Amazon.

How would you explain the difference between an API and SDK to a non-technical person?

### Problem 388 (Medium)

This problem was asked by Airtable.

How would you explain web cookies to someone non-technical?

### Problem 389 (Hard)

This problem was asked by Google.

Explain the difference between composition and inheritance. In which cases would you use each?

### Problem 390 (Medium)

This problem was asked by Two Sigma.

You are given an unsorted list of 999,000 unique integers, each from 1 and 1,000,000. Find the missing 1000 numbers. What is the computational and space complexity of your solution?

### Problem 391 (Hard)

This problem was asked by Facebook.

We have some historical clickstream data gathered from our site anonymously using cookies. The histories contain URLs that users have visited in chronological order.

Write a function that takes two users' browsing histories as input and returns the longest contiguous sequence of URLs that appear in both.

For example, given the following two users' histories:

```
user1 = ['/home', '/register', '/login', '/user', '/one', '/two']
user2 = ['/home', '/red', '/login', '/user', '/one', '/pink']
```

You should return the following:

```
['/login', '/user', '/one']
```

### Problem 392 (Hard)

This problem was asked by Google.

You are given a 2D matrix of 1s and 0s where 1 represents land and 0 represents water.

Grid cells are connected horizontally orvertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

An island is a group is cells connected horizontally or vertically, but not diagonally. There is guaranteed to be exactly one island in this grid, and the island doesn't have water inside that isn't connected to the water around the island. Each cell has a side length of 1.

Determine the perimeter of this island.

For example, given the following matrix:

```
[[0, 1, 1, 0],
[1, 1, 1, 0],
[0, 1, 1, 0],
[0, 0, 1, 0]]
```

Return `14`.

### Problem 393 (Medium)

This problem was asked by Airbnb.

Given an array of integers, return the largest range, inclusive, of integers that are all included in the array.

For example, given the array `[9, 6, 1, 3, 8, 10, 12, 11]`, return `(8, 12)` since 8, 9, 10, 11, and 12 are all in the array.

### Problem 394 (Easy)

This problem was asked by Uber.

Given a binary tree and an integer k, return whether there exists a root-to-leaf path that sums up to `k`.

For example, given `k = 18` and the following binary tree:

```
    8
   / \
  4   13
 / \   \
2   6   19
```

Return `True` since the path `8 -> 4 -> 6` sums to 18.

### Problem 395 (Medium)

This problem was asked by Robinhood.

Given an array of strings, group anagrams together.

For example, given the following array:

```
['eat', 'ate', 'apt', 'pat', 'tea', 'now']
```

Return:

```
[['eat', 'ate', 'tea'],
 ['apt', 'pat'],
 ['now']]
```

### Problem 396 (Hard)

This problem was asked by Google.

Given a string, return the length of the longest palindromic subsequence in the string.

For example, given the following string:

```
MAPTPTMTPA
```

Return 7, since the longest palindromic subsequence in the string is `APTMTPA`. Recall that a subsequence of a string does not have to be contiguous!

Your algorithm should run in O(n^2) time and space.

### Problem 397 (Medium)

This problem was asked by Microsoft.

You are given a list of jobs to be done, where each job is represented by a start time and end time. Two jobs are compatible if they don't overlap. Find the largest subset of compatible jobs.

For example, given the following jobs (there is no guarantee that jobs will be sorted):

```
[(0, 6),
(1, 4),
(3, 5),
(3, 8),
(4, 7),
(5, 9),
(6, 10),
(8, 11)]
```

Return:

```
[(1, 4),
(4, 7),
(8, 11)]
```

### Problem 398 (Medium)

This problem was asked by Amazon.

Given a linked list and an integer `k`, remove the k-th node from the end of the list and return the head of the list.

`k` is guaranteed to be smaller than the length of the list.

Do this in one pass.

### Problem 399 (Hard)

This problem was asked by Facebook.

Given a list of strictly positive integers, partition the list into 3 contiguous partitions which each sum up to the same value. If not possible, return null.

For example, given the following list:

```
[3, 5, 8, 0, 8]
```

Return the following 3 partitions:

```
[[3, 5],
 [8, 0],
 [8]]
```

Which each add up to 8.

### Problem 400 (Hard)

Same as [problem 149](#problem-149-hard).

### Problem 401 (Easy)

Same as [problem 206](#problem-206-easy).

### Problem 402 (Easy)

Same as [problem 362](#problem-362-easy).

### Problem 403 (Easy)

Same as [problem 45](#problem-45-easy).

### Problem 404 (Easy)

Same as [problem 21](#problem-21-easy).

### Problem 405 (Hard)

Same as [problem 93](#problem-93-hard).

### Problem 406 (Hard)

Same as [problem 308](#problem-308-hard).

### Problem 407 (Medium)

Same as [problem 299](#problem-299-medium).

### Problem 408 (Medium)

Same as [problem 130](#problem-130-medium).

### Problem 409 (Hard)

Same as [problem 335](#problem-335-hard).

### Problem 410 (Hard)

Same as [problem 355](#problem-355-hard).

### Problem 411 (Hard)

Same as [problem 121](#problem-121-hard).

### Problem 412 (Medium)

Same as [problem 275](#problem-275-medium).

### Problem 413 (Hard)

Same as [problem 12](#problem-12-hard).

### Problem 414 (Hard)

Same as [problem 38](#problem-38-hard).

### Problem 415 (Hard)

Same as [problem 193](#problem-193-hard).

### Problem 416 (Easy)

Same as [problem 100](#problem-100-easy).

### Problem 417 (Easy)

Same as [problem 305](#problem-305-easy).

### Problem 418 (Easy)

Same as [problem 265](#problem-265-easy).

### Problem 419 (Easy)

Same as [problem 321](#problem-321-easy).

### Problem 420 (Easy)

Same as [problem 70](#problem-70-easy).

### Problem 421 (Medium)

Same as [problem 251](#problem-251-medium).

### Problem 422 (Easy)

Same as [problem 327](#problem-327-easy).

### Problem 423 (Easy)

Same as [problem 255](#problem-255-easy).

### Problem 424 (Medium)

Same as [problem 140](#problem-140-medium).

### Problem 425 (Hard)

Same as [problem 267](#problem-267-hard).

### Problem 426 (Easy)

Same as [problem 117](#problem-117-easy).

### Problem 427 (Medium)

Same as [problem 294](#problem-294-medium).

### Problem 428 (Hard)

Same as [problem 293](#problem-293-hard).

### Problem 429 (Medium)

Same as [problem 295](#problem-295-medium).

### Problem 430 (Hard)

Same as [problem 199](#problem-199-hard).

### Problem 431 (Medium)

Same as [problem 263](#problem-263-medium).

### Problem 432 (Hard)

Same as [problem 354](#problem-354-hard).

### Problem 433 (Medium)

Same as [problem 338](#problem-338-medium).

### Problem 434 (Easy)

Same as [problem 307](#problem-307-easy).

### Problem 435 (Medium)

Same as [problem 48](#problem-48-medium).

### Problem 436 (Hard)

Same as [problem 141](#problem-141-hard).

### Problem 437 (Medium)

Same as [problem 103](#problem-103-medium).

### Problem 438 (Easy)

Same as [problem 154](#problem-154-easy).

### Problem 439 (Medium)

Same as [problem 41](#problem-41-medium).

### Problem 440 (Medium)

Same as [problem 174](#problem-174-medium).

### Problem 441 (Medium)

Same as [problem 143](#problem-143-medium).

### Problem 442 (Hard)

Same as [problem 326](#problem-326-hard).

### Problem 443 (Medium)

Same as [problem 53](#problem-53-medium).

### Problem 444 (Hard)

Same as [problem 276](#problem-276-hard).

### Problem 445 (Medium)

Same as [problem 146](#problem-146-medium).

### Problem 446 (Medium)

Same as [problem 268](#problem-268-medium).

### Problem 447 (Medium)

Same as [problem 61](#problem-61-medium).

### Problem 448 (Hard)

Same as [problem 35](#problem-35-hard).

### Problem 449 (Easy)

Same as [problem 101](#problem-101-easy).

### Problem 450 (Hard)

Same as [problem 142](#problem-142-hard).

### Problem 451 (Easy)

Same as [problem 233](#problem-233-easy).

### Problem 452 (Easy)

Same as [problem 127](#problem-127-easy).

### Problem 453 (Easy)

Same as [problem 125](#problem-125-easy).

### Problem 454 (Medium)

Same as [problem 364](#problem-364-medium).

### Problem 455 (Medium)

Same as [problem 39](#problem-39-medium).

### Problem 456 (Easy)

Same as [problem 171](#problem-171-easy).

### Problem 457 (Hard)

Same as [problem 111](#problem-111-hard).

### Problem 458 (Hard)

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

### Problem 459 (Medium)

Same as [350](#problem-350-medium).

### Problem 460 (Medium)

Same as [problem 331](#problem-331-medium).

### Problem 461 (Medium)

Same as [problem 62](#problem-62-medium).

### Problem 462 (Hard)

Same as [problem 217](#problem-217-hard).

### Problem 463 (Easy)

Same as [problem 290](#problem-290-easy).

### Problem 464 (Medium)

Same as [problem 198](#problem-198-medium).

### Problem 465 (Easy)

Same as [problem 73](#problem-73-easy).

### Problem 466 (Easy)

Same as [problem 237](#problem-237-easy).

### Problem 467 (Medium)

Same as [problem 129](#problem-129-medium).

### Problem 468 (Medium)

Same as [problem 168](#problem-168-medium).

### Problem 469 (Medium)

Same as [problem 361](#problem-361-medium).

### Problem 470 (Medium)

Same as [problem 144](#problem-144-medium).

### Problem 471 (Easy)

Same as [problem 278](#problem-278-easy).

### Problem 472 (Medium)

Same as [7](#problem-7-medium).

### Problem 473 (Medium)

Same as [problem 218](#problem-218-medium).

### Problem 474 (Hard)

Same as [problem 138](#problem-138-hard).

### Problem 475 (Medium)

Same as [problem 24](#problem-24-medium).

### Problem 476 (Medium)

Same as [problem 164](#problem-164-medium).

### Problem 477 (Easy)

Same as [problem 91](#problem-91-easy).

### Problem 478 (Hard)

Same as [problem 59](#problem-59-hard).

### Problem 479 (Easy)

Same as [problem 96](#problem-96-easy).

### Problem 480 (Medium)

Same as [problem 22](#problem-22-medium).

### Problem 481 (Hard)

Same as [problem 163](#problem-163-hard).

### Problem 482 (Medium)

Same as [problem 343](#problem-343-medium).

### Problem 483 (Easy)

Same as [problem 225](#problem-225-easy).

### Problem 484 (Medium)

Same as [problem 36](#problem-36-medium).

### Problem 485 (Hard)

Same as [problem 13](#problem-13-hard).

### Problem 486 (Medium)

Same as [problem 333](#problem-333-medium).

### Problem 487 (Medium)

Same as [problem 284](#problem-284-medium).

### Problem 488 (Hard)

Same as [problem 356](#problem-356-hard).

### Problem 489 (Easy)

Same as [problem 189](#problem-189-easy).

### Problem 490 (Medium)

Same as [problem 215](#problem-215-medium).

### Problem 491 (Easy)

Same as [problem 202](#problem-202-easy).

### Problem 492 (Medium)

Same as [problem 56](#problem-56-medium).

### Problem 493 (Medium)

Same as [problem 152](#problem-152-medium).

### Problem 494 (Medium)

Same as [problem 190](#problem-190-medium).

### Problem 495 (Medium)

Same as [problem 495](#problem-15-medium).

### Problem 496 (Easy)

Same as [problem 310](#problem-310-easy).

### Problem 497 (Medium)

Same as [problem 254](#problem-254-medium).

### Problem 498 (Easy)

Same as [problem 257](#problem-257-easy).

### Problem 499 (Easy)

Same as [problem 352](#problem-352-easy).

### Problem 500 (Easy)

Same as [problem 23](#problem-23-easy).

### Problem 501 (Medium)

Same as [problem 51](#problem-51-medium).

### Problem 502 (Medium)

Same as [problem 247](#problem-247-medium).

### Problem 503 (Medium)

Same as [problem 169](#problem-169-medium).

### Problem 504 (Easy)

Same as [problem 16](#problem-16-easy).

### Problem 505 (Easy)

Same as [problem 197](#problem-197-easy).

### Problem 506 (Medium)

Same as [problem 256](#problem-256-medium).

### Problem 507 (Easy)

Same as [problem 300](#problem-300-easy).

### Problem 508 (Medium)

Same as [323](#problem-323-medium).

### Problem 509 (Medium)

Same as [problem 34](#problem-34-medium).

### Problem 510 (Hard)

Same as [problem 167](#problem-167-hard).

### Problem 511 (Medium)

Same as [problem 245](#problem-245-medium).

### Problem 512 (Medium)

Same as [problem 192](#problem-192-medium).

### Problem 513 (Medium)

Same as [problem 102](#problem-102-medium).

### Problem 514 (Medium)

Same as [problem 99](#problem-99-medium).

### Problem 515 (Medium)

Same as [problem 208](#problem-208-medium).

### Problem 516 (Easy)

Same as [problem 221](#problem-221-easy).

### Problem 517 (Easy)

Same as [problem 20](#problem-20-easy).

### Problem 518 (Easy)

Same as [problem 339](#problem-339-easy).

### Problem 519 (Medium)

Same as [problem 85](#problem-85-medium).

### Problem 520 (Hard)

Same as [problem 357](#problem-357-hard).

### Problem 521 (Medium)

Same as [problem 253](#problem-253-medium).

### Problem 522 (Medium)

Same as [problem 211](#problem-211-medium).

### Problem 523 (Medium)

Same as [problem 332](#problem-332-easy).

### Problem 524 (Medium)

Same as [problem 49](#problem-49-medium).

### Problem 525 (Easy)

Same as [problem 65](#problem-65-easy).

### Problem 526 (Easy)

Same as [problem 347](#problem-347-easy).

### Problem 527 (Medium)

Same as [problem 336](#problem-336-medium).

### Problem 528 (Easy)

Same as [problem 261](#problem-261-easy).

### Problem 529 (Hard)

Same as [problem 181](#problem-181-hard).

### Problem 530 (Easy)

Same as [problem 31](#problem-31-easy).

### Problem 531 (Easy)

Same as [problem 82](#problem-82-easy).

### Problem 532 (Medium)

Same as [problem 68](#problem-68-medium).

### Problem 533 (Easy)

Same as [problem 227](#problem-227-easy).

### Problem 534 (Easy)

Same as [problem 157](#problem-157-easy).

### Problem 535 (Medium)

Same as [problem 230](#problem-230-medium).

### Problem 536 (Medium)

Same as [problem 179](#problem-179-medium).

### Problem 537 (Easy)

Same as [problem 210](#problem-210-easy).

### Problem 538 (Hard)

Same as [problem 264](#problem-264-hard).

### Problem 539 (Easy)

Same as [problem 280](#problem-280-easy).

### Problem 540 (Easy)

Same as [problem 258](#problem-258-easy).

### Problem 541 (Easy)

Same as [problem 29](#problem-29-easy).

### Problem 542 (Medium)

Same as [problem 207](#problem-207-medium).

### Problem 543 (Medium)

Same as [problem 26](#problem-26-medium).

### Problem 544 (Hard)

Same as [problem 42](#problem-42-hard).

### Problem 545 (Hard)

Same as [problem 112](#problem-112-hard).

### Problem 546 (Medium)

Same as [problem 165](#problem-165-medium).

### Problem 547 (Hard)

Same as [problem 249](#problem-249-hard).

### Problem 548 (Easy)

Same as [problem 303](#problem-303-easy).

### Problem 549 (Hard)

Same as [problem 40](#problem-40-hard).

### Problem 550 (Hard)

Same as [problem 32](#problem-32-hard).

### Problem 551 (Medium)

Same as [problem 66](#problem-66-medium).

### Problem 552 (Easy)

Same as [problem 312](#problem-312-easy).

### Problem 553 (Medium)

Same as [problem 76](#problem-76-medium).

### Problem 554 (Easy)

Same as [problem 252](#problem-252-easy).

### Problem 555 (Medium)

Same as [problem 58](#problem-58-medium).

### Problem 556 (Medium)

Same as [problem 79](#problem-79-medium).

### Problem 557 (Medium)

Same as [problem 74](#problem-74-medium).

### Problem 558 (Medium)

Same as [problem 14](#problem-14-medium).

### Problem 559 (Medium)

Same as [problem 78](#problem-78-medium).

### Problem 560 (Easy)

Same as [problem 1](#problem-1-easy).

### Problem 561 (Hard)

Same as [problem 296](#problem-296-hard).

### Problem 562 (Hard)

Same as [problem 2](#problem-2-hard).

### Problem 563 (Hard)

Same as [problem 248](#problem-248-hard).

### 564 (Hard)

Same as [problem 564](#problem-9-hard).

### 565 (Medium)

Same as [problem 106](#problem-106-medium).

### Problem 566 (Medium)

Same as [problem 182](#problem-182-medium).

### Problem 567 (Medium)

Same as [5](#problem-5-medium).

### Problem 568 (Easy)

Same as [problem 118](#problem-118-easy).

### Problem 569 (Hard)

Same as [problem 235](#problem-235-hard).

### Problem 570 (Hard)

Same as [problem 115](#problem-115-hard).

### Problem 571 (Medium)

Same as [problem 128](#problem-128-medium).

### Problem 572 (Hard)

Same as [problem 95](#problem-95-hard).

### Problem 573 (Medium)

Same as [problem 180](#problem-180-medium).

### Problem 574 (Medium)

Same as [problem 137](#problem-137-medium).

### Problem 575 (Medium)

Same as [problem 166](#problem-166-medium).

### Problem 576 (Medium)

Same as [problem 272](#problem-272-medium).

### Problem 577 (Medium)

Same as [problem 246](#problem-246-medium).

### Problem 578 (Easy)

Same as [problem 176](#problem-176-easy).

### Problem 579 (Medium)

Same as [problem 322](#problem-322-medium).

### Problem 580 (Easy)

Same as [problem 135](#problem-135-easy).

### Problem 581 (Easy)

Same as [problem 185](#problem-185-easy).

### Problem 582 (Hard)

Same as [problem 200](#problem-200-hard).

### Problem 583 (Medium)

Same as [problem 122](#problem-122-medium).

### Problem 584 (Easy)

Same as [problem 231](#problem-231-easy).

### Problem 585 (Medium)

Same as [problem 136](#problem-136-medium).

### Problem 586 (Medium)

Same as [problem 287](#problem-287-medium).

### Problem 587 (Medium)

Same as [problem 110](#problem-110-medium).

### Problem 588 (Easy)

Same as [problem 134](#problem-134-easy).

### Problem 589 (Hard)

Same as [problem 178](#problem-178-hard).

### Problem 590 (Hard)

Same as [6](#problem-6-hard).

### Problem 591 (Hard)

Same as [problem 351](#problem-351-hard).

### Problem 592 (Medium)

Same as [problem 84](#problem-84-medium).

### Problem 593 (Medium)

Same as [problem 285](#problem-285-medium).

### Problem 594 (Easy)

Same as [problem 341](#problem-341-easy).

### Problem 595 (Medium)

Same as [problem 288](#problem-288-medium).

### Problem 596 (Medium)

Same as [problem 83](#problem-83-medium).

### Problem 597 (Easy)

Same as [problem 282](#problem-282-easy).

### Problem 598 (Easy)

Same as [problem 124](#problem-124-easy).

### Problem 599 (Hard)

Same as [problem 259](#problem-259-hard).

### Problem 600 (Easy)

Same as [problem 340](#problem-340-easy).

### Problem 601 (Medium)

Same as [problem 260](#problem-260-medium).

### Problem 602 (Easy)

Same as [194](#problem-194-easy).

### Problem 603 (Easy)

Same as [problem 269](#problem-269-easy).

### Problem 604 (Hard)

Same as [problem 349](#problem-349-hard).

### Problem 605 (Easy)

Same as [241](#problem-241-easy).

### Problem 606 (Hard)

Same as [problem 64](#problem-64-hard).

### Problem 607 (Medium)

Same as [problem 309](#problem-309-medium).

### Problem 608 (Medium)

Same as [problem 170](#problem-170-medium).

### Problem 609 (Medium)

Same as [problem 133](#problem-133-medium).

### Problem 610 (Medium)

Same as [problem 88](#problem-88-medium).

### Problem 611 (Hard)

Same as [problem 358](#problem-358-hard).

### Problem 612 (Easy)

Same as [problem 191](#problem-191-easy).

### Problem 613 (Easy)

Same as [problem 232](#problem-232-easy).

### Problem 614 (Medium)

Same as [problem 270](#problem-270-medium).

### Problem 616 (Hard)

Same as [problem 329](#problem-329-hard).

### Problem 616 (Medium)

Same as [problem 250](#problem-250-medium).

### Problem 617 (Medium)

Same as [problem 216](#problem-216-medium).

### Problem 618 (Hard)

Same as [problem 147](#problem-147-hard).

### Problem 619 (Easy)

Same as [problem 98](#problem-98-easy).

### Problem 620 (Medium)

Same as [problem 281](#problem-281-medium).

### Problem 621 (Hard)

Same as [problem 160](#problem-160-hard).

### Problem 622 (Easy)

Same as [problem 80](#problem-80-easy).

### Problem 623 (Medium)

Same as [28](#problem-28-medium).

### Problem 624 (Medium)

Same as [problem 86](#problem-86-medium).

### Problem 625 (Easy)

Same as [problem 214](#problem-214-easy).

### Problem 626 (Easy)

Same as [problem 69](#problem-69-easy).

### Problem 627 (Medium)

Same as [problem 139](#problem-139-medium).

### Problem 628 (Hard)

Same as [problem 313](#problem-313-hard).

### Problem 629 (Medium)

Same as [problem 243](#problem-243-medium).

### Problem 630 (Medium)

Same as [problem 10](#problem-10-medium).

### Problem 631 (Hard)

Same as [problem 286](#problem-286-hard).

### Problem 632 (Medium)

Same as [problem 316](#problem-316-medium).

### Problem 633 (Medium)

Same as [problem 306](#problem-306-medium).

### Problem 634 (Medium)

Same as [problem 353](#problem-353-medium).

### Problem 635 (Hard)

Same as [problem 25](#problem-25-hard).

### Problem 636 (Medium)

Same as [problem 203](#problem-203-medium).

### Problem 637 (Easy)

Same as [problem 77](#problem-77-easy).

### Problem 638 (Medium)

Same as [problem 113](#problem-113-medium).

### Problem 639 (Easy)

Same as [problem 81](#problem-81-easy).

### Problem 640 (Easy)

Same as [problem 175](#problem-175-easy).

### Problem 641 (Easy)

Same as [problem 224](#problem-224-easy).

### Problem 642 (Easy)

Same as [problem 266](#problem-266-easy).

### Problem 643 (Hard)

Same as [problem 209](#problem-209-hard).

### Problem 644 (Easy)

Same as [problem 8](#problem-8-easy).

### Problem 645 (Easy)

Same as [problem 63](#problem-63-easy).

### Problem 646 (Easy)

Same as [problem 279](#problem-279-easy).

### Problem 647 (Medium)

Same as [problem 60](#problem-60-medium).

### Problem 648 (Medium)

Same as [problem 131](#problem-131-medium).

### Problem 649 (Easy)

Same as [problem 159](#problem-159-easy).

### Problem 650 (Hard)

Same as [problem 195](#problem-195-hard).

### Problem 651 (Medium)

Same as [problem 89](#problem-89-medium).

### Problem 652 (Hard)

Same as [problem 318](#problem-318-hard).

### Problem 653 (Easy)

Same as [problem 187](#problem-187-easy).

### Problem 654 (Medium)

Same as [problem 320](#problem-320-medium).

### Problem 655 (Easy)

Same as [problem 161](#problem-161-easy).

### Problem 656 (Medium)

Same as [problem 151](#problem-151-medium).

### Problem 657 (Easy)

Same as [problem 37](#problem-37-easy).

### Problem 658 (Hard)

Same as [problem 17](#problem-17-hard).

### Problem 659 (Hard)

Same as [problem 183](#problem-183-hard).

### Problem 660 (Hard)

Same as [problem 226](#problem-226-hard).

### Problem 661 (Hard)

Same as [problem 271](#problem-271-hard).

### Problem 662 (Easy)

Same as [problem 184](#problem-184-easy).

### Problem 663 (Easy)

Same as [problem 132](#problem-132-easy).

### Problem 664 (Easy)

Same as [problem 94](#problem-94-easy).

### Problem 665 (Easy)

Same as [problem 55](#problem-55-easy).

### Problem 666 (Hard)

Same as [problem 186](#problem-186-hard).

### Problem 667 (Medium)

Same as [problem 328](#problem-328-medium).

### Problem 668 (Easy)

Same as [problem 315](#problem-315-easy).

### Problem 669 (Hard)

Same as [problem 289](#problem-289-hard).

### Problem 670 (Medium)

Same as [problem 156](#problem-156-medium).

### Problem 671 (Easy)

Same as [problem 105](#problem-105-easy).

### Problem 672 (Easy)

Same as [problem 201](#problem-201-easy).

### Problem 673 (Hard)

Same as [problem 150](#problem-150-hard).

### Problem 674 (Easy)

Same as [problem 298](#problem-298-easy).

### Problem 675 (Medium)

Same as [problem 345](#problem-345-medium).

### Problem 676 (Hard)

Same as [problem 123](#problem-123-hard).

### Problem 677 (Easy)

Same as [problem 244](#problem-244-easy).

### Problem 678 (Easy)

Same as [problem 205](#problem-205-easy).

### Problem 679 (Medium)

Same as [problem 44](#problem-44-medium).

### Problem 680 (Medium)

Same as [problem 162](#problem-162-medium).

### Problem 681 (Medium)

Same as [problem 229](#problem-229-medium).

### Problem 682 (Medium)

Same as [problem 363](#problem-363-medium).

### Problem 683 (Medium)

Same as [problem 155](#problem-155-medium).

### Problem 684 (Medium)

Same as [problem 342](#problem-342-medium).

### Problem 685 (Hard)

Same as [114](#problem-114-hard)..

### Problem 686 (Hard)

Same as [problem 344](#problem-344-hard).

### Problem 687 (Hard)

Same as [problem 319](#problem-319-hard).

### Problem 688 (Hard)

Same as [problem 330](#problem-330-hard).

### Problem 689 (Easy)

Same as [problem 325](#problem-325-easy).

### Problem 690 (Hard)

Same as [problem 75](#problem-75-hard).

### Problem 691 (Medium)

Same as [problem 317](#problem-317-medium).

### Problem 692 (Medium)

Same as [problem 11](#problem-11-medium).

### Problem 693 (Medium)

Same as [problem 109](#problem-109-medium).

### Problem 694 (Hard)

Same as [4](#problem-4-hard).

### Problem 695 (Medium)

Same as [problem 90](#problem-90-medium).

### Problem 696 (Hard)

Same as [problem 242](#problem-242-hard).

### Problem 697 (Hard)

Same as [problem 52](#problem-52-hard).

### Problem 698 (Medium)

Same as [problem 302](#problem-302-medium).

### Problem 699 (Easy)

Same as [problem 177](#problem-177-easy).

### Problem 700 (Medium)

Same as [problem 346](#problem-346-medium).

### Problem 701 (Medium)

Same as [problem 297](#problem-297-medium).

### Problem 702 (Medium)

Same as [3](#problem-3-medium).

### Problem 703 (Hard)

Same as [problem 304](#problem-304-hard).

### Problem 704 (Medium)

Same as [problem 239](#problem-239-medium).

### Problem 705 (Medium)

Same as [problem 30](#problem-30-medium).

### Problem 706 (Easy)

Same as [problem 334](#problem-334-easy).

### Problem 707 (Medium)

Same as [problem 314](#problem-314-medium).

### Problem 708 (Easy)

Same as [problem 273](#problem-273-easy).

### Problem 709 (Medium)

Same as [problem 158](#problem-158-medium).

### Problem 710 (Medium)

Same as [problem 172](#problem-172-medium).

### Problem 711 (Medium)

Same as [problem 236](#problem-236-medium).

### Problem 712 (Easy)

Same as [problem 27](#problem-27-easy).

### Problem 713 (Medium)

Same as [problem 222](#problem-222-medium).

### Problem 714 (Easy)

Same as [problem 145](#problem-145-easy).

### Problem 715 (Easy)

Same as [problem 104](#problem-104-easy).

### Problem 716 (Easy)

Same as [problem 277](#problem-277-easy).

### Problem 717 (Medium)

Same as [problem 19](#problem-19-medium).

### Problem 718 (Medium)

Same as [problem 148](#problem-148-medium).

### Problem 719 (Easy)

Same as [problem 212](#problem-212-easy).

### Problem 720 (Hard)

Same as [problem 54](#problem-54-hard).

### Problem 721 (Hard)

Same as [problem 234](#problem-234-hard).

### Problem 722 (Hard)

Same as [problem 240](#problem-240-hard).

### Problem 723 (Medium)

Same as [problem 119](#problem-119-medium).

### Problem 724 (Easy)

Same as [problem 50](#problem-50-easy).

### Problem 725 (Easy)

Same as [problem 324](#problem-324-easy).

### Problem 726 (Medium)

Same as [problem 120](#problem-120-medium).

### Problem 727 (Easy)

Same as [problem 33](#problem-33-easy).

### Problem 728 (Hard)

Same as [problem 292](#problem-292-hard).

### Problem 729 (Medium)

Same as [problem 360](#problem-360-medium).

### Problem 730 (Medium)

Same as [problem 188](#problem-188-medium).

### Problem 731 (Easy)

Same as [problem 47](#problem-47-easy).

### Problem 732 (Medium)

Same as [problem 291](#problem-291-medium).

### Problem 733 (Hard)

Same as [problem 219](#problem-219-hard).

### Problem 734 (Medium)

Same as [problem 97](#problem-97-medium).

### Problem 735 (Easy)

Same as [problem 311](#problem-311-easy).

### Problem 736 (Easy)

Same as [problem 204](#problem-204-easy).

### Problem 737 (Hard)

Same as [problem 92](#problem-92-hard).

### Problem 738 (Medium)

Same as [problem 57](#problem-57-medium).

### Problem 739 (Hard)

Same as [problem 365](#problem-365-hard).

### Problem 740 (Easy)

Same as [problem 283](#problem-283-easy).

### Problem 741 (Hard)

Same as [problem 274](#problem-274-hard).

### Problem 742 (Easy)

Same as [problem 173](#problem-173-easy).

### Problem 743 (Medium)

Same as [problem 262](#problem-262-medium).

### Problem 744 (Hard)

Same as [problem 67](#problem-67-hard).

### Problem 745 (Medium)

Same as [problem 301](#problem-301-medium).

### Problem 746 (Easy)

Same as [problem 43](#problem-43-easy).

### Problem 747 (Easy)

Same as [problem 108](#problem-108-easy).

### Problem 748 (Easy)

Same as [problem 196](#problem-196-easy).

### Problem 749 (Hard)

Same as [problem 46](#problem-46-hard).

### Problem 750 (Medium)

Same as [problem 116](#problem-116-medium).

### Problem 751 (Hard)

Same as [problem 223](#problem-223-hard).

### Problem 752 (Easy)

Same as [problem 107](#problem-107-easy).

### Problem 753 (Easy)

Same as [problem 348](#problem-348-easy).

### Problem 754 (Medium)

Same as [problem 220](#problem-220-medium).

### Problem 755 (Hard)

Same as [problem 72](#problem-72-hard).

### Problem 756 (Easy)

Same as [problem 359](#problem-359-easy).

### Problem 757 (Hard)

Same as [problem 238](#problem-238-hard).

### Problem 758 (Medium)

Same as [problem 126](#problem-126-medium).

### Problem 759 (Medium)

Same as [problem 213](#problem-213-medium).

### Problem 760 (Hard)

Same as [problem 337](#problem-337-hard).

### Problem 761 (Easy)

Same as [problem 71](#problem-71-easy).

### Problem 762 (Hard)

Same as [problem 153](#problem-153-hard).

### Problem 763 (Hard)

Same as [problem 18](#problem-18-hard).

### Problem 764 (Medium)

Same as [problem 228](#problem-228-medium).

### Problem 765 (Medium)

Same as [problem 26](#problem-26-medium).

### Problem 766 (Medium)

Same as [problem 331](#problem-331-medium).

### Problem 767 (Hard)

Same as [problem 111](#problem-111-hard).

### Problem 768 (Hard)

Same as [problem 235](#problem-235-hard).

### Problem 769 (Hard)

Same as [problem 178](#problem-178-hard).

### Problem 770 (Hard)

Same as [problem 289](#problem-289-hard).

### Problem 771 (Easy)

Same as [problem 176](#problem-176-easy).

### Problem 772 (Easy)

Same as [problem 227](#problem-227-easy).

### Problem 773 (Medium)

Same as [problem 44](#problem-44-medium).

### Problem 774 (Easy)

Same as [problem 82](#problem-82-easy).

### Problem 775 (Easy)

Same as [problem 21](#problem-21-easy).

### Problem 776 (Easy)

Same as [problem 225](#problem-225-easy).

### Problem 777 (Easy)

Same as [problem 348](#problem-348-easy).

### Problem 778 (Medium)

Same as [problem 360](#problem-360-medium).

### Problem 779 (Medium)

Same as [problem 230](#problem-230-medium).

### Problem 780 (Hard)

Same as [problem 92](#problem-92-hard).

### Problem 781 (Medium)

Same as [problem 353](#problem-353-medium).

### Problem 782 (Easy)

Same as [241](#problem-241-easy).

### Problem 783 (Hard)

Same as [problem 75](#problem-75-hard).

### Problem 784 (Easy)

Same as [problem 63](#problem-63-easy).

### Problem 785 (Easy)

Same as [problem 69](#problem-69-easy).

### Problem 786 (Medium)

Same as [problem 61](#problem-61-medium).

### Problem 787 (Medium)

Same as [problem 338](#problem-338-medium).

### Problem 788 (Easy)

Same as [problem 202](#problem-202-easy).

### Problem 789 (Hard)

Same as [problem 95](#problem-95-hard).

### Problem 790 (Easy)

Same as [problem 266](#problem-266-easy).

### Problem 791 (Medium)

Same as [problem 272](#problem-272-medium).

### Problem 792 (Hard)

Same as [problem 293](#problem-293-hard).

### Problem 793 (Medium)

Same as [problem 254](#problem-254-medium).

### Problem 794 (Easy)

Same as [problem 43](#problem-43-easy).

### Problem 795 (Medium)

Same as [problem 66](#problem-66-medium).

### Problem 796 (Medium)

Same as [problem 236](#problem-236-medium).

### Problem 797 (Easy)

Same as [problem 101](#problem-101-easy).

### Problem 798 (Medium)

Same as [problem 345](#problem-345-medium).

### Problem 799 (Easy)

Same as [problem 232](#problem-232-easy).

### Problem 800 (Medium)

Same as [problem 256](#problem-256-medium).

### Problem 801 (Easy)

Same as [problem 221](#problem-221-easy).

### Problem 802 (Medium)

Same as [problem 152](#problem-152-medium).

### Problem 803 (Medium)

Same as [problem 361](#problem-361-medium).

### Problem 804 (Medium)

Same as [problem 346](#problem-346-medium).

### Problem 805 (Easy)

Same as [problem 212](#problem-212-easy).

### Problem 806 (Hard)

Same as [problem 195](#problem-195-hard).

### Problem 807 (Hard)

Same as [problem 13](#problem-13-hard).

### Problem 808 (Hard)

Same as [problem 223](#problem-223-hard).

### Problem 809 (Easy)

Same as [problem 27](#problem-27-easy).

### Problem 810 (Easy)

Same as [problem 258](#problem-258-easy).

### Problem 811 (Medium)

Same as [problem 162](#problem-162-medium).

### Problem 812 (Medium)

Same as [problem 328](#problem-328-medium).

### Problem 813 (Medium)

Same as [problem 79](#problem-79-medium).

### Problem 814 (Easy)

Same as [problem 127](#problem-127-easy).

### Problem 815 (Medium)

Same as [problem 14](#problem-14-medium).

### Problem 816 (Medium)

Same as [problem 85](#problem-85-medium).

### Problem 817 (Medium)

Same as [problem 22](#problem-22-medium).

### Problem 818 (Easy)

Same as [problem 244](#problem-244-easy).

### Problem 819 (Easy)

Same as [problem 47](#problem-47-easy).

### Problem 820 (Hard)

Same as [4](#problem-4-hard).

### Problem 821 (Easy)

Same as [problem 273](#problem-273-easy).

### Problem 822 (Easy)

Same as [problem 77](#problem-77-easy).

### Problem 823 (Medium)

Same as [problem 137](#problem-137-medium).

### Problem 824 (Easy)

Same as [problem 327](#problem-327-easy).

### Problem 825 (Easy)

Same as [problem 118](#problem-118-easy).

### Problem 826 (Hard)

Same as [problem 59](#problem-59-hard).

### Problem 827 (Medium)

Same as [problem 314](#problem-314-medium).

### Problem 828 (Medium)

Same as [problem 336](#problem-336-medium).

### Problem 829 (Hard)

Same as [problem 358](#problem-358-hard).

### Problem 830 (Medium)

Same as [problem 228](#problem-228-medium).

### Problem 831 (Medium)

Same as [problem 172](#problem-172-medium).

### Problem 832 (Easy)

Same as [problem 189](#problem-189-easy).

### Problem 833 (Medium)

Same as [problem 333](#problem-333-medium).

### Problem 834 (Hard)

Same as [problem 240](#problem-240-hard).

### Problem 835 (Medium)

Same as [problem 103](#problem-103-medium).

### Problem 836 (Medium)

Same as [problem 51](#problem-51-medium).

### Problem 837 (Medium)

Same as [problem 263](#problem-263-medium).

### Problem 838 (Medium)

Same as [problem 122](#problem-122-medium).

### Problem 839 (Easy)

Same as [problem 341](#problem-341-easy).

### Problem 840 (Medium)

Same as [problem 253](#problem-253-medium).

### Problem 841 (Easy)

Same as [problem 332](#problem-332-easy).

### Problem 842 (Medium)

Same as [problem 83](#problem-83-medium).

### Problem 843 (Medium)

Same as [problem 211](#problem-211-medium).

### Problem 844 (Hard)

Same as [problem 330](#problem-330-hard).

### Problem 845 (Medium)

Same as [problem 126](#problem-126-medium).

### Problem 846 (Medium)

Same as [5](#problem-5-medium).

### Problem 847 (Medium)

Same as [problem 106](#problem-106-medium).

### Problem 848 (Hard)

Same as [problem 52](#problem-52-hard).

### Problem 849 (Easy)

Same as [problem 210](#problem-210-easy).

### Problem 850 (Hard)

Same as [problem 264](#problem-264-hard).

### Problem 851 (Medium)

Same as [problem 182](#problem-182-medium).

### Problem 852 (Medium)

Same as [problem 190](#problem-190-medium).

### Problem 853 (Hard)

Same as [problem 153](#problem-153-hard).

### Problem 854 (Medium)

Same as [problem 57](#problem-57-medium).

### Problem 855 (Hard)

Same as [problem 38](#problem-38-hard).

### Problem 856 (Medium)

Same as [problem 287](#problem-287-medium).

### Problem 857 (Hard)

Same as [problem 357](#problem-357-hard).

### Problem 858 (Easy)

Same as [problem 33](#problem-33-easy).

### Problem 859 (Medium)

Same as [problem 215](#problem-215-medium).

### Problem 860 (Hard)

Same as [problem 25](#problem-25-hard).

### Problem 861 (Hard)

Same as [problem 304](#problem-304-hard).

### Problem 862 (Medium)

Same as [problem 262](#problem-262-medium).

### Problem 863 (Medium)

Same as [problem 116](#problem-116-medium).

### Problem 864 (Medium)

Same as [problem 291](#problem-291-medium).

### Problem 865 (Medium)

Same as [problem 299](#problem-299-medium).

### Problem 866 (Medium)

Same as [problem 130](#problem-130-medium).

### Problem 867 (Easy)

Same as [problem 201](#problem-201-easy).

### Problem 868 (Easy)

Same as [problem 157](#problem-157-easy).

### Problem 869 (Easy)

Same as [problem 104](#problem-104-easy).

### Problem 870 (Medium)

Same as [problem 136](#problem-136-medium).

### Problem 871 (Hard)

Same as [problem 349](#problem-349-hard).

### Problem 872 (Medium)

Same as [323](#problem-323-medium).

### Problem 873 (Hard)

Same as [problem 163](#problem-163-hard).

### Problem 874 (Hard)

Same as [problem 46](#problem-46-hard).

### Problem 875 (Hard)

Same as [problem 17](#problem-17-hard).

### Problem 876 (Medium)

Same as [problem 306](#problem-306-medium).

### Problem 877 (Hard)

Same as [problem 115](#problem-115-hard).

### Problem 878 (Hard)

Same as [problem 93](#problem-93-hard).

### Problem 879 (Easy)

Same as [problem 1](#problem-1-easy).

### Problem 880 (Hard)

Same as [problem 181](#problem-181-hard).

### Problem 881 (Medium)

Same as [problem 166](#problem-166-medium).

### Problem 882 (Hard)

Same as [problem 319](#problem-319-hard).

### Problem 883 (Easy)

Same as [problem 321](#problem-321-easy).

### Problem 884 (Easy)

Same as [problem 71](#problem-71-easy).

### Problem 885 (Hard)

Same as [problem 35](#problem-35-hard).

### Problem 886 (Easy)

Same as [problem 31](#problem-31-easy).

### Problem 887 (Easy)

Same as [problem 252](#problem-252-easy).

### Problem 888 (Hard)

Same as [problem 150](#problem-150-hard).

### Problem 889 (Easy)

Same as [problem 29](#problem-29-easy).

### Problem 890 (Medium)

Same as [problem 62](#problem-62-medium).

### Problem 891 (Medium)

Same as [problem 302](#problem-302-medium).

### Problem 892 (Easy)

Same as [problem 37](#problem-37-easy).

### Problem 893 (Medium)

Same as [problem 19](#problem-19-medium).

### Problem 894 (Easy)

Same as [problem 132](#problem-132-easy).

### Problem 895 (Hard)

Same as [problem 121](#problem-121-hard).

### Problem 896 (Medium)

Same as [problem 88](#problem-88-medium).

### Problem 897 (Medium)

Same as [problem 53](#problem-53-medium).

### Problem 898 (Easy)

Same as [problem 154](#problem-154-easy).

### Problem 899 (Easy)

Same as [problem 334](#problem-334-easy).

### Problem 900 (Medium)

Same as [problem 49](#problem-49-medium).

### Problem 901 (Hard)

Same as [problem 354](#problem-354-hard).

### Problem 902 (Easy)

Same as [problem 191](#problem-191-easy).

### Problem 903 (Easy)

Same as [problem 339](#problem-339-easy).

### Problem 904 (Easy)

Same as [problem 80](#problem-80-easy).

### Problem 905 (Medium)

Same as [problem 246](#problem-246-medium).

### Problem 906 (Easy)

Same as [problem 340](#problem-340-easy).

### Problem 907 (Medium)

Same as [problem 148](#problem-148-medium).

### Problem 908 (Medium)

Same as [problem 76](#problem-76-medium).

### Problem 909 (Medium)

Same as [problem 119](#problem-119-medium).

### Problem 910 (Medium)

Same as [problem 245](#problem-245-medium).

### Problem 911 (Medium)

Same as [problem 495](#problem-15-medium).

### Problem 912 (Medium)

Same as [problem 284](#problem-284-medium).

### Problem 913 (Easy)

Same as [problem 204](#problem-204-easy).

### Problem 914 (Hard)

Same as [problem 356](#problem-356-hard).

### Problem 915 (Hard)

Same as [problem 355](#problem-355-hard).

### Problem 916 (Easy)

Same as [problem 73](#problem-73-easy).

### Problem 917 (Medium)

Same as [problem 208](#problem-208-medium).

### Problem 918 (Hard)

Same as [problem 335](#problem-335-hard).

### Problem 919 (Medium)

Same as [problem 281](#problem-281-medium).

### Problem 920 (Medium)

Same as [problem 301](#problem-301-medium).

### Problem 921 (Hard)

Same as [6](#problem-6-hard).

### Problem 922 (Medium)

Same as [problem 24](#problem-24-medium).

### Problem 923 (Medium)

Same as [problem 268](#problem-268-medium).

### Problem 924 (Easy)

Same as [problem 257](#problem-257-easy).

### Problem 925 (Easy)

Same as [problem 173](#problem-173-easy).

### Problem 926 (Easy)

Same as [problem 196](#problem-196-easy).

### Problem 927 (Easy)

Same as [problem 177](#problem-177-easy).

### Problem 928 (Easy)

Same as [problem 70](#problem-70-easy).

### Problem 929 (Medium)

Same as [problem 294](#problem-294-medium).

### Problem 930 (Medium)

Same as [problem 169](#problem-169-medium).

### Problem 931 (Easy)

Same as [problem 184](#problem-184-easy).

### Problem 932 (Hard)

Same as [problem 183](#problem-183-hard).

### Problem 933 (Medium)

Same as [problem 260](#problem-260-medium).

### Problem 934 (Easy)

Same as [problem 159](#problem-159-easy).

### Problem 935 (Easy)

Same as [problem 247](#problem-247-medium).

### Problem 936 (Medium)

Same as [problem 343](#problem-343-medium).

### Problem 937 (Hard)

Same as [problem 142](#problem-142-hard).

### Problem 938 (Hard)

Same as [problem 313](#problem-313-hard).

### Problem 939 (Easy)

Same as [problem 65](#problem-65-easy).

### Problem 940 (Medium)

Same as [problem 270](#problem-270-medium).

### Problem 941 (Hard)

Same as [problem 32](#problem-32-hard).

### Problem 942 (Medium)

Same as [problem 86](#problem-86-medium).

### Problem 943 (Easy)

Same as [problem 312](#problem-312-easy).

### Problem 944 (Easy)

Same as [problem 205](#problem-205-easy).

### Problem 945 (Hard)

Same as [problem 160](#problem-160-hard).

### Problem 946 (Medium)

Same as [problem 295](#problem-295-medium).

### Problem 947 (Hard)

Same as [problem 217](#problem-217-hard).

### Problem 948 (Medium)

Same as [problem 128](#problem-128-medium).

### Problem 949 (Medium)

Same as [problem 11](#problem-11-medium).

### Problem 950 (Easy)

Same as [problem 171](#problem-171-easy).

### Problem 951 (Medium)

Same as [problem 180](#problem-180-medium).

### Problem 952 (Easy)

Same as [problem 359](#problem-359-easy).

### Problem 953 (Hard)

Same as [problem 564](#problem-9-hard).

### Problem 954 (Easy)

Same as [problem 8](#problem-8-easy).

### Problem 955 (Easy)

Same as [problem 50](#problem-50-easy).

### Problem 956 (Medium)

Same as [problem 78](#problem-78-medium).

### Problem 957 (Hard)

Same as [problem 286](#problem-286-hard).

### Problem 958 (Medium)

Same as [problem 41](#problem-41-medium).

### Problem 959 (Easy)

Same as [problem 310](#problem-310-easy).

### Problem 960 (Medium)

Same as [problem 192](#problem-192-medium).

### Problem 961 (Medium)

Same as [problem 222](#problem-222-medium).

### Problem 962 (Hard)

Same as [problem 64](#problem-64-hard).

### Problem 963 (Easy)

Same as [problem 20](#problem-20-easy).

### Problem 964 (Easy)

Same as [problem 16](#problem-16-easy).

### Problem 965 (Easy)

Same as [problem 277](#problem-277-easy).

### Problem 966 (Medium)

Same as [problem 131](#problem-131-medium).

### Problem 967 (Medium)

Same as [problem 164](#problem-164-medium).

### Problem 968 (Medium)

Same as [problem 322](#problem-322-medium).

### Problem 969 (Medium)

Same as [problem 84](#problem-84-medium).

### Problem 970 (Easy)

Same as [problem 134](#problem-134-easy).

### Problem 971 (Medium)

Same as [problem 168](#problem-168-medium).

### Problem 972 (Easy)

Same as [problem 231](#problem-231-easy).

### Problem 973 (Medium)

Same as [7](#problem-7-medium).

### Problem 974 (Hard)

Same as [problem 274](#problem-274-hard).

### Problem 975 (Hard)

Same as [problem 318](#problem-318-hard).

### Problem 976 (Medium)

Same as [problem 250](#problem-250-medium).

### Problem 977 (Easy)

Same as [problem 55](#problem-55-easy).

### Problem 978 (Hard)

Same as [problem 123](#problem-123-hard).

### Problem 979 (Medium)

Same as [problem 39](#problem-39-medium).

### Problem 980 (Medium)

Same as [problem 68](#problem-68-medium).

### Problem 981 (Medium)

Same as [problem 364](#problem-364-medium).

### Problem 982 (Easy)

Same as [problem 362](#problem-362-easy).

### Problem 983 (Medium)

Same as [problem 110](#problem-110-medium).

### Problem 984 (Hard)

Same as [problem 199](#problem-199-hard).

### Problem 985 (Medium)

Same as [problem 239](#problem-239-medium).

### Problem 986 (Easy)

Same as [problem 214](#problem-214-easy).

### Problem 987 (Medium)

Same as [problem 144](#problem-144-medium).

### Problem 988 (Medium)

Same as [problem 156](#problem-156-medium).

### Problem 989 (Medium)

Same as [problem 316](#problem-316-medium).

### Problem 990 (Hard)

Same as [problem 12](#problem-12-hard).

### Problem 991 (Medium)

Same as [problem 188](#problem-188-medium).

### Problem 993 (Medium)

Same as [problem 155](#problem-155-medium).

### Problem 994 (Easy)

Same as [problem 107](#problem-107-easy).

### Problem 995 (Hard)

Same as [problem 2](#problem-2-hard).

### Problem 996 (Hard)

Same as [problem 234](#problem-234-hard).

### Problem 997 (Medium)

Same as [3](#problem-3-medium).

### Problem 998 (Medium)

Same as [problem 56](#problem-56-medium).

### Problem 999 (Medium)

Same as [problem 74](#problem-74-medium).

### Problem 1000 (Medium)

Same as [problem 203](#problem-203-medium).

### Problem 1001 (Medium)

Same as [problem 89](#problem-89-medium).

### Problem 1002 (Easy)

Same as [problem 224](#problem-224-easy).

### Problem 1003 (Easy)

Same as [problem 255](#problem-255-easy).

### Problem 1004 (Hard)

Same as [problem 149](#problem-149-hard).

### Problem 1005 (Hard)

Same as [problem 238](#problem-238-hard).

### Problem 1006 (Easy)

Same as [194](#problem-194-easy).

### Problem 1007 (Hard)

Same as [problem 267](#problem-267-hard).

### Problem 1008 (Hard)

Same as [problem 249](#problem-249-hard).

### Problem 1009 (Easy)

Same as [problem 98](#problem-98-easy).

### Problem 1010 (Easy)

Same as [problem 325](#problem-325-easy).

### Problem 1011 (Hard)

Same as [problem 248](#problem-248-hard).

### Problem 1012 (Medium)

Same as [problem 129](#problem-129-medium).

### Problem 1013 (Medium)

Same as [problem 691](#problem-691-medium).

### Problem 1014 (Medium)

Same as [problem 170](#problem-170-medium).

### Problem 1015 (Hard)

Same as [problem 72](#problem-72-hard).

### Problem 1016 (Easy)

Same as [problem 261](#problem-261-easy).

### Problem 1017 (Hard)

Same as [problem 147](#problem-147-hard).

### Problem 1018 (Easy)

Same as [problem 303](#problem-303-easy).

### Problem 1019 (Easy)

Same as [problem 185](#problem-185-easy).

### Problem 1020 (Easy)

Same as [problem 125](#problem-125-easy).

### Problem 1021 (Medium)

Same as [problem 109](#problem-109-medium).

### Problem 1022 (Hard)

Same as [problem 40](#problem-40-hard).

### Problem 1023 (Hard)

Same as [problem 226](#problem-226-hard).

### Problem 1024 (Easy)

Same as [problem 161](#problem-161-easy).

### Problem 1025 (Easy)

Same as [problem 305](#problem-305-easy).

### Problem 1026 (Medium)

Same as [28](#problem-28-medium).

### Problem 1027 (Medium)

Same as [problem 99](#problem-99-medium).

### Problem 1028 (Medium)

Same as [problem 288](#problem-288-medium).

### Problem 1029 (Hard)

Same as [problem 138](#problem-138-hard).

### Problem 1030 (Easy)

Same as [problem 290](#problem-290-easy).

### Problem 1031 (Medium)

Same as [problem 229](#problem-229-medium).

### Problem 1032 (Easy)

Same as [problem 315](#problem-315-easy).

### Problem 1033 (Hard)

Same as [problem 186](#problem-186-hard).

### Problem 1034 (Easy)

Same as [problem 124](#problem-124-easy).

### Problem 1035 (Easy)

Same as [problem 265](#problem-265-easy).

### Problem 1036 (Medium)

Same as [problem 179](#problem-179-medium).

### Problem 1037 (Hard)

Same as [problem 296](#problem-296-hard).

### Problem 1038 (Medium)

Same as [problem 113](#problem-113-medium).

### Problem 1039 (Hard)

Same as [problem 242](#problem-242-hard).

### Problem 1040 (Hard)

Same as [problem 276](#problem-276-hard).

### Problem 1041 (Medium)

Same as [problem 30](#problem-30-medium).

### Problem 1042 (Hard)

Same as [problem 209](#problem-209-hard).

### Problem 1043 (Medium)

Same as [problem 139](#problem-139-medium).

### Problem 1044 (Hard)

Same as [114](#problem-114-hard)..

### Problem 1045 (Medium)

Same as [problem 174](#problem-174-medium).

### Problem 1046 (Medium)

Same as [problem 34](#problem-34-medium).

### Problem 1047 (Medium)

Same as [problem 97](#problem-97-medium).

### Problem 1048 (Hard)

Same as [problem 326](#problem-326-hard).

### Problem 1049 (Medium)

Same as [problem 251](#problem-251-medium).

### Problem 1050 (Easy)

Same as [problem 206](#problem-206-easy).

### Problem 1051 (Medium)

Same as [problem 58](#problem-58-medium).

### Problem 1052 (Hard)

Same as [problem 292](#problem-292-hard).

### Problem 1053 (Hard)

Same as [problem 458](#problem-458-hard).

### Problem 1054 (Medium)

Same as [problem 120](#problem-120-medium).

### Problem 1055 (Medium)

Same as [problem 133](#problem-133-medium).

### Problem 1056 (Medium)

Same as [problem 275](#problem-275-medium).

### Problem 1057 (Easy)

Same as [problem 278](#problem-278-easy).

### Problem 1058 (Medium)

Same as [problem 207](#problem-207-medium).

### Problem 1059 (Hard)

Same as [problem 351](#problem-351-hard).

### Problem 1060 (Easy)

Same as [problem 105](#problem-105-easy).

### Problem 1061 (Easy)

Same as [problem 23](#problem-23-easy).

### Problem 1062 (Easy)

Same as [problem 145](#problem-145-easy).

### Problem 1063 (Easy)

Same as [problem 311](#problem-311-easy).

### Problem 1064 (Easy)

Same as [problem 45](#problem-45-easy).

### Problem 1065 (Medium)

Same as [problem 218](#problem-218-medium).

### Problem 1066 (Hard)

Same as [problem 329](#problem-329-hard).

### Problem 1067 (Medium)

Same as [problem 146](#problem-146-medium).

### Problem 1068 (Easy)

Same as [problem 269](#problem-269-easy).

### Problem 1069 (Medium)

Same as [problem 220](#problem-220-medium).

### Problem 1070 (Easy)

Same as [problem 298](#problem-298-easy).

### Problem 1071 (Hard)

Same as [problem 42](#problem-42-hard).

### Problem 1072 (Easy)

Same as [problem 117](#problem-117-easy).

### Problem 1073 (Medium)

Same as [problem 10](#problem-10-medium).

### Problem 1074 (Hard)

Same as [problem 112](#problem-112-hard).

### Problem 1075 (Easy)

Same as [problem 233](#problem-233-easy).

### Problem 1076 (Medium)

Same as [problem 363](#problem-363-medium).

### Problem 1077 (Easy)

Same as [problem 237](#problem-237-easy).

### Problem 1078 (Easy)

Same as [problem 94](#problem-94-easy).

### Problem 1079 (Medium)

Same as [problem 140](#problem-140-medium).

### Problem 1080 (Easy)

Same as [problem 175](#problem-175-easy).

### Problem 1081 (Medium)

Same as [problem 151](#problem-151-medium).

### Problem 1082 (Hard)

Same as [problem 219](#problem-219-hard).

### Problem 1083 (Medium)

Same as [problem 216](#problem-216-medium).

### Problem 1084 (Medium)

Same as [problem 342](#problem-342-medium).

### Problem 1085 (Medium)

Same as [problem 213](#problem-213-medium).

### Problem 1086 (Hard)

Same as [problem 54](#problem-54-hard).

### Problem 1087 (Easy)

Same as [problem 108](#problem-108-easy).

### Problem 1088 (Hard)

Same as [problem 308](#problem-308-hard).

### Problem 1089 (Hard)

Same as [problem 18](#problem-18-hard).

### Problem 1090 (Hard)

Same as [problem 167](#problem-167-hard).

### Problem 1091 (Easy)

Same as [problem 279](#problem-279-easy).

### Problem 1092 (Easy)

Same as [problem 283](#problem-283-easy).

### Problem 1093 (Medium)

Same as [problem 165](#problem-165-medium).

### Problem 1094 (Hard)

Same as [problem 337](#problem-337-hard).

### Problem 1095 (Easy)

Same as [problem 187](#problem-187-easy).

### Problem 1096 (Hard)

Same as [problem 67](#problem-67-hard).

### Problem 1097 (Easy)

Same as [problem 347](#problem-347-easy).

### Problem 1098 (Easy)

Same as [problem 307](#problem-307-easy).

### Problem 1099 (Easy)

Same as [problem 197](#problem-197-easy).

### Problem 1100 (Hard)

Same as [problem 271](#problem-271-hard).

### Problem 1101 (Easy)

Same as [problem 324](#problem-324-easy).

### Problem 1102 (Medium)

Same as [problem 309](#problem-309-medium).

### Problem 1103 (Medium)

Same as [problem 158](#problem-158-medium).

### Problem 1104 (Easy)

Same as [problem 81](#problem-81-easy).

### Problem 1105 (Medium)

Same as [problem 60](#problem-60-medium).

### Problem 1106 (Medium)

Same as [problem 285](#problem-285-medium).

### Problem 1107 (Hard)

Same as [problem 344](#problem-344-hard).

### Problem 1108 (Easy)

Same as [problem 280](#problem-280-easy).

### Problem 1109 (Medium)

Same as [problem 143](#problem-143-medium).

### Problem 1110 (Easy)

Same as [problem 282](#problem-282-easy).

### Problem 1111 (Medium)

Same as [problem 297](#problem-297-medium).

### Problem 1112 (Easy)

Same as [problem 135](#problem-135-easy).

### Problem 1113 (Easy)

Same as [problem 352](#problem-352-easy).

### Problem 1114 (Easy)

Same as [problem 300](#problem-300-easy).

### Problem 1115 (Medium)

Same as [problem 90](#problem-90-medium).

### Problem 1116 (Hard)

Same as [problem 365](#problem-365-hard).

### Problem 1117 (Hard)

Same as [problem 141](#problem-141-hard).

### Problem 1118 (Easy)

Same as [problem 91](#problem-91-easy).

### Problem 1119 (Medium)

Same as [problem 243](#problem-243-medium).

### Problem 1120 (Easy)

Same as [problem 100](#problem-100-easy).

### Problem 1121 (Hard)

Same as [problem 193](#problem-193-hard).

### Problem 1122 (Hard)

Same as [problem 259](#problem-259-hard).

### Problem 1123 (Medium)

Same as [problem 198](#problem-198-medium).

### Problem 1124 (Hard)

Same as [problem 200](#problem-200-hard).

### Problem 1125 (Medium)

Same as [problem 102](#problem-102-medium).

### Problem 1126 (Medium)

Same as [350](#problem-350-medium).

### Problem 1127 (Medium)

Same as [problem 320](#problem-320-medium).

### Problem 1128 (Easy)

Same as [problem 96](#problem-96-easy).

### Problem 1129 (Medium)

Same as [problem 48](#problem-48-medium).

### Problem 1130 (Hard)

Same as [problem 93](#problem-93-hard).

### Problem 1131 (Hard)

Same as [problem 238](#problem-238-hard).

### Problem 1132 (Medium)

Same as [problem 126](#problem-126-medium).

### Problem 1133 (Easy)

Same as [problem 81](#problem-81-easy).

### Problem 1134 (Easy)

Same as [problem 33](#problem-33-easy).

### Problem 1135 (Easy)

Same as [problem 37](#problem-37-easy).

### Problem 1136 (Medium)

Same as [problem 215](#problem-215-medium).

### Problem 1137 (Medium)

Same as [5](#problem-5-medium).

### Problem 1138 (Medium)

Same as [problem 58](#problem-58-medium).

### Problem 1139 (Hard)

Same as [problem 112](#problem-112-hard).

### Problem 1140 (Hard)

Same as [problem 264](#problem-264-hard).

### Problem 1141 (Medium)

Same as [problem 309](#problem-309-medium).

### Problem 1142 (Easy)

Same as [problem 221](#problem-221-easy).

### Problem 1143 (Medium)

Same as [problem 78](#problem-78-medium).

### Problem 1144 (Easy)

Same as [problem 332](#problem-332-easy).

### Problem 1145 (Medium)

Same as [problem 301](#problem-301-medium).

### Problem 1146 (Easy)

Same as [problem 269](#problem-269-easy).

### Problem 1147 (Medium)

Same as [problem 24](#problem-24-medium).

### Problem 1148 (Easy)

Same as [problem 177](#problem-177-easy).

### Problem 1149 (Medium)

Same as [problem 84](#problem-84-medium).

### Problem 1150 (Hard)

Same as [problem 286](#problem-286-hard).

### Problem 1151 (Easy)

Same as [problem 104](#problem-104-easy).

### Problem 1152 (Medium)

Same as [problem 222](#problem-222-medium).

### Problem 1153 (Easy)

Same as [problem 100](#problem-100-easy).

### Problem 1154 (Easy)

Same as [problem 135](#problem-135-easy).

### Problem 1155 (Hard)

Same as [problem 18](#problem-18-hard).

### Problem 1156 (Easy)

Same as [problem 107](#problem-107-easy).

### Problem 1157 (Easy)

Same as [241](#problem-241-easy).

### Problem 1158 (Medium)

Same as [problem 169](#problem-169-medium).

### Problem 1159 (Easy)

Same as [problem 101](#problem-101-easy).

### Problem 1160 (Easy)

Same as [problem 359](#problem-359-easy).

### Problem 1161 (Hard)

Same as [problem 319](#problem-319-hard).

### Problem 1162 (Hard)

Same as [problem 344](#problem-344-hard).

### Problem 1163 (Easy)

Same as [problem 191](#problem-191-easy).

### Problem 1164 (Easy)

Same as [problem 124](#problem-124-easy).

### Problem 1165 (Hard)

Same as [problem 304](#problem-304-hard).

### Problem 1166 (Medium)

Same as [problem 151](#problem-151-medium).

### Problem 1167 (Medium)

Same as [problem 61](#problem-61-medium).

### Problem 1168 (Easy)

Same as [problem 334](#problem-334-easy).

### Problem 1169 (Hard)

Same as [problem 150](#problem-150-hard).

### Problem 1170 (Hard)

Same as [problem 354](#problem-354-hard).

### Problem 1171 (Easy)

Same as [problem 352](#problem-352-easy).

### Problem 1172 (Medium)

Same as [problem 48](#problem-48-medium).

### Problem 1173 (Hard)

Same as [problem 326](#problem-326-hard).

### Problem 1174 (Hard)

Same as [problem 123](#problem-123-hard).

### Problem 1175 (Medium)

Same as [problem 190](#problem-190-medium).

### Problem 1176 (Easy)

Same as [problem 98](#problem-98-easy).

### Problem 1177 (Hard)

Same as [problem 40](#problem-40-hard).

### Problem 1178 (Easy)

Same as [problem 210](#problem-210-easy).

### Problem 1179 (Easy)

Same as [problem 105](#problem-105-easy).

### Problem 1180 (Easy)

Same as [problem 145](#problem-145-easy).

### Problem 1181 (Medium)

Same as [problem 203](#problem-203-medium).

### Problem 1182 (Medium)

Same as [problem 243](#problem-243-medium).

### Problem 1183 (Easy)

Same as [problem 362](#problem-362-easy).

### Problem 1184 (Medium)

Same as [problem 360](#problem-360-medium).

### Problem 1185 (Hard)

Same as [problem 153](#problem-153-hard).

### Problem 1186 (Easy)

Same as [194](#problem-194-easy).

### Problem 1187 (Easy)

Same as [problem 175](#problem-175-easy).

### Problem 1188 (Medium)

Same as [problem 44](#problem-44-medium).

### Problem 1189 (Easy)

Same as [problem 339](#problem-339-easy).

### Problem 1190 (Medium)

Same as [problem 270](#problem-270-medium).

### Problem 1191 (Medium)

Same as [323](#problem-323-medium).

### Problem 1192 (Easy)

Same as [problem 266](#problem-266-easy).

### Problem 1193 (Hard)

Same as [problem 259](#problem-259-hard).

### Problem 1194 (Hard)

Same as [problem 330](#problem-330-hard).

### Problem 1195 (Medium)

Same as [problem 320](#problem-320-medium).

### Problem 1196 (Hard)

Same as [problem 358](#problem-358-hard).

### Problem 1197 (Easy)

Same as [problem 43](#problem-43-easy).

### Problem 1198 (Medium)

Same as [problem 316](#problem-316-medium).

### Problem 1199 (Medium)

Same as [problem 10](#problem-10-medium).

### Problem 1200 (Easy)

Same as [problem 161](#problem-161-easy).

### Problem 1201 (Medium)

Same as [problem 218](#problem-218-medium).

### Problem 1202 (Hard)

Same as [problem 240](#problem-240-hard).

### Problem 1203 (Hard)

Same as [problem 226](#problem-226-hard).

### Problem 1204 (Easy)

Same as [problem 127](#problem-127-easy).

### Problem 1206 (Hard)

Same as [problem 458](#problem-458-hard).

### Problem 1207 (Medium)

Same as [problem 26](#problem-26-medium).

### Problem 1208 (Medium)

Same as [350](#problem-350-medium).

### Problem 1209 (Medium)

Same as [problem 198](#problem-198-medium).

### Problem 1210 (Easy)

Same as [problem 307](#problem-307-easy).

### Problem 1211 (Medium)

Same as [problem 180](#problem-180-medium).

### Problem 1212 (Medium)

Same as [problem 137](#problem-137-medium).

### Problem 1213 (Hard)

Same as [problem 329](#problem-329-hard).

### Problem 1214 (Medium)

Same as [problem 41](#problem-41-medium).

### Problem 1215 (Easy)

Same as [problem 321](#problem-321-easy).

### Problem 1216 (Medium)

Same as [problem 76](#problem-76-medium).

### Problem 1217 (Easy)

Same as [problem 310](#problem-310-easy).

### Problem 1218 (Hard)

Same as [problem 141](#problem-141-hard).

### Problem 1219 (Easy)

Same as [problem 91](#problem-91-easy).

### Problem 1220 (Easy)

Same as [problem 327](#problem-327-easy).

### Problem 1221 (Easy)

Same as [problem 233](#problem-233-easy).

### Problem 1222 (Easy)

Same as [problem 196](#problem-196-easy).

### Problem 1223 (Hard)

Same as [problem 357](#problem-357-hard).

### Problem 1224 (Medium)

Same as [problem 343](#problem-343-medium).

### Problem 1225 (Medium)

Same as [problem 86](#problem-86-medium).

### Problem 1226 (Medium)

Same as [problem 284](#problem-284-medium).

### Problem 1227 (Medium)

Same as [problem 56](#problem-56-medium).

### Problem 1228 (Easy)

Same as [problem 77](#problem-77-easy).

### Problem 1229 (Easy)

Same as [problem 8](#problem-8-easy).

### Problem 1230 (Medium)

Same as [problem 162](#problem-162-medium).

### Problem 1231 (Medium)

Same as [problem 14](#problem-14-medium).

### Problem 1232 (Medium)

Same as [problem 302](#problem-302-medium).

### Problem 1233 (Hard)

Same as [problem 35](#problem-35-hard).

### Problem 1234 (Easy)

Same as [problem 290](#problem-290-easy).

### Problem 1235 (Medium)

Same as [3](#problem-3-medium).

### Problem 1236 (Medium)

Same as [problem 272](#problem-272-medium).

### Problem 1237 (Easy)

Same as [problem 279](#problem-279-easy).

### Problem 1238 (Medium)

Same as [problem 34](#problem-34-medium).

### Problem 1239 (Medium)

Same as [problem 88](#problem-88-medium).

### Problem 1240 (Medium)

Same as [problem 148](#problem-148-medium).

### Problem 1241 (Medium)

Same as [problem 333](#problem-333-medium).

### Problem 1242 (Medium)

Same as [problem 170](#problem-170-medium).

### Problem 1243 (Easy)

Same as [problem 108](#problem-108-easy).

### Problem 1244 (Medium)

Same as [problem 291](#problem-291-medium).

### Problem 1245 (Medium)

Same as [28](#problem-28-medium).

### Problem 1246 (Hard)

Same as [problem 234](#problem-234-hard).

### Problem 1247 (Easy)

Same as [problem 118](#problem-118-easy).

### Problem 1248 (Medium)

Same as [problem 172](#problem-172-medium).

### Problem 1249 (Medium)

Same as [problem 89](#problem-89-medium).

### Problem 1250 (Easy)

Same as [problem 157](#problem-157-easy).

### Problem 1251 (Hard)

Same as [problem 25](#problem-25-hard).

### Problem 1252 (Easy)

Same as [problem 303](#problem-303-easy).

### Problem 1253 (Easy)

Same as [problem 27](#problem-27-easy).

### Problem 1254 (Hard)

Same as [problem 200](#problem-200-hard).

### Problem 1255 (Easy)

Same as [problem 1](#problem-1-easy).

### Problem 1256 (Medium)

Same as [problem 49](#problem-49-medium).

### Problem 1257 (Medium)

Same as [problem 314](#problem-314-medium).

### Problem 1258 (Medium)

Same as [problem 139](#problem-139-medium).

### Problem 1259 (Medium)

Same as [problem 331](#problem-331-medium).

### Problem 1260 (Easy)

Same as [problem 171](#problem-171-easy).

### Problem 1261 (Hard)

Same as [problem 167](#problem-167-hard).

### Problem 1262 (Medium)

Same as [problem 188](#problem-188-medium).

### Problem 1263 (Medium)

Same as [problem 110](#problem-110-medium).

### Problem 1264 (Medium)

Same as [problem 136](#problem-136-medium).

### Problem 1265 (Medium)

Same as [problem 22](#problem-22-medium).

### Problem 1266 (Medium)

Same as [problem 228](#problem-228-medium).

### Problem 1267 (Hard)

Same as [problem 149](#problem-149-hard).

### Problem 1268 (Medium)

Same as [problem 85](#problem-85-medium).

### Problem 1269 (Medium)

Same as [problem 168](#problem-168-medium).

### Problem 1270 (Hard)

Same as [problem 111](#problem-111-hard).

### Problem 1271 (Easy)

Same as [problem 71](#problem-71-easy).

### Problem 1272 (Easy)

Same as [problem 315](#problem-315-easy).

### Problem 1273 (Easy)

Same as [problem 232](#problem-232-easy).

### Problem 1274 (Medium)

Same as [problem 146](#problem-146-medium).

### Problem 1275 (Hard)

Same as [problem 46](#problem-46-hard).

### Problem 1276 (Medium)

Same as [problem 60](#problem-60-medium).

### Problem 1277 (Medium)

Same as [problem 363](#problem-363-medium).

### Problem 1278 (Hard)

Same as [problem 54](#problem-54-hard).

### Problem 1279 (Medium)

Same as [problem 297](#problem-297-medium).

### Problem 1280 (Medium)

Same as [problem 109](#problem-109-medium).

### Problem 1281 (Easy)

Same as [problem 185](#problem-185-easy).

### Problem 1282 (Easy)

Same as [problem 70](#problem-70-easy).

### Problem 1283 (Medium)

Same as [problem 165](#problem-165-medium).

### Problem 1284 (Hard)

Same as [problem 195](#problem-195-hard).

### Problem 1285 (Medium)

Same as [problem 253](#problem-253-medium).

### Problem 1286 (Medium)

Same as [problem 262](#problem-262-medium).

### Problem 1287 (Easy)

Same as [problem 265](#problem-265-easy).

### Problem 1288 (Hard)

Same as [problem 199](#problem-199-hard).

### Problem 1289 (Hard)

Same as [problem 335](#problem-335-hard).

### Problem 1290 (Medium)

Same as [problem 236](#problem-236-medium).

### Problem 1291 (Easy)

Same as [problem 205](#problem-205-easy).

### Problem 1292 (Medium)

Same as [problem 295](#problem-295-medium).

### Problem 1293 (Hard)

Same as [problem 318](#problem-318-hard).

### Problem 1294 (Easy)

Same as [problem 29](#problem-29-easy).

### Problem 1295 (Easy)

Same as [problem 16](#problem-16-easy).

### Problem 1296 (Easy)

Same as [problem 224](#problem-224-easy).

### Problem 1297 (Easy)

Same as [problem 82](#problem-82-easy).

### Problem 1298 (Medium)

Same as [problem 288](#problem-288-medium).

### Problem 1299 (Hard)

Same as [problem 12](#problem-12-hard).

### Problem 1300 (Medium)

Same as [problem 102](#problem-102-medium).

### Problem 1301 (Medium)

Same as [problem 322](#problem-322-medium).

### Problem 1302 (Hard)

Same as [4](#problem-4-hard).

### Problem 1303 (Medium)

Same as [problem 338](#problem-338-medium).

### Problem 1304 (Medium)

Same as [problem 90](#problem-90-medium).

### Problem 1305 (Hard)

Same as [problem 209](#problem-209-hard).

### Problem 1306 (Hard)

Same as [problem 17](#problem-17-hard).

### Problem 1307 (Medium)

Same as [problem 51](#problem-51-medium).

### Problem 1308 (Medium)

Same as [problem 299](#problem-299-medium).

### Problem 1309 (Hard)

Same as [problem 349](#problem-349-hard).

### Problem 1310 (Medium)

Same as [problem 256](#problem-256-medium).

### Problem 1311 (Hard)

Same as [problem 365](#problem-365-hard).

### Problem 1312 (Easy)

Same as [problem 45](#problem-45-easy).

### Problem 1313 (Medium)

Same as [problem 691](#problem-691-medium).

### Problem 1314 (Easy)

Same as [problem 252](#problem-252-easy).

### Problem 1315 (Medium)

Same as [problem 275](#problem-275-medium).

### Problem 1316 (Hard)

Same as [problem 217](#problem-217-hard).

### Problem 1317 (Medium)

Same as [problem 260](#problem-260-medium).

### Problem 1318 (Easy)

Same as [problem 347](#problem-347-easy).

### Problem 1319 (Medium)

Same as [problem 129](#problem-129-medium).

### Problem 1320 (Hard)

Same as [problem 13](#problem-13-hard).

### Problem 1321 (Medium)

Same as [problem 216](#problem-216-medium).

### Problem 1322 (Hard)

Same as [problem 289](#problem-289-hard).

### Problem 1323 (Hard)

Same as [problem 293](#problem-293-hard).

### Problem 1324 (Hard)

Same as [problem 242](#problem-242-hard).

### Problem 1325 (Hard)

Same as [problem 296](#problem-296-hard).

### Problem 1326 (Medium)

Same as [problem 342](#problem-342-medium).

### Problem 1327 (Hard)

Same as [problem 356](#problem-356-hard).

### Problem 1328 (Hard)

Same as [problem 181](#problem-181-hard).

### Problem 1329 (Easy)

Same as [problem 340](#problem-340-easy).

### Problem 1330 (Easy)

Same as [problem 212](#problem-212-easy).

### Problem 1331 (Easy)

Same as [problem 187](#problem-187-easy).

### Problem 1332 (Hard)

Same as [problem 355](#problem-355-hard).

### Problem 1333 (Medium)

Same as [problem 158](#problem-158-medium).

### Problem 1334 (Easy)

Same as [problem 31](#problem-31-easy).

### Problem 1335 (Medium)

Same as [7](#problem-7-medium).

### Problem 1336 (Hard)

Same as [problem 38](#problem-38-hard).

### Problem 1337 (Easy)

Same as [problem 244](#problem-244-easy).

### Problem 1338 (Medium)

Same as [problem 99](#problem-99-medium).

### Problem 1339 (Medium)

Same as [problem 68](#problem-68-medium).

### Problem 1340 (Medium)

Same as [problem 62](#problem-62-medium).

### Problem 1341 (Easy)

Same as [problem 247](#problem-247-medium).

### Problem 1342 (Easy)

Same as [problem 341](#problem-341-easy).

### Problem 1343 (Hard)

Same as [problem 138](#problem-138-hard).

### Problem 1344 (Hard)

Same as [problem 292](#problem-292-hard).

### Problem 1345 (Easy)

Same as [problem 257](#problem-257-easy).

### Problem 1346 (Medium)

Same as [problem 144](#problem-144-medium).

### Problem 1347 (Easy)

Same as [problem 231](#problem-231-easy).

### Problem 1348 (Hard)

Same as [problem 160](#problem-160-hard).

### Problem 1349 (Medium)

Same as [problem 179](#problem-179-medium).

### Problem 1350 (Easy)

Same as [problem 305](#problem-305-easy).

### Problem 1351 (Hard)

Same as [problem 235](#problem-235-hard).

### Problem 1352 (Hard)

Same as [problem 32](#problem-32-hard).

### Problem 1353 (Medium)

Same as [problem 336](#problem-336-medium).

### Problem 1354 (Medium)

Same as [problem 245](#problem-245-medium).

### Problem 1355 (Easy)

Same as [problem 214](#problem-214-easy).

### Problem 1356 (Easy)

Same as [problem 258](#problem-258-easy).

### Problem 1357 (Hard)

Same as [6](#problem-6-hard).

### Problem 1358 (Medium)

Same as [problem 130](#problem-130-medium).

### Problem 1359 (Medium)

Same as [problem 495](#problem-15-medium).

### Problem 1360 (Medium)

Same as [problem 239](#problem-239-medium).

### Problem 1361 (Hard)

Same as [problem 193](#problem-193-hard).

### Problem 1362 (Easy)

Same as [problem 298](#problem-298-easy).

### Problem 1363 (Easy)

Same as [problem 300](#problem-300-easy).

### Problem 1364 (Hard)

Same as [problem 72](#problem-72-hard).

### Problem 1365 (Easy)

Same as [problem 204](#problem-204-easy).

### Problem 1366 (Medium)

Same as [problem 207](#problem-207-medium).

### Problem 1367 (Medium)

Same as [problem 250](#problem-250-medium).

### Problem 1368 (Hard)

Same as [problem 183](#problem-183-hard).

### Problem 1369 (Medium)

Same as [problem 213](#problem-213-medium).

### Problem 1370 (Hard)

Same as [problem 121](#problem-121-hard).

### Problem 1371 (Easy)

Same as [problem 324](#problem-324-easy).

### Problem 1372 (Easy)

Same as [problem 23](#problem-23-easy).

### Problem 1373 (Medium)

Same as [problem 166](#problem-166-medium).

### Problem 1374 (Medium)

Same as [problem 106](#problem-106-medium).

### Problem 1375 (Medium)

Same as [problem 246](#problem-246-medium).

### Problem 1376 (Hard)

Same as [problem 337](#problem-337-hard).

### Problem 1377 (Hard)

Same as [problem 142](#problem-142-hard).

### Problem 1378 (Easy)

Same as [problem 94](#problem-94-easy).

### Problem 1379 (Hard)

Same as [problem 248](#problem-248-hard).

### Problem 1380 (Hard)

Same as [problem 42](#problem-42-hard).

### Problem 1381 (Medium)

Same as [problem 39](#problem-39-medium).

### Problem 1382 (Medium)

Same as [problem 364](#problem-364-medium).

### Problem 1383 (Medium)

Same as [problem 152](#problem-152-medium).

### Problem 1384 (Easy)

Same as [problem 132](#problem-132-easy).

### Problem 1385 (Easy)

Same as [problem 65](#problem-65-easy).

### Problem 1386 (Medium)

Same as [problem 36](#problem-36-medium).

### Problem 1387 (Easy)

Same as [problem 125](#problem-125-easy).

### Problem 1388 (Medium)

Same as [problem 53](#problem-53-medium).

### Problem 1389 (Medium)

Same as [problem 287](#problem-287-medium).

### Problem 1390 (Medium)

Same as [problem 122](#problem-122-medium).

### Problem 1391 (Medium)

Same as [problem 66](#problem-66-medium).

### Problem 1392 (Hard)

Same as [problem 313](#problem-313-hard).

### Problem 1393 (Easy)

Same as [problem 225](#problem-225-easy).

### Problem 1394 (Easy)

Same as [problem 73](#problem-73-easy).

### Problem 1395 (Hard)

Same as [problem 52](#problem-52-hard).

### Problem 1396 (Hard)

Same as [problem 276](#problem-276-hard).

### Problem 1397 (Easy)

Same as [problem 20](#problem-20-easy).

### Problem 1398 (Medium)

Same as [problem 79](#problem-79-medium).

### Problem 1399 (Medium)

Same as [problem 19](#problem-19-medium).

### Problem 1400 (Medium)

Same as [problem 268](#problem-268-medium).

### Problem 1401 (Hard)

Same as [problem 59](#problem-59-hard).

### Problem 1402 (Easy)

Same as [problem 261](#problem-261-easy).

### Problem 1403 (Hard)

Same as [problem 178](#problem-178-hard).

### Problem 1404 (Medium)

Same as [problem 211](#problem-211-medium).

### Problem 1405 (Hard)

Same as [problem 308](#problem-308-hard).

### Problem 1406 (Easy)

Same as [problem 117](#problem-117-easy).

### Problem 1407 (Medium)

Same as [problem 285](#problem-285-medium).

### Problem 1408 (Hard)

Same as [problem 147](#problem-147-hard).

### Problem 1409 (Easy)

Same as [problem 255](#problem-255-easy).

### Problem 1410 (Hard)

Same as [problem 219](#problem-219-hard).

### Problem 1411 (Hard)

Same as [problem 115](#problem-115-hard).

### Problem 1412 (Medium)

Same as [problem 116](#problem-116-medium).

### Problem 1413 (Medium)

Same as [problem 103](#problem-103-medium).

### Problem 1414 (Easy)

Same as [problem 176](#problem-176-easy).

### Problem 1415 (Easy)

Same as [problem 173](#problem-173-easy).

### Problem 1416 (Hard)

Same as [problem 274](#problem-274-hard).

### Problem 1417 (Easy)

Same as [problem 312](#problem-312-easy).

### Problem 1418 (Medium)

Same as [problem 133](#problem-133-medium).

### Problem 1419 (Medium)

Same as [problem 113](#problem-113-medium).

### Problem 1420 (Medium)

Same as [problem 57](#problem-57-medium).

### Problem 1421 (Hard)

Same as [problem 2](#problem-2-hard).

### Problem 1422 (Hard)

Same as [problem 564](#problem-9-hard).

### Problem 1423 (Medium)

Same as [problem 192](#problem-192-medium).

### Problem 1424 (Easy)

Same as [problem 55](#problem-55-easy).

### Problem 1425 (Easy)

Same as [problem 50](#problem-50-easy).

### Problem 1426 (Hard)

Same as [problem 249](#problem-249-hard).

### Problem 1427 (Easy)

Same as [problem 197](#problem-197-easy).

### Problem 1428 (Hard)

Same as [problem 186](#problem-186-hard).

### Problem 1429 (Easy)

Same as [problem 311](#problem-311-easy).

### Problem 1430 (Easy)

Same as [problem 134](#problem-134-easy).

### Problem 1431 (Medium)

Same as [problem 155](#problem-155-medium).

### Problem 1432 (Medium)

Same as [problem 131](#problem-131-medium).

### Problem 1433 (Medium)

Same as [problem 263](#problem-263-medium).

### Problem 1434 (Medium)

Same as [problem 346](#problem-346-medium).

### Problem 1435 (Medium)

Same as [problem 120](#problem-120-medium).

### Problem 1436 (Easy)

Same as [problem 189](#problem-189-easy).

### Problem 1437 (Hard)

Same as [problem 75](#problem-75-hard).

### Problem 1438 (Medium)

Same as [problem 353](#problem-353-medium).

### Problem 1439 (Easy)

Same as [problem 63](#problem-63-easy).

### Problem 1440 (Easy)

Same as [problem 348](#problem-348-easy).

### Problem 1441 (Easy)

Same as [problem 277](#problem-277-easy).

### Problem 1442 (Easy)

Same as [problem 154](#problem-154-easy).

### Problem 1443 (Hard)

Same as [problem 351](#problem-351-hard).

### Problem 1444 (Medium)

Same as [problem 254](#problem-254-medium).

### Problem 1445 (Easy)

Same as [problem 325](#problem-325-easy).

### Problem 1446 (Medium)

Same as [problem 119](#problem-119-medium).

### Problem 1447 (Medium)

Same as [problem 361](#problem-361-medium).

### Problem 1448 (Medium)

Same as [problem 281](#problem-281-medium).

### Problem 1449 (Medium)

Same as [problem 30](#problem-30-medium).

### Problem 1450 (Medium)

Same as [problem 128](#problem-128-medium).

### Problem 1451 (Hard)

Same as [problem 95](#problem-95-hard).

### Problem 1452 (Medium)

Same as [problem 306](#problem-306-medium).

### Problem 1453 (Easy)

Same as [problem 206](#problem-206-easy).

### Problem 1454 (Medium)

Same as [problem 182](#problem-182-medium).

### Problem 1455 (Easy)

Same as [problem 201](#problem-201-easy).

### Problem 1456 (Easy)

Same as [problem 159](#problem-159-easy).

### Problem 1457 (Hard)

Same as [problem 67](#problem-67-hard).

### Problem 1458 (Medium)

Same as [problem 229](#problem-229-medium).

### Problem 1459 (Medium)

Same as [problem 83](#problem-83-medium).

### Problem 1460 (Easy)

Same as [problem 273](#problem-273-easy).

### Problem 1461 (Medium)

Same as [problem 230](#problem-230-medium).

### Problem 1462 (Hard)

Same as [problem 163](#problem-163-hard).

### Problem 1463 (Easy)

Same as [problem 282](#problem-282-easy).

### Problem 1464 (Medium)

Same as [problem 140](#problem-140-medium).

### Problem 1465 (Medium)

Same as [problem 220](#problem-220-medium).

### Problem 1466 (Medium)

Same as [problem 345](#problem-345-medium).

### Problem 1467 (Easy)

Same as [problem 96](#problem-96-easy).

### Problem 1468 (Hard)

Same as [problem 64](#problem-64-hard).

### Problem 1469 (Hard)

Same as [problem 267](#problem-267-hard).

### Problem 1470 (Medium)

Same as [problem 156](#problem-156-medium).

### Problem 1471 (Hard)

Same as [problem 271](#problem-271-hard).

### Problem 1472 (Easy)

Same as [problem 69](#problem-69-easy).

### Problem 1473 (Medium)

Same as [problem 74](#problem-74-medium).

### Problem 1474 (Easy)

Same as [problem 227](#problem-227-easy).

### Problem 1475 (Medium)

Same as [problem 11](#problem-11-medium).

### Problem 1476 (Easy)

Same as [problem 47](#problem-47-easy).

### Problem 1477 (Easy)

Same as [problem 283](#problem-283-easy).

### Problem 1478 (Easy)

Same as [problem 80](#problem-80-easy).

### Problem 1479 (Medium)

Same as [problem 143](#problem-143-medium).

### Problem 1480 (Medium)

Same as [problem 251](#problem-251-medium).

### Problem 1481 (Hard)

Same as [114](#problem-114-hard)..

### Problem 1482 (Easy)

Same as [problem 202](#problem-202-easy).

### Problem 1483 (Medium)

Same as [problem 294](#problem-294-medium).

### Problem 1484 (Easy)

Same as [problem 278](#problem-278-easy).

### Problem 1485 (Easy)

Same as [problem 237](#problem-237-easy).

### Problem 1486 (Medium)

Same as [problem 208](#problem-208-medium).

### Problem 1487 (Hard)

Same as [problem 223](#problem-223-hard).

### Problem 1488 (Hard)

Same as [problem 92](#problem-92-hard).

### Problem 1489 (Medium)

Same as [problem 97](#problem-97-medium).

### Problem 1490 (Medium)

Same as [problem 164](#problem-164-medium).

### Problem 1491 (Medium)

Same as [problem 174](#problem-174-medium).

### Problem 1492 (Easy)

Same as [problem 21](#problem-21-easy).

### Problem 1493 (Easy)

Same as [problem 282](#problem-282-easy).

### Problem 1494 (Medium)

Same as [problem 218](#problem-218-medium).

### Problem 1495 (Hard)

Same as [problem 326](#problem-326-hard).

### Problem 1496 (Medium)

Same as [problem 19](#problem-19-medium).

### Problem 1497 (Easy)

Same as [problem 266](#problem-266-easy).

### Problem 1498 (Medium)

Same as [problem 39](#problem-39-medium).

### Problem 1499 (Medium)

Same as [problem 10](#problem-10-medium).

### Problem 1500 (Medium)

Same as [problem 84](#problem-84-medium).

### Problem 1501 (Easy)

Same as [problem 196](#problem-196-easy).

### Problem 1502 (Hard)

Same as [problem 95](#problem-95-hard).

### Problem 1503 (Easy)

Same as [problem 37](#problem-37-easy).

### Problem 1504 (Hard)

Same as [problem 276](#problem-276-hard).

### Problem 1505 (Medium)

Same as [problem 106](#problem-106-medium).

### Problem 1506 (Hard)

Same as [problem 249](#problem-249-hard).

### Problem 1507 (Medium)

Same as [problem 179](#problem-179-medium).

### Problem 1508 (Hard)

Same as [problem 2](#problem-2-hard).

### Problem 1509 (Medium)

Same as [problem 182](#problem-182-medium).

### Problem 1510 (Hard)

Same as [problem 141](#problem-141-hard).

### Problem 1511 (Medium)

Same as [problem 343](#problem-343-medium).

### Problem 1512 (Easy)

Same as [problem 159](#problem-159-easy).

### Problem 1513 (Medium)

Same as [problem 211](#problem-211-medium).

### Problem 1514 (Easy)

Same as [problem 189](#problem-189-easy).

### Problem 1515 (Medium)

Same as [problem 228](#problem-228-medium).

### Problem 1516 (Medium)

Same as [problem 113](#problem-113-medium).

### Problem 1517 (Easy)

Same as [problem 8](#problem-8-easy).

### Problem 1518 (Easy)

Same as [problem 261](#problem-261-easy).

### Problem 1519 (Hard)

Same as [problem 178](#problem-178-hard).

### Problem 1520 (Hard)

Same as [problem 40](#problem-40-hard).

### Problem 1521 (Hard)

Same as [problem 111](#problem-111-hard).

### Problem 1522 (Medium)

Same as [problem 172](#problem-172-medium).

### Problem 1523 (Medium)

Same as [problem 36](#problem-36-medium).

### Problem 1524 (Hard)

Same as [4](#problem-4-hard).

### Problem 1525 (Easy)

Same as [problem 277](#problem-277-easy).

### Problem 1526 (Hard)

Same as [problem 335](#problem-335-hard).

### Problem 1527 (Medium)

Same as [problem 74](#problem-74-medium).

### Problem 1528 (Medium)

Same as [problem 291](#problem-291-medium).

### Problem 1529 (Medium)

Same as [problem 146](#problem-146-medium).

### Problem 1530 (Easy)

Same as [problem 258](#problem-258-easy).

### Problem 1531 (Easy)

Same as [problem 231](#problem-231-easy).

### Problem 1532 (Medium)

Same as [problem 83](#problem-83-medium).

### Problem 1533 (Medium)

Same as [problem 299](#problem-299-medium).

### Problem 1534 (Medium)

Same as [problem 137](#problem-137-medium).

### Problem 1535 (Easy)

Same as [problem 1](#problem-1-easy).

### Problem 1536 (Medium)

Same as [problem 49](#problem-49-medium).

### Problem 1537 (Easy)

Same as [problem 175](#problem-175-easy).

### Problem 1538 (Easy)

Same as [problem 21](#problem-21-easy).

### Problem 1539 (Easy)

Same as [problem 305](#problem-305-easy).

### Problem 1540 (Easy)

Same as [problem 69](#problem-69-easy).

### Problem 1541 (Medium)

Same as [problem 51](#problem-51-medium).

### Problem 1542 (Easy)

Same as [problem 27](#problem-27-easy).

### Problem 1543 (Medium)

Same as [problem 14](#problem-14-medium).

### Problem 1544 (Hard)

Same as [problem 17](#problem-17-hard).

### Problem 1545 (Hard)

Same as [problem 293](#problem-293-hard).

### Problem 1546 (Medium)

Same as [problem 208](#problem-208-medium).

### Problem 1547 (Hard)

Same as [6](#problem-6-hard).

### Problem 1548 (Easy)

Same as [problem 265](#problem-265-easy).

### Problem 1549 (Easy)

Same as [problem 315](#problem-315-easy).

### Problem 1550 (Easy)

Same as [problem 91](#problem-91-easy).

### Problem 1551 (Medium)

Same as [problem 263](#problem-263-medium).

### Problem 1552 (Easy)

Same as [problem 47](#problem-47-easy).

### Problem 1553 (Hard)

Same as [problem 226](#problem-226-hard).

### Problem 1554 (Easy)

Same as [problem 157](#problem-157-easy).

### Problem 1555 (Medium)

Same as [problem 116](#problem-116-medium).

### Problem 1556 (Easy)

Same as [problem 327](#problem-327-easy).

### Problem 1557 (Medium)

Same as [problem 122](#problem-122-medium).

### Problem 1558 (Easy)

Same as [problem 279](#problem-279-easy).

### Problem 1559 (Hard)

Same as [problem 357](#problem-357-hard).

### Problem 1560 (Medium)

Same as [problem 119](#problem-119-medium).

### Problem 1561 (Easy)

Same as [problem 107](#problem-107-easy).

### Problem 1562 (Easy)

Same as [problem 324](#problem-324-easy).

### Problem 1563 (Medium)

Same as [problem 62](#problem-62-medium).

### Problem 1564 (Hard)

Same as [problem 195](#problem-195-hard).

### Problem 1565 (Medium)

Same as [problem 60](#problem-60-medium).

### Problem 1566 (Hard)

Same as [problem 46](#problem-46-hard).

### Problem 1567 (Easy)

Same as [problem 171](#problem-171-easy).

### Problem 1568 (Easy)

Same as [problem 214](#problem-214-easy).

### Problem 1569 (Easy)

Same as [problem 55](#problem-55-easy).

### Problem 1570 (Medium)

Same as [problem 275](#problem-275-medium).

### Problem 1571 (Medium)

Same as [problem 22](#problem-22-medium).

### Problem 1572 (Easy)

Same as [problem 81](#problem-81-easy).

### Problem 1573 (Easy)

Same as [problem 311](#problem-311-easy).

### Problem 1574 (Medium)

Same as [problem 162](#problem-162-medium).

### Problem 1575 (Medium)

Same as [problem 250](#problem-250-medium).

### Problem 1576 (Hard)

Same as [problem 238](#problem-238-hard).

### Problem 1577 (Hard)

Same as [problem 217](#problem-217-hard).

### Problem 1578 (Hard)

Same as [problem 235](#problem-235-hard).

### Problem 1579 (Medium)

Same as [problem 190](#problem-190-medium).

### Problem 1580 (Medium)

Same as [problem 198](#problem-198-medium).

### Problem 1581 (Easy)

Same as [problem 185](#problem-185-easy).

### Problem 1582 (Hard)

Same as [problem 219](#problem-219-hard).

### Problem 1583 (Medium)

Same as [problem 215](#problem-215-medium).

### Problem 1584 (Medium)

Same as [problem 166](#problem-166-medium).

### Problem 1585 (Easy)

Same as [problem 244](#problem-244-easy).

### Problem 1586 (Hard)

Same as [problem 319](#problem-319-hard).

### Problem 1587 (Medium)

Same as [problem 245](#problem-245-medium).

### Problem 1588 (Medium)

Same as [problem 158](#problem-158-medium).

### Problem 1589 (Easy)

Same as [problem 290](#problem-290-easy).

### Problem 1590 (Medium)

Same as [problem 320](#problem-320-medium).

### Problem 1591 (Hard)

Same as [problem 42](#problem-42-hard).

### Problem 1592 (Easy)

Same as [problem 82](#problem-82-easy).

### Problem 1593 (Easy)

Same as [problem 71](#problem-71-easy).

### Problem 1594 (Easy)

Same as [problem 187](#problem-187-easy).

### Problem 1595 (Hard)

Same as [problem 181](#problem-181-hard).

### Problem 1596 (Easy)

Same as [problem 237](#problem-237-easy).

### Problem 1597 (Medium)

Same as [problem 48](#problem-48-medium).

### Problem 1598 (Hard)

Same as [problem 355](#problem-355-hard).

### Problem 1599 (Medium)

Same as [problem 213](#problem-213-medium).

### Problem 1600 (Easy)

Same as [problem 154](#problem-154-easy).

### Problem 1601 (Easy)

Same as [problem 135](#problem-135-easy).

### Problem 1602 (Medium)

Same as [problem 331](#problem-331-medium).

### Problem 1603 (Easy)

Same as [problem 310](#problem-310-easy).

### Problem 1604 (Easy)

Same as [problem 307](#problem-307-easy).

### Problem 1605 (Easy)

Same as [problem 312](#problem-312-easy).

### Problem 1606 (Easy)

Same as [problem 247](#problem-247-medium).

### Problem 1607 (Easy)

Same as [problem 176](#problem-176-easy).

### Problem 1608 (Medium)

Same as [problem 336](#problem-336-medium).

### Problem 1609 (Hard)

Same as [problem 242](#problem-242-hard).

### Problem 1610 (Medium)

Same as [problem 495](#problem-15-medium).

### Problem 1611 (Easy)

Same as [problem 347](#problem-347-easy).

### Problem 1612 (Hard)

Same as [problem 296](#problem-296-hard).

### Problem 1613 (Hard)

Same as [problem 286](#problem-286-hard).

### Problem 1614 (Medium)

Same as [7](#problem-7-medium).

### Problem 1615 (Easy)

Same as [problem 197](#problem-197-easy).

### Problem 1616 (Easy)

Same as [problem 101](#problem-101-easy).

### Problem 1617 (Easy)

Same as [problem 269](#problem-269-easy).

### Problem 1618 (Easy)

Same as [problem 221](#problem-221-easy).

### Problem 1619 (Hard)

Same as [problem 115](#problem-115-hard).

### Problem 1620 (Hard)

Same as [problem 54](#problem-54-hard).

### Problem 1621 (Easy)

Same as [problem 283](#problem-283-easy).

### Problem 1622 (Hard)

Same as [problem 13](#problem-13-hard).

### Problem 1623 (Medium)

Same as [problem 345](#problem-345-medium).

### Problem 1624 (Medium)

Same as [problem 288](#problem-288-medium).

### Problem 1625 (Medium)

Same as [problem 133](#problem-133-medium).

### Problem 1626 (Easy)

Same as [problem 127](#problem-127-easy).

### Problem 1627 (Easy)

Same as [problem 105](#problem-105-easy).

### Problem 1628 (Medium)

Same as [problem 168](#problem-168-medium).

### Problem 1629 (Medium)

Same as [problem 143](#problem-143-medium).

### Problem 1630 (Medium)

This problem was asked by Facebook.

Same as [problem 110](#problem-110-medium).

### Problem 1631 (Medium)

Same as [problem 89](#problem-89-medium).

### Problem 1632 (Hard)

Same as [problem 186](#problem-186-hard).

### Problem 1633 (Medium)

Same as [problem 85](#problem-85-medium).

### Problem 1634 (Medium)

Same as [problem 170](#problem-170-medium).

### Problem 1635 (Hard)

Same as [problem 200](#problem-200-hard).

### Problem 1636 (Hard)

Same as [problem 121](#problem-121-hard).

### Problem 1637 (Hard)

Same as [problem 271](#problem-271-hard).

### Problem 1638 (Easy)

Same as [problem 145](#problem-145-easy).

### Problem 1639 (Medium)

Same as [problem 44](#problem-44-medium).

### Problem 1640 (Hard)

Same as [problem 142](#problem-142-hard).

### Problem 1641 (Easy)

Same as [problem 29](#problem-29-easy).

### Problem 1642 (Hard)

Same as [problem 153](#problem-153-hard).

### Problem 1643 (Easy)

Same as [problem 161](#problem-161-easy).

### Problem 1644 (Easy)

Same as [problem 205](#problem-205-easy).

### Problem 1645 (Hard)

Same as [problem 25](#problem-25-hard).

### Problem 1646 (Medium)

Same as [problem 126](#problem-126-medium).

### Problem 1647 (Medium)

Same as [problem 220](#problem-220-medium).

### Problem 1648 (Medium)

Same as [problem 222](#problem-222-medium).

### Problem 1649 (Easy)

Same as [problem 212](#problem-212-easy).

### Problem 1650 (Hard)

Same as [problem 234](#problem-234-hard).

### Problem 1651 (Hard)

Same as [problem 318](#problem-318-hard).

### Problem 1652 (Medium)

Same as [problem 34](#problem-34-medium).

### Problem 1653 (Easy)

Same as [problem 50](#problem-50-easy).

### Problem 1654 (Hard)

Same as [problem 351](#problem-351-hard).

### Problem 1655 (Medium)

Same as [problem 188](#problem-188-medium).

### Problem 1656 (Medium)

Same as [problem 11](#problem-11-medium).

### Problem 1657 (Easy)

Same as [problem 177](#problem-177-easy).

### Problem 1658 (Easy)

Same as [problem 201](#problem-201-easy).

### Problem 1659 (Easy)

Same as [problem 257](#problem-257-easy).

### Problem 1660 (Hard)

Same as [problem 344](#problem-344-hard).

### Problem 1661 (Medium)

Same as [problem 301](#problem-301-medium).

### Problem 1662 (Hard)

Same as [problem 67](#problem-67-hard).

### Problem 1663 (Hard)

Same as [problem 337](#problem-337-hard).

### Problem 1664 (Easy)

Same as [problem 206](#problem-206-easy).

### Problem 1665 (Medium)

Same as [problem 281](#problem-281-medium).

### Problem 1666 (Easy)

Same as [problem 184](#problem-184-easy).

### Problem 1667 (Hard)

Same as [problem 92](#problem-92-hard).

### Problem 1668 (Easy)

Same as [problem 70](#problem-70-easy).

### Problem 1669 (Easy)

Same as [problem 118](#problem-118-easy).

### Problem 1670 (Medium)

Same as [problem 102](#problem-102-medium).

### Problem 1671 (Medium)

Same as [problem 76](#problem-76-medium).

### Problem 1672 (Hard)

Same as [problem 267](#problem-267-hard).

### Problem 1673 (Hard)

Same as [problem 313](#problem-313-hard).

### Problem 1674 (Hard)

Same as [problem 59](#problem-59-hard).

### Problem 1675 (Easy)

Same as [problem 280](#problem-280-easy).

### Problem 1676 (Easy)

Same as [problem 232](#problem-232-easy).

### Problem 1677 (Easy)

Same as [problem 104](#problem-104-easy).

### Problem 1678 (Medium)

Same as [problem 88](#problem-88-medium).

### Problem 1679 (Hard)

Same as [problem 93](#problem-93-hard).

### Problem 1680 (Medium)

Same as [problem 236](#problem-236-medium).

### Problem 1681 (Medium)

Same as [problem 86](#problem-86-medium).

### Problem 1682 (Medium)

Same as [problem 56](#problem-56-medium).

### Problem 1683 (Easy)

Same as [problem 63](#problem-63-easy).

### Problem 1684 (Easy)

Same as [problem 31](#problem-31-easy).

### Problem 1685 (Medium)

Same as [problem 360](#problem-360-medium).

### Problem 1686 (Hard)

Same as [problem 147](#problem-147-hard).

### Problem 1687 (Easy)

Same as [problem 80](#problem-80-easy).

### Problem 1688 (Medium)

Same as [5](#problem-5-medium).

### Problem 1689 (Medium)

Same as [problem 169](#problem-169-medium).

### Problem 1690 (Easy)

Same as [problem 227](#problem-227-easy).

### Problem 1691 (Medium)

Same as [problem 338](#problem-338-medium).

### Problem 1692 (Easy)

Same as [problem 303](#problem-303-easy).

### Problem 1693 (Easy)

Same as [problem 348](#problem-348-easy).

### Problem 1694 (Medium)

Same as [problem 256](#problem-256-medium).

### Problem 1695 (Easy)

Same as [problem 20](#problem-20-easy).

### Problem 1696 (Hard)

Same as [problem 38](#problem-38-hard).

### Problem 1697 (Easy)

Same as [problem 352](#problem-352-easy).

### Problem 1698 (Medium)

Same as [problem 316](#problem-316-medium).

### Problem 1699 (Medium)

Same as [problem 272](#problem-272-medium).

### Problem 1700 (Hard)

Same as [problem 365](#problem-365-hard).

### Problem 1701 (Easy)

Same as [problem 300](#problem-300-easy).

### Problem 1702 (Medium)

Same as [problem 136](#problem-136-medium).

### Problem 1703 (Hard)

Same as [problem 149](#problem-149-hard).

### Problem 1704 (Medium)

Same as [problem 297](#problem-297-medium).

### Problem 1705 (Medium)

Same as [problem 284](#problem-284-medium).

### Problem 1706 (Medium)

Same as [problem 99](#problem-99-medium).

### Problem 1707 (Medium)

Same as [problem 328](#problem-328-medium).

### Problem 1708 (Medium)

Same as [problem 268](#problem-268-medium).

### Problem 1709 (Medium)

Same as [problem 79](#problem-79-medium).

### Problem 1710 (Medium)

Same as [problem 131](#problem-131-medium).

### Problem 1711 (Easy)

Same as [problem 255](#problem-255-easy).

### Problem 1712 (Easy)

Same as [problem 125](#problem-125-easy).

### Problem 1713 (Hard)

Same as [problem 356](#problem-356-hard).

### Problem 1714 (Easy)

Same as [problem 341](#problem-341-easy).

### Problem 1715 (Hard)

Same as [problem 193](#problem-193-hard).

### Problem 1716 (Easy)

Same as [problem 65](#problem-65-easy).

### Problem 1717 (Medium)

Same as [28](#problem-28-medium).

### Problem 1718 (Easy)

Same as [194](#problem-194-easy).

### Problem 1719 (Easy)

Same as [241](#problem-241-easy).

### Problem 1720 (Medium)

Same as [350](#problem-350-medium).

### Problem 1721 (Hard)

Same as [114](#problem-114-hard).

### Problem 1722 (Medium)

Same as [323](#problem-323-medium).

### Problem 1723 (Medium)

Same as [problem 58](#problem-58-medium).

### Problem 1724 (Medium)

Same as [problem 346](#problem-346-medium).

### Problem 1725 (Easy)

Same as [problem 191](#problem-191-easy).

### Problem 1726 (Medium)

Same as [problem 306](#problem-306-medium).

### Problem 1728 (Medium)

Same as [problem 66](#problem-66-medium).

### Problem 1729 (Medium)

Same as [problem 285](#problem-285-medium).

### Problem 1730 (Medium)

Same as [problem 61](#problem-61-medium).

### Problem 1731 (Medium)

Same as [problem 295](#problem-295-medium).

### Problem 1732 (Medium)

Same as [problem 691](#problem-691-medium).

### Problem 1733 (Hard)

Same as [problem 52](#problem-52-hard).

### Problem 1734 (Easy)

Same as [problem 273](#problem-273-easy).

### Problem 1735 (Easy)

Same as [problem 73](#problem-73-easy).

### Problem 1736 (Medium)

Same as [problem 53](#problem-53-medium).

### Problem 1737 (Medium)

Same as [problem 140](#problem-140-medium).

### Problem 1738 (Hard)

Same as [problem 72](#problem-72-hard).

### Problem 1739 (Medium)

Same as [problem 24](#problem-24-medium).

### Problem 1740 (Hard)

Same as [problem 123](#problem-123-hard).

### Problem 1741 (Hard)

Same as [problem 354](#problem-354-hard).

### Problem 1742 (Easy)

Same as [problem 278](#problem-278-easy).

### Problem 1743 (Medium)

Same as [problem 342](#problem-342-medium).

### Problem 1744 (Medium)

Same as [problem 78](#problem-78-medium).

### Problem 1745 (Medium)

Same as [problem 333](#problem-333-medium).

### Problem 1746 (Medium)

Same as [problem 152](#problem-152-medium).

### Problem 1747 (Easy)

Same as [problem 96](#problem-96-easy).

### Problem 1748 (Easy)

Same as [problem 359](#problem-359-easy).

### Problem 1749 (Medium)

Same as [problem 130](#problem-130-medium).

### Problem 1750 (Medium)

Same as [problem 192](#problem-192-medium).

### Problem 1751 (Easy)

Same as [problem 100](#problem-100-easy).

### Problem 1752 (Medium)

Same as [problem 26](#problem-26-medium).

### Problem 1753 (Easy)

Same as [problem 252](#problem-252-easy).

### Problem 1754 (Easy)

Same as [problem 362](#problem-362-easy).

### Problem 1755 (Easy)

Same as [problem 204](#problem-204-easy).

### Problem 1756 (Easy)

Same as [problem 132](#problem-132-easy).

### Problem 1757 (Hard)

Same as [problem 12](#problem-12-hard).

### Problem 1758 (Hard)

Same as [problem 35](#problem-35-hard).

### Problem 1759 (Hard)

Same as [problem 183](#problem-183-hard).

### Problem 1760 (Hard)

Same as [problem 18](#problem-18-hard).

### Problem 1761 (Medium)

Same as [problem 180](#problem-180-medium).

### Problem 1762 (Hard)

Same as [problem 308](#problem-308-hard).

### Problem 1763 (Medium)

Same as [problem 251](#problem-251-medium).

### Problem 1764 (Hard)

Same as [problem 349](#problem-349-hard).

### Problem 1765 (Medium)

Same as [problem 216](#problem-216-medium).

### Problem 1766 (Easy)

Same as [problem 77](#problem-77-easy).

### Problem 1767 (Medium)

Same as [problem 30](#problem-30-medium).

### Problem 1768 (Hard)

Same as [problem 458](#problem-458-hard).

### Problem 1769 (Medium)

Same as [problem 294](#problem-294-medium).

### Problem 1770 (Medium)

Same as [problem 151](#problem-151-medium).

### Problem 1771 (Hard)

Same as [problem 274](#problem-274-hard).

### Problem 1772 (Medium)

Same as [problem 322](#problem-322-medium).

### Problem 1773 (Easy)

Same as [problem 332](#problem-332-easy).

### Problem 1774 (Easy)

Same as [problem 321](#problem-321-easy).

### Problem 1775 (Medium)

Same as [problem 361](#problem-361-medium).

### Problem 1776 (Medium)

Same as [problem 239](#problem-239-medium).

### Problem 1777 (Medium)

Same as [problem 68](#problem-68-medium).

### Problem 1778 (Hard)

Same as [problem 9](#problem-9-hard).

### Problem 1779 (Hard)

Same as [problem 138](#problem-138-hard).

### Problem 1780 (Medium)

Same as [problem 109](#problem-109-medium).

### Problem 1781 (Easy)

Same as [problem 325](#problem-325-easy).

### Problem 1782 (Medium)

Same as [problem 156](#problem-156-medium).

### Problem 1783 (Medium)

Same as [problem 302](#problem-302-medium).

### Problem 1784 (Hard)

Same as [problem 223](#problem-223-hard).

### Problem 1785 (Medium)

Same as [problem 41](#problem-41-medium).

### Problem 1786 (Easy)

Same as [problem 334](#problem-334-easy).

### Problem 1787 (Easy)

Same as [problem 225](#problem-225-easy).

### Problem 1788 (Hard)

Same as [problem 150](#problem-150-hard).

### Problem 1789 (Medium)

Same as [problem 314](#problem-314-medium).

### Problem 1790 (Easy)

Same as [problem 233](#problem-233-easy).

### Problem 1791 (Hard)

Same as [problem 358](#problem-358-hard).

### Problem 1792 (Easy)

Same as [problem 94](#problem-94-easy).

### Problem 1793 (Medium)

Same as [problem 309](#problem-309-medium).

### Problem 1794 (Hard)

Same as [problem 289](#problem-289-hard).

### Problem 1795 (Medium)

Same as [problem 139](#problem-139-medium).
