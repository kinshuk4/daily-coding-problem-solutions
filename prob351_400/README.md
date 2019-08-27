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