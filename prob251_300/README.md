251 (Medium)

This problem was asked by Amazon.

Given an array of a million integers between zero and a billion, out of order, how can you efficiently sort it? Assume that you cannot store an array of a billion elements in memory.

252 (Easy)

This problem was asked by Palantir.

The ancient Egyptians used to express fractions as a sum of several terms where each numerator is one. For example, `4 / 13` can be represented as `1 / 4 + 1 / 18 + 1 / 468`.

Create an algorithm to turn an ordinary fraction `a / b`, where `a < b`, into an Egyptian fraction.

253 (Medium)

This problem was asked by PayPal.

Given a string and a number of lines `k`, print the string in zigzag form. In zigzag, characters are printed out diagonally from top left to bottom right until reaching the `k``th` line, then back up to top right, and so on.

For example, given the sentence `"thisisazigzag"` and `k = 4`, you should print:

```
t     a     g
 h   s z   a
  i i   i z
   s     g
```



254 (Medium)

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



255 (Easy)

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

256 (Medium)

This problem was asked by Fitbit.

Given a linked list, rearrange the node values such that they appear in alternating `low -> high -> low -> high ...` form. For example, given `1 -> 2 -> 3 -> 4 -> 5`, you should return `1 -> 3 -> 2 -> 5 -> 4`.

257 (Easy)

This problem was asked by WhatsApp.

Given an array of integers out of order, determine the bounds of the smallest window that must be sorted in order for the entire array to be sorted. For example, given `[3, 7, 5, 6, 9]`, you should return `(1, 3)`.

258 (Easy)

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

259 (Hard)

This problem was asked by Two Sigma.

Ghost is a two-person word game where players alternate appending letters to a word. The first person who spells out a word, or creates a prefix for which there is no possible continuation, loses. Here is a sample game:

- Player 1: `g`
- Player 2: `h`
- Player 1: `o`
- Player 2: `s`
- Player 1: `t` [loses]

Given a dictionary of words, determine the letters the first player should start with, such that with optimal play they cannot lose.

For example, if the dictionary is `["cat", "calf", "dog", "bear"]`, the only winning start letter would be `b`.

260 (Medium)

This problem was asked by Pinterest.

The sequence `[0, 1, ..., N]` has been jumbled, and the only clue you have for its order is an array representing whether each number is larger or smaller than the last. Given this information, reconstruct an array that is consistent with it. For example, given `[None, +, +, -, +]`, you could return `[1, 2, 3, 0, 4]`.

261 (Easy)

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

262 (Medium)

This problem was asked by Mozilla.

A bridge in a connected (undirected) graph is an edge that, if removed, causes the graph to become disconnected. Find all the bridges in a graph.

263 (Medium)

This problem was asked by Nest.

Create a basic sentence checker that takes in a stream of characters and determines whether they form valid sentences. If a sentence is valid, the program should print it out.

We can consider a sentence valid if it conforms to the following rules:

1. The sentence must start with a capital letter, followed by a lowercase letter or a space.
2. All other characters must be lowercase letters, separators (`,`,`;`,`:`) or terminal marks (`.`,`?`,`!`,`‽`).
3. There must be a single space between each word.
4. The sentence must end with a terminal mark immediately following a word.

264 (Hard)

This problem was asked by LinkedIn.

Given a set of characters `C` and an integer `k`, a De Bruijn sequence is a cyclic sequence in which every possible `k`-length string of characters in `C` occurs exactly once.

For example, suppose `C = {0, 1}` and `k = 3`. Then our sequence should contain the substrings `{'000', '001', '010', '011', '100', '101', '110', '111'}`, and one possible solution would be `00010111`.

Create an algorithm that finds a De Bruijn sequence.

265 (Easy)

This problem was asked by Atlassian.

MegaCorp wants to give bonuses to its employees based on how many lines of codes they have written. They would like to give the smallest positive amount to each worker consistent with the constraint that if a developer has written more lines of code than their neighbor, they should receive more money.

Given an array representing a line of seats of employees at MegaCorp, determine how much each one should get paid.

For example, given `[10, 40, 200, 1000, 60, 30]`, you should return `[1, 2, 3, 4, 2, 1]`.

266 (Easy)

This problem was asked by Pivotal.

A step word is formed by taking a given word, adding a letter, and anagramming the result. For example, starting with the word "APPLE", you can add an "A" and anagram to get "APPEAL".

Given a dictionary of words and an input word, create a function that returns all valid step words.

267 (Hard)

This problem was asked by Oracle.

You are presented with an `8` by `8` matrix representing the positions of pieces on a chess board. The only pieces on the board are the black king and various white pieces. Given this matrix, determine whether the king is in check.

For details on how each piece moves, see [here](https://en.wikipedia.org/wiki/Chess_piece#Moves_of_the_pieces).

For example, given the following matrix:

```python
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

268 (Medium)

This problem was asked by Indeed.

Given a `32`-bit positive integer `N`, determine whether it is a power of four in faster than `O(log N)` time.



269 (Easy)

This problem was asked by Microsoft.

You are given an string representing the initial conditions of some dominoes. Each element can take one of three values:

- `L`, meaning the domino has just been pushed to the left,
- `R`, meaning the domino has just been pushed to the right, or
- `.`, meaning the domino is standing still.

Determine the orientation of each tile when the dominoes stop falling. Note that if a domino receives a force from the left and right side simultaneously, it will remain upright.

For example, given the string `.L.R....L`, you should return `LL.RRRLLL`.

Given the string `..R...L.L`, you should return `..RR.LLLL`.

270 (Medium)

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



271 (Hard)

This problem was asked by Netflix.

Given a sorted list of integers of length `N`, determine if an element `x`is in the list without performing any multiplication, division, or bit-shift operations.

Do this in `O(log N)` time.

272 (Medium)

This problem was asked by Spotify.

Write a function, `throw_dice(N, faces, total)`, that determines how many ways it is possible to throw `N` dice with some number of faces each to get a specific total.

For example, `throw_dice(3, 6, 7)` should equal `15`.

273 (Easy)

This problem was asked by Apple.

A fixed point in an array is an element whose value is equal to its index. Given a sorted array of distinct elements, return a fixed point, if one exists. Otherwise, return `False`.

For example, given `[-6, 0, 2, 40]`, you should return `2`. Given `[1, 5, 7, 8]`, you should return `False`.



274 (Hard)

This problem was asked by Facebook.

Given a string consisting of parentheses, single digits, and positive and negative signs, convert the string into a mathematical expression to obtain the answer.

Don't use `eval` or a similar built-in parser.

For example, given '-1 + (2 + 3)', you should return `4`.

275 (Medium)

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

276 (Hard)

This problem was asked by Dropbox.

Implement an efficient string matching algorithm.

That is, given a string of length `N` and a pattern of length `k`, write a program that searches for the pattern in the string with less than `O(N * k)` worst-case time complexity.

If the pattern is found, return the start index of its location. If not, return `False`.