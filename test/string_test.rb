#!/usr/local/ruby -w
# -*- coding: utf-8 -*-
require 'test/unit'

class TestString < Test::Unit::TestCase
  # 将字符串按指定的字符分割为数组
  def test_split
    test_str = 'ABC DEF HIJ KLM NOP'
    assert_equal(%w[ABC DEF HIJ KLM NOP], test_str.split(' '))
  end

  # strip 去除字符串首尾的空格
  def test_strip
    assert_equal("", "".strip)
    assert_equal("", " ".strip)
    assert_equal("x", " x ".strip)
    assert_equal("x y", " x y ".strip)
  end

  # 去除指定的重复字符
  def test_squeeze
    assert_equal('ABCA', 'ABCAAA'.squeeze!('A'))
    assert_nil('ABCABC'.squeeze!('A'))
    assert_nil('ABCABC'.squeeze!('ABC'))
    assert_nil('ABCA A'.squeeze!('A'))
  end

  # 根据给定的正则表达式将字符串切分为字符数组
  def test_scan
    test_str = '123A456B789C0'
    assert_equal(%w[123 456 789 0], test_str.scan(/\d+/))
  end

  # 根据正则表达式对象切分或者替换字符串(非贪婪)
  def test_sub
    test_str = 'the quick brown fox'

    # 第二个参数可以是字符串
    assert_equal('th* quick brown fox', test_str.sub(/[aeiou]/, '*'))
    assert_equal('the brown fox', test_str.sub(/\s\S+/, ''))

    # 第二个参数是代码块
    assert_equal('The quick brown fox', test_str.sub(/^./, &:upcase))
  end

  # 根据正则表达式对象切分或者替换字符串(贪婪)
  def test_gsub
    test_str = 'the quick brown fox'

    # 第二个参数可以是字符串
    assert_equal('th* q**ck br*wn f*x', test_str.gsub(/[aeiou]/, '*'))
    assert_equal('the', test_str.gsub(/\s\S+/, ''))

    # 第二个参数是代码块
    assert_equal('The Quick Brown Fox', test_str.gsub(/\b\w/, &:upcase))
  end
end
