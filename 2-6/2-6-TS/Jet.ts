/*
 * Class representing a jet with specific speed multiplier functionality.
 * Extends the Plane class to inherit basic airplane properties.
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-29
 */

import Airplane from './Airplane.ts';

export default class Jet extends Airplane {

    /**
     * Multiplier used to increase the speed of the jet.
     * @type {number}
     */
    private static MULTIPLIER: number = 2;

    /**
     * Creates a new Jet instance.
     */
    constructor() {
        super();
    }

    /**
     * Sets the speed of the jet, applying the multiplier to the input speed.
     * @param {number} speed - The base speed to set, which will be multiplied.
     */
    public set setSpeed(speed: number) {
        super.setSpeed(speed * Jet.MULTIPLIER);
    }

    /**
     * Accelerates the jet by doubling its current speed.
     */
    public accelerate(): void {
        super.setSpeed(this.getSpeed * Jet.MULTIPLIER);
    }
}
