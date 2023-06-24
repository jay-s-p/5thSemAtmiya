#include <iostream>
using namespace std;

void sort(int arr[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                arr[j] = arr[j] + arr[j + 1];
                arr[j + 1] = arr[j] - arr[j + 1];
                arr[j] = arr[j] - arr[j + 1];
            }
        }
    }
}

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
}

main()
{
    int arr[] = {2, 5, 4, 1, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Original array	: ";
    printArray(arr, n);

    sort(arr, n);

    cout << "\n\nSorted array	: ";
    printArray(arr, n);
}