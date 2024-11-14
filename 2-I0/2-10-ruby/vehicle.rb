# frozen_string_literal: true

# Class representing a vehicle with basic functionality.
# @version 1.0
# @since   2024-11-05

# The Vehicle class which represents a vehicle
class Abstract Vehicle
  # The color of the vehicle.
  # @type [String]
  attr_reader :color

  # The maximum speed of the vehicle.
  # @type [Integer]
  attr_reader :max_speed

  # The current speed of the vehicle.
  # @type [Integer]
  attr_reader :current_speed

  # The number of tires of the vehicle.
  # @type [Integer]
  attr_reader :number_of_tires

  # Creates a new Vehicle instance.
  # @param color [String] The color of the vehicle.
  # @param max_speed [Integer] The maximum speed of the vehicle.
  def initialize(color, max_speed, number_of_tires)
    @color = color
    @max_speed = max_speed
    @current_speed = 0
    @number_of_tires = number_of_tires
  end

  # Returns the current speed of the vehicle.
  # @return [Integer] The current speed of the vehicle.
  def speed
    @current_speed
  end

  # Returns the maximum speed of the vehicle.
  # @return [Integer] The maximum speed of the vehicle.
  def max_vehicle_speed
    @max_speed
  end

  # Returns the number of tires of the vehicle.
  # @return [Integer] The number of tires of the vehicle.
  def vehicle_number_of_tires
    @number_of_tires
  end

  # Accelerates the vehicle by a specified power over a given time.
  # @param power [Integer] The power level for acceleration.
  # @param time [Integer] The time duration for acceleration.
  def accelerate(power, time)
    speed_increase = power * time
    if @current_speed + speed_increase < @max_speed
      @current_speed += speed_increase
    else
      @current_speed = @max_speed
    end
  end

  # Brakes the vehicle by a specified power over a given time.
  # @param power [Integer] The power level for braking.
  # @param time [Integer] The time duration for braking.
  def brake(power, time)
    speed_decrease = power * time
    if (@current_speed - speed_decrease).positive?
      @current_speed -= speed_decrease
    else
      @current_speed = 0
    end
  end

  # Displays the status of the vehicle.
  def status
    puts "-> Speed: #{@current_speed}"
    puts "-> Max Speed: #{@max_speed}"
    puts "-> Color: #{@color}"
    puts "-> # of tires: #{@number_of_tires}"
  end
end
