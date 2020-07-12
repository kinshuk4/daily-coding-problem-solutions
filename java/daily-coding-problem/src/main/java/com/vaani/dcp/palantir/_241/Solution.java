package com.vaani.dcp.palantir._241;

import java.util.Arrays;

/**
 *
 * */
public class Solution {

    public static void main(String... args) {
        System.out.println(calcIndex(new int[] { 4, 3, 0, 1, 5 }));  // 3
    }

    public static int calcIndex(int[] papers) {
        Arrays.sort(papers);

        for (int i = papers.length - 1; 0 <= i; i--)
            if (papers[i] <= papers.length - i)
                return papers[i];

        return 0;
    }

}
