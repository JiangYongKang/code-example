#include <stdio.h>
int main()
{
    int sum = 0;
    int i = 1;
    int flag = 1;

    while(i <= 100)
    {
        sum = (i % 2 == 0 ? sum - i : sum + i);
        i++;
    }

    i = 1;
    sum = 0;

    do {
        sum = (i % 2 == 0 ? sum - i : sum + i);
        i++;

    } while (i <= 100);

    i = 1;
    sum = 0;

    for(i = 1; i <= 100; i++)
    {
        sum = (i % 2 == 0 ? sum - i : sum + i);
    }
    printf("sum=%d\n", sum);

    return 0;
}
