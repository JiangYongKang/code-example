#!/usr/bin/ruby -w
# -*- coding: utf-8 -*-
puts "hello world";

# 打印多行字符串
print <<EOF
  1
  2
EOF

# 打印多行字符串
print <<"EOF";
  3
  4
EOF

# 执行shell命令
print <<`EOC`
  echo 5
  echo 6
EOC

# 堆叠打印
print <<"foo", <<"bar"
  7
foo
  8
bar

# output:
#   1
#   2
#   3
#   4
# 5
#   6
#   7
#   8
