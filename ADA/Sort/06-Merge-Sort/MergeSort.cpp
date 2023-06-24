#include <iostream>
using namespace std;

void merge(int arr[], int start, int mid, int end)
{
    int merged[end - start + 1];

    int leftPointer = start;
    int rightPointer = mid + 1;
    int x = 0;

    while (leftPointer <= mid && rightPointer <= end)
    {
        if (arr[leftPointer] <= arr[rightPointer])
        {
            merged[x] = arr[leftPointer];
            x++;
            leftPointer++;
        }
        else
        {
            merged[x] = arr[rightPointer];
            x++;
            rightPointer++;
        }
    }

    while (leftPointer <= mid)
    {
        merged[x] = arr[leftPointer];
        x++;
        leftPointer++;
    }

    while (rightPointer <= end)
    {
        merged[x] = arr[rightPointer];
        x++;
        rightPointer++;
    }

    for (int i = start, j = 0; j < end - start + 1; i++, j++)
    {
        arr[i] = merged[j];
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

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
}

main()
{
    int arr[] = {5, 4, 3, 2, 1};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Original array	: ";
    printArray(arr, n);

    mergeSort(arr, 0, n - 1);

    cout << "\n\nSorted array	: ";
    printArray(arr, n);
}