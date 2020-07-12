package com.vaani.dcp.company.google._138;

import java.util.Arrays;

/**
 *
 * */
public class Solution {

    public static void main(String... args) {
        System.out.println(getMinCoinsAmount(16));  // 3
    }

    private static final int[] DENOMINATION = {1, 5, 10, 25};

    public static int getMinCoinsAmount(int n) {
        int[] cache = new int[n + 1];
        Arrays.fill(cache, Integer.MAX_VALUE);

        for (int d : DENOMINATION)
            if (d < cache.length)
                cache[d] = 1;

        for (int i = 1; i < cache.length; i++)
            for (int d : DENOMINATION)
                if (i - d > 0)
                    cache[i] = Math.min(cache[i], 1 + cache[i - d]);

        return cache[n];
    }
}
