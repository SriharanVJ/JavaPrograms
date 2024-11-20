"""nmbr1=int(input("Enter the number: "))
nmbr2=int(input("Enter the number: "))

for i in range(nmbr1,nmbr2+1):
    if(i%3==0 and i%5==0):
        print(f"{i}= FizzBuzz")
    elif(i%5==0):
        print(f"{i}= buzz")
    elif(i%3==0):
        print(f"{i}= Fizz")
    else:
        print("None")"""

    
nmbr1=int(input("Enter the number: "))  
first=0
sec=1 
third=0  
for i in range(nmbr1):
    print(first,end=" ")
    third=first+sec
    first=sec
    sec=third
    
