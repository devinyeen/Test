package com.spread.ydy.leetcode.l1;

import java.util.HashMap;
import java.util.Map;

// Level:1
public class Problem1TwoSum {
    private static int[] nums   = { 2, 7, 11, 15 };
    private static int   target = 9;

    public static void main(String[] args) {
        Problem1TwoSum s = new Problem1TwoSum();
        int[] results = s.twoSum(nums, target);
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }

    // 1 初步的暴力解决
//    public int[] twoSum(int[] nums, int target) {
//        int[] results = { -1, -1 };
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    results[0] = i;
//                    results[1] = j;
//                    return results;
//                } else {
//                    continue;
//                }
//            }
//        }
//        return results;
//    }

    // 2 网上参考其他解法
//    public int[] twoSum(int[] nums, int target) {
//        int[] results = new int[2];
//        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//        for (int i = nums.length - 1; i >= 0; i--) {
//            if (hm.containsKey(target - nums[i])) {
//                results[0] = i;
//                results[1] = hm.get(target - nums[i]);
//                break;
//            }
//            hm.put(nums[i], i);
//        }
//        return results;
//    }


    // 3 网上参考其他解法改进
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (hm.containsKey(target - nums[i])) {
//                return new int[]{hm.get(target - nums[i]),i};
//            }
//            hm.put(nums[i], i);
//        }
//        return new int[]{-1, -1};
//    }

    public int[] twoSum(int[] nums, int target) {
        int size = 2047;
        int [] maxArr = new int [size + 1];

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            int index = value & size;
            System.out.println(index);
            if(maxArr[index] != 0){
                return new int[]{maxArr[index] - 1,i};
            }
            maxArr[nums[i]& size] = i + 1;
        }
        throw new IllegalArgumentException("cant not find element in nums that sum is target");
    }
}
