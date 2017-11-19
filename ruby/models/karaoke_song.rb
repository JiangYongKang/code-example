#!/usr/local/ruby -w
# -*- coding: utf-8 -*-

class KaraokeSong < Song
  def initialize(name, artist, duration, lyrics)
    super(name, artist, duration)
    @lyrics = lyrics
  end

  def to_s
    super + ", @lyrics = #@lyrics"
  end
end
