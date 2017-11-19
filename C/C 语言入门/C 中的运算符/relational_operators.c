#include <stdio.h>
int main()
{
    int x = 5;
    int y = 5;
    int z = 10;
    printf("x 是否大于 y: %d\n", x > y);          // x 是否大于 y
    printf("y 是否大于等于 x: %d\n", x >= y);      // y 是否大于等于 x
    printf("y 是否小于 z: %d\n", y < z);          // y 是否小于 z
    printf("z 是否小于等于 x: %d\n", z <= x);      // z 是否小于等于 x
    printf("z 是否等于 x + y: %d\n", z == x + y); // z 是否等于 x + y
    return 0;
}
