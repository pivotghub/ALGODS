largest = None
smallest = None
while True:
    num = input("Enter a number: ")
    if num == "done":
        break
    try:
        print(num)
        num = int(num)
    except ValueError:
        print("Invalid input")
        if largest is None or num > largest:
            largest = num
        if smallest is None or num < smallest:
            smallest = num
print("Maximum is", largest)
print("Minimum is", smallest)
