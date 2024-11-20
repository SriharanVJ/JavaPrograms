cars=[]

size=int(input("Enter your Size"))
for i in range(size):
 name=input(f"Enter name {i+1}: ")
 cars.append(name)
cars.sort()
print(cars)