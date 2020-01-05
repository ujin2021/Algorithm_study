#책 problem 184
sum = 0
i = 1
while True :
    if(i % 2 == 0) :
        sum -= i
    else :
        sum += i
    if(sum >= 100) :
        print(i)
        break
    i += 1