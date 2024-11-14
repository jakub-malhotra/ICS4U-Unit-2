/*
* This program is a vehicle class.
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
*/

import { Truck } from "./Truck.ts"
import { Bike } from "./Bike.ts"

const bmx = new Bike('Red', 40, 2)

console.log('Created Bmx bike.\nStatus:')
bmx.status()

console.log('\nSet the cadense to 10\n')
bmx.setGear(2)
bmx.setCadence(10)
bmx.status()

console.log('\nAccelerate by 15:')
bmx.accelerate(15)
bmx.status()
console.log('\nRinging bell.')
console.log(bmx.ringBell())

const bigTruck = new Truck('Grey', 200, 'HGC-3456F', 6)

console.log('Created a Truck.\nStatus:')
bigTruck.status()

console.log('\nAccelerating, 10 of power for ten seconds:')
bigTruck.accelerate(10, 10)
console.log('New speed: ' + bigTruck.speed)

console.log('\nBrake for 3 seconds with a power of 2 and air pressure of 10:')
bigTruck.brake(2,3,10)
console.log('New speed: ' + bigTruck.speed)

console.log('\nDone.')
