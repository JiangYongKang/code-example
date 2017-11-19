#include <stdio.h>
int main()
{
    // 数据类型的自动转换
    char c = 'a';
    int n = c; //将c赋值给n
    float f = n; //将c赋值给f
    double d = c; //将c赋值给d
    printf("%d\n", n);
    printf("%f\n", f);
    printf("%lf\n", d);
    return 0;
}
