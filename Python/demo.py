import time
current=time.localtime(time.time())
corect=time.strftime("%d/%m/%y\n%H:%M:%S",current)
print(corect)
