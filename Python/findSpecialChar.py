word=input("Enter your word: ")
count=1
for char in word:
    if(char=='!' or char=='@' or char=='#' or char=='$'):
        count+=1
if(count>1):
    print("Not acceptable")
else:
    print("Acceptable")