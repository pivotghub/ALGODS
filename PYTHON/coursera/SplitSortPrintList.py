# a list of words using the split() method. The program should build a
# list of words. For each word on each line check to see if the word is
# already in the list and if not append it to the list. When the program
# completes, sort and print the resulting words in alphabetical order.
fname = input("Enter file name: ")
newlist = list()
fh = open(fname)
for linem in fh:
    splitted = linem.split()
    for w in splitted:
        if w not in newlist:
            newlist.append(w)
newlist.sort()
print(newlist)