# ADD ELEMENTS and FIND AVERAGE
total = 0
count = 0
while True:
    num = input("Enter a number: ")
    if num == 'done':
        break
    total = total + float(num)
    count = count + 1
print("average: ", total/count)

