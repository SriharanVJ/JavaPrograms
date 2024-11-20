word=input("Enter your Word: ")
temp=""
for char in word:
    if('0'<=char<='9'):
        temp+=char
    elif('A'<=char<='Z'):
        temp+=chr(ord(char)+32) #-32 for upper case
    else:
        temp+=char
print(temp)