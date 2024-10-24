/*
 * This is a program that uses MrCoxallStack class for dog items.
 * @author  Jakub Malhotra
 * @version 3.0
 * @since   2024-10-21
 */

public final class Dogs {

    // Private constructor to prevent instantiation of utility class
    private Dogs() {
        throw new IllegalStateException("This is the main function");
    }

    /**
     * The main method uses MrCoxallStack for dog items.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        // Dog Stack
        MrCoxallStack dogStack = new MrCoxallStack();
        System.out.println("Dog items: " + dogStack.getShowStack());
        System.out.println("The size of the stack is: " + dogStack.getSize());
        System.out.println("Is the stack empty? " + dogStack.isEmpty());

        // Push items
        dogStack.pushItem("poodle");
        dogStack.pushItem("retriever");
        dogStack.pushItem("beagle");

        // Print full stack
        System.out.println("Dog items: " + dogStack.getShowStack());

        // Pop and show an item
        String topDog = dogStack.popItem();
        System.out.println("Popped dog item: " + topDog);

        // Display stack after popping item
        System.out.println("Dog items: " + dogStack.getShowStack());
        System.out.println("The size of the stack is: " + dogStack.getSize());
        System.out.println("Is the stack empty? " + dogStack.isEmpty());

        // Peek and display an item
        System.out.println("The top dog is: " + dogStack.peekItem());
        System.out.println("The size of the stack is: " + dogStack.getSize());

        // Empty the stack and show it
        System.out.println("Emptying the stack ...");
        dogStack.clearStack();
        System.out.println("The size of the stack is: " + dogStack.getSize());
        System.out.println("Is the stack empty? " + dogStack.isEmpty());

        System.out.println("\nDone.");
    }
}
