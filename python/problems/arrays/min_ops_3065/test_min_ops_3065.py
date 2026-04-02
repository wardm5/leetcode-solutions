from python.problems.arrays.min_ops_3065.solution import minOperations

def test_returns_three_when_three_values_are_less_than_k():
    assert minOperations([2, 11, 10, 1, 3], 10) == 3

def test_returns_zero_when_all_values_are_greater_than_or_equal_to_k():
    assert minOperations([10, 12, 15], 10) == 0

def test_returns_all_elements_when_every_value_is_less_than_k():
    assert minOperations([1, 2, 3, 4], 5) == 4

def test_returns_one_when_only_one_value_is_less_than_k():
    assert minOperations([9, 10, 11], 10) == 1