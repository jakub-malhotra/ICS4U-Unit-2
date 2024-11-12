/*
 * Class representing a vehicle with basic functionality.
 * @version 1.0
 * @since   2024-11-05
 */

export default class Vehicle {

    /**
     * The color of the vehicle.
     * @type {string}
     */
    protected color: string;

    /**
     * The maximum speed of the vehicle.
     * @type {number}
     */
    protected maxSpeed: number;

    /**
     * The current speed of the vehicle.
     * @type {number}
     */
    protected currentSpeed: number;

    /**
     * The current speed of the vehicle.
     * @type {number}
     */
        protected numberOfTires: number;

    /**
     * Creates a new Vehicle instance.
     * @param {string} color - The color of the vehicle.
     * @param {number} maxSpeed - The maximum speed of the vehicle.
     * @param {number} numberOfTires - The number of tires the vehicle has.
     */
    constructor(color: string, maxSpeed: number, numberOfTires: number) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.numberOfTires = numberOfTires
    }

    /**
     * Returns the current speed of the vehicle.
     * @returns {number} The current speed of the vehicle.
     */
    get speed(): number {
        return this.currentSpeed;
    }

    /**
     * Returns the maximum speed of the vehicle.
     * @returns {number} The maximum speed of the vehicle.
     */
    get maxVehicleSpeed(): number {
        return this.maxSpeed;
    }

    /**
     * Returns the number of tires of the vehicle.
     * @returns {number} The number of tires of the vehicle.
     */
    get vehicleNumberOfTires(): number {
        return this.numberOfTires;
    }

    /**
     * Accelerates the vehicle by a specified power over a given time.
     * @param {number} power - The power level for acceleration.
     * @param {number} time - The time duration for acceleration.
     */
    public accelerate(power: number, time: number): void {
        const speedIncrease = power * time;
        if (this.currentSpeed + speedIncrease < this.maxSpeed) {
            this.currentSpeed += speedIncrease;
        } else {
            this.currentSpeed = this.maxSpeed;
        }
    }

    /**
     * Brakes the vehicle by a specified power over a given time.
     * @param {number} power - The power level for braking.
     * @param {number} time - The time duration for braking.
     * @param {number} airPressure - The air pressure during truck braking.
     */
    public brake(power: number, time: number, _airPressure: number): void {
        const speedDecrease = power * time;
        if (this.currentSpeed - speedDecrease > 0) {
            this.currentSpeed -= speedDecrease;
        } else {
            this.currentSpeed = 0;
        }
    }

    /**
     * Displays the status of the vehicle.
     */
    public status(): void {
        console.log(`-> Speed: ${this.currentSpeed}`);
        console.log(`-> Max Speed: ${this.maxSpeed}`);
        console.log(`-> Color: ${this.color}`);
        console.log(`-> # of tires: ${this.numberOfTires}`);
    }
}
