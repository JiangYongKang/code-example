#!/usr/bin/ruby
# -*- coding: utf-8 -*-

# END 代码块会在程序结尾被调用
END {
  puts "END 代码块会在程序结尾被调用";
}

# BEGIN 代码块会在程序运行之前被调用
BEGIN {
  puts "BEGIN 代码块会在程序运行之前被调用";
}

# 一个程序可以包含多个 BEGIN 和 END 块。
# BEGIN 块按照它们出现的顺序执行。
# END 块按照它们出现的相反顺序执行。
puts "这是主 Ruby 程序";

# output:
# BEGIN 代码块会在程序运行之前被调用
# 这是主 Ruby 程序
# END 代码块会在程序结尾被调用
