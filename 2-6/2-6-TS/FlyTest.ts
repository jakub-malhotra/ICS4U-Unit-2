/**
 * This is the main code that runs
 * with the Plane and Jet classes.
 * By:      Jakub Malhotra
 * Version: 1.0
 * Since:   2024-10-29
 */

import Plane from './Airplane.ts';
import Jet from './Jet.ts';

const biplane = new Plane();
biplane.setSpeed(212);
console.log(biplane.getSpeed);

const boeing = new Jet();
boeing.setSpeed(422);
console.log(boeing.getSpeed);

let x = 0;
while (x < 4) {
    boeing.accelerate();
    console.log(boeing.getSpeed);
    if (boeing.getSpeed > 5000) {
        biplane.setSpeed(biplane.getSpeed * 2);
    } else {
        boeing.accelerate();
    }
    x++;
}

console.log(biplane.getSpeed);
