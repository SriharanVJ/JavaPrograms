def odd_even(sri):
    if(nmbr%2==0):
        return "even"
    else:
        return "odd"
nmbr=int(input("Enter your number: "))
result=odd_even(nmbr)
print(result)