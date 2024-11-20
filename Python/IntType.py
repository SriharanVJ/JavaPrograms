nmbr=int(input("Enter your Number: "))
if(nmbr>=-128 and nmbr<=127):
    print("*Byte")
elif(nmbr>=-32768 and nmbr<= 32767):
    print("*Short")
elif(nmbr>=-2147483648 and nmbr<=2147483648):
    print("*Integer")
elif(nmbr>=-9223372036854775808 and nmbr<=9223372036854775808):
    print("*long")