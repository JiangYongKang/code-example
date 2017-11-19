#include <stdio.h>
int main()
{
    int sum, num;
    sum = 0;
    for(num = 0; num <= 10; num++)
    {
        sum += num;
    }
    printf("10以内数的和为：%d", sum);
    return 0;
}
