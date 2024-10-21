import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class L2022211851_5_Test {
    @Test
    public void testNumSubseq() {
        Solution5 solution = new Solution5();

        // 测试示例 1
        int[] nums1 = {3, 5, 6, 7};
        int target1 = 9;
        int expected1 = 4;
        assertEquals(expected1, solution.numSubseq(nums1, target1));

        // 测试示例 2
        int[] nums2 = {3, 3, 6, 8};
        int target2 = 10;
        int expected2 = 6;
        assertEquals(expected2, solution.numSubseq(nums2, target2));

        // 测试示例 3
        int[] nums3 = {2, 3, 3, 4, 6, 7};
        int target3 = 12;
        int expected3 = 61;
        assertEquals(expected3, solution.numSubseq(nums3, target3));
    }
}
