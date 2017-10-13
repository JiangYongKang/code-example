#!/usr/local/ruby -w
# -*- coding: utf-8 -*-
class SongLogger

  # 配合类方法实现单列模式
  private_class_method :new
  @@logger = nil
  def SongLogger.create
    @@logger = new unless @@logger
      @@logger
  end
end
