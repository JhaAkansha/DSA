/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

    [4,5,6,7,0,1,4] if it was rotated 4 times.
    [0,1,4,4,5,6,7] if it was rotated 7 times.

Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.
*/
class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1, ip = nums[high], mid;
        while (low <= high) {
            mid = (low + high)/2;
            //System.out.println(nums[mid]);
            if (nums[mid] < ip) {
                ip = nums[mid];
                high = mid-1;
            }
            else if (nums[mid] > ip) {
                low = mid + 1;
            }
            else {
                ip = nums[high--];
            }
        }
        return ip;
    }
}
