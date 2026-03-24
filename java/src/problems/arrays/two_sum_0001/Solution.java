package arrays.two_sum_0001;

import java.util.HashMap;
import java.util.Map;

/*
    Problem:
    Given an array of integers, return indices of the two numbers such that they add up to a target.

    Approach:
    - Use a hash map to store values and their indices
    - For each element, check if its complement exists in the map
    - Return the indices of the two elements that sum to the target

    Time: O(n)
    Space: O(n)
*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // assume exactly one solution exists as per problem constraints
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need))
                return new int[] { map.get(need), i };
            map.put(nums[i], i);
        }

        return new int[0];
    }
}