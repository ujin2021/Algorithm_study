arr = input().split(" ")
count = 0
for i in range(0, len(arr)) :
    if(len(arr[i]) > 0) :
        count += 1
print(count)