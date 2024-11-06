/*
 * Class representing a bike, extending the Vehicle class.
 * @version 1.0
 * @since   2024-11-05
 */

public class Bike extends Vehicle {

    /**
     * The cadence of the bike.
     * @type {int}
     */
    private int cadence = 0;

    /**
     * The gear of the bike.
     * @type {int}
     */
    private int gear = 1;

    /**
     * Creates a new Bike instance.
     * @param {String} color - The color of the bike.
     * @param {int} maxSpeed - The maximum speed of the bike.
     */
    public Bike(final String color, final int maxSpeed) {
        super(color, maxSpeed);
    }

    /**
     * Sets the gear of the bike.
     * @param {int} gear - The gear to set.
     */
    public void setGear(final int gear) {
        this.gear = gear;
    }

    /**
     * Sets the cadence of the bike.
     * @param {int} cadence - The cadence to set.
     */
    public void setCadence(final int cadence) {
        this.cadence = cadence;
    }

    /**
     * Accelerates the bike based on cadence and gear.
     * @param {int} appliedPower - The power level for acceleration.
     */
    public void accelerate(final int appliedPower) {
        this.cadence = this.cadence + appliedPower;
        this.currentSpeed = this.currentSpeed + (this.cadence * this.gear);
    }

    /**
     * Rings the bike's bell.
     * @return {String} The sound of the bell.
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
    }
}
