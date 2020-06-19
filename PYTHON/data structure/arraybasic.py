import array as arr

a = arr.array('d', [1.1, 2.2])
print("initial array: ", a)
print("first array element by index: ", a[0])
print("last array element by index:  ", a[-1])
print("sliced array: ", a[0:1])

print("\n")
ai = arr.array('i', [1, 2, 3, 4, 5, 6, 7, 8, 9])
print("initial array: ", ai)
print("sliced array: ai[0:1]: ", ai[0:1])
print("sliced array: ai[3:9]: ", ai[3:9])
print("sliced array: ai[3:1]: ", ai[3:1])
print("sliced array: ai[5:-5]: ", ai[5:-5])
print("sliced array: ai[-5:5]: ", ai[-5:5])
print("sliced array: ai[-4:]: ", ai[-4:])
print("sliced array: ai[:-4]: ", ai[:-4])
print("sliced array: ai[:]: ", ai[:])

print("\n")
print("CHANGE/ADD ELEMENTS TO AN ARRAY ")
ai = arr.array('i', [1, 2, 3, 4, 5, 6, 7, 8, 9])
print("initial array: ", ai)
ai[2] = 11
print("now: ", ai)
ai[3:6] = arr.array('i', [22, 33, 44])
print("now: ", ai)

print("\n")
ai = arr.array('i', [1, 2, 3, 4, 5, 6, 7, 8, 9])
print("initial array: ", ai)
ai.append(10)
print("append: ", ai)
ai.extend([11, 12, 13])
print("extend: ", ai)














