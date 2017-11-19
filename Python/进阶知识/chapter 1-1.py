# -*- coding: utf-8 -*-
# 函数式编程

# 把函数作为参数
def add(x, y, f):
    return f(x) + f(y) # 实际上执行的代码是 abs(x) + abs(y)
print add(-1, 2, abs);

# map 函数
# map 函数接受一个函数 f 和一个 list
# 并把 list 的每个元素都用函数 f 执行一遍后组成新的 list 返回
def f(x):
    return x + x
print map(f, [1, 2, 3, 4, 5])

# reduce 函数
# reduce 函数用来将 list 中的元素依次计算
# 并且可以设定初值
def f(x, y):
    return x * y
print reduce(f, [1, 2, 3, 4, 5]) # 不设置初值
print reduce(f, [1, 2, 3, 4, 5], 100) # 设置初值为 100

# filter 函数
# 接受一个函数和一个 list 根据接受的函数来过滤 list，返回过滤后的 list
def is_odd(x):
    return x % 2 == 1
L = filter(is_odd, [1, 2, 3, 4, 5])
print L
