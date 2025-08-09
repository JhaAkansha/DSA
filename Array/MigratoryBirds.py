'''
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
'''
def migratoryBirds(arr):
    # Write your code here
    frequencyDict = {}
    for i in arr:
        if i in frequencyDict:
            frequencyDict[i] = frequencyDict[i]+1
        else:
            frequencyDict[i] = 1
    maxFreq = max(frequencyDict.values())
    minKey = sys.maxsize
    for key, value in frequencyDict.items():
        if (value == maxFreq and key < minKey):
            minKey = key
            fin_max = key
    return fin_max
