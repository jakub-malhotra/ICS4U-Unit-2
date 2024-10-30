/*
 * Class representing a vehicle with basic functionality.
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-29
 */

public final class Vehicle {
    private String color;
    private String licensePlate;
    private int numberOfDoors;
    private int maxSpeed;
    private int currentSpeed;

    /**
     * Creates a new Vehicle instance.
     * @param color - The color of the vehicle.
     * @param licensePlate - The license plate of the vehicle.
     * @param numberOfDoors - The number of doors on the vehicle.
     * @param maxSpeed - The maximum speed of the vehicle.
     */
    public Vehicle(String color, String licensePlate,
            int numberOfDoors, int maxSpeed) {
        this.color = color;
        this.licensePlate = licensePlate;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0; // Initialize current speed to 0
    }

    /**
     * Returns the current color of the vehicle.
     * @return The color of the vehicle.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets a new color for the vehicle.
     * @param newColor - The new color to set.
     */
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /**
     * Returns the current speed of the vehicle.
     * @return The current speed of the vehicle.
     */
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    /**
     * Displays the status of the vehicle.
     */
    public void status() {
        System.out.println("License Plate: " + this.licensePlate);
        System.out.println("Color: " + this.color);
        System.out.println("Number of Doors: " + this.numberOfDoors);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Current Speed: " + this.currentSpeed);
    }

    /**
     * Accelerates the vehicle by a specified power over a given time.
     * @param power - The power level for acceleration.
     * @param time - The time duration for acceleration.
     */
    public void accelerate(int power, int time) {
        int speedIncrease = power * time;
        if (this.currentSpeed + speedIncrease < this.maxSpeed) {
            this.currentSpeed += speedIncrease;
        } else {
            this.currentSpeed = this.maxSpeed;
        }
    }

    /**
     * Brakes the vehicle by a specified power over a given time.
     * @param power - The power level for braking.
     * @param time - The time duration for braking.
     */
    public void brake(int power, int time) {
        int speedDecrease = power * time;
        if (this.currentSpeed - speedDecrease > 0) {
            this.currentSpeed -= speedDecrease;
        } else {
            this.currentSpeed = 0;
        }
    }
}
