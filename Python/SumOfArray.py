size=int(input("Enter your Array Size: "))
nmbr=[]
sum=0
for i in range(size):
    num=int(input(f"Enter your Number {i+1}: "))
    nmbr.append(num)
for i in nmbr:
   sum= sum+i
print(sum)
