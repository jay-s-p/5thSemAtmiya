#include <stdio.h>
#include <stdlib.h>

void merge(int arr[], int start, int mid, int end)
{

    int mergerd[end - start + 1];

    int leftPointer = start;
    int rightPointer = mid + 1;
    int x = 0;

    while (leftPointer <= mid && rightPointer <= end)
    {
        if (arr[leftPointer] <= arr[rightPointer])
        {
            mergerd[x] = arr[leftPointer];
            x++;
            leftPointer++;
        }
        else
        {
            mergerd[x] = arr[rightPointer];
            x++;
            rightPointer++;
        }
    }

    while (leftPointer <= mid)
    {
        mergerd[x] = arr[leftPointer];
        x++;
        leftPointer++;
    }
    while (rightPointer <= end)
    {
        mergerd[x] = arr[rightPointer];
        x++;
        rightPointer++;
    }
    int i = start, // index for arr
        j = 0;     // index for mergerd

    while (j < end - start + 1)
    {
        arr[i++] = mergerd[j++];
    }
}

void mergeSort(int arr[], int start, int end)
{
    if (start >= end)
        return;

    int mid = start + (end - start) / 2;

    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);

    merge(arr, start, mid, end);
}

void printArray(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

void main()
{
    int arr[] = {2, 5, 4, 1, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Original array	: ");
    printArray(arr, n);

    mergeSort(arr, 0, n - 1);

    printf("\n\nSorted array	: ");
    printArray(arr, n);
}