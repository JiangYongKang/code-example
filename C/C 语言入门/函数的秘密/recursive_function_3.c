#include <stdio.h>
int sum_age (int i, int age) {
    if (i < 5) {
        return sum_age(i + 1, age + 2);
    }
    return age;
}

int main () {
    printf("第5个人的年龄是%d岁", sum_age(1, 10));
    return 0;
}
