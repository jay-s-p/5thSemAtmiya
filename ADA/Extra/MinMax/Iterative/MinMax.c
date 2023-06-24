#include <stdio.h>

struct pair
{
    int min, max;
};

struct pair minMax(int arr[], int n)
{
    struct pair min_max;
    min_max.min = min_max.max = arr[0];
    for (int i = 1; i < n; i++)
    {
        if(arr[i] > min_max.max)
            min_max.max = arr[i];
        else if(arr[i] < min_max.min)
            min_max.min = arr[i];
    }
    return min_max;
}

void main()
{
    int arr[] = {2, 5, 4, 1, 3, 7, 6, 9, 8};
    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    struct pair min_max = minMax(arr, n);

    printf("\n\nMinimum value is %d",min_max.min);
    printf("\n\nMaximum value is %d",min_max.max);
}