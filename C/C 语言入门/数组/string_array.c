#include <stdio.h>
/* 定义say函数 */
void say (char string[]) {
    printf("%s\n", string);
}

int main() {
    //定义字符串数组
    char string[] = "我在慕课网上学习IT技能！";
    say(string);           //调用say函数输出字符串
    return 0;
}
