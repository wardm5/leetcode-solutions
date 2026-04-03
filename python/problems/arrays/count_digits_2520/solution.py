def countDigits(num: int) -> int:
    count = 0

    # create a hash table - does not allow duplicate
    num_s = str(num)
    val = []

    for i in range(len(num_s)):
        val.append(num_s[i])

    for v in val:
        if num % int(v) == 0:
            count += 1

    return count