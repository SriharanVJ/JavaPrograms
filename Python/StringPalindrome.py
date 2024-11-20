"""word=input("Enter your word: ")
temp=""
for char in word:
    temp=char+temp
if(temp==word):
    print("Yes")
else:
    print("No")"""

size=int(input("Enter your word: "))
nmbr=[]
for i in range(size):
    num=int(input("Enter your numbers"))
    nmbr.append(num)
temp=0
for i in range(len(nmbr)):
    if(nmbr[i]>temp):
        temp=nmbr[i]
temp1=0
for i in range(len(nmbr)):
    if(nmbr[i]<temp and nmbr[i]>temp1):
        temp1=nmbr[i]
print(temp1)


