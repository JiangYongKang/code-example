#!/usr/local/bin/ruby
# -*- coding: utf-8 -*-

# 类变量以 @@ 开头，且必须初始化后才能在方法定义中使用。
# 引用一个未初始化的类变量会产生错误。类变量在定义它的类或模块的子类或子模块中可共享使用。

class Customer
    # @@no_of_customers 是类变量
    @@no_of_customers = 0
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
    def total_no_of_customers()
       @@no_of_customers += 1
       puts "Total number of customers: #@@no_of_customers"
    end
end

# 创建对象
cust1=Customer.new("1", "John", "Wisdom Apartments, Ludhiya")
cust2=Customer.new("2", "Poul", "New Empire road, Khandala")

# 调用方法
cust1.total_no_of_customers()
cust2.total_no_of_customers()

# output
# Total number of customers: 1
# Total number of customers: 2
