#!/usr/local/bin/ruby
# -*- coding: utf-8 -*-

# 全局变量以 $ 开头。未初始化的全局变量的值为 nil，在使用 -w 选项后，会产生警告。
# 给全局变量赋值会改变全局状态，所以全局变量要慎重使用。

$global_variable = 100

class Class1
    def display_global
        puts "全局变量在 Class1 中输出为 #$global_variable"
    end
end

class Class2
    def display_global
        puts "全局变量在 Class2 中输出为 #$global_variable"
    end
end

class1 = Class1.new
class2 = Class2.new
class1.display_global()
class2.display_global()
