#!/usr/local/ruby -w
# -*- coding: utf-8 -*-
require "test/unit"

class TestString < Test::Unit::TestCase

    #将字符串按指定的字符分割为数组
    def test_split
        test_str = "ABC DEF HIJ KLM NOP"
        assert_equal(["ABC", "DEF", "HIJ", "KLM", "NOP"], test_str.split(" "))
    end

    # 去除指定的重复字符
    def test_squeeze
        assert_equal("ABCA", "ABCAAA".squeeze!("A"))
        assert_nil("ABCABC".squeeze!("A"))
        assert_nil("ABCABC".squeeze!("ABC"))
        assert_nil("ABCA A".squeeze!("A"))
    end

    #根据给定的正则表达式将字符串切分为字符数组
    def test_scan
        test_str = "123A456B789C0"
        assert_equal(["123", "456", "789", "0"], test_str.scan(/\d+/))
    end
end
