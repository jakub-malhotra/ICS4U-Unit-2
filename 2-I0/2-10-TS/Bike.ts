/*
 * Class representing a bike, extending the Vehicle class.
 * @version 1.0
 * @since   2024-11-05
 */

import Vehicle from "./Vehicle.ts";

export class Bike extends Vehicle {

    /**
     * The cadence of the bike.
     * @type {number}
     */
    protected cadence: number = 0;

    /**
     * The gear of the bike.
     * @type {number}
     */
    protected gear: number = 1;

    /**
     * Creates a new Bike instance.
     * @param {string} color - The color of the bike.
     * @param {number} maxSpeed - The maximum speed of the bike.
     * @param {number} numberOfTires - The number of tires the bike has.
     */
    constructor(color: string, maxSpeed: number, numberOfTires: number) {
        super(color, maxSpeed, numberOfTires);
    }

    /**
     * Sets the gear of the bike.
     * @param {number} gear - The gear to set.
     */
    public setGear(gear: number): void {
        this.gear = gear;
    }

    /**
     * Sets the cadence of the bike.
     * @param {number} cadence - The cadence to set.
     */
    public setCadence(cadence: number): void {
        this.cadence = cadence;
    }

    /**
     * Accelerates the bike based on cadence and gear.
     * @param {number} appliedPower - The power level for acceleration.
     */
    public accelerate(appliedPower: number): void {
        this.cadence = this.cadence + appliedPower;
        this.currentSpeed = this.currentSpeed + (this.cadence * this.gear);
    }

    /**
     * Rings the bike's bell.
     * @returns {string} The sound of the bell.
     */
    public ringBell(): string {
        return "Ding ding!\n";
    }

    /**
     * Displays the status of the bike, including cadence and gear.
     */
    public status(): void {
        super.status();
        console.log(`-> Cadence: ${this.cadence}`);
        console.log(`-> Gear: ${this.gear}`);
    }
}
