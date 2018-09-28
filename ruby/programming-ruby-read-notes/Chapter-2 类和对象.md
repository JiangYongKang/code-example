如何定义一个类？
```ruby
class Person
end
```
如何实例化一个对象？
```ruby
Person.new
```
如何创建一个带构造方法的类？
```ruby
class Person
  def initialize(name)
    @name = name
  end
end
```
如何将对象的 ID 和实例变量格式化输出？
```ruby
2.4.0 :013 > Person.new('vincent').inspect
 => "#<Person:0x007f9d41a65848 @name=\"vincent\">"
```
如何继承？
```ruby
class Animal
end

class Cat < Animal
end

class Dog < Animal
end
```
如何定义属性？
```ruby
class Person
  attr_reader :name, :age
  attr_writer :name, :age
  attr_accessor :sex
end
```
如何定义类变量？
```ruby
class Person
  @@id = 0
  def initialize
    @@id = @@id + 1
  end
end
```
如何自定义 `singleton` 模式？
```ruby
class Person
  private_class_method :new
  def self.create
  end
end
```
如何定义方法的访问级别？
```ruby
class Person
  def method1;end

  public
    def method2;end

  protected
    def method3;end

  private
    def method4;end
end
```
```ruby
class Person
  def method1;end
  # ... and so on

  public :method1, method2
  protected :method3
  private :method4
end
```