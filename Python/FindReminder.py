size=int(input("Enter your array size: "))
nmbr=[]
for i in range(size):
   num=int (input(f"Enter your number {i+1}: "))
   nmbr.append(num)
rem=int (input("Enter your divide by number: "))

sum=1
temp=0
for i in range(size):
   sum*=nmbr[i]
temp=sum%rem

print(temp)