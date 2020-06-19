# Use the file name mbox-short.txt as the file name
fname = input("Enter file name: ")
fh = open(fname)
ta = 0.0
count = 0
for line in fh:
    if not line.startswith("X-DSPAM-Confidence:"):
        continue
    ta = ta + float(line[line.find(":") + 1:len(line)])
    count = count + 1
print("Average spam confidence:", ta / count)
