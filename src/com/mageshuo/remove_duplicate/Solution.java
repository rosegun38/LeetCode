package com.mageshuo.remove_duplicate;

/**
 * Created by majian on 08/10/2016.
 * Please leave this header if you want to use the code.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[j]) {
                continue;
            }
            nums[j] = nums[i - 1];
            j++;
        }
        return j;
    }
    
}
