#!/usr/local/ruby -w
# -*- coding: utf-8 -*-

require "test/unit"

class ExpressionsTest < Test::Unit::TestCase

  # 表达式执行系统命令
  def test_expressions_command
    assert_equal("Hello World!\n", `echo Hello World!`)
    assert_equal("Hello World!\n", %x{echo Hello World!})
  end

end
