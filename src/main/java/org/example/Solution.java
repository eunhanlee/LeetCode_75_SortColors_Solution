package org.example;
public class Solution {

    /**
     * Sorts the given array in-place, containing only 0s, 1s, and 2s, using counting technique.
     *
     * @param nums The array to be sorted.
     */
    public void sortColors(int[] nums) {
        int Zero = 0, One = 0, Two = 0; // Variables to count the occurrences of 0s, 1s, and 2s
        int idx = 0; // Index to track the position in the array

        // Count the occurrences of 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) Zero++;
            if (num == 1) One++;
            if (num == 2) Two++;
        }

        // Fill the array with the counted number of 0s, then 1s, and finally 2s
        for (int i = 0; i < Zero; i++) {
            nums[idx] = 0;
            idx++;
        }
        for (int i = 0; i < One; i++) {
            nums[idx] = 1;
            idx++;
        }
        for (int i = 0; i < Two; i++) {
            nums[idx] = 2;
            idx++;
        }
    }
}
