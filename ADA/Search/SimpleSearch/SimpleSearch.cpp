#include <iostream>
using namespace std;

int search(int arr[], int n, int value)
{
	for (int i = 0; i < n; i++)
		if (arr[i] == value)
			return i;

	return -1;
}

void main()
{
	int arr[] = {2, 5, 4, 1, 3};
	int n = sizeof(arr) / sizeof(arr[0]);
	int x, pos;

	for (int i = 0; i < n; i++)
		cout << arr[i] << " ";

	cout << "\nEnter value to search : ";
	cin >> x;

	pos = search(arr, n, x);

	if (pos == -1)
		printf("\n%d is not found!", x);
	else
		printf("\n%d found at position %d", x, pos + 1);
}