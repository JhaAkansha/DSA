'''
Note the space between the apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described. 
'''

def timeInWords(h, m):
    # Write your code here
    res = ""
    minutes = " minutes"
    numInWords = ("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine")
    if (m == 00):
       res = (numInWords[h-1] + " o' clock")
    if (m == 15):
        res = ("quarter past " + numInWords[h-1])
    if (m == 45):
        res = ("quarter to " + numInWords[h])
    if (m == 30):
        res = "half past " + numInWords[h-1]
    elif (m < 30 and m!=15 and m!=0):
        if (m == 1):
            minutes = " minute"
        res = (numInWords[m-1] + minutes+ " past " + numInWords[h-1])
    elif (m > 30 and m != 45):
        if (60-m == 1):
            minutes = " minute"
        res = (numInWords[60-m-1] + minutes +" to " + numInWords[h])
    return res
