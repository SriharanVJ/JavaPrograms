word=input("Enter your word: ")

count={}
for char in word:    
    if char in count:
      count[char] += 1
    else:
      count[char]=1

for char,count in count.items():
  print(f"{char,count} time")
        