package arrays.min_ops_k_divisible_3512;

/*
    Problem:
    Minimum operations to make array sum divisible by k.

    Approach:
    - Each operation reduces the total sum by 1
    - We want the smallest number of operations to make sum % k == 0
    - Therefore, answer = sum % k

    Time: O(n)
    Space: O(1)
*/

public class Solution {
    public int minOperations(int[] nums, int k) {
        // assume k > 0 as per problem constraints
        int sum = 0;
        for (int val : nums)
            sum += val;
        return sum % k;
    }
}
