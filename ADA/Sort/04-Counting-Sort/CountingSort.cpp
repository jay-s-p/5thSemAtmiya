#include <iostream>
using namespace std;

void countSort(int arr[], int n)
{
    int output[n];
    int  max = 0, i;

    // find max
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > max)
            max = arr[i];
    }
    ++max; // because array start from 0

    // declare count array
    int c[max] = {};


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

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
}

main()
{
    int arr[] = {1, 4, 1, 2, 9, 5, 2};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Original array	: ";
    printArray(arr, n);

    countSort(arr, n);

    cout << "\n\nSorted array	: ";
    printArray(arr, n);
}