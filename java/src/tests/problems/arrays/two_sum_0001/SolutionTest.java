package problems.arrays.two_sum_0001;

import org.junit.jupiter.api.Test;

import arrays.two_sum_0001.Solution;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void example1() {
        Solution solution = new Solution();
        assertArrayEquals(
                new int[] { 0, 1 },
                solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    }

    @Test
    void example2() {
        Solution solution = new Solution();
        assertArrayEquals(
                new int[] { 1, 2 },
                solution.twoSum(new int[] { 3, 2, 4 }, 6));
    }

    @Test
    void example3() {
        Solution solution = new Solution();
        assertArrayEquals(
                new int[0],
                solution.twoSum(new int[] { 0, 5, 3, 7 }, 11));
    }
}