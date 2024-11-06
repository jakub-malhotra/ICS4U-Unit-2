# Class representing a truck, extending the Vehicle class.
# @version 1.0
# @since   2024-11-05

# The Truck class represents a truck, which is a specific type of vehicle
# with additional properties such as license plate and doors, and includes
# functionality to apply air pressure for braking and display its status.
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
    def initialize(color, max_speed, license_plate_number)
      super(color, max_speed)
      @license_plate_number = license_plate_number
      @doors = 2
    end
  
    # Applies air pressure to slow down the truck.
    # @param air_pressure [Integer] The amount of air pressure applied.
    def apply_air(air_pressure)
      @current_speed = [0, @current_speed - air_pressure / 2].max
    end
  
    # Displays the status of the truck, including license plate.
    def status
      super()
      puts "-> License Plate: #{@license_plate_number}"
    end
  end
