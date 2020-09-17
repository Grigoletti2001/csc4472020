#include <stdio.h>
int f (int x) {
	int y;
	if (x) y=1; else y=2;
	return y;
}
int main(void) { printf ("%d\n", f(5)); return 0; } 
//compiles to 1. y= 1 .
