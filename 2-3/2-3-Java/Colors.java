/*
 * This is a program that uses MrCoxallStack class for color items.
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-21
 */

public final class Colors {

    // Private constructor to prevent instantiation of utility class
    private Colors() {
        throw new IllegalStateException("This is the main function");
    }

    /**
     * The main method that demonstrates the use of MrCoxallStack for color items.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        // Color Stack
        MrCoxallStack colorStack = new MrCoxallStack();
        System.out.println("Color items: " + colorStack.getShowStack());
        System.out.println("The size of the stack: " + colorStack.getSize());
        System.out.println("Is the stack empty? " + colorStack.isEmpty());

        // Push items
        colorStack.pushItem("red");
        colorStack.pushItem("green");
        colorStack.pushItem("blue");

        // Print full stack
        System.out.println("Color items: " + colorStack.getShowStack());

        // Pop and show an item
        String topColor = colorStack.popItem();
        System.out.println("Popped color item: " + topColor);

        // Display stack after popping item
        System.out.println("Color items: " + colorStack.getShowStack());
        System.out.println("The size of the stack: " + colorStack.getSize());
        System.out.println("Is the stack empty? " + colorStack.isEmpty());

        System.out.println("\nDone.");
    }
}
