#!/usr/local/ruby -w
# -*- coding: utf-8 -*-

class SongList
  MAX_TIME = 5 * 60

  # 类方法通过 "类名.方法名来实现" 相当于 Java 中的静态方法，方法不依赖于任何一个对象，可以直接通过类名调用
  def SongList.is_too_long(song)
    song.duration > MAX_TIME
  end
end
