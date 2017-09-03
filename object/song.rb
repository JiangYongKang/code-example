#!/usr/local/ruby -w
# -*- coding: utf-8 -*-

class Song

  # 类变量被类的所有对象共享，类变量只有一份拷贝，类变量有两个 "@" 开头，类变量在使用前必须被初始化
  # 类变量相当于 Java 中的静态变量，不同的是 Ruby 中的类变量不可以直接通过类名调用，它是被封装在类的内部，需要提供方法才可以使用
  @@plays = 0

  # 初始化方法，相当于 Java 中的构造器
  # Java 中的构造器名必须和类名一致，这里的初始化方法必须为 initialize
  def initialize(name, artist, duration)
    @name = name
    @artist = artist
    @duration = duration
    @play = 0
  end

  # 可读的属性定义，相当于 Java 中的 Get 方法
  attr_reader :name, :artist, :duration

  # 可写的属性定义，相当于 Java 中的 Set 方法
  attr_writer :name, :artist, :duration

  def duration_in_minutes
    @duration / 60.0
  end

  # 虚拟属性，一般方法以 "=" 等号结尾，是用来更新对象属性的方法
  def duration_in_minutes=(new_duration)
    @duration = (new_duration * 60).to_i
  end

  # 演示类变量与实例变量之间的差异
  def play
    @play += 1
    @@plays += 1
    "This song: #@play plays. Total #@@plays plays."
  end

  def to_s
    "Song: @name = #@name, @artist = #@artist, @duration = #@duration"
  end
end
