你可以像运行 `Shell` `Python` `Perl` 脚本那样去运行 `Ruby` 程序。
```shell
$ ruby demo.rb
```
也可以在源文件第一行声明 `ruby` 的可执行文件路径, 并为该文件添加可执行权限，然后运行程序。
```ruby
#! /usr/local/bin/ruby -w
puts "hello world"
```
```shell
$ chmod +x demo.rb
$ ./demo.rb
```