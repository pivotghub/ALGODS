# Write a program to read through the mbox-short.txt and figure out who has sent
# the greatest number of mail messages. The program looks for 'From ' lines and
# takes the second word of those lines as the person who sent the mail
# The program creates a Python dictionary that maps the sender's mail address to a ' \
# 'count of the number of times they appear in the file.
# After the dictionary is produced, the program reads through the dictionary using
# a maximum loop to find the most prolific committer.

md = dict()
name = input("Enter file:")
if len(name) < 1: name = "mbox-short.txt"
handle = open(name)
for linem in handle:
    if linem.startswith("From "):
        key = linem.split()[1]
        md[key] = md.get(key, 0) + 1
# count calculation
bigcnt = None
bigwd = None

for wd, cnt in md.items():
    if bigcnt is None or cnt > bigcnt:
        bigcnt = cnt
        bigwd = wd
print(bigwd, bigcnt)


