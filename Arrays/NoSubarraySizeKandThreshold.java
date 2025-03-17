/*
Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
*/
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
     int i = 0, count = 0;
     double  sum = 0;
     for (int a = 0; a < k-1; a++) {
        sum += arr[a];
     }
     for (int j = k-1; j < arr.length; j++) {
        sum += arr[j];
        if (sum/k >= threshold){
            count++;
        }
        sum -= arr[i];
        i++;
     }
     return count;
    }
}
