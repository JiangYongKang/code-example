# -*- coding: utf-8 -*-
# 运算

# 整数和浮点数直接四则运算
print 123 + 321
print 321 - 123
print 123 * 321
print 321 / 123

# 括号提升优先级
print (123 + 123) * 2

# 整数运算结果依旧是整数
print 123 + 123

# 浮点数运算结果依旧是浮点数
print 123.00 + 123.00

# 整数和浮点数混合运算结果依旧是浮点数
print 123 + 123.00

# 与运算：两个布尔都为 True ，计算结果才会为 True
print True and True
print True and False
print False and True
print False and False

# 或运算：只要有一个为 True ， 计算结果即为 True
print True or True
print True or False
print False or True
print False or False

# 非运算
not True
not False
