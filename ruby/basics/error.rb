#!/usr/bin/ruby
# -*- coding: utf-8 -*-

begin
  # 相当于 Java 中的 try 代码块
  puts "risky:"
  raise "oops!" # 手动抛出异常，相当于 Java 中的 throw new Exception();
rescue
  puts "rescued" # 相当于 Java 中的 catch 代码块
end

# Ruby 和 Java 一样，异常可以一层一层的交给调用者处理
def risky_method
  raise "oops!"
  puts "I'll be skipped." # 这行代码永远不会执行，因为上一行手动抛出了异常
end

begin
  risky_method
rescue => my_exception # 将 begin 块中的异常信息存储在一个变量里面
  puts "Rescued an exception!"
  puts my_exception.message # 通过这个变量打印异常信息
end
