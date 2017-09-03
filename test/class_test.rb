#!/usr/local/ruby -w
# -*- coding: utf-8 -*-

require "test/unit"
require "../object/song.rb"
require "../object/karaoke_song.rb"
require "../object/song_list.rb"
require "../object/song_logger.rb"

class ClassTest < Test::Unit::TestCase

  # 对象定义方法的使用
  def test_object_song_to_s
    str = "Song: @name = Bicyclops, @artist = Fleck, @duration = 260"
    assert_equal(str, Song.new("Bicyclops", "Fleck", 260).to_s)
  end

  # 对象继承的使用
  def test_object_karaoke_song_to_s
    str = "Song: @name = My Way, @artist = Sinatra, @duration = 225, @lyrics = And now, the..."
    assert_equal(str, KaraokeSong.new("My Way", "Sinatra", 225, "And now, the...").to_s)
  end

  # 对象的读写方法
  def test_object_song_attr_reader_writer
    song = Song.new("Bicyclops", "Fleck", 260)
    assert_equal("Fleck", song.artist)
    assert_equal("Bicyclops", song.name)
    assert_equal(260, song.duration)
    song.duration = 257
    assert_equal(257, song.duration)
  end

  # 对象的虚拟属性
  def test_object_song_duration_in_minutes
    song = Song.new("Bicyclops", "Fleck", 240)
    assert_equal(4, song.duration_in_minutes)
    song.duration_in_minutes = 4.2
    assert_equal(252, song.duration)
  end

  # 类变量的测试
  def test_object_song_play
    song1 = Song.new("Song1", "Artist1", 234)
    song2 = Song.new("Song2", "Artist2", 345)
    assert_equal("This song: 1 plays. Total 1 plays.", song1.play)
    assert_equal("This song: 1 plays. Total 2 plays.", song2.play)
    assert_equal("This song: 2 plays. Total 3 plays.", song1.play)
    assert_equal("This song: 3 plays. Total 4 plays.", song1.play)
  end

  # 类方法的测试
  def test_object_song_list_is_too_long
    song1 = Song.new("The Calling", "Santana", 468)
    song2 = Song.new("Bicyclops", "Fleck", 260)
    assert(SongList.is_too_long(song1))
    assert_equal(false, SongList.is_too_long(song2))
  end

  # 单例模式测试
  def test_object_song_logger_singleton
    assert_equal(SongLogger.create.object_id, SongLogger.create.object_id)
  end
end
