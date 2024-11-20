nmbr=int(input("Enter your number: "))
temp=nmbr
sum=0
while(nmbr>0):
    rem=nmbr%10
    sum+=rem**3
    nmbr//=10
if(temp==sum):
    print("yes")
else:
    print("No")