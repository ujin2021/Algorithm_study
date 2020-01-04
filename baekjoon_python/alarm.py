hour, minute = map(int, input().split())
if minute < 45 :
    minute = minute + 60 - 45
    if(hour == 0) :
        print("%d %d" %(23, minute))
    else :
        print("%d %d" %(hour - 1, minute))
else :
    minute = minute - 45
    print("%d %d" %(hour, minute))