import urllib.request as ur
import json

json_url = input('Please enter url: ')
print('url', json_url)
data = ur.urlopen(json_url).read().decode()

info = json.loads(data)
sum = 0
for item in info["comments"]:
    sum = sum + int(item["count"])
print(sum)