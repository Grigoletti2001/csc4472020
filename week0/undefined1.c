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

//clang has a different order of operations. 
//left to right. 
//c undefined behavior. clang warming. mutation of behavior. 
//decidable vs undeciable problems. problems the compiler can't solve. 
//mr. godbolt. compiler explorer. 
