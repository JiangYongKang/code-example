#!/usr/local/bin/ruby
# -*- coding: utf-8 -*-

# 实例变量以 @ 开头。未初始化的实例变量的值为 nil，在使用 -w 选项后，会产生警告。
class Customer
    # 在这里 @cust_id、@cust_name、@cust_addr 都是实例变量
    def initialize(id, name, addr)
        @cust_id = id
        @cust_name = name
        @cust_addr = addr
    end
    def display_details()
        puts "Customer id #@cust_id"
        puts "Customer name #@cust_name"
        puts "Customer address #@cust_addr"
    end
end

cust = Customer.new("1", "John", "Wisdom Apartments, Ludhiya")
cust.display_details()

# output
# Customer id 1
# Customer name John
# Customer address Wisdom Apartments, Ludhiya
