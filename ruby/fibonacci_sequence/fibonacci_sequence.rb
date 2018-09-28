#!/usr/bin/ruby
# -*- coding: utf-8 -*-
# load "fibonacci_sequence.rb"

class FibonacciSequence

  # 复杂度 O(2^n)
  def run(n)
    return n if n == 0 || n == 1
    run(n - 1) + run(n - 2)
  end

end
