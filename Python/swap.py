"""first=int(input("Enter the number: "))
sec=int(input("Enter the number: "))
temp=0
temp=first
first=sec
sec=temp
print(first,sec,end="")"""

"""first=int(input("Enter the number: "))
sec=int(input("Enter the number: "))
first=first+sec
sec=first-sec
first=first-sec
print(first,sec)"""
first=int(input("Enter the number: "))
sum=1
for i in range(1,first):
   sum+= sum*i
print(sum)
