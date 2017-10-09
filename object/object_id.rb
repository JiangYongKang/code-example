class ObjectId
  def show_object_id
    puts "self.object_id: #{self.object_id}"
  end
end

object_id = ObjectId.new
puts "object_id: #{object_id.object_id}" 
object_id.show_object_id