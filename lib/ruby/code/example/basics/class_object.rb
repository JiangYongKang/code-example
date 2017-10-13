#!/usr/local/bin/ruby
# -*- coding: utf-8 -*-

# 类总是以关键字 class 开始，后跟类的名称。类名的首字母应该大写
# 使用关键字 end 终止一个类。类 中的所有数据成员都是介于类定义和 end 关键字之间。
class Customer
    @@no_of_customers = 0
    def initialize(id, name, addr)
        @cust_id = id
        @cust_name = name
        @cust_addr = addr
    end

    # 该方法用于在控制台打印客户ID、客户名称、客户地址
    def display_details()
        # 想要在一个单行文本中显示实例变量的值，必须在变量名前面放置前置符号 '#'
        # 文本中和带有符号 '#' 的实例变量应该使用双引号
        puts "Customer id #@cust_id"
        puts "Customer name #@cust_name"
        puts "Customer address #@cust_addr"
    end

    # 对类变量 @@no_of_customers 进行累加，得到客户的总数量
    def total_no_of_customers()
        @@no_of_customers += 1
        puts "Total number of customers: #@@no_of_customers"
    end
end

# 对象的创建
cust1 = Customer.new("1", "John", "Wisdom Apartments, Ludhiya")
# 对象方法的调用，对象名称后总是跟着一个点号，接着是方法名称或数据成员
cust1.display_details()
cust1.total_no_of_customers()

cust2 = Customer.new("2", "Poul", "New Empire road, Khandala")
cust2.display_details()
cust2.total_no_of_customers()

# output:
# Customer id 1
# Customer name John
# Customer address Wisdom Apartments, Ludhiya
# Total number of customers: 1
# Customer id 2
# Customer name Poul
# Customer address New Empire road, Khandala
# Total number of customers: 2
