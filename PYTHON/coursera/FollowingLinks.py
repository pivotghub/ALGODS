import urllib.error, urllib.request, urllib.parse
from bs4 import BeautifulSoup

a = int(input("Position: ")) - 1
b = int(input("Times: "))
url = input("Enter URL: ")
for c in range(b):
    x = urllib.request.urlopen(url).read()
    y = BeautifulSoup(x, 'html.parser')
    anchor = y('a')
    url = anchor[a].get('href', None)
    e = anchor[a].contents[0]
print(e)
