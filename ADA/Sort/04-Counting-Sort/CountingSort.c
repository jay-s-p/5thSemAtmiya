#include <stdio.h>
#include <stdlib.h>

void countSort(int arr[], int n)
{
	// declare count and output array
	int *output = (int *)malloc(sizeof(int) * n), *c;
	int i, max = 0;

	// find max
	for (i = 0; i < n; i++)
	{
		if (arr[i] > max)
			max = arr[i];
	}
	++max; // because array start from 0

	// count array
	c = (int *)malloc(sizeof(int) * (max));

	// set all count array's value to 0
	for (i = 0; i < max; i++)
		c[i] = 0;

	// perform counting operation
	for (i = 0; i < n; i++)
	{
		++c[arr[i]];
	}

	// addition in count array
	for (i = 1; i < max; i++)
	{
		c[i] += c[i - 1];
	}

	// main logic
	for (i = n - 1; i >= 0; i--)
	{
		output[c[arr[i]] - 1] = arr[i];
		--c[arr[i]];
	}

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
	int arr[] = {1, 4, 1, 2, 9, 5, 2};
	int n = sizeof(arr) / sizeof(arr[0]);
	printf("Original array	: ");
	printArray(arr, n);

	countSort(arr, n);

	printf("\n\nSorted array	: ");
	printArray(arr, n);
}