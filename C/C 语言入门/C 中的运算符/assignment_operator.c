#include <stdio.h>
int main()
{
    int x = 10;
    int y = 10;
    x = x * 2; // 使用简单赋值语句实现 x 乘以 2
    y *= 2; // 使用复合赋值语句实现 y 乘以 2
    printf("x = %d\n", x);
    printf("y = %d\n", y);
    return 0;
}
