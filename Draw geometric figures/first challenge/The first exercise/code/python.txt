i = input("Enter the number of lines for the shape to draw :")
i = int(i)
if i > 0:
    n = "*"
    for j in range(0,i):
        print(n)
        n = n+"*"
else:
    print("The number of lines cannot be zero or less than zero.")