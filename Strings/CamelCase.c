/*
There is a sequence of words in CamelCase as a string of letters,

, having the following properties:

    It is a concatenation of one or more words consisting of English letters.
    All letters in the first word are lowercase.
    For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
*/
int camelcase(char* s) {
    int count = 1;
    int len = strlen(s);
    int i;
    for (i=1; i<len; i++){
        if((s[i]>= 'A') && (s[i]<= 'Z')){
            count+=1;
        }
    }
    return count;
}
