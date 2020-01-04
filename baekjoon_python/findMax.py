no = int(input())
numbers = input().split()
maxNum = int(numbers[0])
minNum = int(numbers[0])
for i in range(0, len(numbers)) :
    if(maxNum <= int(numbers[i])) :
        maxNum = int(numbers[i])
    if(minNum >= int(numbers[i])) :
        minNum = int(numbers[i])
print("%d %d" %(minNum, maxNum))