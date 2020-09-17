#include <stdio.h>
#include <stdlib.h>

int foo (int n) {
  int result = 2 * n;
  return result;
}

int main () {
  int x = foo (5);
  int y = foo (7);
  printf ("%d\n", x);
  printf ("%d\n", y);
}

//10
//14
