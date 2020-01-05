remainder = [0] * 42
result = 0
for i in range(0,10) :
    a = int(input())
    remainder[a%42] += 1
for i in range(0,42) :
    if (remainder[i] != 0) :
        result += 1
print(result)