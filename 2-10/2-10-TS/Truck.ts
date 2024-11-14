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
     * @param {number} numberOfTires - The number of tires the truck has.
     */
    constructor(color: string, maxSpeed: number, licensePlateNumber: string, numberOfTires: number) {
        super(color, maxSpeed, numberOfTires);
        this.licensePlateNumber = licensePlateNumber;
        this.numberOfTires = numberOfTires
    }

    /**
     * Applies air pressure to slow down the truck.
     * @param {number} airPressure - The amount of air pressure applied.
     */
    public brake(power: number, time: number, airPressure: number): void {
        this.currentSpeed = this.currentSpeed - (power * time) - (airPressure * time)
    }

    /**
     * Displays the status of the truck, including license plate.
     */
    public status(): void {
        super.status();
        console.log(`-> License Plate: ${this.licensePlateNumber}`);
    }
}
