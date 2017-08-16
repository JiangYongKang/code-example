#!/usr/bin/ruby
# -*- coding: utf-8 -*-

# while 语句
# 当 conditional 为真时，执行 code。
# 语法中 do 或: 可以省略不写。但若要在一行内写出 while 式，则必须以 do 或: 隔开条件式或程式区块。
i = 0
while i < 5 do
    puts "第 #{i + 1} 次循环"
    i += 1
end

# while 修饰符
# 当 conditional 为真时，执行 code。
# 如果 while 修饰符跟在一个没有 rescue 或 ensure 子句的 begin 语句后面，code 会在 conditional 判断之前执行一次。
i = 0
begin
    puts "第 #{i + 1} 次循环"
    i += 1
end while i < 5

# until 语句
# 当 conditional 为假时，执行 code。
# 语法中 do 可以省略不写。但若要在一行内写出 until 式，则必须以 do 隔开条件式或程式区块。
i = 0
until i >= 5 do
    puts "第 #{i + 1} 次循环"
    i += 1
end

# until 修饰符
# 当 conditional 为 false 时，执行 code。
# 如果 until 修饰符跟在一个没有 rescue 或 ensure 子句的 begin 语句后面，code 会在 conditional 判断之前执行一次。
i = 0
begin
    puts "第 #{i + 1} 次循环"
    i += 1
end until i >= 5

# for..in 语句
# 先计算表达式得到一个对象，然后针对 expression 中的每个元素分别执行一次 code。
for i in 0..4
    puts "第 #{i + 1} 次循环"
end

# .each do 语句
# 语法中 do 可以省略不写。但若要在一行内写出 for 式，则必须以 do 隔开条件式或程式区块。
(0..4).each do |i|
    puts "局部变量的值为 #{i}"
end

# break 语句
# 终止最内部的循环。如果在块内调用，则终止相关块的方法（方法返回 nil）。
for i in 0..4
    if i == 2 then
        puts "当前 i 的值: #{i}"
        break
    end
end

# next 语句
# 跳到循环的下一个迭代。如果在块内调用，则终止块的执行（yield 表达式返回 nil）。
for i in 0..4
    if i == 2 then
        next
    end
    puts "当前 i 的值: #{i}"
end

# redo 语句
# 重新开始最内部循环的该次迭代，不检查循环条件。如果在块内调用，则重新开始 yield 或 call。
for i in 0..4 do
    if i > 2 then
        puts "局部变量 i 的值: #{i}"
        # redo 死循环
    end
end

# retry 语句
# 1.9以及之后的版本不支持在循环中使用retry。
# 如果 retry 出现在 begin 表达式的 rescue 子句中，则从 begin 主体的开头重新开始。
# 如果 retry 出现在迭代内、块内或者 for 表达式的主体内，则重新开始迭代调用。迭代的参数会重新评估。
