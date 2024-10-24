/**
 * Class representing a stack for storing strings.
 * @author  Jakub Malhotra
 * @version 2.0 
 * @since   2024-10-17
 */
export default class MrCoxallStack {
    private stackAsList: string[]

    /**
     * Create a new stack.
     */
    constructor() {
        this.stackAsList = []
    }

    /**
     * Getter to return the current stack as a string with comma-separated values.
     * @returns {string} The stack as a string.
     */
    get showStack(): string {
        let stackValues: string = ""

        for (const value of this.stackAsList) {
            stackValues += value + ", "
        }
        // Remove the trailing comma and space if the stack is not empty
        if (stackValues.length > 0) {
            stackValues = stackValues.slice(0, -2)
        }

        return stackValues
    }

    /**
     * Push a string onto the stack.
     * @param {string} pushedString - The string to be pushed onto the stack.
     */
    pushItem(pushedString: string): void {
        this.stackAsList.push(pushedString)
    }

    /**
     * Pop a string from the stack.
     * @returns {string} The popped string, or a message if the stack is empty.
     */
    popItem(): string {
        let returnValue = ""

        if (this.stackAsList.length > 0) {
            returnValue = this.stackAsList.pop()!
        } else {
            returnValue = "The stack is empty!"
        }

        return returnValue
    }
}
