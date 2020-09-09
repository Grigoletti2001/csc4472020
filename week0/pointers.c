#include <stdio.h>
#include <stdlib.h>

void update (int* p) {
	
	*p =10; 
	
}

//this feels like java's global var. 

int main() {
	int x = 5; 
	update (&x); 
	printf ("%d\n", x);
}