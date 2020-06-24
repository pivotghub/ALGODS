# calculation for egex_sum_42.txt
import re

ofile = open('regex_sum_699035.txt')
newl = list()
sum = 0
for aline in ofile:
    aline = aline.strip()
    stuff = re.findall('[0-9]+', aline)
    for e in stuff:
        sum = sum + float(e)
print(sum)


#
newline = '<p>Please click <a href="http://www.dr-chuck.com">here</a></p>'
print(re.findall('href="(.+)"', newline))

