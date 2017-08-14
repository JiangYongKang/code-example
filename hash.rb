#!/usr/local/bin/ruby
# -*- coding: utf-8 -*-

hsh = colors = {"red" => 0xf00, "green" => 0x0f0, "blur" => 0x00f}
hsh.each do |key, value|
    print key, " is ", value, "\n"
end

# output:
# red is 3840
# green is 240
# blur is 15
