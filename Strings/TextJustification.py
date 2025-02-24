'''
Given an array of strings words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
For the last line of text, it should be left-justified, and no extra space is inserted between words.
'''
class Solution:   
    def fullJustify(self,words, maxWidth):
        res = []
        current_words = []
        current_length = 0
        for w in words:
            if current_words and current_length + len(w) + len(current_words) > maxWidth:
                total_spaces = maxWidth - current_length
                gaps = len(current_words) - 1
                if gaps == 0:
                    res.append(current_words[0] + ' ' * (maxWidth - len(current_words[0])))
                else:
                    space_per_gap, extra = divmod(total_spaces, gaps)
                    line = ""
                    for i in range(gaps):
                        line += current_words[i]
                        line += ' ' * space_per_gap
                        if i < extra:
                            line += ' '
                    line += current_words[-1]
                    res.append(line)
                current_words = []
                current_length = 0
            current_words.append(w)
            current_length += len(w)
        if current_words:
            line = ' '.join(current_words)
            line += ' ' * (maxWidth - len(line))
            res.append(line)
        return res
