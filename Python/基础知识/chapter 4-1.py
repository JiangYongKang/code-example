# -*- coding: utf-8 -*-
# 函数定义

# 定义 x 到 y 之间的累加函数
def sum1(x, y):
    number = 0
    while x <= y:
        number += x
        x = x + 1
    return number

# 函数调用
number = sum1(1, 100)
print number

# 定义默认参数
def sum2(x = 1, y = 100):
    number = 0
    while x <= y:
        number += x
        x = x + 1
    return number

# 函数调用
number = sum2(1, 1000)
print number

# 定义可变参数
def display(*args):
    for arg in args:
        print arg

# 函数调用
display(1, 2, 3, 4)
