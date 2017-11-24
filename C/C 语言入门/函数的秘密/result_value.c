#include <stdio.h>
/* Jone算出结果应该怎么写函数？ */
int joneResult(int x, int y, int z) {
    int sum = x + y + z;
    return sum / 3;
}
/* Jack没有算出结果只说了一句话是不是应该用无返回值函数？ */
void jackResult(int x, int y, int z) {
    printf("我算不出来\n");
}
int main() {
    int a, b, c;
    a = 10;
    b = 20;
    c = 30;
    //Jone的返回值类型是什么？
    int jR = joneResult(a, b, c);
    printf("Jone运算结果是：%d\n", jR);
    printf("Jack运算结果是：");
    jackResult(a, b, c);
    return 0;
}
