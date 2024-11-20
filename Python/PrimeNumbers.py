nmbr=int(input("Enter your number: "))
flag=True
for i in range(2,7):
    if(nmbr % i) ==0:
        flag=False
        
        break
    
if(flag==False):
 print (f"{nmbr} is not a Prime Number")
else:
 print(f"{nmbr} is a prime number")

    