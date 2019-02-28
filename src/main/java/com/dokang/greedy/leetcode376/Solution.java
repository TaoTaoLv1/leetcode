package com.dokang.greedy.leetcode376;

import java.util.*;

/**
 * @author: YwT
 * @create: 2019-02-25 15:28
 **/
public class Solution {
    public int wiggleMaxLength(int[] nums) {
        int begin = 0;
        int up = 1;
        int down = 2;
        int sum = 1;
        int status = begin;
        for (int i = 1; i < nums.length; i++){
            switch (status){
                case 0:
                    if (nums[i - 1] > nums[i]){
                        sum++;
                        status = down;
                    }
                    if (nums[i - 1] < nums[i]){
                        sum++;
                        status = up;
                    }break;
                case 1:
                    if (nums[i - 1] > nums[i]){
                        sum++;
                        status = down;
                    }break;
                case 2:
                    if (nums[i - 1] < nums[i]){
                        sum++;
                        status = up;
                    }
            }
        }
        return sum;
    }


}
