#include <stdio.h>
/* 考虑一下哪个输出该用无参函数哪个输出该用有参函数呢？ */

void a() {
    printf("小明在慕课网上学习");
}

void b(x) {
    printf("小明在慕课网上学习了%d们课程", x);
}

int main() {
    a();
    b(10);
    return 0;
}
