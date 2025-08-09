/*
 Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.
 You must write an algorithm that runs in linear time and uses linear extra space.
 */

 import java.lang.Math;
class Solution {
int partition(int arr[], int left, int right){
    int pivot = arr[(left+right)/2];
    int temp;
    while(left <= right){
        while(arr[left] < pivot){
            left ++;
        }
        while (arr[right] > pivot){
            right --;
        }
        if (left <= right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    return left;
}

void quicksort(int arr[], int left, int right){
    int index = partition(arr, left, right);
    if (left < index - 1){
        quicksort(arr, left, index - 1);
    }
    if (index < right){
        quicksort(arr, index, right);
    }
}

    public int maximumGap(int[] nums) {
        int numsSize = nums.length;
        if (numsSize == 1){
        return 0;
        }  
        quicksort(nums, 0, numsSize - 1);

    int diff[] = new int[numsSize - 1];
    int n = 0;
    for (int i = 0; i < numsSize - 1; i++){
        diff[n] = Math.abs(nums[i] - nums[i+1]);
        n++;
    }
    int max = diff[0];
    for (int j = 0; j < numsSize - 1; j++){
        if (diff[j] > max){
            max = diff[j];
        }
    }
    return max;
    }
}