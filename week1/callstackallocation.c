
#include <stdio.h>
#include <stdlib.h>

void countdown (int n) {
	if (n <= 0) {
		printf ("done\n");
	} else {
		printf ("counting down\n");
		countdown (n - 1);
	}
}

int main () {
	countdown (5);
}
//note done = printf 
