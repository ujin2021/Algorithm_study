num = int(input())
numList = input().split()
max = 0
sum = 0
for i in range(0,num) :
    sum += int(numList[i])
    if(int(numList[i]) >= max) :
        max = int(numList[i])
aver = (sum / num) / max * 100
print(aver)