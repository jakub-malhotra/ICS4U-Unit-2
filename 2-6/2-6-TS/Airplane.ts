/*
 * Class representing an airplane with basic functionality.
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-29
 */

export default class Airplane {

    /**
     * The speed of the airplane.
     * @type {number}
     */
    private speed: number;

    /**
     * Creates a new Plane instance.
     */
    constructor() {
        this.speed = 0;
    }

    /**
     * Gets the speed of the airplane.
     * @returns {number} The current speed of the airplane.
     */
    public get getSpeed(): number {
        return this.speed;
    }

    /**
     * Sets the speed of the airplane.
     * @param {number} speed - The new speed to set for the airplane.
     */
    public set setSpeed(speed: number) {
        this.speed = speed;
    }
}
