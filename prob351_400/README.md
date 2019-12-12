351 (Hard)

This problem was asked by Quora.

Word sense disambiguation is the problem of determining which sense a word takes on in a particular setting, if that word has multiple meanings. For example, in the sentence "I went to get money from the *bank*", bank probably means the place where people deposit money, not the land beside a river or lake.

Suppose you are given a list of meanings for several words, formatted like so:

```python
{
    "word_1": ["meaning one", "meaning two", ...],
    ...
    "word_n": ["meaning one", "meaning two", ...]
}
```

Given a sentence, most of whose words are contained in the meaning list above, create an algorithm that determines the likely sense of each possibly ambiguous word.

352 (Easy)

This problem was asked by Palantir.

A typical American-style crossword puzzle grid is an `N x N` matrix with black and white squares, which obeys the following rules:

- Every white square must be part of an "across" word and a "down" word.
- No word can be fewer than three letters long.
- Every white square must be reachable from every other white square.
- The grid is rotationally symmetric (for example, the colors of the top left and bottom right squares must match).

Write a program to determine whether a given matrix qualifies as a crossword grid.



353 (Medium)

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

354 (Hard)

This problem was asked by Google.

Design a system to crawl and copy all of Wikipedia using a distributed network of machines.

More specifically, suppose your server has access to a set of client machines. Your client machines can execute code you have written to access Wikipedia pages, download and parse their data, and write the results to a database.

Some questions you may want to consider as part of your solution are:

- How will you reach as many pages as possible?
- How can you keep track of pages that have already been visited?
- How will you deal with your client machines being blacklisted?
- How can you update your database when Wikipedia pages are added or updated?

355 (Hard)

This problem was asked by Airbnb.

You are given an array `X` of floating-point numbers `x``1`, `x``2`, ... `x``n`. These can be rounded up or down to create a corresponding array `Y` of integers `y``1`, `y``2`, ... `y``n`.

Write an algorithm that finds an appropriate `Y` array with the following properties:

- The rounded sums of both arrays should be equal.
- The absolute pairwise difference between elements is minimized. In other words, `|x``1``- y``1``| + |x``2``- y``2``| + ... + |x``n``- y``n``|`should be as small as possible.

For example, suppose your input is `[1.3, 2.3, 4.4]`. In this case you cannot do better than `[1, 2, 5]`, which has an absolute difference of `|1.3 - 1| + |2.3 - 2| + |4.4 - 5| = 1`.

356 (Hard)

This problem was asked by Netflix.

Implement a queue using a set of fixed-length arrays.

The queue should support `enqueue`, `dequeue`, and `get_size`operations.

357 (Hard)

This problem was asked by LinkedIn.

You are given a binary tree in a peculiar string representation. Each node is written in the form `(lr)`, where `l` corresponds to the left child and `r` corresponds to the right child.

If either `l` or `r` is null, it will be represented as a zero. Otherwise, it will be represented by a new `(lr)` pair.

Here are a few examples:

- A root node with no children: `(00)`
- A root node with two children: `((00)(00))`
- An unbalanced tree with three consecutive left children: `((((00)0)0)0)`

Given this representation, determine the depth of the tree.

358 (Hard)

This problem was asked by Dropbox.

Create a data structure that performs all the following operations in `O(1)` time:

- `plus`: Add a key with value `1`. If the key already exists, increment its value by one.
- `minus`: Decrement the value of a key. If the key's value is currently `1`, remove it.
- `get_max`: Return a key with the highest value.
- `get_min`: Return a key with the lowest value.

359 (Easy)

This problem was asked by Slack.

You are given a string formed by concatenating several words corresponding to the integers zero through nine and then anagramming.

For example, the input could be 'niesevehrtfeev', which is an anagram of 'threefiveseven'. Note that there can be multiple instances of each integer.

Given this string, return the original integers in sorted order. In the example above, this would be `357`.

360 (Medium)

This problem was asked by Spotify.

You have access to ranked lists of songs for various users. Each song is represented as an integer, and more preferred songs appear earlier in each list. For example, the list `[4, 1, 7]` indicates that a user likes song `4` the best, followed by songs `1` and `7`.

Given a set of these ranked lists, interleave them to create a playlist that satisfies everyone's priorities.

For example, suppose your input is `{[1, 7, 3], [2, 1, 6, 7, 9], [3, 9, 5]}`. In this case a satisfactory playlist could be `[2, 1, 6, 7, 3, 9, 5]`.



361 (Medium)

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

362 (Easy)

This problem was asked by Twitter.

A strobogrammatic number is a positive number that appears the same after being rotated 180 degrees. For example, `16891` is strobogrammatic.

Create a program that finds all strobogrammatic numbers with `N` digits.

363 (Medium)

This problem was asked by Squarespace.

Write a function, `add_subtract`, which alternately adds and subtracts curried arguments. Here are some sample operations:

```python
add_subtract(7) -> 7

add_subtract(1)(2)(3) -> 1 + 2 - 3 -> 0

add_subtract(-5)(10)(3)(9) -> -5 + 10 - 3 + 9 -> 11
```

364 (Medium)

This problem was asked by Facebook.

Describe an algorithm to compute the longest increasing subsequence of an array of numbers in `O(n log n)` time.

365 (Hard)

This problem was asked by Google.

A quack is a data structure combining properties of both stacks and queues. It can be viewed as a list of elements written left to right such that three operations are possible:

- `push(x)`: add a new item `x` to the left end of the list
- `pop()`: remove and return the item on the left end of the list
- `pull()`: remove the item on the right end of the list.

Implement a quack using three stacks and `O(1)` additional memory, so that the amortized time for any push, pop, or pull operation is `O(1)`.



367 (Medium)

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



368 (Hard)

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



369 (Medium)

This problem was asked by Two Sigma.

You’re tracking stock price at a given instance of time. Implement an API with the following functions: add(), update(), remove(), which adds/updates/removes a datapoint for the stock price you are tracking. The data is given as (timestamp, price), where timestamp is specified in unix epoch time.

Also, provide max(), min(), and average() functions that give the max/min/average of all values seen thus far.



370 (Easy)

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

371 (Hard)

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



372 (Easy)

This problem was asked by Amazon.

Write a function that takes a natural number as input and returns the number of digits the input has.

Constraint: don't use any loops.

373 (Hard)

This problem was asked by Facebook.

Given a list of integers L, find the maximum length of a sequence of consecutive numbers that can be formed using elements from L.

For example, given `L = [5, 2, 99, 3, 4, 1, 100]`, return 5 as we can build a sequence `[1, 2, 3, 4, 5]` which has length 5.

374 (Hard)

This problem was asked by Amazon.

Given a sorted array `arr` of distinct integers, return the lowest index `i` for which `arr[i] == i`. Return `null` if there is no such index.

For example, given the array `[-5, -3, 2, 3]`, return `2` since `arr[2] == 2`. Even though `arr[3] == 3`, we return 2 since it's the lowest index.



375 (Medium)

This problem was asked by Google.

The h-index is a metric used to measure the impact and productivity of a scientist or researcher.

A scientist has index _h_ if _h_ of their _N_ papers have **at least** _h_ citations each, and the other *N - h* papers have no more than _h_ citations each. If there are multiple possible values for _h_, the maximum value is used.

Given an array of natural numbers, with each value representing the number of citations of a researcher's paper, return the h-index of that researcher.

For example, if the array was:

```
[4, 0, 0, 2, 3]
```

This means the researcher has 5 papers with 4, 1, 0, 2, and 3 citations respectively. The h-index for this researcher is 2, since they have 2 papers with at least 2 citations and the remaining 3 papers have no more than 2 citations.

376 (Easy)

This problem was asked by Google.

You are writing an AI for a 2D map game. You are somewhere in a 2D grid, and there are coins strewn about over the map.

Given the position of all the coins and your current position, find the closest coin to you in terms of Manhattan distance. That is, you can move around up, down, left, and right, but not diagonally. If there are multiple possible closest coins, return any of them.

For example, given the following map, where you are `x`, coins are `o`, and empty spaces are `.` (top left is 0, 0):

```
---------------------
| . | . | x | . | o |
---------------------
| o | . | . | . | . |
---------------------
| o | . | . | . | o |
---------------------
| . | . | o | . | . |
---------------------
```

return `(0, 4)`, since that coin is closest. This map would be represented in our question as:

```
Our position: (0, 2)
Coins: [(0, 4), (1, 0), (2, 0), (3, 2)]
```



377 (Hard)

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



378 (Medium)

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



379 (Easy)

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



380 (Medium)

This problem was asked by Nextdoor.

Implement integer division without using the division operator. Your function should return a tuple of (dividend, remainder) and it should take two numbers, the product and divisor.

For example, calling `divide(10, 3)` should return `(3, 1)` since the divisor is 3 and the remainder is 1.

Bonus: Can you do it in O(log n) time?

381 (Easy)

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



382 (Easy)

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

383 (Medium)

This problem was asked by Gusto.

Implement the function `embolden(s, lst)` which takes in a string `s` and list of substrings `lst`, and wraps all substrings in `s` with an HTML bold tag `` and ``.

If two bold tags overlap or are contiguous, they should be merged.

For example, given `s = abcdefg` and `lst = ["bc", "ef"]`, return the string `abcdefg`.

Given `s = abcdefg` and `lst = ["bcd", "def"]`, return the string `abcdefg`, since they overlap.

384 (Hard)

This problem was asked by WeWork.

You are given an array of integers representing coin denominations and a total amount of money. Write a function to compute the fewest number of coins needed to make up that amount. If it is not possible to make that amount, return null.

For example, given an array of `[1, 5, 10]` and an amount `56`, return `7` since we can use 5 dimes, 1 nickel, and 1 penny.

Given an array of `[5, 8]` and an amount `15`, return `3` since we can use 5 5-cent coins.

385 (Medium)

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

386 (Easy)

This problem was asked by Twitter.

Given a string, sort it in decreasing order based on the frequency of characters. If there are multiple possible solutions, return any of them.

For example, given the string `tweet`, return `tteew`. `eettw` would also be acceptable.

387 (Medium)

This problem was recently asked by Amazon.

How would you explain the difference between an API and SDK to a non-technical person?

388 (Medium)

This problem was asked by Airtable.

How would you explain web cookies to someone non-technical?

