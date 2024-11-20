#i/p 1a2b3c
#o/p=abbccc
word=input("Enter your word: ")
flag=True
for i in range(len(word)-1):
    #check for double digits in input 
    if('0'<=word[i]<='9' and '0'<=word[i+1]<='9'):
             flag=False
             break
    #check for double char in input
    elif('a'<=word[i]<='z' and 'a'<=word[i+1]<='z'):
            flag=False
            break
    
if(flag==False):
    print("Invalid")
    #check for starting index is char
elif  not('0'<=word[0]<='9' ):
             print("Invalid")
else:
        for char in word:
         i=0
        
         if('0'<=char<='9'):
              nmbr=int(char)
         
         else:
             while (i<nmbr):
               print(char,end="")
               i=i+1
    