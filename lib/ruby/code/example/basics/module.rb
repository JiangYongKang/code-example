#!/usr/bin/ruby
# -*- coding: utf-8 -*-
# 可以通过 require 和 include 来加载其他 module
# 未加载进来的可以通过 "模块名称::常量名称" 来进行加载
# 通过 include 加载进来的模块，可以省略 "模块名称"。如 "Math::PI" 可以简写为 "PI"
require "date"
include Math

# 模块
# 模块（Module）是一种把方法、类和常量组合在一起的方式。
# 模块提供了一个命名空间和避免名字冲突。
# 模块实现了 mixin 装置。
# 模块（Module）定义了一个命名空间，相当于一个沙盒，在里边您的方法和常量不会与其他地方的方法常量冲突。
# 模块不能实例化
# 模块没有子类
# 模块只能被另一个模块定义
# 模块常量命名与类常量命名类似，以大写字母开头。方法定义看起来也相似：模块方法定义与类方法定义类似。
# 通过类方法，您可以在类方法名称前面放置模块名称和一个点号来调用模块方法，您可以使用模块名称和两个冒号来引用一个常量。
puts Math::PI
puts Date.today

module Circle
    def Circle.area(radius)
        PI * radius ** 2
    end
    def Circle.circumference(radius)
        PI * radius * 2
    end
end

puts "半径为 10 的圆的面积: #{Circle.area(10)}"
puts "半径为 10 的圆的周长: #{Circle.circumference(10)}"
# output:
# 3.141592653589793
# 2017-08-16
# 半径为 10 的圆的面积: 314.1592653589793
# 半径为 10 的圆的周长: 62.83185307179586

# Mixins
# 当一个类可以从多个父类继承类的特性时，该类显示为多重继承。
# Ruby 不直接支持多重继承，但是 Ruby 的模块（Module）有另一个神奇的功能。它几乎消除了多重继承的需要，提供了一种名为 mixin 的装置。
# Ruby 没有真正实现多重继承机制，而是采用成为 mixin 技术作为替代品。将模块 include 到类定义中，模块中的方法就 mix 进了类中。

module A
    def a1
        1
    end
    def a2
        2
    end
end

module B
    def b1
        3
    end
    def b2
        4
    end
end

class Sample
    include A
    include B
    def s1
        5
    end
end

samp = Sample.new
puts "samp.a1: #{samp.a1}"
puts "samp.a2: #{samp.a2}"
puts "samp.b1: #{samp.b1}"
puts "samp.b2: #{samp.b2}"
puts "samp.s1: #{samp.s1}"
# output:
# samp.a1: 1
# samp.a2: 2
# samp.b1: 3
# samp.b2: 4
# samp.s1: 5
