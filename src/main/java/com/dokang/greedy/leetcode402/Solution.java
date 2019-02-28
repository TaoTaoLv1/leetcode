package com.dokang.greedy.leetcode402;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author: YwT
 * @create: 2019-02-26 10:44
 **/
public class Solution {
    public String removeKdigits(String num, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < num.length(); i++){
            int number = Integer.valueOf(num.charAt(i) - '0');
            while (res.size() != 0 && res.get(res.size() - 1) > number && k > 0){
                res.remove(res.size() - 1);
                k--;
            }

            if (number !=0 || res.size() != 0){
                res.add(number);
            }
        }

        while (res.size() != 0 && k > 0){
            res.remove(res.size() - 1);
            k--;
        }

        if (res.size() == 0){
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer re : res) {
            stringBuilder.append(re);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().removeKdigits("10200", 1));
    }
}
