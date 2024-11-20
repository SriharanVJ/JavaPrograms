word=input("Enter your word: ")
temp=""
for char in word:
    if char not in temp:
     temp+=char
print(temp)