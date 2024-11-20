size=int(input("Enter your Size: "))
nmbr=[]
for i in range(size):
    num=int(input(f"Enter your Numbers {i+1}: "))
    nmbr.append(num)
nmbr.sort(reverse=True)
print(nmbr)