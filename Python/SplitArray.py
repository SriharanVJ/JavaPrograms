size=int(input("Enter your size: "))
nmbr=[]
for i in range(size):
    num=int(input(f"Enter your number {i+1}: "))
    nmbr.append(num)
split=int (input("Enter your split number: "))

for i in range(split):
    x.append(nmbr[i])
#for i in range(split,size):
 #   y=nmbr[i]       
#y.extend(x)
#for i in y:
print(x,end=" ")
    