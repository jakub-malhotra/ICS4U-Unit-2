/*
 * Class representing a truck, extending the Vehicle class.
 * @version 1.0
 * @since   2024-11-05
 */

import Vehicle from "./Vehicle.ts";

export class Truck extends Vehicle {

    /**
     * The license plate number of the truck.
     * @type {string}
     */
    protected licensePlateNumber: string;

    /**
     * The number of doors on the truck.
     * @type {number}
     */
    protected doors: number = 2;

    /**
     * Creates a new Truck instance.
     * @param {string} color - The color of the truck.
     * @param {number} maxSpeed - The maximum speed of the truck.
     * @param {string} licensePlateNumber - The license plate of the truck.
     */
    constructor(color: string, maxSpeed: number, licensePlateNumber: string) {
        super(color, maxSpeed);
        this.licensePlateNumber = licensePlateNumber;
    }

    /**
     * Applies air pressure to slow down the truck.
     * @param {number} airPressure - The amount of air pressure applied.
     */
    public applyAir(airPressure: number): void {
        this.currentSpeed = Math.max(0, this.currentSpeed - airPressure / 2);
    }

    /**
     * Displays the status of the truck, including license plate.
     */
    public status(): void {
        super.status();
        console.log(`License Plate: ${this.licensePlateNumber}`);
        console.log(`Doors: ${this.doors}`);
    }
}
