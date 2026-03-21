def two_sum(nums, target):
    map = {}

    for i, n in enumerate(nums):
        if target - n in map:
            return [map[target - n], i]
        map[n] = i

    return []
