/**
 * Class representing a vehicle with basic functionality.
 *
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-29
 */
public class Vehicle {
    /**
    * The color of the vehicle.
     */
    private String color;

    /**
     * The license plate of the vehicle.
     */
    private String licensePlate;

    /**
     * The number of doors on the vehicle.
     */
    private int numberOfDoors;

    /**
     * The maximum speed of the vehicle.
     */
    private int maxSpeed;

    /**
     * The current speed of the vehicle.
     */
    private int currentSpeed;

    /**
     * Creates a new Vehicle instance.
     *
     * @param vehicleColor - The color of the vehicle.
     * @param vehicleLicensePlate - The license plate of the vehicle.
     * @param vehicleNumberOfDoors - The number of doors on the vehicle.
     * @param vehicleMaxSpeed - The maximum speed of the vehicle.
     */
    public Vehicle(final String vehicleColor, final String vehicleLicensePlate, 
                   final int vehicleNumberOfDoors, final int vehicleMaxSpeed) {
        this.color = vehicleColor;
        this.licensePlate = vehicleLicensePlate;
        this.numberOfDoors = vehicleNumberOfDoors;
        this.maxSpeed = vehicleMaxSpeed;
        this.currentSpeed = 0;
    }

    /**
     * Gets the current speed of the vehicle.
     * 
     * @return The current speed of the vehicle.
     */
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * Gets the color of the vehicle.
     * 
     * @return The color of the vehicle.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the vehicle.
     * 
     * @param newColor - The new color to set.
     */
    public void setColor(final String newColor) {
        this.color = newColor;
    }

    /**
     * Displays the status of the vehicle.
     */
    public void status() {
        System.out.println("Color: " + color);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Current Speed: " + currentSpeed);
    }

    /**
     * Accelerates the vehicle by the given power for a specified time.
     * 
     * @param power - The power to apply for acceleration.
     * @param time - The time in seconds to apply the power.
     */
    public void accelerate(final int power, final int time) {
        currentSpeed += power * time;
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }
    }

    /**
     * Brakes the vehicle by the given power for a specified time.
     * 
     * @param power - The power to apply for braking.
     * @param time - The time in seconds to apply the power.
     */
    public void brake(final int power, final int time) {
        currentSpeed -= power * time;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }
}
