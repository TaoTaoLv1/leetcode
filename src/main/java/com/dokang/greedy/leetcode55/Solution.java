package com.dokang.greedy.leetcode55;

/**
 * @author: YwT
 * @create: 2019-02-26 11:51
 **/
public class Solution {
    public boolean canJump(int[] nums) {
        int jump = 1;
        int MaxIndex = nums[0];
        while (jump < nums.length ){
            if (jump > MaxIndex){
                break;
            }
            if (MaxIndex < nums[jump] + jump){
                MaxIndex = nums[jump] + jump;
            }
            jump++;
        }

        return jump == nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        new Solution().canJump(nums);
    }
}
