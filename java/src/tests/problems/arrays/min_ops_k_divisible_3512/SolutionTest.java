package problems.arrays.min_ops_k_divisible_3512;

import org.junit.jupiter.api.Test;

import arrays.min_ops_k_divisible_3512.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsZero_whenArraySumIsDivisibleByK() {
        assertEquals(
                0,
                solution.minOperations(new int[] { 2, 3 }, 5));
    }

    @Test
    void returnsOne_whenArraySumIsOneMoreThanMultipleOfK() {
        assertEquals(
                1,
                solution.minOperations(new int[] { 1, 2, 3 }, 5));
    }

    @Test
    void returnsRemainder_whenSumIsNotDivisibleByK() {
        assertEquals(
            4,
            solution.minOperations(new int[] { 3, 9, 7 }, 5));
    }

    @Test
    void returnsCorrectValue_forSingleElementArray() {
        assertEquals(
            2,
            solution.minOperations(new int[] { 7 }, 5));
    }
}
