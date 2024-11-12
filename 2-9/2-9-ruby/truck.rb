# frozen_string_literal: true

# Class representing a truck, extending the Vehicle class.
# @version 1.0
# @since   2024-11-05

# The Truck class represents a truck, which is a specific type of vehicle
class Truck < Vehicle
  # The license plate number of the truck.
  # @type [String]
  attr_reader :license_plate_number

  # The number of doors on the truck.
  # @type [Integer]
  attr_reader :doors

  # Creates a new Truck instance.
  # @param color [String] The color of the truck.
  # @param max_speed [Integer] The maximum speed of the truck.
  # @param license_plate_number [String] The license plate number of the truck.
  # @param number_of_tires [Integer] The number of tires of the truck.
  def initialize(color, max_speed, license_plate_number, number_of_tires)
    super(color, max_speed, number_of_tires)
    @license_plate_number = license_plate_number
    @doors = 2
  end

  # Applies air pressure to slow down the truck.
  # @param air_pressure [Integer] The amount of air pressure applied.
  def brake(power, time, air_pressure)
    @current_speed = @current_speed - (power * time) - (time * air_pressure)
  end

  # Displays the status of the truck, including license plate.
  def status
    super()
    puts "-> License Plate: #{@license_plate_number}"
  end
end
