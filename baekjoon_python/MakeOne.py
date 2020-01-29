def fun(number):
    sum = 0
    for i in number:
        sum += int(i)

    if len(str(sum)) == 1:
        return sum
    elif len(str(sum)) >= 2:
        r_sum = 0
        for j in str(sum):
            r_sum += int(j)

        return r_sum

number = input("Enter the number : ")
print(fun(number))