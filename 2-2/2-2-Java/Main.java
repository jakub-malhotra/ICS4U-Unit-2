/*
 * This is a program that prints out the stack and pops an item.
 * @author  Jakub Malhotra
 * @version 2.0
 * @since   2024-10-17
 */

public class Main {

    // Private constructor to prevent instantiation of utility class
    private Main() {
        throw new IllegalStateException("This is the main fuction");
    }

    /**
     * The main method that demonstrates the use of MrCoxallStack.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        // Fruit Stack
        MrCoxallStack fruitStack = new MrCoxallStack();
        fruitStack.pushItem("apple");
        fruitStack.pushItem("banana");
        fruitStack.pushItem("cherry");
        System.out.println("Fruit items: " + fruitStack.getShowStack());
        String topFruit = fruitStack.popItem();
        System.out.println("Popped fruit item: " + topFruit);
        System.out.println("Fruit items: " + fruitStack.getShowStack() + "\n");

        // Color Stack
        MrCoxallStack colorStack = new MrCoxallStack();
        colorStack.pushItem("red");
        colorStack.pushItem("green");
        colorStack.pushItem("blue");
        System.out.println("Color items: " + colorStack.getShowStack());
        String topColor = colorStack.popItem();
        System.out.println("Popped color item: " + topColor);
        System.out.println("Color items: " + colorStack.getShowStack() + "\n");

        // Dog Stack
        MrCoxallStack dogStack = new MrCoxallStack();
        dogStack.pushItem("poodle");
        dogStack.pushItem("retriever");
        dogStack.pushItem("beagle");
        System.out.println("Dog items: " + dogStack.getShowStack());
        String topDog = dogStack.popItem();
        System.out.println("Popped dog item: " + topDog);
        System.out.println("Dog items: " + dogStack.getShowStack() + "\n");

        System.out.println("\nDone.");
    }
}
