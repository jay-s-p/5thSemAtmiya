#include <iostream>
using namespace std;

int binarySearch(int arr[], int low, int high, int value)
{
    while (low <= high)
    {
        int mid = low + (high - low) / 2;

        if (arr[mid] == value)
        {
            return mid;
        }
        else if (arr[mid] < value)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
    return -1;
}

main()
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x, pos;

    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";

    cout << "\nEnter value for search : ";
    cin >> x;

    int pos = binarySearch(arr, 0, n - 1, x);
    if (pos == -1)
		printf("\n%d is not found!", x);
    else
		printf("\n%d found at position %d", x, pos + 1);
}