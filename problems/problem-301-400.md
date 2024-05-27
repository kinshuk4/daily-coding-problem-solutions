### Problem 301

This problem was asked by Triplebyte.

Implement a data structure which carries out the following operations without resizing the underlying array:

- `add(value)`: Add a value to the set of values.
- `check(value)`: Check whether a value is in the set.

The check method may return occasional false positives (in other words, incorrectly identifying an element as part of the set), but should always correctly identify a true element.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution301.java)

---

### Problem 302

This problem was asked by Uber.

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

### Problem 303

This problem was asked by Microsoft.

Given a clock time in `hh:mm` format, determine, to the nearest degree, the angle between the hour and the minute hands.

Bonus: When, during the course of a day, will the angle be zero?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution303.java)

---

### Problem 304

This problem was asked by Two Sigma.

A knight is placed on a given square on an `8 x 8` chessboard. It is then moved randomly several times, where each move is a standard knight move. If the knight jumps off the board at any point, however, it is not allowed to jump back on.

After `k` moves, what is the probability that the knight remains on the board?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution304.java)

---

### Problem 305

This problem was asked by Amazon.

Given a linked list, remove all consecutive nodes that sum to zero. Print out the remaining nodes.

For example, suppose you are given the input `3 -> 4 -> -7 -> 5 -> -6 -> 6`. In this case, you should first remove `3 -> 4 -> -7`, then `-6 -> 6`, leaving only `5`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution305.java)

---

### Problem 306

This problem was asked by Palantir.

You are given a list of N numbers, in which each number is located at most k places away from its sorted position. For example, if `k = 1`, a given element at index `4` might end up at indices `3`, `4`, or `5`.

Come up with an algorithm that sorts this list in `O(N log k)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution306.java)

---

### Problem 307

This problem was asked by Oracle.

Given a binary search tree, find the floor and ceiling of a given integer. The floor is the highest element in the tree less than or equal to an integer, while the ceiling is the lowest element in the tree greater than or equal to an integer.

If either value does not exist, return None.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution307.java)

---

### Problem 308

This problem was asked by Quantcast.

You are presented with an array representing a Boolean expression. The elements are of two kinds:

- `T` and `F`, representing the values `True` and `False`.
- `&`, `|`, and `^`, representing the bitwise operators for `AND`, `OR`, and `XOR`.

Determine the number of ways to group the array elements using parentheses so that the entire expression evaluates to `True`.

For example, suppose the input is `['F', '|', 'T', '&', 'T']`. In this case, there are two acceptable groupings: `(F | T) & T` and `F | (T & T)`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution308.java)

---

### Problem 309

This problem was asked by Walmart Labs.

There are `M` people sitting in a row of `N` seats, where `M < N`. Your task is to redistribute people such that there are no gaps between any of them, while keeping overall movement to a minimum.

For example, suppose you are faced with an input of `[0, 1, 1, 0, 1, 0, 0, 0, 1]`, where `0` represents an empty seat and `1` represents a person. In this case, one solution would be to place the person on the right in the fourth seat. We can consider the cost of a solution to be the sum of the absolute distance each person must move, so that the cost here would be `5`.

Given an input such as the one above, return the lowest possible cost of moving people to remove all gaps.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution309.java)

---

### Problem 310

This problem was asked by Pivotal.

Write an algorithm that finds the total number of set bits in all integers between `1` and `N`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution310.java)

---

### Problem 311

This problem was asked by Sumo Logic.

Given an unsorted array, in which all elements are distinct, find a "peak" element in `O(log N)` time.

An element is considered a peak if it is greater than both its left and right neighbors. It is guaranteed that the first and last elements are lower than all others.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution311.java)

---

### Problem 312

This problem was asked by Wayfair.

You are given a `2 x N` board, and instructed to completely cover the board with the following shapes:

- Dominoes, or `2 x 1` rectangles.
- Trominoes, or L-shapes.

For example, if `N = 4`, here is one possible configuration, where A is a domino, and B and C are trominoes.

```
A B B C
A B C C
```

Given an integer N, determine in how many ways this task is possible.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution312.java)

---

### Problem 313

This problem was asked by Citrix.

You are given a circular lock with three wheels, each of which display the numbers `0` through `9` in order. Each of these wheels rotate clockwise and counterclockwise.

In addition, the lock has a certain number of "dead ends", meaning that if you turn the wheels to one of these combinations, the lock becomes stuck in that state and cannot be opened.

Let us consider a "move" to be a rotation of a single wheel by one digit, in either direction. Given a lock initially set to `000`, a target combination, and a list of dead ends, write a function that returns the minimum number of moves required to reach the target state, or `None` if this is impossible.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution313.java)

---

### Problem 314

This problem was asked by Spotify.

You are the technical director of WSPT radio, serving listeners nationwide. For simplicity's sake we can consider each listener to live along a horizontal line stretching from `0` (west) to `1000` (east).

Given a list of `N` listeners, and a list of `M` radio towers, each placed at various locations along this line, determine what the minimum broadcast range would have to be in order for each listener's home to be covered.

For example, suppose `listeners = [1, 5, 11, 20]`, and `towers = [4, 8, 15]`. In this case the minimum range would be `5`, since that would be required for the tower at position `15` to reach the listener at position `20`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution314.java)

---

### Problem 315

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

### Problem 316

This problem was asked by Snapchat.

You are given an array of length `N`, where each element `i` represents the number of ways we can produce `i` units of change. For example, `[1, 0, 1, 1, 2]` would indicate that there is only one way to make `0`, `2`, or `3` units, and two ways of making `4` units.

Given such an array, determine the denominations that must be in use. In the case above, for example, there must be coins with value `2`, `3`, and `4`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution316.java)

---

### Problem 317

This problem was asked by Yahoo.

Write a function that returns the bitwise `AND` of all integers between `M` and `N`, inclusive.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution317.java)

---

### Problem 318

This problem was asked by Apple.

You are going on a road trip, and would like to create a suitable music playlist. The trip will require `N` songs, though you only have `M` songs downloaded, where `M < N`. A valid playlist should select each song at least once, and guarantee a buffer of `B` songs between repeats.

Given `N`, `M`, and `B`, determine the number of valid playlists.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution318.java)

---

### Problem 319

This problem was asked by Airbnb.

An 8-puzzle is a game played on a `3 x 3` board of tiles, with the ninth tile missing. The remaining tiles are labeled `1` through `8` but shuffled randomly. Tiles may slide horizontally or vertically into an empty space, but may not be removed from the board.

Design a class to represent the board, and find a series of steps to bring the board to the state `[[1, 2, 3], [4, 5, 6], [7, 8, None]]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution319.java)

---

### Problem 320

This problem was asked by Amazon.

Given a string, find the length of the smallest window that contains every distinct character. Characters may appear more than once in the window.

For example, given "jiujitsu", you should return 5, corresponding to the final five letters.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution320.java)

---

### Problem 321

This problem was asked by PagerDuty.

Given a positive integer `N`, find the smallest number of steps it will take to reach `1`.

There are two kinds of permitted steps:

- You may decrement `N` to `N - 1`.
- If `a * b = N`, you may decrement `N` to the larger of `a` and `b`.

For example, given `100`, you can reach `1` in five steps with the following route: `100 -> 10 -> 9 -> 3 -> 2 -> 1`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution321.java)

---

### Problem 322

This problem was asked by Flipkart.

Starting from `0` on a number line, you would like to make a series of jumps that lead to the integer `N`.

On the `i`th jump, you may move exactly `i` places to the left or right.

Find a path with the fewest number of jumps required to get from `0` to `N`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution322.java)

---

### Problem 323

This problem was asked by Dropbox.

Create an algorithm to efficiently compute the approximate median of a list of numbers.

More precisely, given an unordered list of `N` numbers, find an element whose rank is between `N / 4` and `3 * N / 4`, with a high level of certainty, in less than `O(N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution323.java)

---

### Problem 324

This problem was asked by Amazon.

Consider the following scenario: there are `N` mice and `N` holes placed at integer points along a line. Given this, find a method that maps mice to holes such that the largest number of steps any mouse takes is minimized.

Each move consists of moving one mouse one unit to the left or right, and only one mouse can fit inside each hole.

For example, suppose the mice are positioned at `[1, 4, 9, 15]`, and the holes are located at `[10, -5, 0, 16]`. In this case, the best pairing would require us to send the mouse at `1` to the hole at `-5`, so our function should return `6`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution324.java)

---

### Problem 325

This problem was asked by Jane Street.

The United States uses the imperial system of weights and measures, which means that there are many different, seemingly arbitrary units to measure distance. There are 12 inches in a foot, 3 feet in a yard, 22 yards in a chain, and so on.

Create a data structure that can efficiently convert a certain quantity of one unit to the correct amount of any other unit. You should also allow for additional units to be added to the system.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution325.java)

---

### Problem 326

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

Given a sequence S, construct the corresponding Cartesian tree.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution326.java)

---

### Problem 327

This problem was asked by Salesforce.

Write a program to merge two binary trees. Each node in the new tree should hold a value equal to the sum of the values of the corresponding nodes of the input trees.

If only one input tree has a node in a given position, the corresponding node in the new tree should match that input node.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution327.java)

---

### Problem 328

This problem was asked by Facebook.

In chess, the Elo rating system is used to calculate player strengths based on game results.

A simplified description of the Elo system is as follows. Every player begins at the same score. For each subsequent game, the loser transfers some points to the winner, where the amount of points transferred depends on how unlikely the win is. For example, a 1200-ranked player should gain much more points for beating a 2000-ranked player than for beating a 1300-ranked player.

Implement this system.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution328.java)

---

### Problem 329

This problem was asked by Amazon.

The stable marriage problem is defined as follows:

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

### Problem 330

This problem was asked by Dropbox.

A Boolean formula can be said to be satisfiable if there is a way to assign truth values to each variable such that the entire formula evaluates to true.

For example, suppose we have the following formula, where the symbol `¬` is used to denote negation:

```
(¬c OR b) AND (b OR c) AND (¬b OR c) AND (¬c OR ¬a)
```

One way to satisfy this formula would be to let `a = False`, `b = True`, and `c = True`.

This type of formula, with AND statements joining tuples containing exactly one OR, is known as 2-CNF.

Given a 2-CNF formula, find a way to assign truth values to satisfy it, or return `False` if this is impossible.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution330.java)

---

### Problem 331

This problem was asked by LinkedIn.

You are given a string consisting of the letters `x` and `y`, such as `xyxxxyxyy`. In addition, you have an operation called flip, which changes a single `x` to `y` or vice versa.

Determine how many times you would need to apply this operation to ensure that all `x`'s come before all `y`'s. In the preceding example, it suffices to flip the second and sixth characters, so you should return `2`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution331.java)

---

### Problem 332

This problem was asked by Jane Street.

Given integers `M` and `N`, write a program that counts how many positive integer pairs `(a, b)` satisfy the following conditions:

```
a + b = M
a XOR b = N
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution332.java)

---

### Problem 333

This problem was asked by Pinterest.

At a party, there is a single person who everyone knows, but who does not know anyone in return (the "celebrity"). To help figure out who this is, you have access to an `O(1)` method called `knows(a, b)`, which returns `True` if person `a` knows person `b`, else `False`.

Given a list of `N` people and the above operation, find a way to identify the celebrity in `O(N)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution333.java)

---

### Problem 334

This problem was asked by Twitter.

The `24` game is played as follows. You are given a list of four integers, each between `1` and `9`, in a fixed order. By placing the operators `+`, `-`, `*`, and `/` between the numbers, and grouping them with parentheses, determine whether it is possible to reach the value `24`.

For example, given the input `[5, 2, 7, 8]`, you should return True, since `(5 * 2 - 7) * 8 = 24`.

Write a function that plays the `24` game.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution334.java)

---

### Problem 335

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

### Problem 336

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

### Problem 337

This problem was asked by Apple.

Given a linked list, uniformly shuffle the nodes. What if we want to prioritize space over time?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution337.java)

---

### Problem 338

This problem was asked by Facebook.

Given an integer `n`, find the next biggest integer with the same number of `1`-bits on. For example, given the number `6` (`0110` in binary), return `9` (`1001`).

[Solution](solutions/src/main/java/com/vaani/dcp/Solution338.java)

---

### Problem 339

This problem was asked by Microsoft.

Given an array of numbers and a number `k`, determine if there are three entries in the array which add up to the specified number `k`. For example, given `[20, 303, 3, 4, 25]` and `k = 49`, return true as `20 + 4 + 25 = 49`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution339.java)

---

### Problem 340

This problem was asked by Google.

Given a set of points `(x, y)` on a 2D cartesian plane, find the two closest points. For example, given the points `[(1, 1), (-1, -1), (3, 4), (6, 1), (-1, -6), (-4, -3)]`, return `[(-1, -1), (1, 1)]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution340.java)

---

### Problem 341

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

### Problem 342

This problem was asked by Stripe.

`reduce` (also known as `fold`) is a function that takes in an array, a combining function, and an initial value and builds up a result by calling the combining function on each element of the array, left to right. For example, we can write `sum()` in terms of reduce:

```python
def add(a, b):
    return a + b
```

```python
def sum(lst):
    return reduce(lst, add, 0)
```

This should call add on the initial value with the first element of the array, and then the result of that with the second element of the array, and so on until we reach the end, when we return the sum of the array.

Implement your own version of reduce.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution342.java)

---

### Problem 343

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

and the range `[4, 9]`, return `23 (5 + 4 + 6 + 8)`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution343.java)

---

### Problem 344

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

Write a function that returns the maximum number of edges you can remove while still satisfying this requirement.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution344.java)

---

### Problem 345

This problem was asked by Google.

You are given a set of synonyms, such as `(big, large)` and `(eat, consume)`. Using this set, determine if two sentences with the same number of words are equivalent.

For example, the following two sentences are equivalent:

- "He wants to eat food."
- "He wants to consume food."

Note that the synonyms `(a, b)` and `(a, c)` do not necessarily imply `(b, c)`: consider the case of `(coach, bus)` and `(coach, teacher)`.

Follow-up: what if we can assume that `(a, b)` and `(a, c)` do in fact imply `(b, c)`?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution345.java)

---

### Problem 346

This problem was asked by Airbnb.

You are given a huge list of airline ticket prices between different cities around the world on a given day. These are all direct flights. Each element in the list has the format `(source_city, destination, price)`.

Consider a user who is willing to take up to `k` connections from their origin city `A` to their destination `B`. Find the cheapest fare possible for this journey and print the itinerary for that journey.

For example, our traveler wants to go from JFK to LAX with up to 3 connections, and our input flights are as follows:

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

Due to some improbably low flight prices, the cheapest itinerary would be JFK -> ATL -> ORD -> LAX, costing $440.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution346.java)

---

### Problem 347

This problem was asked by Yahoo.

You are given a string of length `N` and a parameter `k`. The string can be manipulated by taking one of the first `k` letters and moving it to the end.

Write a program to determine the lexicographically smallest string that can be created after an unlimited number of moves.

For example, suppose we are given the string `daily` and `k = 1`. The best we can create in this case is `ailyd`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution347.java)

---

### Problem 348

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

For instance, since code is the first word inserted in the tree, and `cob` lexicographically precedes `cod`, `cob` is represented as a left child extending from `cod`.

Implement insertion and search functions for a ternary search tree.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution348.java)

---

### Problem 349

This problem was asked by Grammarly.

Soundex is an algorithm used to categorize phonetically, such that two names that sound alike but are spelled differently have the same representation.

Soundex maps every name to a string consisting of one letter and three numbers, like `M460`.

One version of the algorithm is as follows:

- Remove consecutive consonants with the same sound (for example, change `ck -> c`).
- Keep the first letter. The remaining steps only apply to the rest of the string.
- Remove all vowels, including `y`, `w`, and `h`.
- Replace all consonants with the following digits:

    ```
    b, f, p, v -> 1
    c, g, j, k, q, s, x, z -> 2
    d, t -> 3
    l -> 4
    m, n -> 5
    r -> 6
    ```

If you don't have three numbers yet, append zeros until you do. Keep the first three numbers.
Using this scheme, `Jackson` and `Jaxen` both map to `J250`.

Implement Soundex.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution349.java)

---

### Problem 350

This problem was asked by Uber.

Write a program that determines the smallest number of perfect squares that sum up to `N`.

Here are a few examples:

- Given `N = 4`, return `1` `(4)`
- Given `N = 17`, return `2` `(16 + 1)`
- Given `N = 18`, return `2` `(9 + 9)`

[Solution](solutions/src/main/java/com/vaani/dcp/Solution350.java)

---

### Problem 351

This problem was asked by Quora.

Word sense disambiguation is the problem of determining which sense a word takes on in a particular setting, if that word has multiple meanings. For example, in the sentence "I went to get money from the bank", bank probably means the place where people deposit money, not the land beside a river or lake.

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

### Problem 352

This problem was asked by Palantir.

A typical American-style crossword puzzle grid is an `N x N` matrix with black and white squares, which obeys the following rules:

- Every white square must be part of an "across" word and a "down" word.
- No word can be fewer than three letters long.
- Every white square must be reachable from every other white square.

The grid is rotationally symmetric (for example, the colors of the top left and bottom right squares must match).
Write a program to determine whether a given matrix qualifies as a crossword grid.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution352.md)

---

### Problem 353

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

### Problem 354

This problem was asked by Google.

Design a system to crawl and copy all of Wikipedia using a distributed network of machines.

More specifically, suppose your server has access to a set of client machines. Your client machines can execute code you have written to access Wikipedia pages, download and parse their data, and write the results to a database.

Some questions you may want to consider as part of your solution are:

- How will you reach as many pages as possible?
- How can you keep track of pages that have already been visited?
- How will you deal with your client machines being blacklisted?
- How can you update your database when Wikipedia pages are added or updated?

[Solution](solutions/src/main/java/com/vaani/dcp/Solution354.md)

---

### Problem 355

This problem was asked by Airbnb.

You are given an array `X` of floating-point numbers `x1, x2, ... xn`. These can be rounded up or down to create a corresponding array `Y` of integers `y1, y2, ... yn`.

Write an algorithm that finds an appropriate `Y` array with the following properties:

- The rounded sums of both arrays should be equal.
- The absolute pairwise difference between elements is minimized. In other words, `|x1- y1| + |x2- y2| + ... + |xn- yn|` should be as small as possible.

For example, suppose your input is `[1.3, 2.3, 4.4]`. In this case you cannot do better than `[1, 2, 5]`, which has an absolute difference of `|1.3 - 1| + |2.3 - 2| + |4.4 - 5| = 1`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution355.java)

---

### Problem 356

This problem was asked by Netflix.

Implement a queue using a set of fixed-length arrays.

The queue should support `enqueue`, `dequeue`, and `get_size` operations.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution356.java)

---

### Problem 357

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

### Problem 358

This problem was asked by Dropbox.

Create a data structure that performs all the following operations in `O(1)` time:

- `plus`: Add a key with value 1. If the key already exists, increment its value by one.
- `minus`: Decrement the value of a key. If the key's value is currently 1, remove it.
- `get_max`: Return a key with the highest value.
- `get_min`: Return a key with the lowest value.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution358.java)

---

### Problem 359

This problem was asked by Slack.

You are given a string formed by concatenating several words corresponding to the integers zero through nine and then anagramming.

For example, the input could be 'niesevehrtfeev', which is an anagram of 'threefiveseven'. Note that there can be multiple instances of each integer.

Given this string, return the original integers in sorted order. In the example above, this would be `357`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution359.java)

---

### Problem 360

This problem was asked by Spotify.

You have access to ranked lists of songs for various users. Each song is represented as an integer, and more preferred songs appear earlier in each list. For example, the list `[4, 1, 7]` indicates that a user likes song `4` the best, followed by songs `1` and `7`.

Given a set of these ranked lists, interleave them to create a playlist that satisfies everyone's priorities.

For example, suppose your input is `{[1, 7, 3], [2, 1, 6, 7, 9], [3, 9, 5]}`. In this case a satisfactory playlist could be `[2, 1, 6, 7, 3, 9, 5]`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution360.java)

---

### Problem 361

This problem was asked by Facebook.

Mastermind is a two-player game in which the first player attempts to guess the secret code of the second. In this version, the code may be any six-digit number with all distinct digits.

Each turn the first player guesses some number, and the second player responds by saying how many digits in this number correctly matched their location in the secret code. For example, if the secret code were `123456`, then a guess of `175286` would score two, since `1` and `6` were correctly placed.

Write an algorithm which, given a sequence of guesses and their scores, determines whether there exists some secret code that could have produced them.

For example, for the following scores you should return `True`, since they correspond to the secret code `123456`:
`{175286: 2, 293416: 3, 654321: 0}`

However, it is impossible for any key to result in the following scores, so in this case you should return `False`:
`{123456: 4, 345678: 4, 567890: 4}`

[Solution](solutions/src/main/java/com/vaani/dcp/Solution361.java)

---

### Problem 362

This problem was asked by Twitter.

A strobogrammatic number is a positive number that appears the same after being rotated `180` degrees. For example, `16891` is strobogrammatic.

Create a program that finds all strobogrammatic numbers with N digits.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution362.java)

---

### Problem 363

Write a function, add_subtract, which alternately adds and subtracts curried arguments. Here are some sample operations:

```
add_subtract(7) -> 7
add_subtract(1)(2)(3) -> 1 + 2 - 3 -> 0
add_subtract(-5)(10)(3)(9) -> -5 + 10 - 3 + 9 -> 11
```

[Solution](solutions/src/main/java/com/vaani/dcp/Solution363.java)

---

### Problem 364

This problem was asked by Facebook.

Describe an algorithm to compute the longest increasing subsequence of an array of numbers in `O(n log n)` time.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution364.java)

---

### Problem 365

This problem was asked by Google.

A quack is a data structure combining properties of both stacks and queues. It can be viewed as a list of elements written left to right such that three operations are possible:

- `push(x)`: add a new item `x` to the left end of the list
- `pop()`: remove and return the item on the left end of the list
- `pull()`: remove the item on the right end of the list.

Implement a quack using three stacks and `O(1)` additional memory, so that the amortized time for any push, pop, or pull operation is `O(1)`.

[Solution](solutions/src/main/java/com/vaani/dcp/Solution365.java)

---

## Problem 367 (Medium)

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

## Problem 368 (Hard)

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

## Problem 369 (Medium)

This problem was asked by Two Sigma.

You’re tracking stock price at a given instance of time. Implement an API with the following functions: add(), update(), remove(), which adds/updates/removes a datapoint for the stock price you are tracking. The data is given as (timestamp, price), where timestamp is specified in unix epoch time.

Also, provide max(), min(), and average() functions that give the max/min/average of all values seen thus far.

## Problem 370 (Easy)

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

## Problem 371 (Hard)

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

## Problem 372 (Easy)

This problem was asked by Amazon.

Write a function that takes a natural number as input and returns the number of digits the input has.

Constraint: don't use any loops.

## Problem 373 (Hard)

This problem was asked by Facebook.

Given a list of integers L, find the maximum length of a sequence of consecutive numbers that can be formed using elements from L.

For example, given `L = [5, 2, 99, 3, 4, 1, 100]`, return 5 as we can build a sequence `[1, 2, 3, 4, 5]` which has length 5.

## Problem 374 (Hard)

This problem was asked by Amazon.

Given a sorted array `arr` of distinct integers, return the lowest index `i` for which `arr[i] == i`. Return `null` if there is no such index.

For example, given the array `[-5, -3, 2, 3]`, return `2` since `arr[2] == 2`. Even though `arr[3] == 3`, we return 2 since it's the lowest index.

## Problem 375 (Medium)

This problem was asked by Google.

The h-index is a metric used to measure the impact and productivity of a scientist or researcher.

A scientist has index _h_ if _h_ of their _N_ papers have **at least** _h_ citations each, and the other _N - h_ papers have no more than _h_ citations each. If there are multiple possible values for _h_, the maximum value is used.

Given an array of natural numbers, with each value representing the number of citations of a researcher's paper, return the h-index of that researcher.

For example, if the array was:

```
[4, 0, 0, 2, 3]
```

This means the researcher has 5 papers with 4, 1, 0, 2, and 3 citations respectively. The h-index for this researcher is 2, since they have 2 papers with at least 2 citations and the remaining 3 papers have no more than 2 citations.

## Problem 376 (Easy)

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
Coins: [(## Problem 0, 4), (1, 0), (2, 0), (3, 2)]
```

## Problem 377 (Hard)

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

## Problem 378 (Medium)

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

## Problem 379 (Easy)

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

## Problem 380 (Medium)

This problem was asked by Nextdoor.

Implement integer division without using the division operator. Your function should return a tuple of (dividend, remainder) and it should take two numbers, the product and divisor.

For example, calling `divide(10, 3)` should return `(3, 1)` since the divisor is 3 and the remainder is 1.

Bonus: Can you do it in O(log n) time?

## Problem 381 (Easy)

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

## Problem 382 (Easy)

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

## Problem 383 (Medium)

This problem was asked by Gusto.

Implement the function `embolden(s, lst)` which takes in a string `s` and list of substrings `lst`, and wraps all substrings in `s` with an HTML bold tag `` and ``.

If two bold tags overlap or are contiguous, they should be merged.

For example, given `s = abcdefg` and `lst = ["bc", "ef"]`, return the string `abcdefg`.

Given `s = abcdefg` and `lst = ["bcd", "def"]`, return the string `abcdefg`, since they overlap.

## Problem 384 (Hard)

This problem was asked by WeWork.

You are given an array of integers representing coin denominations and a total amount of money. Write a function to compute the fewest number of coins needed to make up that amount. If it is not possible to make that amount, return null.

For example, given an array of `[1, 5, 10]` and an amount `56`, return `7` since we can use 5 dimes, 1 nickel, and 1 penny.

Given an array of `[5, 8]` and an amount `15`, return `3` since we can use 5 5-cent coins.

## Problem 385 (Medium)

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

## Problem 386 (Easy)

This problem was asked by Twitter.

Given a string, sort it in decreasing order based on the frequency of characters. If there are multiple possible solutions, return any of them.

For example, given the string `tweet`, return `tteew`. `eettw` would also be acceptable.

## Problem 387 (Medium)

This problem was recently asked by Amazon.

How would you explain the difference between an API and SDK to a non-technical person?

## Problem 388 (Medium)

This problem was asked by Airtable.

How would you explain web cookies to someone non-technical?

## Problem 389 (Hard)

This problem was asked by Google.

Explain the difference between composition and inheritance. In which cases would you use each?

## Problem 390 (Medium)

This problem was asked by Two Sigma.

You are given an unsorted list of 999,000 unique integers, each from 1 and 1,000,000. Find the missing 1000 numbers. What is the computational and space complexity of your solution?

## Problem 391 (Hard)

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

## Problem 392 (Hard)

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

## Problem 393 (Medium)

This problem was asked by Airbnb.

Given an array of integers, return the largest range, inclusive, of integers that are all included in the array.

For example, given the array `[9, 6, 1, 3, 8, 10, 12, 11]`, return `(8, 12)` since 8, 9, 10, 11, and 12 are all in the array.

## Problem 394 (Easy)

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

## Problem 395 (Medium)

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

## Problem 396 (Hard)

This problem was asked by Google.

Given a string, return the length of the longest palindromic subsequence in the string.

For example, given the following string:

```
MAPTPTMTPA
```

Return 7, since the longest palindromic subsequence in the string is `APTMTPA`. Recall that a subsequence of a string does not have to be contiguous!

Your algorithm should run in O(n^2) time and space.

## Problem 397 (Medium)

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

## Problem 398 (Medium)

This problem was asked by Amazon.

Given a linked list and an integer `k`, remove the k-th node from the end of the list and return the head of the list.

`k` is guaranteed to be smaller than the length of the list.

Do this in one pass.

## Problem 399 (Hard)

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

## Problem 400 (Hard)

This problem was asked by Goldman Sachs.

Given a list of numbers `L`, implement a method `sum(i, j)` which returns the sum from the sublist `L[i:j]` (including `i`, excluding `j`).

For example, given `L = [1, 2, 3, 4, 5]`, `sum(1, 3)` should return `sum([2, 3])`, which is `5`.

You can assume that you can do some pre-processing. `sum()` should be optimized over the pre-processing step.
