scale = input().split()
i = 0
if (int(scale[0]) == 1) :
    for i in range(0,8) :
        if(int(scale[i]) == i+1) :
            continue
        else :
            print("mixed")
            break
    if(i == 7) :
        print("ascending")
elif (int(scale[0]) == 8):
    for i in range(0,8) :
        if(int(scale[i]) == 8 - i) :
            continue
        else :
            print("mixed")
            break
    if(i== 7):
        print("descending")
else :
    print("mixed")
