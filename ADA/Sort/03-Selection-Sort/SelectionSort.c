#include <stdio.h>

void selectionSort(int arr[], int n)
{
	int i, j, min, temp;
	for (i = 0; i < n - 1; i++)
	{
		min = i;
		for (j = i + 1; j < n; j++)
		{
			if (arr[j] < arr[min])
			{
				min = j;
			}
		}
		temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	}
}

void printArray(int arr[], int n)
{
	for (int i = 0; i < n; i++)
		printf("%d ", arr[i]);
}

void main()
{
	int arr[] = {2, 5, 4, 1, 3};
	int n = sizeof(arr) / sizeof(arr[0]);
	printf("Original array	: ");
	printArray(arr, n);

	selectionSort(arr, n);

	printf("\n\nSorted array	: ");
	printArray(arr, n);
}