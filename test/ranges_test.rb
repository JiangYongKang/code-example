#!/usr/local/ruby -w
# -*- coding: utf-8 -*-
require "test/unit"

class TestString < Test::Unit::TestCase

  # 测试一些值是否会落入区间表达式
  def test_ranges
    assert_equal(true, (1..10) === 5)
    assert_equal(false, (1..10) === 15)
    assert_equal(true, (1..10) === 3.1415926)
    assert_equal(true, ('a'..'j') === 'c')
  end

  # 将区间转换位数组
  def test_to_a
    assert_equal([1, 2, 3, 4, 5], (1..5).to_a)
    assert_equal(['a', 'b', 'c', 'd', 'e'], ('a'..'e').to_a)
    assert_equal(["aa", "ab", "ac", "ad", "ae"], ('aa'..'ae').to_a)
  end
end
