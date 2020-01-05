caseNum = int(input())
count = 0
for i in range(0, caseNum):
    stdNum = input().split()
    for j in range(1, int(stdNum[0]) + 1):
        sum += int(stdNum[j])
    for k in range(1, int(stdNum[0]) + 1):
        if (int(stdNum[k]) > sum / int(stdNum[0])):
            count += 1
    print("%.3f" % (count / stdNum[0]))
