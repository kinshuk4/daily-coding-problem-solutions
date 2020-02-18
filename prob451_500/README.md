451 (Easy)

This problem was asked by Apple.

Implement the function `fib(n)`, which returns the `n``th` number in the Fibonacci sequence, using only `O(1)` space.

452 (Easy)

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



453 (Easy)

This problem was asked by Google.

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

454 (Medium)

This problem was asked by Facebook.

Describe an algorithm to compute the longest increasing subsequence of an array of numbers in `O(n log n)` time.

455 (Medium)

This problem was asked by Dropbox.

Conway's Game of Life takes place on an infinite two-dimensional board of square cells. Each cell is either dead or alive, and at each tick, the following rules apply:

- Any live cell with less than two live neighbours dies.
- Any live cell with two or three live neighbours remains living.
- Any live cell with more than three live neighbours dies.
- Any dead cell with exactly three live neighbours becomes a live cell.

A cell neighbours another cell if it is horizontally, vertically, or diagonally adjacent.

Implement Conway's Game of Life. It should be able to be initialized with a starting list of live cell coordinates and the number of steps it should run for. Once initialized, it should print out the board state at each step. Since it's an infinite board, print out only the relevant coordinates, i.e. from the top-leftmost live cell to bottom-rightmost live cell.

You can represent a live cell with an asterisk (`*`) and a dead cell with a dot (`.`).