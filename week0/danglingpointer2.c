#include <stdio.h>
#include <stdlib.h>

int *foo(int n)
{
    int result = 2 * n;
    return &result;
}

int main()
{
    int *p = foo(5);
    int *q = foo(7);
    printf("%p %d\n", p, *p);
    printf("%p %d\n", q, *q);
}