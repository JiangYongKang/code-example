#!/usr/bin/ruby -w
# -*- conding: utf-8 -*-

# 字符串类型
puts 'escape using "\\"';
puts 'That\'s right';

# 可以使用序列 #{expr} 替换任意 Ruby 表达式的值为一个字符串。
# 在这里，expr 可以是任意的 Ruby 表达式。
puts "相乘：#{24 * 60 * 60}";

name = "Ruby";
puts name;
puts "#{name+", OK"}";

# output
# escape using "\"
# That's right
# 相乘：86400
# Ruby
# Ruby, OK
