/**
 * Class representing a stack for storing strings.
 * @author  Jakub Malhotra
 * @version 2.1 
 * @since   2024-10-21
 */
export default class MrCoxallStack {
    private stackAsList: string[];

    /**
     * Create a new stack.
     */
    constructor() {
        this.stackAsList = [];
    }

    /**
     * Getter to return the current stack as a string with comma-separated values.
     * @returns {string} The stack as a string.
     */
    get showStack(): string {
        if (this.isEmpty) {
            return "The stack is empty!";
        }
        
        return this.stackAsList.join(", ");
    }

    /**
     * Getter to check if the stack is empty.
     * @returns {boolean} True if the stack is empty, false otherwise.
     */
    isEmpty(): boolean {
        if (this.stackAsList.length === 0) {
            // Stack is empty
            return true
        }
        // Stack is not empty
        return false;
    }    

    /**
     * Getter to get the size of the stack.
     * @returns {number} The number of elements in the stack.
     */
    get size(): number {
        return this.stackAsList.length;
    }

    /**
     * Push a string onto the stack.
     * @param {string} pushedString - The string to be pushed onto the stack.
     */
    pushItem(pushedString: string): void {
        this.stackAsList.push(pushedString);
    }

    /**
     * Pop a string from the stack.
     * @returns {string} The popped string, or a message if the stack is empty.
     */
    popItem(): string {
        if (this.isEmpty) {
            return "The stack is empty!";
        }
        
        const poppedValue = this.stackAsList.pop();
        
        // Handle the case where poppedValue might be undefined
        if (poppedValue === undefined) {
            return "The stack is empty!";
        }
        
        return poppedValue;
    }
    
}
