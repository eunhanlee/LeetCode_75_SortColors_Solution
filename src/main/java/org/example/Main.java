package org.example;

public class Main {
    public static void main(String[] args) {
        Solution2 tt = new Solution2();
        int[] nums = {2, 0, 2, 1, 1, 0};
        tt.sortColors(nums);
        for (int num : nums) System.out.print(num+" ");
    }
}