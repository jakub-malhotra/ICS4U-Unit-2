public class FlyTest3 {
    public static void main(String[] args) {
        // Using Jet without encapsulation
        Jet jet1 = new Jet();
        jet1.speed = 212; // Directly accessing the speed variable
        System.out.println("Speed of jet1: " + jet1.speed);

        // Using Jet with encapsulation
        Jet jet2 = new Jet();
        jet2.setSpeed(212); // Setting speed via setter method
        System.out.println("Speed of jet2: " + jet2.getSpeed()); // Accessing speed via getter method
    }
}
