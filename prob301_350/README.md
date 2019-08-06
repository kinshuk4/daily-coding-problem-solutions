301 (Medium)

This problem was asked by Triplebyte.

Implement a data structure which carries out the following operations without resizing the underlying array:

- `add(value)`: Add a value to the set of values.
- `check(value)`: Check whether a value is in the set.

The `check` method may return occasional false positives (in other words, incorrectly identifying an element as part of the set), but should always correctly identify a true element.

302 (Medium)

This problem was asked by Uber.

You are given a 2-d matrix where each cell consists of either `/`, `\`, or an empty space. Write an algorithm that determines into how many regions the slashes divide the space.

For example, suppose the input for a three-by-six grid is the following:

```
\    /
 \  /
  \/
```

Considering the edges of the matrix as boundaries, this divides the grid into three triangles, so you should return `3`.

303 (Easy)

This problem was asked by Microsoft.

Given a clock time in `hh:mm` format, determine, to the nearest degree, the angle between the hour and the minute hands.

Bonus: When, during the course of a day, will the angle be zero?

304 (Hard)

This problem was asked by Two Sigma.

A knight is placed on a given square on an `8 x 8` chessboard. It is then moved randomly several times, where each move is a standard [knight move](https://en.wikipedia.org/wiki/Knight_(chess)#Movement). If the knight jumps off the board at any point, however, it is not allowed to jump back on.

After `k` moves, what is the probability that the knight remains on the board?

305 (Easy)

This problem was asked by Amazon.

Given a linked list, remove all consecutive nodes that sum to zero. Print out the remaining nodes.

For example, suppose you are given the input `3 -> 4 -> -7 -> 5 -> -6 -> 6`. In this case, you should first remove `3 -> 4 -> -7`, then `-6 -> 6`, leaving only `5`.

306 (Medium)

This problem was asked by Palantir.

You are given a list of `N` numbers, in which each number is located at most `k` places away from its sorted position. For example, if `k = 1`, a given element at index `4` might end up at indices `3`, `4`, or `5`.

Come up with an algorithm that sorts this list in `O(N log k)` time.

307 (Easy)

This problem was asked by Oracle.

Given a binary search tree, find the floor and ceiling of a given integer. The floor is the highest element in the tree less than or equal to an integer, while the ceiling is the lowest element in the tree greater than or equal to an integer.

If either value does not exist, return None.

308 (Hard)

This problem was asked by Quantcast.

You are presented with an array representing a Boolean expression. The elements are of two kinds:

- `T` and `F`, representing the values `True` and `False`.
- `&`, `|`, and `^`, representing the bitwise operators for `AND`, `OR`, and `XOR`.

Determine the number of ways to group the array elements using parentheses so that the entire expression evaluates to `True`.

For example, suppose the input is `['F', '|', 'T', '&', 'T']`. In this case, there are two acceptable groupings: `(F | T) & T` and `F | (T & T)`.

309 (Medium)

This problem was asked by Walmart Labs.

There are `M` people sitting in a row of `N` seats, where `M < N`. Your task is to redistribute people such that there are no gaps between any of them, while keeping overall movement to a minimum.

For example, suppose you are faced with an input of `[0, 1, 1, 0, 1, 0, 0, 0, 1]`, where `0` represents an empty seat and `1` represents a person. In this case, one solution would be to place the person on the right in the fourth seat. We can consider the cost of a solution to be the sum of the absolute distance each person must move, so that the cost here would be five.

Given an input such as the one above, return the lowest possible cost of moving people to remove all gaps.

310 (Easy)

This problem was asked by Pivotal.

Write an algorithm that finds the total number of set bits in all integers between `1` and `N`.

311 (Easy)

This problem was asked by Sumo Logic.

Given an unsorted array, in which all elements are distinct, find a "peak" element in `O(log N)` time.

An element is considered a peak if it is greater than both its left and right neighbors. It is guaranteed that the first and last elements are lower than all others.

312 (Easy)

This problem was asked by Wayfair.

You are given a `2 x N` board, and instructed to completely cover the board with the following shapes:

- Dominoes, or `2 x 1` rectangles.
- Trominoes, or `L`-shapes.

For example, if `N = 4`, here is one possible configuration, where `A`is a domino, and `B` and `C` are trominoes.

```
A B B C
A B C C
```

Given an integer `N`, determine in how many ways this task is possible.

313 (Hard)

This problem was asked by Citrix.

You are given a circular lock with three wheels, each of which display the numbers `0` through `9` in order. Each of these wheels rotate clockwise and counterclockwise.

In addition, the lock has a certain number of "dead ends", meaning that if you turn the wheels to one of these combinations, the lock becomes stuck in that state and cannot be opened.

Let us consider a "move" to be a rotation of a single wheel by one digit, in either direction. Given a lock initially set to `000`, a target combination, and a list of dead ends, write a function that returns the minimum number of moves required to reach the target state, or `None`if this is impossible.

314 (Medium)

This problem was asked by Spotify.

You are the technical director of WSPT radio, serving listeners nationwide. For simplicity's sake we can consider each listener to live along a horizontal line stretching from `0` (west) to `1000` (east).

Given a list of `N` listeners, and a list of `M` radio towers, each placed at various locations along this line, determine what the minimum broadcast range would have to be in order for each listener's home to be covered.

For example, suppose `listeners = [1, 5, 11, 20]`, and `towers = [4, 8, 15]`. In this case the minimum range would be `5`, since that would be required for the tower at position `15` to reach the listener at position `20`.

315 (Easy)

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

316 (Medium)

This problem was asked by Snapchat.

You are given an array of length `N`, where each element `i` represents the number of ways we can produce `i` units of change. For example, `[1, 0, 1, 1, 2]` would indicate that there is only one way to make `0`, `2`, or `3` units, and two ways of making `4` units.

Given such an array, determine the denominations that must be in use. In the case above, for example, there must be coins with value `2`, `3`, and `4`.

317 (Medium)

This problem was asked by Yahoo.

Write a function that returns the bitwise AND of all integers between `M`and `N`, inclusive

318 (Hard)

This problem was asked by Apple.

You are going on a road trip, and would like to create a suitable music playlist. The trip will require `N` songs, though you only have `M` songs downloaded, where `M < N`. A valid playlist should select each song at least once, and guarantee a buffer of `B` songs between repeats.

Given `N`, `M`, and `B`, determine the number of valid playlists.

319 (Hard)

This problem was asked by Airbnb.

An 8-puzzle is a game played on a 3 x 3 board of tiles, with the ninth tile missing. The remaining tiles are labeled 1 through 8 but shuffled randomly. Tiles may slide horizontally or vertically into an empty space, but may not be removed from the board.

Design a class to represent the board, and find a series of steps to bring the board to the state [[1, 2, 3], [4, 5, 6], [7, 8, None]].

320 (Medium)

This problem was asked by Amazon.

Given a string, find the length of the smallest window that contains every distinct character. Characters may appear more than once in the window.

For example, given "jiujitsu", you should return `5`, corresponding to the final five letters.

321 (Easy)

This problem was asked by PagerDuty.

Given a positive integer `N`, find the smallest number of steps it will take to reach `1`.

There are two kinds of permitted steps:

- You may decrement `N` to `N - 1`.
- If `a * b = N`, you may decrement `N` to the larger of `a` and `b`.

For example, given `100`, you can reach `1` in five steps with the following route: `100 -> 10 -> 9 -> 3 -> 2 -> 1`.

322 (Medium)

This problem was asked by Flipkart.

Starting from 0 on a number line, you would like to make a series of jumps that lead to the integer N.

On the `i``th` jump, you may move exactly i places to the left or right.

Find a path with the fewest number of jumps required to get from 0 to N.

323 (Medium)

This problem was asked by Dropbox.

Create an algorithm to efficiently compute the approximate median of a list of numbers.

More precisely, given an unordered list of `N` numbers, find an element whose rank is between `N / 4` and `3 * N / 4`, with a high level of certainty, in less than `O(N)` time.

324 (Easy)

This problem was asked by Amazon.

Consider the following scenario: there are `N` mice and `N` holes placed at integer points along a line. Given this, find a method that maps mice to holes such that the largest number of steps any mouse takes is minimized.

Each move consists of moving one mouse one unit to the left or right, and only one mouse can fit inside each hole.

For example, suppose the mice are positioned at `[1, 4, 9, 15]`, and the holes are located at `[10, -5, 0, 16]`. In this case, the best pairing would require us to send the mouse at `1` to the hole at `-5`, so our function should return `6`.

325 (Easy)

This problem was asked by Jane Street.

The United States uses the imperial system of weights and measures, which means that there are many different, seemingly arbitrary units to measure distance. There are 12 inches in a foot, 3 feet in a yard, 22 yards in a chain, [and so on](https://en.wikipedia.org/wiki/Imperial_units#Length).

Create a data structure that can efficiently convert a certain quantity of one unit to the correct amount of any other unit. You should also allow for additional units to be added to the system.

326 (Hard)

This problem was asked by Netflix.

A Cartesian tree with sequence `S` is a binary tree defined by the following two properties:

- It is heap-ordered, so that each parent value is strictly less than that of its children.
- An in-order traversal of the tree produces nodes with values that correspond exactly to `S`.

For example, given the sequence `[3, 2, 6, 1, 9]`, the resulting Cartesian tree would be:

```
      1
    /   \   
  2       9
 / \
3   6
```

Given a sequence `S`, construct the corresponding Cartesian tree.

327 (Easy)

This problem was asked by Salesforce.

Write a program to merge two binary trees. Each node in the new tree should hold a value equal to the sum of the values of the corresponding nodes of the input trees.

If only one input tree has a node in a given position, the corresponding node in the new tree should match that input node.

328 (Medium)

This problem was asked by Facebook.

In chess, the Elo rating system is used to calculate player strengths based on game results.

A simplified description of the Elo system is as follows. Every player begins at the same score. For each subsequent game, the loser transfers some points to the winner, where the amount of points transferred depends on how unlikely the win is. For example, a 1200-ranked player should gain much more points for beating a 2000-ranked player than for beating a 1300-ranked player.

Implement this system.

329 (Hard)

This problem was asked by Amazon.

The [stable marriage problem](https://en.wikipedia.org/wiki/Stable_marriage_problem) is defined as follows:

Suppose you have `N` men and `N` women, and each person has ranked their prospective opposite-sex partners in order of preference.

For example, if `N = 3`, the input could be something like this:

```python
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

330 (Hard)

This problem was asked by Dropbox.

A Boolean formula can be said to be satisfiable if there is a way to assign truth values to each variable such that the entire formula evaluates to true.

For example, suppose we have the following formula, where the symbol `¬` is used to denote negation:

```
(¬c OR b) AND (b OR c) AND (¬b OR c) AND (¬c OR ¬a)
```

One way to satisfy this formula would be to let `a = False`, `b = True`, and `c = True`.

This type of formula, with `AND` statements joining tuples containing exactly one `OR`, is known as `2-CNF`.

Given a `2-CNF` formula, find a way to assign truth values to satisfy it, or return `False` if this is impossible.

331 (Medium)

This problem was asked by LinkedIn.

You are given a string consisting of the letters `x` and `y`, such as `xyxxxyxyy`. In addition, you have an operation called `flip`, which changes a single `x` to `y` or vice versa.

Determine how many times you would need to apply this operation to ensure that all `x`'s come before all `y`'s. In the preceding example, it suffices to flip the second and sixth characters, so you should return `2`.

332 (Easy)

This problem was asked by Jane Street.

Given integers `M` and `N`, write a program that counts how many positive integer pairs `(a, b)` satisfy the following conditions:

- `a + b = M`
- `a XOR b = N`