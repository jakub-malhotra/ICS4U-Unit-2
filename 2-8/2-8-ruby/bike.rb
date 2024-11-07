# frozen_string_literal: true

# Class representing a bike, extending the Vehicle class.
# @version 1.0
# @since   2024-11-05

# The Bike class represents a bike, which is a specific type of vehicle
class Bike < Vehicle
  # The cadence of the bike.
  # @type [Integer]
  attr_accessor :cadence

  # The gear of the bike.
  # @type [Integer]
  attr_accessor :gear

  # Creates a new Bike instance.
  # @param color [String] The color of the bike.
  # @param max_speed [Integer] The maximum speed of the bike.
  # @param number_of_tires [Integer] The number of tires of the bike.
  def initialize(color, max_speed, number_of_tires)
    super(color, max_speed, number_of_tires)
    @cadence = 0
    @gear = 1
  end

  # Sets the gear of the bike.
  # @param gear [Integer] The gear to set.
  def gear_set(gear)
    @gear = gear
  end

  # Sets the cadence of the bike.
  # @param cadence [Integer] The cadence to set.
  def cadence_set(cadence)
    @cadence = cadence
  end

  # Accelerates the bike based on cadence and gear.
  # @param applied_power [Integer] The power level for acceleration.
  def accelerate(applied_power)
    @cadence += applied_power
    @current_speed += (@cadence * @gear)
  end

  # Rings the bike's bell.
  # @return [String] The sound of the bell.
  def ring_bell
    "Ding ding!\n"
  end

  # Displays the status of the bike, including cadence and gear.
  def status
    super()
    puts "-> Cadence: #{@cadence}, Gear: #{@gear}"
  end
end
