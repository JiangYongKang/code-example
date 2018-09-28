如果使用 `RDoc` 来文档化一个源文件，那么其中的文档可以被提取出来，并且转换为 `HTML` 或者 `ri` 格式。`ri` 是一种本地的命令行工具，用来阅读 `RDoc` 格式的 `Ruby` 文档。 `ri` 加上类名，就可以查看该类的文档，比如下面就是查看 `String` 类的文档。
```shell
$ ri String
String < Object

(from gem CFPropertyList-2.3.5)
------------------------------------------------------------------------------
Instance methods:

  bytesize

(from gem activesupport-5.1.4)
------------------------------------------------------------------------------








String inflections define new methods on the String class to transform names
for different purposes. For instance, you can figure out the name of a table
from the name of a class.

  'ScaleScore'.tableize # => "scale_scores"






------------------------------------------------------------------------------
```
`ri` 还可以查看方法的文档，只需要输入 `ri` 加方法名即可。如果这个方法在多个类中都会出现，那么 `ri` 会列出所有的可能。如果想精确的查找方法，可以使用 `ri 类名.方法名`, 如:
```shell
$ ri String.firsy
String.first

(from gem mail-2.6.6)
------------------------------------------------------------------------------
  first(limit = 1)

------------------------------------------------------------------------------

Returns the first character of the string or the first limit
characters.

Examples:
  "hello".first     # => "h"
  "hello".first(2)  # => "he"
  "hello".first(10) # => "hello"


(from gem activesupport-5.1.4)
```
`ri --help` 可以让你查看所有的选项。如果找到了自己喜欢的选项，可以将其加入到 `RI` 这个环境变量中。如:
```shell
$ export RI="--format ansi --width 70"
```