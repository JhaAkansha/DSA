/*
Given an integer n, return the least number of perfect square numbers that sum to n.
A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
*/
class Solution {
    public int numSquares(int n) {
	int sqrt = (int) Math.sqrt(n);
	if (sqrt * sqrt == n) // Perfect square
		return 1;
	while (n % 4 == 0) // 4^a (8b + 7)
		n = n / 4;
	if (n % 8 == 7)
		return 4;
	for (int i = 1; i * i <= n; i++) { // Sum of two perfect squares
		int square = i * i;
		int base = (int) Math.sqrt(n - square);
		if (base * base == n - square)
			return 2;
	}
	return 3;
	}
}
