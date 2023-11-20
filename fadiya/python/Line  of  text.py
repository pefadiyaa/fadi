s=input("Enter a sentence:");
print(s)
wordsList=s.split()
print(wordsList)
for i in wordsList:
    print(f"{i} Occurs {wordsList.count(i)} times")
    
