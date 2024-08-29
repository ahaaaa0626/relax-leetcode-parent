package com.relax.binary.search;

/**
 * @Author relax
 * @Date 2024/8/20 14:57
 * @Description Binary Search
 * @Version 1.0
 **/
public class Question_704 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
//        int target = 9;
        int target = 2;
        System.out.println(binarySearch(nums, target));
    }

    private static int binarySearch(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int middle = i + j >>> 1;
            if (nums[middle] < target) {
                i = middle + 1;
            } else if (nums[middle] > target) {
                j = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

}
