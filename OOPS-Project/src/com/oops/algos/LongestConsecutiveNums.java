package com.oops.algos;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveNums {
    public static int longestConsecutiveNums(int[] nums) {
        int current = 1;
        int result = 1;
        Set<Integer> set = new HashSet<>();
        for(int num: nums)
            set.add(num);
        for(int num: set) {
            if(!set.contains(num - 1)) {
                current = 1;
                int currNum = num;
                while(set.contains(currNum + 1)) {
                    current++;
                    currNum++;
                }
            }
            result = Math.max(result, current);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutiveNums(nums));
    }

}