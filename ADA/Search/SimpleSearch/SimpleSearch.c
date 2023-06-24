#include <stdio.h>

int search(int arr[], int n, int x)
{
	for (int i = 0; i < n; i++)
		if (arr[i] == x)
			return i;

	return -1;
}

void main()
{
	int arr[] = {2, 5, 4, 1, 3};
	int n = sizeof(arr) / sizeof(arr[0]);
	int x, pos;

	for (int i = 0; i < n; i++)
		printf("%d ", arr[i]);

	printf("\nEnter value to search : ");
	scanf("%d", &x);

	pos = search(arr, n, x);

	if (pos > -1)
		printf("\n%d found at position %d", x, pos + 1);
	else
		printf("\n%d is not found!", x);
}