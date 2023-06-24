#include <stdio.h>

struct pair
{
    int min, max;
};

struct pair minMax(int arr[], int low, int high)
{
    struct pair min_max, min_maxLeft, min_maxRight;
    int mid;

    // for one element
    if (low == high)
    {
        min_max.max = arr[low];
        min_max.min = arr[low];
        return min_max;
    }

    // for two elements
    if (low + 1 == high)
    {
        if (arr[low] > arr[high])
        {
            min_max.min = arr[high];
            min_max.max = arr[low];
        }
        else
        {
            min_max.min = arr[low];
            min_max.max = arr[high];
        }
        return min_max;
    }

    // for more than two elements
    mid = low + (high - low) / 2;
    
    min_maxRight = minMax(arr, low, mid);
    min_maxLeft = minMax(arr, mid + 1, high);

    min_max.min = (min_maxLeft.min < min_maxRight.min) ? min_maxLeft.min : min_maxRight.min;

    min_max.max = (min_maxLeft.max > min_maxRight.max) ? min_maxLeft.max : min_maxRight.max;

    return min_max;
}

void main()
{
    int arr[] = {2, 5, 4, 1, 3, 7, 6, 9, 8};
    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    struct pair min_max = minMax(arr, 0, n - 1);

    printf("\n\nMinimum value is %d", min_max.min);
    printf("\n\nMaximum value is %d", min_max.max);
}