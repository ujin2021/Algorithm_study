initNum = int(input())
nextNum = initNum
count = 0
while True :
    a = nextNum // 10
    b = nextNum % 10
    nextNum = b*10 + ((a + b) % 10)
    count += 1
    if(nextNum == initNum) :
        print(count)
        break;