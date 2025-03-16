'''
Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints. Sherlock must determine the number of square integers within that range.
'''
def squares(a, b):
    # Write your code here
    count = 0
    s = 0
    for i in range (int(math.sqrt(a)), int(math.sqrt(b))+1):
        s = i*i
        if (a <= s and s<= b):
            count+=1
    return count
