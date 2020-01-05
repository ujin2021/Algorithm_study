numList = [0] * 10
a = int(input())
b = int(input())
c = int(input())
number = str(a*b*c)

for i in range(0, len(number)) :
    numList[int(number[i])] += 1
for i in range(0, len(numList)) :
    print(int(numList[i]))