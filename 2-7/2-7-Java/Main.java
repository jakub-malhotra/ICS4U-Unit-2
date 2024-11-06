/*
 * This program demonstrates the use of the Vehicle, Bike, and Truck classes.
 *
 * @author  Mr Coxall
 * @version 1.0
 * @since   2024-11-05
 */

public class Main {

    public static void main(String[] args) {

        // Creating a new Bike instance
        Bike bmx = new Bike("Red", 40);

        System.out.println("Created BMX bike.\nStatus:");
        bmx.status();

        System.out.println("\nSet the cadence to 10");
        bmx.setGear(2);
        bmx.setCadence(10);
        bmx.status();

        System.out.println("\nAccelerate by 15:");
        bmx.accelerate(15);
        bmx.status();
        System.out.println("\nRinging bell.");
        System.out.println(bmx.ringBell());

        // Creating a new Truck instance
        Truck bigTruck = new Truck("Grey", 200, "HGC-3456F");

        System.out.println("Created a Truck.\nStatus:");
        bigTruck.status();

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        bigTruck.accelerate(10, 10);
        System.out.println("New speed: " + bigTruck.getSpeed());

        System.out.println("\nBraking, 10 of power for 10 sec.");
        bigTruck.accelerate(10, 10);
        System.out.println("New speed: " + bigTruck.getSpeed());

        System.out.println("\nApplied air pressure of 10:");
        bigTruck.applyAir(10);
        System.out.println("New speed: " + bigTruck.getSpeed());

        System.out.println("\nDone.");
    }
}
