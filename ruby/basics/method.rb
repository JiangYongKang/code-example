#!/usr/bin/ruby
# -*- coding: utf-8 -*-

# 方法
# Ruby 方法与其他编程语言中的函数类似。Ruby 方法用于捆绑一个或多个重复的语句到一个单元中。
# 方法名应以小写字母开头。
# 如果以大写字母作为方法名的开头，Ruby 可能会把它当作常量，从而导致不正确地解析调用。
# 方法应在调用之前定义，否则 Ruby 会产生未定义的方法调用异常。
# 无参方法声明和调用时，可以省略掉 "()"
# 有参方法可以设定默认值，调用设定默认值的方法，可以省略参数列表，方法执行时采用默认值，甚至在调用时可以省略 "()"
# 调用设定默认值得方法时，提供了默认值的参数可以不传递参数
def show_language(a = "Ruby", b = "Java")
    puts "编程语言为 #{a} #{b}"
end
show_language
show_language("C", "C++")
# output:
# 编程语言为 Ruby Java
# 编程语言为 C C++

# 方法返回值
# Ruby 中的每个方法默认都会返回一个值。这个返回的值是最后一个语句的值。例如：
def method_value
    a = 100
    b = 200
end
puts "方法默认返回值: #{method_value}"
# output:
# 方法默认返回值: 200

# 通过 return 返回
# 如果给出超过两个的表达式，包含这些值的数组将是返回值。如果未给出表达式，nil 将是返回值。
def return_array
    a, b, c = 100, 200, 300
    return a, b, c
end
puts "方法返回的数组: #{return_array}"
# output:
# 方法返回的数组: [100, 200, 300]

# 可变数量的参数
# 假设您声明了一个带有两个参数的方法，当您调用该方法时，您同时还需要传递两个参数。
def sample(*param)
    puts "参数的个数: #{param.length}"
    puts "参数的值:   #{param}"
end
sample "A", "B", "C", "D"
# saplme ("E", "F", "H", "I") 这种调用方式是错误的
sample (["E", "F", "H", "I"]) # 通过括号来调用，这里传递的将是一个数组，而不是多个参数用逗号分隔
# output:
# 参数的个数: 4
# 参数的值:   ["A", "B", "C", "D"]
# 参数的个数: 1
# 参数的值:   [["E", "F", "H", "I"]]

# 类方法
# 当方法定义在类的外部，方法默认标记为 private。另一方面，如果方法定义在类中的，则默认标记为 public。
# 方法默认的可见性和 private 标记可通过模块（Module）的 public 或 private 改变。
# 当想要访问类的方法时，您首先需要实例化类。然后，使用对象，您可以访问类的任何成员。
# Ruby 提供了一种不用实例化即可访问方法的方式。
class Accounts
    def Accounts.reading_charge
        puts "class method"
    end
end
Accounts.reading_charge
# output:
# class method

# alias 语句
# 这个语句用于为方法或全局变量起别名。别名不能在方法主体内定义。即使方法被重写，方法的别名也保持方法的当前定义。
# 为编号的全局变量（$1, $2,...）起别名是被禁止的。重写内置的全局变量可能会导致严重的问题。

# undef 语句
# 这个语句用于取消方法定义。undef 不能出现在方法主体内。
# 通过使用 undef 和 alias，类的接口可以从父类独立修改，但是，在自身内部方法调用时，它可能会破坏程序。
