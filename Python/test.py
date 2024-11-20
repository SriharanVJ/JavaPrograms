size=int(input("Enter your size: "))
nmbr=[]
for i in range(size):
    num=int(input(f"Enter your Number {i+1}: "))
    nmbr.append(num)
temp1=0
temp2=0
flag=False
for i in range(size):
    if(nmbr[i]>temp1):
        temp1=nmbr[i]
for i in range(size):
    if(nmbr[i]<temp1 and nmbr[i]>temp2):
        temp2=nmbr[i]
for i in range(2,8):
    if(i%temp2==0):
        flag=True

if flag==True:
    print(temp1)
else:
    print(temp2)