import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.example.Solution;
import org.example.Solution2;
import org.example.Solution3;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSortColors() {
        Solution solution = new Solution();
//        Solution2 solution = new Solution2();
//        Solution3 solution = new Solution3();

        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums1);

        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);
        assertArrayEquals(new int[]{0, 1, 2}, nums2);

        int[] nums3 = {0, 0, 0, 0, 0};
        solution.sortColors(nums3);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, nums3);

        int[] nums4 = {1, 1, 1, 1, 1};
        solution.sortColors(nums4);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, nums4);

        int[] nums5 = {2, 2, 2, 2, 2};
        solution.sortColors(nums5);
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, nums5);

        int[] nums6 = {1, 0};
        solution.sortColors(nums6);
        assertArrayEquals(new int[]{0, 1}, nums6);

        int[] nums7 = {0, 1};
        solution.sortColors(nums7);
        assertArrayEquals(new int[]{0, 1}, nums7);

        int[] nums8 = {2, 1};
        solution.sortColors(nums8);
        assertArrayEquals(new int[]{1, 2}, nums8);

        int[] nums9 = {0};
        solution.sortColors(nums9);
        assertArrayEquals(new int[]{0}, nums9);

        int[] nums10 = {1};
        solution.sortColors(nums10);
        assertArrayEquals(new int[]{1}, nums10);

        System.out.println("All test cases passed");
    }
}
