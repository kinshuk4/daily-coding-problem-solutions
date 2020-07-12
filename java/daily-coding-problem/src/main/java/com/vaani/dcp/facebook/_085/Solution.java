package com.vaani.dcp.facebook._085;

/**
 *
 * */
public class Solution {

    public static void main(String... args) {
        System.out.println(ifElse(4, 7, 1));    // 4
        System.out.println(ifElse(4, 7, 0));    // 7
    }

    public static int ifElse(int x, int y, int b) {
        return (x * b) | (y * (1 - b));
    }
}
