#include <stdio.h>
int x = 77;
void fn1() {
    printf("fn1(): x=%d\n", x);
}
int main() {
    int x = 10;
    if(x > 0) {
        x = 100;
        x /= 2;
        printf("if语句内, x=%d\n", x);
    }
    x = 10;
    printf("main方法内, x=%d\n", x);
    fn1();
    return 0;
}
