nmbr=int(input("Enter your Number: "))
first=0
sec=1
third=0
for i in range(1,nmbr):
    print(first," ")
    third=first+sec
    first=sec
    sec=third