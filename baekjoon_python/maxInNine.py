myList = []
max = 0
index = 0
for i in range(0,9) :
    myList.append(int(input()))
    if (myList[i] >= max) :
        max = myList[i]
        index = i
print("%d\n%d" %(max, index+1))