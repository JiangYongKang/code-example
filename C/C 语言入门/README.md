# C 语言入门
### 前言
简介：本 C 语言教程从以下几个模块来贯穿主要知识点：初始 C 程序、数据类型、运算符、语句结构、函数和数组。每个阶段都配有练习题同时提供在线编程任务。希望通过本教程帮助 C 语言入门学习者迅速掌握程序逻辑并开始 C 语言编程。
来源：[http://www.imooc.com/learn/249](http://www.imooc.com/learn/249)
### 初始 C 程序
程序结构
```c
#include <stdio.h>
int main() {
    printf("Hello world!")
    return 0;
}
```
注释
```c
// 这是单行注释
/*
 * 这是多行注释（不可以嵌套使用）
 */
```
### C 中的数据类型
声明变量
```c
int number;
```
声明多个变量
```c
int x, y, z;
```
声明的变量并且赋值
```c
int x, y = 0, z = -1;
```
格式化输出语句
```c
int x = 100;
float y = 200.00;
char c = 'c';
printf("%d\n", x);
printf("%f\n", y);
printf("%c\n", z);
```
声明常量
```c
#include <stdio.h>
#define NUMBER 100
int main() {
    printf("NUMBER = %d\n", NUMBER);
    return 0;
}
```
自动类型转换
```c
int x = 0;
char y = 'c';
x = y
```
强制类型转换
```c
double number = 100.100;
int x = (int)number;
```
### C 中的运算符
算术运算符
```c
int x = 100, y = 200;
printf("x + y = %d\n", x + y);
printf("x - y = %d\n", x - y);
printf("x * y = %d\n", x * y);
printf("x / y = %d\n", x / y);
printf("x %% y = %d\n", x % y);
```
自增与自减运算符
```c
int x = 100, y = 200;
printf("x++ = %d\n", x++);
printf("++x = %d\n", ++x);
printf("y++ = %d\n", y++);
printf("++y = %d\n", ++y);
```
赋值运算符
```c
int x = 100;
x = x + 100;
x += 100;
x -= 100;
x *= 100;
x /= 100;
x %= 100;
```
逻辑运算符
```c
int x = 0, y = 1, z;
z = x && y;
z = x || y;
z = !x;
```
三目运算符
```c
int x = 0, y = 100, z = 0;
z = x > 0 ? x : y;
```
### C 程序结构语句
分支结构
```c
int x = 100;
if (x == 100) {
    printf("满分\n");
} else if (x >= 80) {
    printf("优秀\n");
} else if (x >= 60) {
    printf("及格");
} else {
    printf("不及格\n");
}
```
循环结构
```c
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}

int i = 0;
int sum = 0;
do {
    sum += i;
    i++;
} while(i <= 100);

int i = 0;
int sum = 0;
while (i <= 100) {
  sum += i;
  i++;
}
```
