class Person
  private_class_method :new
  def self.create
    puts "Person#create"
  end
end