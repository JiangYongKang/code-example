#include <stdio.h>
int getGirth(int a, int b, int c) {
    if((a + b) <= c || (a + c) <=b || (b + c) <=a ) {
        printf("不构成三角形\n");
        return 0;
    } else {
      int cirf = a + b + c;
      return cirf;
    }
}

int main() {
    int a, b, c;
    a = 3;
    b = 4;
    c = 5;
    printf("三角形的周长是：%d\n", getGirth(a, b, c));
    return 0;
}
