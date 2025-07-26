/* 
Calculate and print the factorial of a given integer. 
*/

char* readline();
char* ltrim(char*);
char* rtrim(char*);

int parse_int(char*);

/*
 * Complete the 'extraLongFactorials' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

int multiply(int i, int res[], int res_size)
{
    int carry = 0;
    for (int j=0; j<res_size; j++)
    {
        int prod = res[j] * i + carry;
        res[j] = prod % 10; 
        carry  = prod/10;   
    }
    while (carry)
    {
        res[res_size] = carry%10;
        carry = carry/10;
        res_size++;
    }
    return res_size;
}
void extraLongFactorials(int n) {
    int res[500];
    res[0] = 1;
    int res_size = 1;
    for ( int i = 2; i <= n; i++)
    {
        res_size = multiply(i, res, res_size);
    }
    for (int i=res_size-1; i>=0; i--)
    {
        printf("%d",res[i]);
    }
}


int main()
{
    int n = parse_int(ltrim(rtrim(readline())));

    extraLongFactorials(n);

    return 0;
}