#include <stdio.h>
/* 定义获取单词数量的函数 */
int getWordNumber(int n) {
    if (n > 0) {
        return getWordNumber(n-1)+n;
    }
    return 0;
}

int main() {
    int num = getWordNumber(10);     //获取会了的单词数量
    printf("小明第10天记了:%d个单词。\n", num);
    return 0;
}
