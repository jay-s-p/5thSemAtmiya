#include <stdio.h>

long exponential(int x, int n) // x^n
{
    if (n == 0)
        return 1;
    long r = exponential(x, n / 2);
    if (n % 2 == 0)
        return r * r;
    else
        return r * r * x;
}

void main()
{
    int a = 2, b = 8;
    long ans = exponential(a, b);

    printf("%d ^ %d = %ld", a, b, ans);
}