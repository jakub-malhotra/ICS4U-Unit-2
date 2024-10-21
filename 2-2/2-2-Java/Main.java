/*
 * This is a program that prints out the stack and pops an item.
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-16
 */

public class Main {
    /**
     * The main method that demonstrates the use of MrCoxallStack.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Fruit Stack
        MrCoxallStack fruitStack = new MrCoxallStack();
        fruitStack.pushItem("apple");
        fruitStack.pushItem("banana");
        fruitStack.pushItem("cherry");
        System.out.println(String.format("Fruit items: %s", fruitStack.getShowStack()));
        String topFruit = fruitStack.popItem();
        System.out.println(String.format("Popped fruit item: %s", topFruit));
        System.out.println(String.format("Fruit items: %s\n", fruitStack.getShowStack()));

        // Color Stack
        MrCoxallStack colorStack = new MrCoxallStack();
        colorStack.pushItem("red");
        colorStack.pushItem("green");
        colorStack.pushItem("blue");
        System.out.println(String.format("Color items: %s", colorStack.getShowStack()));
        String topColor = colorStack.popItem();
        System.out.println(String.format("Popped color item: %s", topColor));
        System.out.println(String.format("Color items: %s\n", colorStack.getShowStack()));

        // Dog Stack
        MrCoxallStack dogStack = new MrCoxallStack();
        dogStack.pushItem("poodle");
        dogStack.pushItem("retriever");
        dogStack.pushItem("beagle");
        System.out.println(String.format("Dog items: %s", dogStack.getShowStack()));
        String topDog = dogStack.popItem();
        System.out.println(String.format("Popped dog item: %s", topDog));
        System.out.println(String.format("Dog items: %s\n", dogStack.getShowStack()));

        System.out.println("\nDone.");
    }
}
