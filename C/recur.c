#include <stdio.h>
void up_and_down(int n);
int main(void){
	up_and_down(1);	
	return 0;
}
void up_and_down(int n){
	printf("Leave %d:n localion %p\n", n, &n);
	if(n < 4){
		up_and_down(++n);
	}
	printf("Leave %d:n location %p\n", n, &n);
}
