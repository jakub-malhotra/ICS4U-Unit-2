/*
 * This is a program that uses MrCoxallStack class for fruit items.
 * @author  Jakub Malhotra
 * @version 3.0
 * @since   2024-10-21
 */

public final class Fruits {

    // Private constructor to prevent instantiation of utility class
    private Fruits() {
        throw new IllegalStateException("This is the main function");
    }

    /**
     * The main method uses MrCoxallStack for fruit items.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        // Fruit Stack
        MrCoxallStack fruitStack = new MrCoxallStack();
        System.out.println("Fruit items: " + fruitStack.getShowStack());
        System.out.println("The size of the stack is: " + fruitStack.getSize());
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        // Push items
        fruitStack.pushItem("banana");
        fruitStack.pushItem("apple");
        fruitStack.pushItem("cherry");

        // Print full stack
        System.out.println("Fruit items: " + fruitStack.getShowStack());

        // Pop and show an item
        String topFruit = fruitStack.popItem();
        System.out.println("Popped fruit item: " + topFruit);

        // Display stack after popping item
        System.out.println("Fruit items: " + fruitStack.getShowStack());
        System.out.println("The size of the stack is: " + fruitStack.getSize());
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        // Peek and display an item
        System.out.println("The top fruit is: " + fruitStack.peekItem());
        System.out.println("The size of the stack is: " + fruitStack.getSize());

        // Empty the stack and show it
        System.out.println("Emptying the stack ...");
        fruitStack.clearStack();
        System.out.println("The size of the stack is: " + fruitStack.getSize());
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        System.out.println("\nDone.");
    }
}
