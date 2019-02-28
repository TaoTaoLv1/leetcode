package com.dokang.greedy.leetcode452;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author: YwT
 * @create: 2019-02-26 15:11
 **/
public class Solution {
    public static int findMinArrowShots(int[][] points) {
        if(points.length ==0) return 0;
        Arrays.sort(points, (a,b) ->(a[1] - b[1]));
        int shootNum = 1;
        int shootE = points[0][1];
        for (int i = 1; i < points.length; i++){
            if (shootE < points[i][0]){
                shootNum++;
                shootE = points[i][1];
            }
        }
        return shootNum;
    }

    public static void main(String[] args) {
        System.out.println(1234%3);
    }
}
