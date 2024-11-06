# This program demonstrates the use of the Vehicle, Bike, and Truck classes.
#
# @author  Jakub Malhotra
# @version 1.0
# @since   2024-11-05

# Creating a new Bike instance
bmx = Bike.new("Red", 40)

puts "Created BMX bike.\nStatus:"
bmx.status

puts "\nSet the cadence to 10"
bmx.set_gear(2)
bmx.set_cadence(10)
bmx.status

puts "\nAccelerate by 15:"
bmx.accelerate(15)
bmx.status

puts "\nRinging bell."
puts bmx.ring_bell

# Creating a new Truck instance
big_truck = Truck.new("Grey", 200, "HGC-3456F")

puts "Created a Truck.\nStatus:"
big_truck.status

puts "\nAccelerating, 10 of power for ten seconds:"
big_truck.accelerate(10, 10)
puts "New speed: #{big_truck.speed}"

puts "\nBraking, 10 of power for 10 sec."
big_truck.accelerate(10, 10)
puts "New speed: #{big_truck.speed}"

puts "\nApplied air pressure of 10:"
big_truck.apply_air(10)
puts "New speed: #{big_truck.speed}"

puts "\nDone."
