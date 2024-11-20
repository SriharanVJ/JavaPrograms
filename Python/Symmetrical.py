word=input("Enter your word: ")
length=len(word)
temp=""
temp1=""
for char in word [:len(word)//2]:
    temp+=char
for char in word[len(word)//2:]:
    temp1+=char
if(temp==temp1):
    print("Symmetrical")
else:
    print("Non Symmetrical")
