num = int(input())
subScore = 0
score = 0
for i in range(0, num) :
    str = input()
    for j in range(0, len(str)) :
        if(str[j] == 'O') :
            subScore += 1
            score += subScore
        else :
            subScore = 0
    print(score)
    score = 0
    subScore = 0


