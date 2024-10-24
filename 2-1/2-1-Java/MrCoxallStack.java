/*
 * This is a program that prints out stuff.
 * @author  Jakub Malhotra
 * @version 1.0
 * @since   2024-10-16
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This is a standard program.
 */
public class MrCoxallStack {

    /**
     * Represents a stack data structure implemented using a List.
     * This list stores elements as strings and is public.
     */
    public List<String> stackAsList = new ArrayList<>();

    /**
     * Pushes the specified string onto the top of the stack.
     *
     * @param pushedString the string to be pushed onto the stack
     */
    public void pushItem(final String pushedString) {
        // Push the value onto the stack
        this.stackAsList.add(pushedString);
    }

    /**
     * Returns a string representation of the stack.
     *
     * @return the string representation of the stack
     */
    public String showStack() {
        // Return the stack
        final StringBuilder stackValues = new StringBuilder();

        for (String value : this.stackAsList) {
            stackValues.append(value).append(",");
        }

        if (stackValues.length() > 0) {
            // Remove the trailing comma
            stackValues.deleteCharAt(stackValues.length() - 1);
        }

        return stackValues.toString();
    }
}
