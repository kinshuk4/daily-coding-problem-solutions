Problem 601 (Medium)

This problem was asked by Pinterest.

The sequence `[0, 1, ..., N]` has been jumbled, and the only clue you have for its order is an array representing whether each number is larger or smaller than the last. Given this information, reconstruct an array that is consistent with it. For example, given `[None, +, +, -, +]`, you could return `[1, 2, 3, 0, 4]`.

Problem 602 (Easy)

This problem was asked by Facebook.

Suppose you are given two lists of `n` points, one list p1, p2, ..., pn on the line y = 0 and the other list q1, q2, ..., qn on the line y = 1. Imagine a set of `n` line segments connecting each point pi to qi. Write an algorithm to determine how many pairs of the line segments intersect.

Problem 603 (Easy)

This problem was asked by Microsoft.

You are given an string representing the initial conditions of some dominoes. Each element can take one of three values:

- `L`, meaning the domino has just been pushed to the left,
- `R`, meaning the domino has just been pushed to the right, or
- `.`, meaning the domino is standing still.

Determine the orientation of each tile when the dominoes stop falling. Note that if a domino receives a force from the left and right side simultaneously, it will remain upright.

For example, given the string `.L.R....L`, you should return `LL.RRRLLL`.

Given the string `..R...L.L`, you should return `..RR.LLLL`.

Problem 604 (Hard)

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

Problem 605 (Easy)

This problem was asked by Palantir.

In academia, the h-index is a metric used to calculate the impact of a researcher's papers. It is calculated as follows:

A researcher has index `h` if at least `h` of her `N` papers have `h`citations each. If there are multiple `h` satisfying this formula, the maximum is chosen.

For example, suppose `N` = 5, and the respective citations of each paper are `[4, 3, 0, 1, 5]`. Then the h-index would be `3`, since the researcher has `3` papers with at least `3` citations.

Given a list of paper citations of a researcher, calculate their h-index.

Problem 606 (Hard)

This problem was asked by Google.

A knight's tour is a sequence of moves by a knight on a chessboard such that all squares are visited once.

Given N, write a function to return the number of knight's tours on an N by N chessboard.

Problem 607 (Medium)

This problem was asked by Walmart Labs.

There are `M` people sitting in a row of `N` seats, where `M < N`. Your task is to redistribute people such that there are no gaps between any of them, while keeping overall movement to a minimum.

For example, suppose you are faced with an input of `[0, 1, 1, 0, 1, 0, 0, 0, 1]`, where `0` represents an empty seat and `1` represents a person. In this case, one solution would be to place the person on the right in the fourth seat. We can consider the cost of a solution to be the sum of the absolute distance each person must move, so that the cost here would be five.

Given an input such as the one above, return the lowest possible cost of moving people to remove all gaps.