#!/usr/local/ruby -w
# -*- coding: utf-8 -*-

require "test/unit"

class VariablesTest < Test::Unit::TestCase

  # 引用的复制
  def test_basic_variables
    person1 = "Tim"
    assert_equal("Tim", person1)

    person2 = person1
    assert_equal(person1, person2)

    person1[0] = "J"
    assert_equal(person1, person2)
    assert_equal(person1, person2)
    assert_equal("Jim", person2)
  end

  # 对象的复制
  def test_object_dup
    person1 = "Tim"
    person2 = person1.dup
    person1[0] = "J"
    assert_equal("Tim", person2)
    assert_equal("Jim", person1)
  end
end
