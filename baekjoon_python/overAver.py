case = int(input())
for i in range(0, case) :
    a = input().split(" ")
    num = int(a[0])
    sum = 0
    count = 0
    aver = 0
    for j in range(1, num+1) :
        sum += int(a[j])

    aver = sum / num

    for j in range(1, num+1) :
        if(int(a[j]) > aver) :
            count += 1

    print("%.3f%%" %((count/num) * 100))