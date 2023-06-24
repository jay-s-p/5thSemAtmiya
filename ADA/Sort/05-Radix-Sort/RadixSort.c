#include <stdio.h>
#include <stdlib.h>

void countSort(int[], int, int);

void radixSort(int arr[], int n)
{
    int i, max = 0, temp = 0;
    for (i = 0; i < n; i++)
        if (arr[i] > max)
            max = arr[i];

    for (int div = 1; max / div > 0; div *= 10)
    {
        countSort(arr, n, div);
    }
}

void countSort(int arr[], int n, int div)
{
    // declare count and output array
    int c[10] = {}, *output = (int *)malloc(sizeof(int) * n);
    int i;

    // perform counting operation in count array
    for (i = 0; i < n; i++)
    {
        ++c[(arr[i] / div) % 10];
    }

    // addition with previous elements
    for (i = 0; i < 9; i++)
    {
        c[i + 1] += c[i];
    }

    // counting sort logic
    for (i = n - 1; i >= 0; i--)
    {
        output[c[(arr[i] / div) % 10] - 1] = arr[i];
        --c[(arr[i] / div) % 10];
    }

    // copy output array to main array
    for (i = 0; i < n; i++)
        arr[i] = output[i];
}

void printArray(int *arr, int n)
{
	for (int i = 0; i < n; i++)
		printf("%d ", arr[i]);
}

void main()
{
    int arr[] = {902, 802, 45, 66, 24, 75, 170};
	int n = sizeof(arr) / sizeof(arr[0]);
	printf("Original array	: ");
	printArray(arr, n);

	radixSort(arr, n);

	printf("\n\nSorted array	: ");
	printArray(arr, n);
}