/*
 * Class representing a truck, extending the Vehicle class.
 * 
 * @version 1.0
 * @since   2024-11-05
 */

/**
 * The Truck class represents a truck, which is a specific type of vehicle
 * with additional properties such as license plate and doors, and includes
 * functionality to apply air pressure for braking and display its status.
 */
public class Truck extends Vehicle {

    /**
     * The license plate number of the truck.
     */
    protected String licensePlateNumber;

    /**
     * The number of doors on the truck.
     */
    protected int doors = 2;

    /**
     * Creates a new Truck instance.
     * 
     * @param color              The color of the truck.
     * @param maxSpeed           The maximum speed of the truck.
     * @param licensePlateNumber The license plate number of the truck.
     */
    public Truck(String color, int maxSpeed, String licensePlateNumber) {
        super(color, maxSpeed);
        this.licensePlateNumber = licensePlateNumber;
    }

    /**
     * Applies air pressure to slow down the truck.
     * 
     * @param airPressure The amount of air pressure applied.
     */
    public void applyAir(int airPressure) {
        this.currentSpeed = Math.max(0, this.currentSpeed - airPressure / 2);
    }

    /**
     * Displays the status of the truck, including license plate.
     */
    public void status() {
        super.status();
        System.out.println("-> License Plate: " + this.licensePlateNumber);
    }
}
