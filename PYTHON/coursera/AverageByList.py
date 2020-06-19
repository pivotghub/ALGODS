myList = list()
while True:
    inp = input("Enter value to add to the list: ")
    if inp == "done":
        break
    myList.append(float(inp))
print("now: ", myList)
print("average: ", sum(myList)/len(myList))
