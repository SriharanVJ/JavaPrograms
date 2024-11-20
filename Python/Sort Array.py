nmbr=[]
size=int(input("Enter your Size"))
for i in range(size):
    num=input(f"Enter your Numbers {i+1}: ")
    nmbr.append(num)
nmbr.sort(reverse=True)
print(nmbr)