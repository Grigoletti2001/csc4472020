#include <stdio.h>
int count = 0;
int f()
{
    count += 1;
    return count;
}
int main()
{
    int z = f() + f();
    printf("%d\n", z);
    z = (z += 1) + (z = z * z);
    printf("%d\n", z);
}