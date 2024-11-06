/*
 * Class representing a bike, extending the Vehicle class.
 * 
 * @version 1.0
 * @since   2024-11-05
 */

/**
 * The Bike class represents a bike, which is a specific type of vehicle with
 * additional properties such as cadence and gear, and can perform actions like 
 * ringing a bell and accelerating based on cadence and gear.
 */
public class Bike extends Vehicle {

    /**
     * The cadence of the bike.
     */
    public int cadence;

    /**
     * The gear of the bike.
     */
    public int gear;

    /**
     * Creates a new Bike instance.
     * 
     * @param color     The color of the bike.
     * @param maxSpeed  The maximum speed of the bike.
     */
    public Bike(String color, int maxSpeed) {
        super(color, maxSpeed);
        this.cadence = 0;
        this.gear = 1;
    }

    /**
     * Accelerates the bike by adjusting the cadence and speed based on gear.
     * 
     * @param appliedPower The power level for acceleration.
     */
    public void accelerate(int appliedPower) {
        this.cadence += appliedPower;
        this.currentSpeed += this.cadence * this.gear;
    }

    /**
     * Rings the bike's bell.
     * 
     * @return The sound of the bell.
     */
    public String ringBell() {
        return "Ding ding!\n";
    }

    /**
     * Displays the status of the bike, including cadence and gear.
     */
    public void status() {
        super.status();
        System.out.println("-> Cadence: " + this.cadence);
        System.out.println("-> Gear: " + this.gear);
    }
}
