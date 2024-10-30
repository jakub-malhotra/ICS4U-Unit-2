/*
 * Class representing a vehicle with basic functionality.
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-29
 */
export default class Vehicle {

    /**
     * The color of the vehicle.
     * @type {string}
     */
    private color: string;

    /**
      * The license plate of the vehicle.
      * @type {string}
      */
    private licensePlate: string;

    /**
      * The number of doors on the vehicle.
      * @type {number}
      */
    private numberOfDoors: number;

    /**
      * The maximum speed of the vehicle.
      * @type {number}
      */
    private maxSpeed: number;

    /**
      * The current speed of the vehicle.
      * @type {number}
      */

    private currentSpeed: number;

    /**
     * Creates a new Vehicle instance.
     * @param {string} color - The color of the vehicle.
     * @param {string} licensePlate - The license plate of the vehicle.
     * @param {number} numberOfDoors - The number of doors on the vehicle.
     * @param {number} maxSpeed - The maximum speed of the vehicle.
     */
    constructor(color: string, licensePlate: string, numberOfDoors: number, maxSpeed: number) {
        this.color = color;
        this.licensePlate = licensePlate;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    /**
     * Returns the current color of the vehicle.
     * @returns {string} The color of the vehicle.
     */
    get getColor(): string {
        return this.color;
    }

    /**
     * Sets a new color for the vehicle.
     * @param {string} newColor - The new color to set.
     */
    set setColor(newColor: string) {
        this.color = newColor;
    }

    /**
     * Returns the current speed of the vehicle.
     * @returns {number} The current speed of the vehicle.
     */
    get speed(): number {
        return this.currentSpeed;
    }

    /**
     * Displays the status of the vehicle.
     */
    public status(): void {
        console.log(`License Plate: ${this.licensePlate}`);
        console.log(`Color: ${this.color}`);
        console.log(`Number of Doors: ${this.numberOfDoors}`);
        console.log(`Max Speed: ${this.maxSpeed}`);
        console.log(`Current Speed: ${this.currentSpeed}`);
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
     */
    public brake(power: number, time: number): void {
        const speedDecrease = power * time;
        if (this.currentSpeed - speedDecrease > 0) {
            this.currentSpeed -= speedDecrease;
        } else {
            this.currentSpeed = 0;
        }
    }
}