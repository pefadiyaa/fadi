def countChar(inputString) :
    Count = {}
    for char in inputString:
        if char in Count:
            Count[Char] += 1
        else:
            Count[char] = 1
    return Count
str2 = input("Enter a string: ")
result = countChar(str2)
print(result)
