#include <stdio.h>
#include <conio.h>

int partition(int arr[], int first, int last)
{
    int pivot = arr[last];
    int i = (first - 1), j, temp;

    for (j = first; j <= last - 1; j++)
    {
        if (arr[j] < pivot)
        {
            ++i;
            // swap
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    ++i;
    temp = arr[i];
    arr[i] = arr[last];
    arr[last] = temp;

    return i;
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);

        quickSort(arr, low, (pi - 1));
        quickSort(arr, pi + 1, high);
    }
}

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
}

void main()
{
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Original array	: ");
    printArray(arr, n);

    quickSort(arr, 0, n - 1);

    printf("\n\nSorted array	: ");
    printArray(arr, n);
}