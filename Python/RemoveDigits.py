"""word=input("Enter your word: ")
temp=""
for char in word:
    if not('0'<=char<='9'):
        temp+=char
print(temp)"""
"""nmbr=[]
size=int(input("Enter your Size"))
for i in range(size):
    num=input(f"Enter your Numbers {i+1}: ")
    nmbr.append(num)
temp=''
for item in nmbr:
    if(item not in temp):
        temp+=item
        temp+=" "
print(temp)"""
evens = [x for x in range(10) if x % 2 == 0]
print(evens)