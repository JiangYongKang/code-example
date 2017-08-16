#!/usr/bin/ruby
# -*- coding: utf-8 -*-

# 块
# 块由大量的代码组成。
# 需要给块取个名称。
# 块中的代码总是包含在大括号 {} 内。或 do .. end 之内
# 块总是从与其具有相同名称的函数调用。这意味着如果您的块名称为 test，那么您要使用函数 test 来调用这个块。
# 可以使用 yield 语句来调用块。
# 并且要先声明函数，再声明代码块
def bolck_code
    puts "this is method"
    yield
end
bolck_code {
    puts "this is block"
}
# output:
# this is method
# this is block

# 带参数的 yield 语句
# 在这里，yield 语句后跟着参数。甚至可以传递多个参数。
# 在块中，可以在两个竖线之间放置一个变量来接受参数。
# 参数使用逗号分隔。
def block_code
    puts "this is method"
    yield 10, 20, 30
end
block_code {
    |a, b, c| puts "this is block: #{a} #{b} #{c}"
}
# output:
# this is method
# this is block: 10 20 30

# 将代码块作为参数
# 如果方法的最后一个参数前带有 &，那么您可以向该方法传递一个块，且这个块可被赋给最后一个参数。
# 如果 * 和 & 同时出现在参数列表中，& 应放在后面。
