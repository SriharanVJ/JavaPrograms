word=input("Enter your word")
dup={}
for i in range(len(word)):
    count=1
    for j in range(i+1,len(word)):
     if (word[i]==word[j]):
      dup=[i+1]

print(dup)

