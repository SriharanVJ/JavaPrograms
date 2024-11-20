first=int(input("Enter the current year: "))
second=first+20
while(first<=second):
    if( first%4==0 and first%100!=0 )or(first%400==0):

     print(f"{first} Leap Year")
    else:
     print(f"{first} Non leap year")
     
    first+=1
    
