#include <stdio.h>
int main()
{

    double money = 12; // 定义小编兜里的钱
    double cost = 11.5; // 定义打车回家的费用
    printf("小编能不能打车回家呢：");
    printf("%c", money >= cost ? 'y' : 'n'); // 输出 y 小编就打车回家了，输出 n 小编就不能打车回家
    return 0;
}
