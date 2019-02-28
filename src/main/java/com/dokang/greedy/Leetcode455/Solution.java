package com.dokang.greedy.Leetcode455;

import java.util.Arrays;

/**
 * @author: YwT
 * @create: 2019-02-25 13:40
 *
 **/
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sum = 0;
        int j = 0;
        for (int i = 0; i < g.length && j < s.length;){
            if (g[i] <= s[j]){
                i++;
                sum++;
            }
            j++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};
        new Solution().findContentChildren(g, s);

    }
}
