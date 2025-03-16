/*
You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
Return the array after sorting it.
*/
class Solution {
    public int[] sortByBits(int[] arr) {
        //ok so for this enginner rule is applied where each number is updated by a the number itself + number of bits in number*(10001) and then we will sort it and then we will take the modulo.
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]+=Integer.bitCount(arr[i])*10001;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%10001;
        }
        return arr;
    }
}
