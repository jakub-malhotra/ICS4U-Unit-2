/*
 * Class representing a vehicle with basic functionality.
 * 
 * @version 1.0
 * @since   2024-11-05
 */

/**
 * The Vehicle class represents a vehicle with basic functionality like speed, color,
 * and the ability to accelerate or brake.
 */
public class Vehicle {

    /**
     * The color of the vehicle.
     */
    protected String color;

    /**
     * The maximum speed of the vehicle.
     */
    protected int maxSpeed;

    /**
     * The current speed of the vehicle.
     */
    protected int currentSpeed;

    /**
     * Creates a new Vehicle instance.
     * 
     * @param color     The color of the vehicle.
     * @param maxSpeed  The maximum speed of the vehicle.
     */
    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    /**
     * Returns the current speed of the vehicle.
     * 
     * @return The current speed of the vehicle.
     */
    public int getSpeed() {
        return this.currentSpeed;
    }

    /**
     * Returns the maximum speed of the vehicle.
     * 
     * @return The maximum speed of the vehicle.
     */
    public int getMaxVehicleSpeed() {
        return this.maxSpeed;
    }

    /**
     * Accelerates the vehicle by a specified power over a given time.
     * 
     * @param power  The power level for acceleration.
     * @param time   The time duration for acceleration.
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
     * 
     * @param power  The power level for braking.
     * @param time   The time duration for braking.
     */
    public void brake(int power, int time) {
        int speedDecrease = power * time;
        if (this.currentSpeed - speedDecrease > 0) {
            this.currentSpeed -= speedDecrease;
        } else {
            this.currentSpeed = 0;
        }
    }

    /**
     * Displays the status of the vehicle.
     */
    public void status() {
        System.out.println("-> Speed: " + this.currentSpeed);
        System.out.println("-> Max Speed: " + this.maxSpeed);
        System.out.println("-> Color: " + this.color);
    }
}
