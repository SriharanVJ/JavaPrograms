size=int(input("Enter your size: "))
nmbr=[]
first=0
sec=0
third=0
for i in range(size):
    nam=int(input(f"Enter your number {i+1}: "))
    nmbr.append(nam)
for i in nmbr:
    if i>first:
       first=i
for i in nmbr:
        if i>sec and i<first:
          sec=i
        
print(sec)


