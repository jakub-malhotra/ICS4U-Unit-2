/*
 * This is a program that prints out the stack.
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-16
 */

public class Main {
    /**
     * This program utilizes the MrCoxallStack
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create stacks for different types of items
        MrCoxallStack fruitStack = new MrCoxallStack();
        fruitStack.push("apple");
        fruitStack.push("banana");
        fruitStack.push("cherry");
        // Print the fruit stack using String.format()
        System.out.println(String.format("Fruit items: %s", 
                fruitStack.showStack()));
        System.out.println();

        MrCoxallStack colorStack = new MrCoxallStack();
        colorStack.push("red");
        colorStack.push("green");
        colorStack.push("blue");
        // Print the color stack using String.format()
        System.out.println(String.format("Color items: %s", 
                colorStack.showStack()));
        System.out.println();

        MrCoxallStack dogStack = new MrCoxallStack();
        dogStack.push("poodle");
        dogStack.push("retriever");
        dogStack.push("beagle");
        // Print the dog stack using String.format()
        System.out.println(String.format("Dog items: %s", 
                dogStack.showStack()));
        System.out.println();

        System.out.println("\nDone.");
    }
}
