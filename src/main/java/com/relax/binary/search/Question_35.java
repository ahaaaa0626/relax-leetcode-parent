package com.relax.binary.search;

/**
 * @Author relax
 * @Date 2024/8/20 15:14
 * @Description TODO
 * @Version 1.0
 **/
public class Question_35 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
//        int target = 9;
        int target = 111;
        System.out.println(searchInsertPosition(nums, target));
    }

    /**
     * 思路：一直搜索到底，找到大于等于target最左边的位置。
     * @param nums
     * @param target
     * @return
     */
    private static int searchInsertPosition(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int middle = i + j >>> 1;
            if (nums[middle] < target) {
                i = middle + 1;
            } else {
                j = middle - 1;
            }
        }

        return i;
    }

}
