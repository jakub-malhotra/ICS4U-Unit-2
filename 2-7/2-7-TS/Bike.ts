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
    public cadence: number = 0;

    /**
     * The gear of the bike.
     * @type {number}
     */
    public gear: number = 1;

    /**
     * Creates a new Bike instance.
     * @param {string} color - The color of the bike.
     * @param {number} maxSpeed - The maximum speed of the bike.
     */
    constructor(color: string, maxSpeed: number) {
        super(color, maxSpeed);
    }

    /**
     * Overrides the accelerate method to adjust speed based on cadence and gear.
     * @param {number} appliedPower - The power level for acceleration.
     */
    public accelerate(appliedPower: number): void {
        this.cadence += appliedPower;
        this.currentSpeed = this.currentSpeed + (this.cadence * this.gear)
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
        console.log(`Cadence: ${this.cadence}`);
    }
}
