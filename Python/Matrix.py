row=int(input(" Enter your size of row: "))
coloumn=int(input("Enter your size of coloumn: "))
matrix=[]
for i in range(row):
    rows=[]
    for j in range(coloumn):
        nmbr=int(input(f"Enter your row{i+1}, coloumn{j+1}: "))
        rows.append(nmbr)
    matrix.append(rows)
for rows in matrix:
    print(rows)