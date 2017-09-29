#!/usr/local/ruby -w
# -*- coding: utf-8 -*-

class Accounts
  def initialize(checking, savings)
    @checking = checking
    @savings = savings
  end

  # 公开的方法
  public:
    def transfer_to_savings(amount)
      debit(@checking, amount)
      credit(@savings, amount)
    end

  # 私有的方法，仅仅对象内部可以访问
  private:
    def debit(account, amount)
      account.balance -= amount
    end
    def credit(account, amount)
      account.balance += amount
    end
end
