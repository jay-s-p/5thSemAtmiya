#include <stdio.h>

long exponential(int x, int n) // x^n
{
    if (n == 0)
        return 1;
    if (x == 0)
        return 0;
    return x * exponential(x, n - 1);
}

void main()
{
    int a = 0, b = 8;
    long ans = exponential(a, b);

    printf("%d ^ %d = %ld", a, b, ans);
}

// 2 8 256
// 2 7 128
// 2 6 64
// 2 5 32
// 2 4 16
// 2 3 8
// 2 2 4
// 2 1 2
// 2 0 1