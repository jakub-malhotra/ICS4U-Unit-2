/*
 * This is a program that implements a stack for storing strings.
 * @author  Jakub Malhotra
 * @version 3.0
 * @since   2024-10-21
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides methods to push, pop, and display the stack,
 * and methods for size and emptiness.
 */
public final class MrCoxallStack {

    /**
     * Represents the stack as a list of strings.
     */
    private List<String> stackAsList = new ArrayList<>();

    /**
     * Creates a new instance of the stack.
     * The stack is initialized as an empty list.
     */
    public MrCoxallStack() {
        // Constructor - stack is already initialized.
    }

    /**
     * Returns a string of the stack as a list.
     *
     * @return a string containing the elements of the stack,
     *         or a message indicating that the stack is empty
     */
    public String getShowStack() {
        if (this.isEmpty()) {
            return "The stack is empty!";
        }

        final StringBuilder stackValues = new StringBuilder();

        for (String value : this.stackAsList) {
            stackValues.append(value).append(", ");
        }

        // Remove trailing comma and space, if any
        if (stackValues.length() > 0) {
            stackValues.setLength(stackValues.length() - 2);
        }

        return stackValues.toString();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return this.stackAsList.isEmpty();
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return the size of the stack
     */
    public int getSize() {
        return this.stackAsList.size();
    }

    /**
     * Pushes a string onto the top of the stack.
     *
     * @param pushedString the string to be pushed onto the stack
     */
    public void pushItem(final String pushedString) {
        this.stackAsList.add(pushedString);
    }

    /**
     * Pops a string from the top of the stack.
     *
     * @return the popped string if the stack is not empty,
     *         or a message indicating that the stack is empty
     */
    public String popItem() {
        if (this.isEmpty()) {
            return "The stack is empty!";
        } else {
            return this.stackAsList.remove(this.stackAsList.size() - 1);
        }
    }
}
