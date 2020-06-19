text = "X-DSPAM-Confidence:    0.8475"
final = float(text[text.find(':')+1:len(text)].lstrip())
print(final)

