#include <stdio.h>

long exponential(int x, int n) // x^n
{
    int power = 1;
    for (int i = 0; i < n; i++)
        power *= x;
    return power;
}

void main()
{
    int a = 2, b = 8;
    long ans = exponential(a, b);

    printf("%d ^ %d = %ld", a, b, ans);
}