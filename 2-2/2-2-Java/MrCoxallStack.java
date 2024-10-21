/*
 * This is a program that implements a stack for storing strings.
 * @author  Jakub Malhotra
 * @version 2.0
 * @since   2024-10-17
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a stack data structure for strings.
 * It provides methods to push, pop, and display the stack.
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
     * Returns a string representation of the stack as a comma-separated list.
     *
     * @return a string containing the elements of the stack,
     *         or an empty string if the stack is empty
     */
    public String getShowStack() {
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
        if (this.stackAsList.isEmpty()) {
            return "The stack is empty!";
        } else {
            return this.stackAsList.remove(this.stackAsList.size() - 1);
        }
    }
}
