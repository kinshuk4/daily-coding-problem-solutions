package com.vaani.dcp.uber._002;

import java.util.Arrays;

/**
 *
 * */
public class Solution {

    public static void main(String... args) {
        System.out.println(Arrays.toString(product(new int[] { 1, 2, 3, 4, 5 })));
        System.out.println(Arrays.toString(product(new int[] { 3, 2, 1 })));
    }

    public static int[] product(int[] arr) {
        if (arr == null || arr.length < 2)
            return null;

        int[] res = new int[arr.length];
        long product = 1;

        for (int val : arr)
            product *= val;

        for (int i = 0; i < arr.length; i++)
            res[i] = (int)(product / arr[i]);

        return res;
    }

}
