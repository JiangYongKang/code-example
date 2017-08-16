#!/usr/bin/ruby
# -*- coding: utf-8 -*-

# if ... elseif ... else 语句
# if 表达式用于条件执行。值 false 和 nil 为假，其他值都为真。
# Ruby 使用 elsif，不是使用 else if 和 elif。
# 如果 conditional 为真，则执行 code。如果 conditional 不为真，则执行 else 子句中指定的 code。
# 通常我们省略保留字 then 。若想在一行内写出完整的 if 式，则必须以 then 隔开条件式和程式区块。
score = 81
if score >= 0 and score < 60 then
    puts "Test exam failed"
elsif score >= 60 and score < 80 then
    puts "Pass the exam"
else
    puts "Excellent test results"
end

# if 修饰符
# code if condition
# if 修饰词组表示当 if 右边之条件成立时才执行 if 左边的式子。即如果 conditional 为真，则执行 code。
score = 100
puts "Full score!!!" if score == 100

# unless 语句
# unless 式和 if式作用相反，即如果 conditional 为假，则执行 code。
# 如果 conditional 为真，则执行 else 子句中指定的 code。
score = -1
unless score < 0 or score > 100 then
    puts "Effective score!"
else
    puts "Invalid score!"
end

# unless 修饰符
# code unless conditional
# 如果 conditional 为假，则执行 code。
score = 99
puts "The score is not full score!" unless score == 100 then
