#!/usr/local/bin/ruby
# -*- coding: utf-8 -*-

# 常量
# 常量以大写字母开头。
# 定义在类或模块内的常量可以从类或模块的内部访问。
# 定义在类或模块外的常量可以被全局访问。
# 常量不能定义在方法内。
# 引用一个未初始化的常量会产生错误。
# 对已经初始化的常量赋值会产生警告。

class Example
    NUMBER = 100
    def show()
        puts "NUMBER = #{NUMBER}"
    end
end

example = Example.new()
example.show()

# 局部变量
# 局部变量以小写字母或下划线 _ 开头。
# 局部变量的作用域从 class、module、def 或 do 到相对应的结尾或者从左大括号到右大括号 {}。
# 当调用一个未初始化的局部变量时，它被解释为调用一个不带参数的方法。
# 对未初始化的局部变量赋值也可以当作是变量声明。变量会一直存在，直到当前域结束为止。局部变量的生命周期在 Ruby 解析程序时确定。

# 伪变量
# 它们是特殊的变量，有着局部变量的外观，但行为却像常量。不能给这些变量赋任何值。
# self: 当前方法的接收器对象。
# true: 代表 true 的值。
# false: 代表 false 的值。
# nil: 代表 undefined 的值。
# __FILE__: 当前源文件的名称。
# __LINE__: 当前行在源文件中的编号。