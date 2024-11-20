size=input("Enter your size: ")
list=[]
frequence={}

for char in size:
    if(char in frequence):
        frequence[char]+=1
    else:
        frequence[char]=1
print(frequence)