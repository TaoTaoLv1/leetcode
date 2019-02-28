package com.dokang.greedy.leetcode45;

/**
 * @author: YwT
 * @create: 2019-02-26 14:57
 **/
public class Solution {
    public int jump(int[] nums) {
        if (nums.length < 2){
            return 0;
        }
        int jump = 1;
        int preMaxIndex = nums[0];
        int curMaxIndex = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (i > curMaxIndex){
                jump++;
                curMaxIndex = preMaxIndex;
            }
            preMaxIndex = Math.max(preMaxIndex, nums[i] + i);
        }
        return jump;
    }
}
