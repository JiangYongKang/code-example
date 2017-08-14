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

puts "这是主 Ruby 程序";

# output:
# BEGIN 代码块会在程序运行之前被调用
# 这是主 Ruby 程序
# END 代码块会在程序结尾被调用
