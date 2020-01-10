i = input("Enter the number of lines for the shape to draw :")
i = int(i)
if i > 0:
    s="*"
    for j in range(1,i):
        print(" "*i,s*j)
        i=i-1
else:
    print("The number of lines cannot be zero or less than zero.")