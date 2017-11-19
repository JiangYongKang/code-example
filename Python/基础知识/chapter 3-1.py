# -*- coding: utf-8 -*-
# 条件判断和循环

# 条件判断
# if 后接表达式，代码块从 ':' 后面开始执行，代码块假如有多行，必须统一缩紧
age = 18
if age > 0 and age < 18:
    print '小屁孩'
elif age >= 18 and age < 60:
    print '成年人'
else:
    print '老年人'

# for 循环
# for 变量 in 集合: (冒号别忘记了)
L = ['Adam', 'Lisa', 'Bart'];
for name in L:
    print name

# 索引循环
for index, name in enumerate(L):
    print 'L[', index ,']: ', name

# 迭代 dict
D = { 'Adam': 95, 'Lisa': 85, 'Bart': 59 }
for value in D.values():
    print value

for value in D.itervalues():
    print value

for key, value in D.items():
    print key, ': ', value

# while 循环
x = 1;
c = 0;
while x <= 100:
    c += x
    x = x + 1
print c
