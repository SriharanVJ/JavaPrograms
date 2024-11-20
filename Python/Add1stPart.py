"""nmbr=[1,2,3,4,5,6]
div=2
temp=[]
nmbr=nmbr[div:]+nmbr[:div]
print (nmbr)"""

nmbr=[1,2,3,3,4,5,6,43]

"""if all (nmbr[i]>=nmbr[i+1] for i in range(len(nmbr)-1)) or all(nmbr[i]<=nmbr[i+1]for i in range(len(nmbr)-1)):
    print("Monotonic")
else:
    print("no")
    """
"""nmbr[0],nmbr[-1]=nmbr[-1],nmbr[0]
print(nmbr)"""


"""nmbr=370

rem=0
temp=nmbr
sum=0
while temp>0:
   rem =temp%10
   sum+=rem**3
   temp//=10
if nmbr==sum:
    print("Yes")
else:
        print("No")"""
"""nmbr=int(input())
even=[x for x in range(nmbr) if not x%2==0 or x%2==0]
print(even)
"""
def add_nmbr(a,b):
    a=a+b
    b=a-b
    a=a-b
    return a,b
adding=add_nmbr(10,8)
print(adding)