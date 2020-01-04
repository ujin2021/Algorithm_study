num, max = map(int, input().split())
scoreList = input().split(" ")

for i in range(0, len(scoreList), 1) :
    if(int(scoreList[i]) < max) :
        print("%d" %int(scoreList[i]), end=" ")