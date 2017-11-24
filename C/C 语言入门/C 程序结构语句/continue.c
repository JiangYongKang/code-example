#include <stdio.h>
int main() {
    int i, sum;
    for(i = 1, sum = 0; i <= 20; i++) {
        if(i % 3 == 0) {
            continue;
        }
        sum += i;
    }
    printf("sum = %d\n", sum);
    return 0;
}
