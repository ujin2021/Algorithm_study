def solve(a: list) :
    sum = 0
    for i in range(0, len(a)) :
        sum += int(a[i])
    return sum
b = [1, 2, 3]
print(solve(b))