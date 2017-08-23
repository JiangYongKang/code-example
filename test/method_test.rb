#!/usr/local/ruby -w
# -*- coding: utf-8 -*-
require "test/unit"

class TestMethod < Test::Unit::TestCase

  # 实参默认值测试
  def test_cool_dude
    assert_equal("Miles, Coltrance, Roach", cool_dude)
    assert_equal("Bart, Coltrance, Roach", cool_dude("Bart"))
    assert_equal("Bart, Elwood, Roach", cool_dude("Bart", "Elwood"))
    assert_equal("Bart, Elwood, Linus", cool_dude("Bart", "Elwood", "Linus"))
  end

  # 可变参数测试
  def test_varargs
    assert_equal("one", varargs("one"))
    assert_equal("one, two", varargs("one", "two"))
    assert_equal("one, two, three", varargs("one", "two", "three"))
  end

  # 参数是代码块测试
  def test_block_args
    assert_equal("name = ruby, block.call = 100", block_args("ruby", 1) { |number| number * 100 })
    assert_equal("name = ruby, block.call = 200", block_args("ruby", 2) { |number| number * 100 })
    assert_equal("name = ruby, block.call = 300", block_args("ruby", 3) { |number| number * 100 })
    assert_equal("name = ruby, block.call = 400", block_args("ruby", 4) { |number| number * 100 })
  end

  # 方法默认的返回值是最后一个表达式的值
  def test_default_return
    assert_equal("ruby", default_return("ruby"))
    assert_equal("lucy", default_return("lucy"))
    assert_equal("jack", default_return("jack"))
  end

  # 方法返回多个值
  def test_arrays_return
    assert_equal(["A", "B"], arrays_return("A", "B"))
    assert_equal(["C", "D"], arrays_return("C", "D"))
    assert_equal(["E", "F"], arrays_return("E", "F"))
  end

  # 形参数组自动展开
  def test_arrays_args
    assert_equal("I was passed 1 2 3 4 5", arrays_args(1, 2, 3, 4, 5))
    assert_equal("I was passed 1 2 3 4 5", arrays_args(1, 2, 3, *[4, 5]))
    assert_equal("I was passed 1 2 3 4 5", arrays_args(*[1, 2, 3, 4, 5]))
    assert_equal("I was passed 1 2 3 4 5", arrays_args(1, 2, *(3..5).to_a))
    assert_equal("I was passed 1 2 3 4 5", arrays_args(*(1..5).to_a))
  end
end

# 实参设置了默认值的方法
def cool_dude(arg1 = "Miles", arg2 = "Coltrance", arg3 = "Roach")
  "#{arg1}, #{arg2}, #{arg3}"
end

# 可变长度参数列表
def varargs(*args)
  "#{args.join(', ')}"
end

# 参数是一个代码块
def block_args(name, number, &block)
  # 通过 block.call 执行方法
  "name = #{name}, block.call = #{ block.call(number) }"
end

# 默认返回值
def default_return(name)
  name
end

# 返回多个值
def arrays_return(arg1, arg2)
  return arg1, arg2
end

# 形参数组自动展开
def arrays_args(a, b, c, d, e)
  "I was passed #{a} #{b} #{c} #{d} #{e}"
end
