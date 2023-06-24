#include <stdio.h>

void sort(int arr[], int n)
{
	int i, j, temp;
	for (i = 0; i < n - 1; i++)
	{
		for (j = 0; j < n - 1; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
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

	sort(arr, n);

	printf("\n\nSorted array	: ");
	printArray(arr, n);
}