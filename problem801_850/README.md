## Daily Coding Problem: Problem #801 [Easy]

This problem was asked by Zillow.

Let's define a "sevenish" number to be one which is either a power of `7`, or the sum of unique powers of `7`. The first few sevenish numbers are `1`, `7`, `8`, `49`, and so on. Create an algorithm to find the `n`th sevenish number.

## Daily Coding Problem: Problem #802 [Medium]

This problem was asked by Triplebyte.

You are given `n` numbers as well as `n` probabilities that sum up to 1. Write a function to generate one of the numbers with its corresponding probability.

For example, given the numbers `[1, 2, 3, 4]` and probabilities `[0.1, 0.5, 0.2, 0.2]`, your function should return `1` 10% of the time, `2` 50% of the time, and 3 and 4 20% of the time.

You can generate random numbers between 0 and 1 uniformly.

## Daily Coding Problem: Problem #803 [Medium]

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

## Daily Coding Problem: Problem #804 [Medium]

This problem was asked by Airbnb.

You are given a huge list of airline ticket prices between different cities around the world on a given day. These are all direct flights. Each element in the list has the format `(source_city, destination, price)`.

Consider a user who is willing to take up to `k` connections from their origin city `A` to their destination `B`. Find the cheapest fare possible for this journey and print the itinerary for that journey.

For example, our traveler wants to go from `JFK` to `LAX` with up to `3` connections, and our input flights are as follows:

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

Due to some improbably low flight prices, the cheapest itinerary would be `JFK -> ATL -> ORD -> LAX`, costing $440.

## Daily Coding Problem: Problem #805 [Easy]

This problem was asked by Dropbox.

Spreadsheets often use this alphabetical encoding for its columns: "A", "B", "C", ..., "AA", "AB", ..., "ZZ", "AAA", "AAB", ....

Given a column number, return its alphabetical column id. For example, given `1`, return "A". Given `27`, return "AA".

## Daily Coding Problem: Problem #806 [Hard]

This problem was asked by Google.

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

## Daily Coding Problem: Problem #807 [Hard]

This problem was asked by Amazon.

Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

## Daily Coding Problem: Problem #808 [Hard]

This problem was asked by Palantir.

Typically, an implementation of in-order traversal of a binary tree has `O(h)` space complexity, where `h` is the height of the tree. Write a program to compute the in-order traversal of a binary tree using `O(1)` space.