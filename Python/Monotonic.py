size=int(input("Enter your size: "))
nmbr=[]
for i in range(size):
    num=int(input(f"Enter your number {i+1}: "))
    nmbr.append(num)
if all(nmbr[i]<= nmbr[i+1] for i in range(size-1)) or all (nmbr[i]>=nmbr[i+1] for i in range(size-1)):
    print("It is a Monotonic")
else:
    print("It is a Non-Monotonic")
