/*
To prove Insertion Sort is correct, you will then demonstrate it for the three stages:

    Initialization - The subarray starts with the first element of the array, and it is (obviously) sorted to begin with.

    Maintenance - Each iteration of the loop expands the subarray, but keeps the sorted property. An element 

gets inserted into the array only when it is greater than the element to its left. Since the elements to its left have already been sorted, it means

is greater than all the elements to its left, so the array remains sorted. (In Insertion Sort 2 we saw this by printing the array each time an element was properly inserted.)

Termination - The code will terminate after
has reached the last element in the array, which means the sorted subarray has expanded to encompass the entire array. The array is now fully sorted.
  */

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <assert.h>



void insertionSort(int N, int arr[]) {
    int i,j;
    int value;
    for(i=1;i<N;i++)
    {
        value=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>value)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=value;
    }
    for(j=0;j<N;j++)
    {
        printf("%d",arr[j]);
        printf(" ");
    }
}

int main(void) {

    int N;
    scanf("%d", &N);
    int arr[N], i;
    for(i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    insertionSort(N, arr);

    return 0;
}
