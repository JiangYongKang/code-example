# -*- coding: utf-8 -*-
# 闭包
import functools

# 内层函数引用了外层函数的变量，然后返回内层函数，这种即是闭包
def calc_sum(lst):
    def lazy_sum(lst):
        return sum(lst)
    return lazy_sum

# 函数作为返回值
def lazy_sum(*args):
    def sum():
        ax = 0
        for n in args:
            ax = ax + n
        return ax;
    return sum
ftn = lazy_sum(1, 2, 3, 4, 5)
print ftn # 方法名和所在内存地址
print ftn() # 计算的结果

# 匿名函数
L = list(map(lambda x: x * x, [1, 2, 3, 4, 5]))
print L
ftn = lambda x: x * x
print ftn # 同样会打印函数名和函数地址
print ftn(10) # 100
def build(x, y):
    return lambda x: x * x + y * y

# 偏函数
# 设定参数的默认值，减少调用的复杂度
int2 = functools.partial(int, base=2)
int2('100000')
