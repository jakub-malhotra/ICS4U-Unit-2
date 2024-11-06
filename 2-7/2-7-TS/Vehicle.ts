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
     * Creates a new Vehicle instance.
     * @param {string} color - The color of the vehicle.
     * @param {number} maxSpeed - The maximum speed of the vehicle.
     */
    constructor(color: string, maxSpeed: number) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
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
     * @param {number} brakePower - The power level for braking.
     * @param {number} brakeTime - The time duration for braking.
     */
    public brake(brakePower: number, brakeTime: number): void {
        const speedDecrease = brakePower * brakeTime;
        this.currentSpeed = Math.max(this.currentSpeed - speedDecrease, 0);
    }

    /**
     * Displays the status of the vehicle.
     */
    public status(): void {
        console.log(`-> Speed: ${this.currentSpeed}`);
        console.log(`-> Max Speed: ${this.maxSpeed}`);
        console.log(`-> Color: ${this.color}`);
    }
}
