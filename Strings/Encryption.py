'''
n English text needs to be encrypted using the following encryption scheme.
First, the spaces are removed from the text. Let be the length of this text.
Then, characters are written into a grid, whose rows and columns have the following constraints:
 --- Just look up this problem on hackerrank ---
 '''
def encryption(s):
    # Write your code here
    l = len(s)
    r = int(math.sqrt(l))
    if (r*r == l):
        c = r
    else:
        c = r+1
    i = 0
    j = 0
    res = ""
    print("l = ", l)
    print("r = ",r)
    print("c = ", c)
    for i in range (0,c):
        j = 0
        while ((i+j) < l):
            print("i = ", i)
            print("j = ", j)
            print(s[i+j])
            res = res + s[i+j]
            j+=c
        res = res + " "
    return res
