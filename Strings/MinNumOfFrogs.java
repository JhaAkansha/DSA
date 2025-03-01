/*
You are given the string croakOfFrogs, which represents a combination of the string "croak" from different frogs, that is, multiple frogs can croak at the same time, so multiple "croak" are mixed.

Return the minimum number of different frogs to finish all the croaks in the given string.

A valid "croak" means a frog is printing five letters 'c', 'r', 'o', 'a', and 'k' sequentially. The frogs have to print all five letters to finish a croak. If the given string is not a combination of a valid "croak" return -1.
*/
class Solution {
        public int minNumberOfFrogs(String croak) {
        int c = 0, r = 0, o = 0, a = 0, k = 0, in_use = 0, answer = 0;
        for (char d:croak.toCharArray()) {
            switch(d) {
                case 'c':
                    c++;
                    in_use++;
                    break;
                case 'r':
                    r++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'k':
                    k++;
                    in_use--;
                    break;
            }
			answer = Math.max(answer, in_use);
            if ((c < r) || (r < o) || (o < a) || (a < k)) 
                return -1;
        }
        if (in_use == 0 && c == r && c == o && c == a && c == k)
            return answer;
			
        return -1;
    }
}
