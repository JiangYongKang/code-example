#!/usr/local/ruby -w
# -*- coding: utf-8 -*-
require "test/unit"

class TestRegexp < Test::Unit::TestCase

  # 测试正则表达式对象构建
  def test_initialize
    assert_equal(/^\s*[a-z]/, Regexp.new('^\s*[a-z]'))
    assert_equal(/^\s*[a-z]/, /^\s*[a-z]/)
    assert_equal(/^\s*[a-z]/, %r{^\s*[a-z]})
  end

  # 测试匹配
  def test_match
    assert_equal(0, "Fats Waller" =~ /F/)
    assert_equal(1, "Fats Waller" =~ /a/)
    assert_equal(2, "Fats Waller" =~ /t/)
    assert_nil("Fats Waller" =~ /z/)
    assert_equal(0, /F/ =~ "Fats Waller")
    assert_equal(1, /a/ =~ "Fats Waller")
    assert_equal(2, /t/ =~ "Fats Waller")

    assert_equal("<<F>>ats Waller", show_regexp("Fats Waller", /F/))
    assert_equal("F<<a>>ts Waller", show_regexp("Fats Waller", /a/))
    assert_equal("Fa<<t>>s Waller", show_regexp("Fats Waller", /t/))
    assert_equal("no match", show_regexp("Fats Waller", /z/))
  end

  # 测试正则表达式对象
  def test_MatchData
    regexp = /(\d+):(\d+)/
    match_data = regexp.match("Time: 12:34am")

    assert_equal(Regexp, regexp.class)
    assert_equal(MatchData, match_data.class)

    assert_equal("12:34", match_data[0])
    assert_equal("12", match_data[1])
    assert_equal("34", match_data[2])
    assert_equal("Time: ", match_data.pre_match)
    assert_equal("am", match_data.post_match)

    assert_equal("12:34", $&)
    assert_equal("12", $1)
    assert_equal("34", $2)
    assert_equal("Time: ", $`)
    assert_equal("am", $')

    assert_equal(["12", "34"], [$1, $2])
  end

  def test_unescapeHTML
    assert_equal("1<2 && 4>3", unescapeHTML("1&lt;2 &amp;&amp; 4&gt;3"))
    assert_equal("\"A\" = A = A", unescapeHTML("&quot;A&quot; = &#65; = &#x41;"))
  end

  # $` 返回匹配到的字符串之前的字符串
  # $$ 返回匹配到的字符串
  # $' 返回匹配到的字符串之后面的字符串
  def show_regexp(str, regexp)
    if str =~ regexp
      "#{$`}<<#{$&}>>#{$'}"
    else
      "no match"
    end
  end

  # 接收包含 HTML 转移序列并把它转换成普通的 ASCII
  def unescapeHTML(string)
    str = string.dup
    str.gsub!(/&(.*?);/n) {
      match = $1.dup
      case match
        when /\Aamp\z/ni then '&'
        when /\Aquot\z/ni then '"'
        when /\Agt\z/ni then '>'
        when /\Alt\z/ni then '<'
        when /\A#(\d+)\z/ni then Integer($1).chr
        when /\A#x([0-9a-f]+)\z/ni then $1.hex.chr
      end
    }
    str
  end
end
