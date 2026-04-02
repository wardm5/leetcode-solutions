from typing import List

"""
    Problem:
    Minimum number of operations to make all elements in the array greater than or equal to k.

    Approach:
    - Sort the array in ascending order
    - Iterate through the array to find the first element that is greater than or equal to k
    - The index of this element represents how many elements are less than k
    - These elements need to be "removed" or adjusted, so the index is the answer
    - If no element meets the condition, all elements are less than k, so return the length of the array

    Time Complexity: O(n log n)
        - Sorting dominates the runtime

    Space Complexity: O(1)
        - Sorting is done in-place (ignoring Python's internal sorting space)
"""

def minOperations(nums: List[int], k: int) -> int:
    nums.sort()

    for i in range(len(nums)):
        if nums[i] >= k:
            return i

    return len(nums)