"""size1=int(input("Enter your 1st list size: "))
size2=int(input("Enter your 2nd list size: "))
list1=[]
list2=[]
common=[]
for i in range(size1):
   num=int (input(f"Enter your 1st list number {i+1}: "))
   list1.append(num)
for i in range(size2):
   num=int (input(f"Enter your 2nd list number {i+1}: "))
   list2.append(num)"""
list1=[1,2,3,4]
list2=[3,4,5,6]
common=[]

for item in list1:
   if item in list2:
     common.append(item)
print(common)