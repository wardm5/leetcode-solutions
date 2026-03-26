package problems.arrays.two_sum_0001;

import org.junit.jupiter.api.Test;

import arrays.two_sum_0001.Solution;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsIndices_whenTargetIsSumOfFirstTwoElements() {
        assertArrayEquals(
                new int[] { 0, 1 },
                solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    }

    @Test
    void returnsCorrectIndices_whenSolutionIsInMiddleOfArray() {
        assertArrayEquals(
                new int[] { 1, 2 },
                solution.twoSum(new int[] { 3, 2, 4 }, 6));
    }

    @Test
    void returnsEmptyArray_whenNoSolutionExists() {
        assertArrayEquals(
                new int[0],
                solution.twoSum(new int[] { 0, 5, 3, 7 }, 11));
    }

    @Test
    void handlesDuplicateValues() {
        assertArrayEquals(
                new int[] { 1, 2 },
                solution.twoSum(new int[] { 1, 3, 3, 4, 5, 2 }, 6));
    }
}