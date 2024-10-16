/*
 * This program is the MrCoxallStack
 * @author  Jakub Malhotra
 * @version 1.0 
 * @since   2024-10-16
 */

class MrCoxallStack {
    stackAsList: string[]

    constructor() {
        this.stackAsList = []
    }

    push(pushedString: string): void {
        // push the value onto the stack
        this.stackAsList.push(pushedString)
    }

    showStack(): string {
        // return the stack
        let stackValues: string = ""

        for (const value of this.stackAsList) {
            stackValues += value + ","
        }
        // Remove the trailing comma using the slice method
        stackValues = stackValues.slice(0, -1)

        return stackValues
    }
}

// Export the class
export default MrCoxallStack;
