package com.relax.binary.search;

import java.util.Arrays;

/**
 * @Author relax
 * @Date 2024/8/20 15:14
 * @Description Find First and Last Position of Element in Sorted Array
 * @Version 1.0
 **/
public class Question_34 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 5, 5, 6, 9, 12};
//        int target = 9;
        int target = 5;
        System.out.println(Arrays.toString(findElementFirstAndLastIndex(nums, target)));
    }

    /**
     * 思路1：分别搜索最左最右即可
     * @param nums
     * @param target
     * @return
     */
    private static int[] findElementFirstAndLastIndex(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums.length == 0) {
            return result;
        }

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int middle = i + j >>> 1;
            if (nums[middle] < target) {
                i = middle + 1;
            } else if (nums[middle] > target){
                j = middle - 1;
            } else {
                result[0] = i;
                j = middle - 1;
            }
        }
        if (result[0] != -1) {
            result[0] = i;
        }


        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int middle = i + j >>> 1;
            if (nums[middle] > target) {
                j = middle - 1;
            } else if (nums[middle] < target) {
                i = middle + 1;
            } else {
                result[1] = j;
                i = middle + 1;
            }
        }
        if (result[1] != -1) {
            result[1] = j;
        }
        return result;
    }

}
