# LeetCode 75. Sort Colors Java Solution

Hashnode Link: https://eunhanlee.hashnode.dev/leetcode-75-sort-colors-java-solution

Blogger link: https://eunhanspace.blogspot.com/2023/08/leetcode-75-sort-colors-java-solution.html

## Problem

[Sort Colors - LeetCode](https://leetcode.com/problems/sort-colors/?envType=featured-list&envId=top-interview-questions)

### Solution Approach

- This problem asks whether you can implement a sorting algorithm without using built-in sorting functions or methods.
- Since the input consists of only 0, 1, and 2, it is possible to solve it using a logic-based algorithm.
- Algorithm:
    - Iterate through all elements and count the occurrences of 0s, 1s, and 2s.
    - Fill the array with 0s, then 1s, and finally 2s based on their counts.
- The "Follow up" asks about the one-pass algorithm known as the Dutch National Flag algorithm, which specializes in sorting 0s and 1s.
- Alternatively, you can implement the Quick Sort algorithm.

### References

[What is Dutch National Flag algorithm](https://eunhanspace.blogspot.com/2023/08/what-is-dutch-national-flag-algorithm.html) 

[What is Quick Sort](https://eunhanspace.blogspot.com/2023/08/what-is-quick-sort.html) 

## Github Link

[https://github.com/eunhanlee/LeetCode_75_SortColors_Solution.git](https://github.com/eunhanlee/LeetCode_75_SortColors_Solution.git)

## Logic Algorithm Time Complexity: O(n), Space Complexity: O(1)

```java
/**
 * The Solution class provides a method to sort an array containing only 0, 1, and 2.
 */
public class Solution {

    /**
     * Sorts the given array using the counting technique. The array should contain only 0, 1, and 2.
     *
     * @param nums The array to be sorted.
     */
    public void sortColors(int[] nums) {
        int Zero = 0, One = 0, Two = 0; // Variables to count the occurrences of 0s, 1s, and 2s
        int idx = 0; // Index to track the position in the array

        // Count occurrences of 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) Zero++;
            if (num == 1) One++;
            if (num == 2) Two++;
        }

        // Fill the array with 0s, then 1s, and finally 2s based on their counts
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

```

## Dutch National Flag Algorithm Time Complexity: O(n), Space Complexity: O(1)

```java
public class Solution {
    /**
     * Sorts the given array containing only 0, 1, and 2 using the Dutch National Flag algorithm.
     *
     * @param nums The array to be sorted.
     */
    public void sortColors(int[] nums) {
        int low = 0;  // Pointer to 0
        int mid = 0;  // Pointer to 1
        int high = nums.length - 1;  // Pointer to 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                // If the current element is 0, swap it with the element at the low pointer.
                swap(nums, low, mid);
                low++;  // Increment low pointer
                mid++;  // Increment mid pointer (since the swapped element is 1)
            } else if (nums[mid] == 1) {
                // If the current element is 1, move the mid pointer forward.
                mid++;
            } else if (nums[mid] == 2) {
                // If the current element is 2, swap it with the element at the high pointer.
                swap(nums, mid, high);
                high--;  // Decrement high pointer
                // Note: Here, the mid pointer is not incremented yet as the swapped element's value is uncertain.
            }
        }
    }

    /**
     * Swaps two elements in the array.
     *
     * @param nums The array containing the elements.
     * @param i    Index of the first element to be swapped.
     * @param j    Index of the second element to be swapped.
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

```

## Quick Sort Time Complexity: O(n log n), Space Complexity: O()

```java
public class Solution3 {
    /**
     * Sorts the given array using the Quick Sort algorithm.
     *
     * @param nums The array to be sorted.
     */
    public void sortColors(int[] nums) {
        quickSort(nums);
    }

    private static void quickSort(int[] input) {
        quickSortRecur(input, 0, input.length - 1);
    }

    /**
     * Recursively implements Quick Sort using the Lomuto partition scheme.
     * pivot: Rightmost element
     * Starting point for selected value (left): 0
     * Starting point for comparison value (right): 0
     *
     * @param input The array to be sorted.
     * @param left  Starting index of the array to be partitioned.
     * @param right Ending index of the array to be partitioned.
     */
    private static void quickSortRecur(int[] input, int left, int right) {
        // Quick Sort termination condition: array length is 1 or less
        if (left >= right) {
            return;
        }

        // Find the partition point using the Lomuto partition scheme
        int pivotPos = partition(input, left, right);

        // Recursively sort the left partition
        quickSortRecur(input, left, pivotPos - 1);
        // Recursively sort the right partition
        quickSortRecur(input, pivotPos + 1, right);
    }

    /**
     * Swaps the positions of two elements in an array.
     *
     * @param input The array containing the elements.
     * @param a     Index of the first element.
     * @param b     Index of the second element.
     */
    private static void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }

    /**
     * Uses the Lomuto partition scheme to partition an array and returns the position of the pivot.
     *
     * @param input The array to be partitioned.
     * @param left  Starting index of the array to be partitioned.
     * @param right Ending index of the array to be partitioned.
     * @return The position of the pivot.
```