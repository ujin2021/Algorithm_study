#책 problem 185
num = int(input())
leng = 0
while (num != 1) :
    if(num % 2 == 0) :
        num = num /2
        leng += 1
    else :
        num = num * 2 + 2
        leng += 1
print(leng + 1)