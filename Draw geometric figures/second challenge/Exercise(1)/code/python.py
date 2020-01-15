row = input("Enter the number of row  :")
Column = input("Enter the  number of column :")

lr = int(row)
lc = int(Column)

if lr != 0 and lc != 0:
    s = "*"
    for i in range(0, lr):
        print(" "*i,s*lc)
        
else:
    print("The number of lines cannot be zero or less than zero.")
