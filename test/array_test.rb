#!/usr/local/ruby -w
# -*- coding: utf-8 -*-
require "test/unit"

class ArrayTest < Test::Unit::TestCase
  def test_basic
    array = [1, 3, 5, 7, 9]

    assert_equal([3, 5, 7], array[1, 3])
    assert_equal([7],       array[3, 1])
    assert_equal([5, 7],    array[-3, 2])

    assert_equal([3, 5, 7], array[1..3])
    assert_equal([3, 5],    array[1...3])
    assert_equal([7],       array[3..3])
    assert_equal([5, 7, 9], array[-3..-1])

    array[1] = "bat"
    assert_equal([1, "bat", 5, 7, 9], array)

    array[-3] = "cat"
    assert_equal([1, "bat", "cat", 7, 9], array)

    array[3] = [9, 8]
    assert_equal([1, "bat", "cat", [9, 8], 9], array)

    array[6] = 99
    assert_equal([1, "bat", "cat", [9, 8], 9, nil, 99], array)

    array = [1, 3, 5, 7, 9]
    assert_equal([1, 3, 5, 7, 9], array)

    array[2, 2] = "cat"
    assert_equal([1, 3, "cat", 9], array)

    array[2, 0] = "dog"
    assert_equal([1, 3, "dog", "cat", 9], array)

    array[1, 1] = [9, 8, 7]
    assert_equal([1, 9, 8, 7, "dog", "cat", 9], array)

    array[0..3] = []
    assert_equal(["dog", "cat", 9], array)

    array[5..6] = 99, 98
    assert_equal(["dog", "cat", 9, nil, nil, 99, 98], array)
  end
end
