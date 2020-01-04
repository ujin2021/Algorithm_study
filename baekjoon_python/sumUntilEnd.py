#예외처리 다시공부
while True:
    try:
        a, b = map(int, input().split())
        print(a+b)
    except:
        break
